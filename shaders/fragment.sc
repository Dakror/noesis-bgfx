
#if defined(EFFECT_RGBA)

#elif defined(EFFECT_MASK)

#elif defined(EFFECT_PATH_SOLID)
    #define EFFECT_PATH 1
    #define PAINT_SOLID 1
    #define HAS_COLOR 1

#elif defined(EFFECT_PATH_LINEAR)
    #define EFFECT_PATH 1
    #define PAINT_LINEAR 1
    #define HAS_UV0 1

#elif defined(EFFECT_PATH_RADIAL)
    #define EFFECT_PATH 1
    #define PAINT_RADIAL 1
    #define HAS_UV0 1

#elif defined(EFFECT_PATH_PATTERN)
    #define EFFECT_PATH 1
    #define PAINT_PATTERN 1
    #define HAS_UV0 1

#elif defined(EFFECT_PATH_AA_SOLID)
    #define EFFECT_PATH_AA 1
    #define PAINT_SOLID 1
    #define HAS_COLOR 1
    #define HAS_COVERAGE 1

#elif defined(EFFECT_PATH_AA_LINEAR)
    #define EFFECT_PATH_AA 1
    #define PAINT_LINEAR 1
    #define HAS_COVERAGE 1
    #define HAS_UV0 1

#elif defined(EFFECT_PATH_AA_RADIAL)
    #define EFFECT_PATH_AA 1
    #define PAINT_RADIAL 1
    #define HAS_COVERAGE 1
    #define HAS_UV0 1

#elif defined(EFFECT_PATH_AA_PATTERN)
    #define EFFECT_PATH_AA 1
    #define PAINT_PATTERN 1
    #define HAS_COVERAGE 1
    #define HAS_UV0 1

#elif defined(EFFECT_SDF_SOLID)
    #define EFFECT_SDF 1
    #define PAINT_SOLID 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_ST1 1

#elif defined(EFFECT_SDF_LINEAR)
    #define EFFECT_SDF 1
    #define PAINT_LINEAR 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_ST1 1

#elif defined(EFFECT_SDF_RADIAL)
    #define EFFECT_SDF 1
    #define PAINT_RADIAL 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_ST1 1

#elif defined(EFFECT_SDF_PATTERN)
    #define EFFECT_SDF 1
    #define PAINT_PATTERN 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_ST1 1

#elif defined(EFFECT_IMAGE_OPACITY_SOLID)
    #define EFFECT_IMAGE_OPACITY 1
    #define PAINT_SOLID 1
    #define HAS_COLOR 1
    #define HAS_UV1 1

#elif defined(EFFECT_IMAGE_OPACITY_LINEAR)
    #define EFFECT_IMAGE_OPACITY 1
    #define PAINT_LINEAR 1
    #define HAS_UV0 1
    #define HAS_UV1 1

#elif defined(EFFECT_IMAGE_OPACITY_RADIAL)
    #define EFFECT_IMAGE_OPACITY 1
    #define PAINT_RADIAL 1
    #define HAS_UV0 1
    #define HAS_UV1 1

#elif defined(EFFECT_IMAGE_OPACITY_PATTERN)
    #define EFFECT_IMAGE_OPACITY 1
    #define PAINT_PATTERN 1
    #define HAS_UV0 1
    #define HAS_UV1 1

#elif defined(EFFECT_IMAGE_SHADOW_35V)
    #define EFFECT_IMAGE_SHADOW_V 1
    #define GAUSSIAN_35_TAP 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_SHADOW_63V)
    #define EFFECT_IMAGE_SHADOW_V 1
    #define GAUSSIAN_63_TAP 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_UV2 1

#elif defined(EFFECT_IMAGE_SHADOW_127V)
    #define EFFECT_IMAGE_SHADOW_V 1
    #define GAUSSIAN_127_TAP 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_UV2 1

