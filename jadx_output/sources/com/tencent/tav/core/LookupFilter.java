package com.tencent.tav.core;

/* loaded from: classes14.dex */
public class LookupFilter extends com.tencent.tav.core.MultiTextureFilter {
    private static final java.lang.String FRAGMENT_SHADER = "sTexture;\nprecision mediump float;\nuniform sampler2D sLookupTexture; // lookup texture\nvarying highp vec2 vTextureCoord;\n\nuniform lowp float intensity;\nuniform lowp float uAlpha;\n\nvoid main()\n{\n    highp vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    textureColor = clamp(textureColor, 0.0, 1.0);\n    highp float blueColor = textureColor.b * 63.0;\n    \n    highp vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    \n    highp vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    \n    highp float redPos = 0.125 * textureColor.r;\n    highp float greenPos = 0.125 * textureColor.g;\n    redPos = clamp(redPos, 2.0/512.0, 0.125- 2.0/512.0);\n    greenPos = clamp(greenPos, 2.0/512.0, 0.125- 2.0/512.0);\n    highp vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + redPos;\n    texPos1.y = (quad1.y * 0.125)  + greenPos;\n    \n    highp vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125)  + redPos;\n    texPos2.y = (quad2.y * 0.125) + greenPos;\n    \n    lowp vec4 newColor1 = texture2D(sLookupTexture, texPos1);\n    lowp vec4 newColor2 = texture2D(sLookupTexture, texPos2);\n    \n    lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    newColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), intensity);\n    gl_FragColor = mix(vec4(0,0,0,1), newColor, uAlpha);\n}";
    private static final java.lang.String FRAGMENT_SHADER_PREFIX = "uniform sampler2D  ";
    private static final java.lang.String FRAGMENT_SHADER_PREFIX_OES = " #extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES ";
    private static final java.lang.String VERTEX_SHADER = "uniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";
    public float intensity;
    private int intensityHandle;
    public android.graphics.Bitmap lookupBitmap;
    public java.lang.String lookupBitmapPath;
    private int lookupTextureID;
    private int sLookupTextureHandle;

