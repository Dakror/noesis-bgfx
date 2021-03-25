$input a_position, a_color0, a_texcoord0, a_texcoord1, a_texcoord2, a_texcoord3
$output v_uv0, v_uv1, v_uv2, v_st1, v_coverage, v_color

#include <bgfx_shader.sh>

uniform vec4 u_textureDimensions;

void main() {
    gl_Position = mul(vec4(a_position, 0.0, 1.0), u_proj);
    v_color = a_color0;
    v_uv0 = a_texcoord0;
    v_uv1 = a_texcoord1;
    v_uv2 = a_texcoord2;
    v_st1 = a_texcoord1 * u_textureDimensions.xy;
    v_coverage = a_texcoord3;
}