#elif defined(EFFECT_IMAGE_SHADOW_35H_SOLID)
    #define EFFECT_IMAGE_SHADOW_H 1
    #define GAUSSIAN_35_TAP 1
    #define PAINT_SOLID 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_SHADOW_35H_LINEAR)
    #define EFFECT_IMAGE_SHADOW_H 1
    #define GAUSSIAN_35_TAP 1
    #define PAINT_LINEAR 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_SHADOW_35H_RADIAL)
    #define EFFECT_IMAGE_SHADOW_H 1
    #define GAUSSIAN_35_TAP 1
    #define PAINT_RADIAL 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_SHADOW_35H_PATTERN)
    #define EFFECT_IMAGE_SHADOW_H 1
    #define GAUSSIAN_35_TAP 1
    #define PAINT_PATTERN 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_SHADOW_63H_SOLID)
    #define EFFECT_IMAGE_SHADOW_H 1
    #define GAUSSIAN_63_TAP 1
    #define PAINT_SOLID 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_SHADOW_63H_LINEAR)
    #define EFFECT_IMAGE_SHADOW_H 1
    #define GAUSSIAN_63_TAP 1
    #define PAINT_LINEAR 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_SHADOW_63H_RADIAL)
    #define EFFECT_IMAGE_SHADOW_H 1
    #define GAUSSIAN_63_TAP 1
    #define PAINT_RADIAL 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_SHADOW_63H_PATTERN)
    #define EFFECT_IMAGE_SHADOW_H 1
    #define GAUSSIAN_63_TAP 1
    #define PAINT_PATTERN 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_SHADOW_127H_SOLID)
    #define EFFECT_IMAGE_SHADOW_H 1
    #define GAUSSIAN_127_TAP 1
    #define PAINT_SOLID 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_SHADOW_127H_LINEAR)
    #define EFFECT_IMAGE_SHADOW_H 1
    #define GAUSSIAN_127_TAP 1
    #define PAINT_LINEAR 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_SHADOW_127H_RADIAL)
    #define EFFECT_IMAGE_SHADOW_H 1
    #define GAUSSIAN_127_TAP 1
    #define PAINT_RADIAL 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_SHADOW_127H_PATTERN)
    #define EFFECT_IMAGE_SHADOW_H 1
    #define GAUSSIAN_127_TAP 1
    #define PAINT_PATTERN 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_35V)
    #define EFFECT_IMAGE_BLUR_V 1
    #define GAUSSIAN_35_TAP 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_63V)
    #define EFFECT_IMAGE_BLUR_V 1
    #define GAUSSIAN_63_TAP 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_UV2 1

#elif defined(EFFECT_IMAGE_BLUR_127V)
    #define EFFECT_IMAGE_BLUR_V 1
    #define GAUSSIAN_127_TAP 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_UV2 1

#elif defined(EFFECT_IMAGE_BLUR_35H_SOLID)
    #define EFFECT_IMAGE_BLUR_H 1
    #define GAUSSIAN_35_TAP 1
    #define PAINT_SOLID 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_35H_LINEAR)
    #define EFFECT_IMAGE_BLUR_H 1
    #define GAUSSIAN_35_TAP 1
    #define PAINT_LINEAR 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_35H_RADIAL)
    #define EFFECT_IMAGE_BLUR_H 1
    #define GAUSSIAN_35_TAP 1
    #define PAINT_RADIAL 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_35H_PATTERN)
    #define EFFECT_IMAGE_BLUR_H 1
    #define GAUSSIAN_35_TAP 1
    #define PAINT_PATTERN 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_63H_SOLID)
    #define EFFECT_IMAGE_BLUR_H 1
    #define GAUSSIAN_63_TAP 1
    #define PAINT_SOLID 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_63H_LINEAR)
    #define EFFECT_IMAGE_BLUR_H 1
    #define GAUSSIAN_63_TAP 1
    #define PAINT_LINEAR 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_63H_RADIAL)
    #define EFFECT_IMAGE_BLUR_H 1
    #define GAUSSIAN_63_TAP 1
    #define PAINT_RADIAL 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_63H_PATTERN)
    #define EFFECT_IMAGE_BLUR_H 1
    #define GAUSSIAN_63_TAP 1
    #define PAINT_PATTERN 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_127H_SOLID)
    #define EFFECT_IMAGE_BLUR_H 1
    #define GAUSSIAN_127_TAP 1
    #define PAINT_SOLID 1
    #define HAS_COLOR 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_127H_LINEAR)
    #define EFFECT_IMAGE_BLUR_H 1
    #define GAUSSIAN_127_TAP 1
    #define PAINT_LINEAR 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_127H_RADIAL)
    #define EFFECT_IMAGE_BLUR_H 1
    #define GAUSSIAN_127_TAP 1
    #define PAINT_RADIAL 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#elif defined(EFFECT_IMAGE_BLUR_127H_PATTERN)
    #define EFFECT_IMAGE_BLUR_H 1
    #define GAUSSIAN_127_TAP 1
    #define PAINT_PATTERN 1
    #define HAS_UV0 1
    #define HAS_UV1 1
    #define HAS_UV2 2

#else
    #error EFFECT not defined
#endif

#include <bgfx_shader.sh>

uniform vec4 u_opacity;
uniform vec4 u_rgba;
uniform vec4 u_radialGrad[2];
uniform vec4 u_effectParams[8];
uniform vec4 u_textureDimensions;


SAMPLER2D(s_pattern, 0);
SAMPLER2D(s_ramps, 1);
SAMPLER2D(s_image, 2);
SAMPLER2D(s_glyphs, 3);
SAMPLER2D(s_shadow, 4);