    public LookupFilter(android.graphics.Bitmap bitmap) {
        this(bitmap, 1.0f);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        com.tencent.tav.core.LookupFilter lookupFilter = (com.tencent.tav.core.LookupFilter) obj;
        if (this.intensity == lookupFilter.intensity && this.lookupBitmap == lookupFilter.lookupBitmap) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // com.tencent.tav.core.MultiTextureFilter
    public void finishDraw(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        super.finishDraw(textureInfo);
        android.opengl.GLES20.glActiveTexture(33985);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    @Override // com.tencent.tav.core.MultiTextureFilter
    public void initShaderForTextureInfo(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        if (textureInfo.textureType == 36197) {
            initShaders(VERTEX_SHADER, " #extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES sTexture;\nprecision mediump float;\nuniform sampler2D sLookupTexture; // lookup texture\nvarying highp vec2 vTextureCoord;\n\nuniform lowp float intensity;\nuniform lowp float uAlpha;\n\nvoid main()\n{\n    highp vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    textureColor = clamp(textureColor, 0.0, 1.0);\n    highp float blueColor = textureColor.b * 63.0;\n    \n    highp vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    \n    highp vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    \n    highp float redPos = 0.125 * textureColor.r;\n    highp float greenPos = 0.125 * textureColor.g;\n    redPos = clamp(redPos, 2.0/512.0, 0.125- 2.0/512.0);\n    greenPos = clamp(greenPos, 2.0/512.0, 0.125- 2.0/512.0);\n    highp vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + redPos;\n    texPos1.y = (quad1.y * 0.125)  + greenPos;\n    \n    highp vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125)  + redPos;\n    texPos2.y = (quad2.y * 0.125) + greenPos;\n    \n    lowp vec4 newColor1 = texture2D(sLookupTexture, texPos1);\n    lowp vec4 newColor2 = texture2D(sLookupTexture, texPos2);\n    \n    lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    newColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), intensity);\n    gl_FragColor = mix(vec4(0,0,0,1), newColor, uAlpha);\n}");
        } else {
            initShaders(VERTEX_SHADER, "uniform sampler2D  sTexture;\nprecision mediump float;\nuniform sampler2D sLookupTexture; // lookup texture\nvarying highp vec2 vTextureCoord;\n\nuniform lowp float intensity;\nuniform lowp float uAlpha;\n\nvoid main()\n{\n    highp vec4 textureColor = texture2D(sTexture, vTextureCoord);\n    textureColor = clamp(textureColor, 0.0, 1.0);\n    highp float blueColor = textureColor.b * 63.0;\n    \n    highp vec2 quad1;\n    quad1.y = floor(floor(blueColor) / 8.0);\n    quad1.x = floor(blueColor) - (quad1.y * 8.0);\n    \n    highp vec2 quad2;\n    quad2.y = floor(ceil(blueColor) / 8.0);\n    quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n    \n    highp float redPos = 0.125 * textureColor.r;\n    highp float greenPos = 0.125 * textureColor.g;\n    redPos = clamp(redPos, 2.0/512.0, 0.125- 2.0/512.0);\n    greenPos = clamp(greenPos, 2.0/512.0, 0.125- 2.0/512.0);\n    highp vec2 texPos1;\n    texPos1.x = (quad1.x * 0.125) + redPos;\n    texPos1.y = (quad1.y * 0.125)  + greenPos;\n    \n    highp vec2 texPos2;\n    texPos2.x = (quad2.x * 0.125)  + redPos;\n    texPos2.y = (quad2.y * 0.125) + greenPos;\n    \n    lowp vec4 newColor1 = texture2D(sLookupTexture, texPos1);\n    lowp vec4 newColor2 = texture2D(sLookupTexture, texPos2);\n    \n    lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n    newColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), intensity);\n    gl_FragColor = mix(vec4(0,0,0,1), newColor, uAlpha);\n}");
        }
        this.sLookupTextureHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "sLookupTexture");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation sLookupTexture");
        if (this.sLookupTextureHandle == -1) {
            throw new java.lang.RuntimeException("Could not get uniform location for sLookupTexture");
        }
        this.intensityHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "intensity");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation intensity");
        if (this.intensityHandle == -1) {
            throw new java.lang.RuntimeException("Could not get uniform location for intensity");
        }
        if (this.lookupTextureID == -1) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            int i17 = iArr[0];
            android.opengl.GLES20.glBindTexture(3553, i17);
            com.tencent.tav.decoder.RenderContext.checkEglError("glBindTexture mTextureID");
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            com.tencent.tav.decoder.RenderContext.checkEglError("glTexParameter");
            android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB, getRendererWidth(), getRendererHeight(), 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
            android.opengl.GLUtils.texImage2D(3553, 0, this.lookupBitmap, 0);
            this.lookupTextureID = i17;
        }
    }

    @Override // com.tencent.tav.core.MultiTextureFilter
    public void prepareDraw(com.tencent.tav.coremedia.TextureInfo textureInfo, float[] fArr) {
        super.prepareDraw(textureInfo, fArr);
        android.opengl.GLES20.glActiveTexture(33985);
        android.opengl.GLES20.glBindTexture(3553, this.lookupTextureID);
        android.opengl.GLES20.glUniform1i(this.sLookupTextureHandle, 1);
        android.opengl.GLES20.glUniform1f(this.intensityHandle, this.intensity);
    }

    @Override // com.tencent.tav.core.MultiTextureFilter
    public void release() {
        super.release();
        int i17 = this.lookupTextureID;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
            this.lookupTextureID = -1;
        }
    }

    public LookupFilter(android.graphics.Bitmap bitmap, float f17) {
        this.lookupTextureID = -1;
        this.lookupBitmap = bitmap;
        this.intensity = f17;
    }

    @Override // com.tencent.tav.core.MultiTextureFilter
    /* renamed from: clone */
    public com.tencent.tav.core.MultiTextureFilter mo410clone() {
        com.tencent.tav.core.LookupFilter lookupFilter = new com.tencent.tav.core.LookupFilter(this.lookupBitmap, this.intensity);
        com.tencent.tav.core.MultiTextureFilter multiTextureFilter = this.subFilter;
        if (multiTextureFilter != null) {
            lookupFilter.setSubFilter(multiTextureFilter.mo410clone());
        }
        return lookupFilter;
    }
}