#define SDF_SCALE 7.96875
#define SDF_BIAS 0.50196078431
#define SDF_AA_FACTOR 0.65
#define SDF_BASE_MIN 0.125
#define SDF_BASE_MAX 0.25
#define SDF_BASE_DEV -0.65

void main() {
    // convert uv2 from int16 to normalized uint16
    vec4 uv2 = v_uv2 / 65536.0 + vec4_splat(0.5); 
    
    /////////////////////////////////////////////////////
    // Fetch paint color and opacity
    /////////////////////////////////////////////////////
    #if defined(PAINT_SOLID)
        vec4 paint = v_color;
        float opacity_ = 1.0;

    #elif defined(PAINT_LINEAR)
        vec4 paint = texture2D(s_ramps, v_uv0);
        float opacity_ = u_opacity.x;

    #elif defined(PAINT_RADIAL)
        float dd = u_radialGrad[1].y * v_uv0.x - u_radialGrad[1].z * v_uv0.y;
        float u = u_radialGrad[0].x * v_uv0.x + u_radialGrad[0].y * v_uv0.y + u_radialGrad[0].z * sqrt(u_radialGrad[0].w * v_uv0.x * v_uv0.x + u_radialGrad[1].x * v_uv0.y * v_uv0.y - dd * dd);
        vec4 paint = texture2D(s_ramps, vec2(u, u_radialGrad[1].w));
        float opacity_ = u_opacity.x;

    #elif defined(PAINT_PATTERN)
        vec4 paint = texture2D(s_pattern, v_uv0);
        float opacity_ = u_opacity.x;
    #endif

    #if defined(GAUSSIAN_35_TAP)
        #define GAUSSIAN_NUM_SAMPLES 9
        ARRAY_BEGIN(float, w, GAUSSIAN_NUM_SAMPLES) 0.10855, 0.13135, 0.10406, 0.07216, 0.04380, 0.02328, 0.01083, 0.00441, 0.00157 ARRAY_END();
        ARRAY_BEGIN(float, o, GAUSSIAN_NUM_SAMPLES) 0.66293, 2.47904, 4.46232, 6.44568, 8.42917, 10.41281, 12.39664, 14.38070, 16.36501 ARRAY_END();
    #elif defined(GAUSSIAN_63_TAP)
        #define GAUSSIAN_NUM_SAMPLES 16
        ARRAY_BEGIN(float, w, GAUSSIAN_NUM_SAMPLES) 
            0.05991, 0.07758, 0.07232, 0.06476, 0.05571, 0.04604, 0.03655, 0.02788, 
            0.02042, 0.01438, 0.00972, 0.00631, 0.00394, 0.00236, 0.00136, 0.0007 
        ARRAY_END();
        ARRAY_BEGIN(float, o, GAUSSIAN_NUM_SAMPLES)
            0.66555, 2.49371, 4.48868, 6.48366, 8.47864, 10.47362, 12.46860, 14.46360, 
            16.45860, 18.45361, 20.44863, 22.44365, 24.43869, 26.43375, 28.42881, 30.42389
        ARRAY_END();
    #elif defined(GAUSSIAN_127_TAP)
    #define GAUSSIAN_NUM_SAMPLES 32
        ARRAY_BEGIN(float, w, GAUSSIAN_NUM_SAMPLES) 
            0.02954, 0.03910, 0.03844, 0.03743, 0.03609, 0.03446, 0.03259, 0.03052, 0.02830, 0.02600,
            0.02365, 0.02130, 0.01900, 0.01679, 0.01469, 0.01272, 0.01092, 0.00928, 0.00781, 0.00651,
            0.00537, 0.00439, 0.00355, 0.00285, 0.00226, 0.00178, 0.00138, 0.00107, 0.00081, 0.00062,
            0.00046, 0.00034
        ARRAY_END();
        ARRAY_BEGIN(float, o, GAUSSIAN_NUM_SAMPLES) 
            0.66640, 2.49848, 4.49726, 6.49605, 8.49483, 10.49362, 12.49240, 14.49119, 16.48997, 18.48876,
            20.48754, 22.48633, 24.48511, 26.48390, 28.48268, 30.48147, 32.48026, 34.47904, 36.47783, 38.47662,
            40.47540, 42.47419, 44.47298, 46.47176, 48.47055, 50.46934, 52.46813, 54.46692, 56.46571, 58.46450,
            60.46329, 62.46208
        ARRAY_END();
    #endif
    
    /////////////////////////////////////////////////////
    // Apply selected effect
    /////////////////////////////////////////////////////
    #if defined(EFFECT_RGBA)
        gl_FragColor = u_rgba;

    #elif defined(EFFECT_MASK)
        gl_FragColor = vec4_splat(1.0);

    #elif defined(EFFECT_PATH)
        gl_FragColor = opacity_ * paint;

    #elif defined(EFFECT_PATH_AA)
        gl_FragColor = (opacity_ * v_coverage) * paint;

    #elif defined(EFFECT_IMAGE_OPACITY)
        gl_FragColor = texture2D(s_image, v_uv1) * (opacity_ * paint.a);

    #elif defined(EFFECT_IMAGE_SHADOW_V)
        #define BLUR_SIZE u_effectParams[0].x

        float alpha = 0.0;
        vec2 dir = vec2(0.0, BLUR_SIZE * u_textureDimensions.w);

        for (int i = 0; i < GAUSSIAN_NUM_SAMPLES; i++)
        {
            vec2 uvOffset = o[i] * dir;
            alpha += w[i] * (texture2D(s_image, clamp(v_uv1 + uvOffset, uv2.xy, uv2.zw)).a + texture2D(s_image, clamp(v_uv1 - uvOffset, uv2.xy, uv2.zw)).a);
        }

        gl_FragColor = vec4(0.0, 0.0, 0.0, alpha);

    #elif defined(EFFECT_IMAGE_SHADOW_H)
        #define SHADOW_COLOR u_effectParams[0].x
        #define BLUR_SIZE u_effectParams[1].x
        #define SHADOW_OFFSETX u_effectParams[1].y
        #define SHADOW_OFFSETY -u_effectParams[1].z

        float alpha = 0.0;
        vec2 dir = vec2(BLUR_SIZE * u_textureDimensions.z, 0.0);
        vec2 offset = vec2(SHADOW_OFFSETX * u_textureDimensions.z, SHADOW_OFFSETY * u_textureDimensions.w);

        for (int i = 0; i < GAUSSIAN_NUM_SAMPLES; i++)
        {
            vec2 uvOffset = o[i] * dir;
            alpha += w[i] * (texture2D(s_shadow, clamp(v_uv1 - offset + uvOffset, uv2.xy, uv2.zw)).a + texture2D(s_shadow, clamp(v_uv1 - offset - uvOffset, uv2.xy, uv2.zw)).a);
        }

        vec4 img = texture2D(s_image, clamp(v_uv1, uv2.xy, uv2.zw));
        gl_FragColor = (img + (1.0 - img.a) * (SHADOW_COLOR * alpha)) * (opacity_ * paint.a);

    #elif defined(EFFECT_IMAGE_BLUR_V)
        #define BLUR_SIZE u_effectParams[0].x

        vec4 color = vec4_splat(0.0);
        vec2 dir = vec2(0.0, BLUR_SIZE * u_textureDimensions.w);

        for (int i = 0; i < GAUSSIAN_NUM_SAMPLES; i++)
        {
            vec2 uvOffset = o[i] * dir;
            color += w[i] * (texture2D(s_image, clamp(v_uv1 + uvOffset, uv2.xy, uv2.zw)) + texture2D(s_image, clamp(v_uv1 - uvOffset, uv2.xy, uv2.zw)));
        }

        gl_FragColor = color;

    #elif defined(EFFECT_IMAGE_BLUR_H)
        #define BLUR_SIZE u_effectParams[0].x

        vec4 color = vec4_splat(0.0);
        vec2 dir = vec2(BLUR_SIZE * u_textureDimensions.z, 0.0);

        for (int i = 0; i < GAUSSIAN_NUM_SAMPLES; i++)
        {
            vec2 uvOffset = o[i] * dir;
            color += w[i] * (texture2D(s_shadow, clamp(v_uv1 + uvOffset, uv2.xy, uv2.zw)) + texture2D(s_shadow, clamp(v_uv1 - uvOffset, uv2.xy, uv2.zw)));
        }

        gl_FragColor = color * (opacity_ * paint.a);

    #elif defined(EFFECT_SDF)
        vec4 color = texture2D(s_glyphs, v_uv1);
        float distance = SDF_SCALE * (color.r - SDF_BIAS);
        vec2 grad = dFdx(v_st1);

        float gradLen = length(grad);
        float scale = 1.0 / gradLen;
        float base = SDF_BASE_DEV * (1.0 - (clamp(scale, SDF_BASE_MIN, SDF_BASE_MAX) - SDF_BASE_MIN) / (SDF_BASE_MAX - SDF_BASE_MIN));
        float range = SDF_AA_FACTOR * gradLen;
        float alpha = smoothstep(base - range, base + range, distance);
        gl_FragColor = (alpha * opacity_) * paint;

    #endif
}
