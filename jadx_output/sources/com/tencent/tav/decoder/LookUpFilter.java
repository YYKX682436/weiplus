package com.tencent.tav.decoder;

/* loaded from: classes14.dex */
public class LookUpFilter extends com.tencent.tav.decoder.Filter {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final java.lang.String FRAGMENT_SHADER = "#version 300 es\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D lookupTexture;\nuniform float uAlpha;\nuniform int uIsEnableLut;\nout vec4 outColor;\nvoid main() {\n   vec4 textureColor = texture(sTexture, vTextureCoord);\n  textureColor = mix(vec4(0,0,0,1), textureColor, uAlpha);\n  if(uIsEnableLut == 1) {\n     textureColor = mix(vec4(0,0,0,1), textureColor, uAlpha);\n     textureColor.b = clamp(textureColor.b, 0.0, 1.0);\n     textureColor.r = clamp(textureColor.r, 0.0, 1.0);\n     textureColor.g = clamp(textureColor.g, 0.0, 1.0);\n     highp float blueColor = textureColor.b * 63.0;\n\n     highp vec2 pointQuad1;\n     pointQuad1.y = floor(floor(blueColor) / 8.0);\n     pointQuad1.x = floor(blueColor) - (pointQuad1.y * 8.0);\n\n     highp vec2 pointQuad2;\n     pointQuad2.y = floor(ceil(blueColor) / 8.0);\n     pointQuad2.x = ceil(blueColor) - (pointQuad2.y * 8.0);\n\n     highp vec2 texPoint1;\n     texPoint1.x = (pointQuad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint1.y = (pointQuad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    highp vec2 texPoint2;\n     texPoint2.x = (pointQuad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint2.y = (pointQuad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n     lowp vec4 newColor1 = texture(lookupTexture, texPoint1);\n     lowp vec4 newColor2 = texture(lookupTexture, texPoint2);\n\n     lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n     textureColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), 1.0);\n  }\n  outColor = textureColor;\n}\n";
    private static final java.lang.String FRAGMENT_SHADER_2 = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D lookupTexture;\nuniform int uIsEnableLut;\nuniform float uAlpha;\nvoid main() {\n   vec4 textureColor = texture2D(sTexture, vTextureCoord);\n  textureColor = mix(vec4(0,0,0,1), textureColor, uAlpha);\n  if(uIsEnableLut == 1) {\n     textureColor = mix(vec4(0,0,0,1), textureColor, uAlpha);\n     textureColor.b = clamp(textureColor.b, 0.0, 1.0);\n     textureColor.r = clamp(textureColor.r, 0.0, 1.0);\n     textureColor.g = clamp(textureColor.g, 0.0, 1.0);\n     highp float blueColor = textureColor.b * 63.0;\n\n     highp vec2 pointQuad1;\n     pointQuad1.y = floor(floor(blueColor) / 8.0);\n     pointQuad1.x = floor(blueColor) - (pointQuad1.y * 8.0);\n\n     highp vec2 pointQuad2;\n     pointQuad2.y = floor(ceil(blueColor) / 8.0);\n     pointQuad2.x = ceil(blueColor) - (pointQuad2.y * 8.0);\n\n     highp vec2 texPoint1;\n     texPoint1.x = (pointQuad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint1.y = (pointQuad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    highp vec2 texPoint2;\n     texPoint2.x = (pointQuad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint2.y = (pointQuad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n     lowp vec4 newColor1 = texture2D(lookupTexture, texPoint1);\n     lowp vec4 newColor2 = texture2D(lookupTexture, texPoint2);\n\n     lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n     textureColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), 1.0);\n  }\n  gl_FragColor = textureColor;\n}\n";
    private static final java.lang.String FRAGMENT_SHADER_OES = "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : enable\nuniform samplerExternalOES sTexture;\nin highp vec2 vTextureCoord;\nprecision mediump float;\n\nuniform float uAlpha;\nuniform sampler2D lookupTexture;\nuniform int uIsCrop;\nuniform int uIsEnableLut;\nuniform vec4 uCropRect;\nout vec4 outColor;\n\nvoid main()\n{\n  vec4 textureColor;\n  if(uIsCrop == 1) {\n    ivec2 size = textureSize(sTexture, 0);\n    float cropWidth = uCropRect.z - uCropRect.x;\n    float cropHeight = uCropRect.w - uCropRect.y;\n    float sizeWidth = float(size.x);\n    float sizeHeight = float(size.y);\n    float pointX = vTextureCoord.x;\n    float pointY = vTextureCoord.y;\n    if(cropWidth <= sizeWidth) {\n        pointX = vTextureCoord.x * cropWidth / sizeWidth + (uCropRect.x / sizeWidth);\n    }\n    if(cropHeight <= sizeHeight) {\n        pointY = vTextureCoord.y * cropHeight / sizeHeight + (uCropRect.y / sizeHeight);\n    }\n    vec2 point = vec2(pointX, pointY);\n    textureColor = texture(sTexture, point);\n  } else {\n    textureColor = texture(sTexture, vTextureCoord);\n  }\n  textureColor = mix(vec4(0,0,0,1), textureColor, uAlpha);\n\n  if(uIsEnableLut == 1) {\n     textureColor = mix(vec4(0,0,0,1), textureColor, uAlpha);\n     textureColor.b = clamp(textureColor.b, 0.0, 1.0);\n     textureColor.r = clamp(textureColor.r, 0.0, 1.0);\n     textureColor.g = clamp(textureColor.g, 0.0, 1.0);\n     highp float blueColor = textureColor.b * 63.0;\n\n     highp vec2 pointQuad1;\n     pointQuad1.y = floor(floor(blueColor) / 8.0);\n     pointQuad1.x = floor(blueColor) - (pointQuad1.y * 8.0);\n\n     highp vec2 pointQuad2;\n     pointQuad2.y = floor(ceil(blueColor) / 8.0);\n     pointQuad2.x = ceil(blueColor) - (pointQuad2.y * 8.0);\n\n     highp vec2 texPoint1;\n     texPoint1.x = (pointQuad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint1.y = (pointQuad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    highp vec2 texPoint2;\n     texPoint2.x = (pointQuad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint2.y = (pointQuad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n     lowp vec4 newColor1 = texture(lookupTexture, texPoint1);\n     lowp vec4 newColor2 = texture(lookupTexture, texPoint2);\n\n     lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n     textureColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), 1.0);\n  }\n  outColor = textureColor;\n}";
    private static final java.lang.String FRAGMENT_SHADER_OES_2 = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTextureOES;\nuniform sampler2D lookupTexture;\nuniform int uIsEnableLut;\nuniform float uAlpha;\nvoid main() {\n  vec4 textureColor = texture2D(sTextureOES, vTextureCoord);\n  textureColor = mix(vec4(0,0,0,1), textureColor, uAlpha);\n  if(uIsEnableLut == 1) {\n     textureColor = mix(vec4(0,0,0,1), textureColor, uAlpha);\n     textureColor.b = clamp(textureColor.b, 0.0, 1.0);\n     textureColor.r = clamp(textureColor.r, 0.0, 1.0);\n     textureColor.g = clamp(textureColor.g, 0.0, 1.0);\n     highp float blueColor = textureColor.b * 63.0;\n\n     highp vec2 pointQuad1;\n     pointQuad1.y = floor(floor(blueColor) / 8.0);\n     pointQuad1.x = floor(blueColor) - (pointQuad1.y * 8.0);\n\n     highp vec2 pointQuad2;\n     pointQuad2.y = floor(ceil(blueColor) / 8.0);\n     pointQuad2.x = ceil(blueColor) - (pointQuad2.y * 8.0);\n\n     highp vec2 texPoint1;\n     texPoint1.x = (pointQuad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint1.y = (pointQuad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n    highp vec2 texPoint2;\n     texPoint2.x = (pointQuad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint2.y = (pointQuad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n     lowp vec4 newColor1 = texture2D(lookupTexture, texPoint1);\n     lowp vec4 newColor2 = texture2D(lookupTexture, texPoint2);\n\n     lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n     textureColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), 1.0);\n  }\n  gl_FragColor = textureColor;\n}\n";
    private static final java.lang.String TAG = "LookUpFilter";
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 8;
    private static final java.lang.String VERTEX_SHADER = "#version 300 es\nuniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nin vec2 aPosition;\nout vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";
    private static final java.lang.String VERTEX_SHADER_2 = "uniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";
    private int aPositionHandle;
    private android.graphics.Bitmap lutBitmap;
    protected int program;
    private int rendererHeight;
    private int rendererWidth;
    private int stMatrixHandle;
    private java.nio.FloatBuffer triangleVertices;
    private int uAlphaHandle;
    private int uMatrixHandle;
    private int uScreenSizeHandle;
    private int uTextureSizeHandle;
    private boolean useLut;
    private boolean renderForScreen = true;
    private int uCropHandle = -1;
    private int uCropRectHandle = -1;
    private int uLookupTextureHandle = -1;
    private int uLookupEnableHandle = -1;
    private int lookupTextureId = -1;
    private int bgColor = -16777216;
    private final int[] shaderIndexes = new int[2];
    private com.tencent.tav.coremedia.TextureInfo _textureInfo = null;
    private int frameBuffer = -1;
    private int[] defaultViewport = new int[4];

    public LookUpFilter(android.graphics.Bitmap bitmap) {
        this.useLut = false;
        this.lutBitmap = bitmap;
        this.useLut = (bitmap == null || bitmap.isRecycled()) ? false : true;
    }

    private void initFrameBuffer() {
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
        android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB, this.rendererWidth, this.rendererHeight, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        this._textureInfo = new com.tencent.tav.coremedia.TextureInfo(i17, 3553, this.rendererWidth, this.rendererHeight, null, 0);
        int[] iArr2 = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr2, 0);
        int i18 = iArr2[0];
        android.opengl.GLES20.glBindFramebuffer(36160, i18);
        com.tencent.tav.decoder.RenderContext.checkEglError("glBindFramebuffer frameBuffer");
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
        com.tencent.tav.decoder.RenderContext.checkEglError("glCheckFramebufferStatus frameBuffer");
        if (android.opengl.GLES20.glCheckFramebufferStatus(36160) != 36053) {
            new java.lang.RuntimeException("EGL error encountered: FramebufferStatus is not complete.");
        } else {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            this.frameBuffer = i18;
        }
    }

    private void initLutInfo() {
        if (this.useLut) {
            this.uLookupTextureHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "lookupTexture");
            com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation uLookupTextureHandle");
            if (this.uLookupTextureHandle == -1) {
                new java.lang.RuntimeException("Could not get uniform location for uLookupTextureHandle");
                return;
            }
            this.uLookupEnableHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uIsEnableLut");
            com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation uLookupTextureHandle");
            if (this.uLookupEnableHandle == -1) {
                new java.lang.RuntimeException("Could not get uniform location for uLookupTextureHandle");
                return;
            }
            if (this.lookupTextureId == -1) {
                int[] iArr = {-1};
                android.opengl.GLES20.glGenTextures(1, iArr, 0);
                android.opengl.GLES20.glBindTexture(3553, iArr[0]);
                android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
                android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
                android.opengl.GLUtils.texImage2D(3553, 0, this.lutBitmap, 0);
                this.lookupTextureId = iArr[0];
            }
        }
    }

    private void initOESShaderExtraInfo() {
        this.uCropHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uIsCrop");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation uCropHandle");
        if (this.uCropHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uCropHandle");
            return;
        }
        this.uCropRectHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uCropRect");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation uCropRectHandle");
        if (this.uCropRectHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uCropRectHandle");
        }
    }

    @Override // com.tencent.tav.decoder.Filter
    public com.tencent.tav.coremedia.TextureInfo applyFilter(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        return applyFilter(textureInfo, null, null, 1.0f);
    }

    @Override // com.tencent.tav.decoder.Filter
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        com.tencent.tav.decoder.LookUpFilter lookUpFilter = (com.tencent.tav.decoder.LookUpFilter) obj;
        return this.rendererHeight == lookUpFilter.rendererHeight && this.rendererWidth == lookUpFilter.rendererWidth && this.renderForScreen == lookUpFilter.renderForScreen;
    }

    @Override // com.tencent.tav.decoder.Filter
    public void finishDraw(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(textureInfo.textureType, 0);
    }

    @Override // com.tencent.tav.decoder.Filter
    public int getFrameBuffer() {
        return this.frameBuffer;
    }

    @Override // com.tencent.tav.decoder.Filter
    public int getRendererHeight() {
        return this.rendererHeight;
    }

    @Override // com.tencent.tav.decoder.Filter
    public int getRendererWidth() {
        return this.rendererWidth;
    }

    @Override // com.tencent.tav.decoder.Filter
    public int hashCode() {
        return ((((((((((((((((((((((0 + this.program) * 31) + this.uScreenSizeHandle) * 31) + this.uTextureSizeHandle) * 31) + this.uMatrixHandle) * 31) + this.uAlphaHandle) * 31) + this.stMatrixHandle) * 31) + this.aPositionHandle) * 31) + this.rendererWidth) * 31) + this.rendererHeight) * 31) + (this.renderForScreen ? 1 : 0)) * 31) + this.frameBuffer) * 31) + java.util.Arrays.hashCode(this.defaultViewport);
    }

    @Override // com.tencent.tav.decoder.Filter
    public void initShaderForTextureInfo(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        boolean isSupportGLSL3 = com.tencent.tav.player.TAVGLUtils.isSupportGLSL3();
        boolean isSupportGLOES3 = com.tencent.tav.player.TAVGLUtils.isSupportGLOES3();
        com.tencent.tav.decoder.logger.Logger.i(TAG, "check support, isSupportGLSL3 = " + isSupportGLSL3 + " isSupportGLOES3 = " + isSupportGLOES3);
        boolean z17 = !isSupportGLSL3 || !isSupportGLOES3 || textureInfo.getTextureRect() == null || com.tencent.tav.Utils.isOnlySupportLowVersionGl();
        if (textureInfo.textureType == 36197) {
            if (z17) {
                initShaders(VERTEX_SHADER_2, FRAGMENT_SHADER_OES_2);
            } else {
                initShaders(VERTEX_SHADER, FRAGMENT_SHADER_OES);
                initOESShaderExtraInfo();
            }
        } else if (z17) {
            initShaders(VERTEX_SHADER_2, FRAGMENT_SHADER_2);
        } else {
            initShaders(VERTEX_SHADER, FRAGMENT_SHADER);
        }
        initLutInfo();
    }

    @Override // com.tencent.tav.decoder.Filter
    public void initShaders(java.lang.String str, java.lang.String str2) {
        this.triangleVertices = java.nio.ByteBuffer.allocateDirect(64).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        int createProgram = com.tencent.tav.decoder.Program.createProgram(str, str2, this.shaderIndexes);
        this.program = createProgram;
        if (createProgram == 0) {
            new java.lang.RuntimeException("failed creating program");
            return;
        }
        this.aPositionHandle = android.opengl.GLES20.glGetAttribLocation(createProgram, "aPosition");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetAttribLocation aPosition");
        if (this.aPositionHandle == -1) {
            new java.lang.RuntimeException("Could not get attribute location for aPosition");
            return;
        }
        this.uMatrixHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uMatrix");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation uMatrix");
        if (this.uMatrixHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uMatrix");
            return;
        }
        this.uAlphaHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uAlpha");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation uAlpha");
        if (this.uAlphaHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uAlpha");
            return;
        }
        this.stMatrixHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "stMatrix");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation stMatrix");
        if (this.stMatrixHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for stMatrix");
            return;
        }
        this.uScreenSizeHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uScreenSize");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation uScreenSize");
        if (this.uScreenSizeHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uScreenSize");
            return;
        }
        this.uTextureSizeHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uTextureSize");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation uTextureSize");
        if (this.uTextureSizeHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uTextureSize");
        }
    }

    @Override // com.tencent.tav.decoder.Filter
    public void prepareDraw(com.tencent.tav.coremedia.TextureInfo textureInfo, float[] fArr) {
        android.graphics.Rect textureRect;
        int i17;
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(textureInfo.textureType, textureInfo.textureID);
        this.triangleVertices.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.aPositionHandle, 2, 5126, false, 8, (java.nio.Buffer) this.triangleVertices);
        com.tencent.tav.decoder.RenderContext.checkEglError("glVertexAttribPointer maPosition");
        android.opengl.GLES20.glEnableVertexAttribArray(this.aPositionHandle);
        com.tencent.tav.decoder.RenderContext.checkEglError("glEnableVertexAttribArray aPositionHandle");
        android.opengl.GLES20.glUniformMatrix3fv(this.uMatrixHandle, 1, false, fArr, 0);
        android.opengl.GLES20.glUniform2f(this.uTextureSizeHandle, textureInfo.width, textureInfo.height);
        android.opengl.GLES20.glUniform2f(this.uScreenSizeHandle, this.rendererWidth, this.rendererHeight);
        if (this.useLut && (i17 = this.uLookupEnableHandle) != -1 && this.uLookupTextureHandle != -1) {
            if (this.lookupTextureId == -1) {
                android.opengl.GLES20.glUniform1i(i17, 0);
            } else {
                android.opengl.GLES20.glUniform1i(i17, 1);
                android.opengl.GLES20.glActiveTexture(33987);
                android.opengl.GLES20.glBindTexture(3553, this.lookupTextureId);
                android.opengl.GLES20.glUniform1i(this.uLookupTextureHandle, 3);
            }
        }
        if (textureInfo.textureType != 36197 || this.uCropHandle == -1 || this.uCropRectHandle == -1 || (textureRect = textureInfo.getTextureRect()) == null || textureRect.right <= textureRect.left || textureRect.bottom <= textureRect.top) {
            return;
        }
        android.opengl.GLES20.glUniform1i(this.uCropHandle, 1);
        android.opengl.GLES20.glUniform4f(this.uCropRectHandle, textureRect.left, textureRect.top, textureRect.right, textureRect.bottom);
    }

    @Override // com.tencent.tav.decoder.Filter
    public void release() {
        int i17 = this.frameBuffer;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
            this.frameBuffer = -1;
        }
        com.tencent.tav.coremedia.TextureInfo textureInfo = this._textureInfo;
        if (textureInfo != null) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{textureInfo.textureID}, 0);
            this._textureInfo = null;
        }
        int i18 = this.lookupTextureId;
        if (i18 != -1) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i18}, 0);
        }
        int i19 = this.program;
        if (i19 > 0) {
            android.opengl.GLES20.glDeleteProgram(i19);
            this.program = 0;
        }
        int i27 = 0;
        while (true) {
            int[] iArr = this.shaderIndexes;
            if (i27 >= iArr.length) {
                return;
            }
            int i28 = iArr[i27];
            if (i28 > 0) {
                android.opengl.GLES20.glDeleteShader(i28);
                this.shaderIndexes[i27] = 0;
            }
            i27++;
        }
    }

    @Override // com.tencent.tav.decoder.Filter
    public void setBgColor(int i17) {
        this.bgColor = i17;
    }

    @Override // com.tencent.tav.decoder.Filter
    public void setRenderForScreen(boolean z17) {
        this.renderForScreen = z17;
    }

    @Override // com.tencent.tav.decoder.Filter
    public void setRendererHeight(int i17) {
        this.rendererHeight = i17;
    }

    @Override // com.tencent.tav.decoder.Filter
    public void setRendererWidth(int i17) {
        this.rendererWidth = i17;
    }

    public void setUseLut(boolean z17, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.useLut = z17;
        this.lutBitmap = bitmap;
    }

    @Override // com.tencent.tav.decoder.Filter
    public com.tencent.tav.coremedia.TextureInfo textureInfo() {
        return this._textureInfo;
    }

    @Override // com.tencent.tav.decoder.Filter
    public com.tencent.tav.coremedia.TextureInfo applyFilter(com.tencent.tav.coremedia.TextureInfo textureInfo, android.graphics.Matrix matrix, android.graphics.Matrix matrix2) {
        return applyFilter(textureInfo, matrix, matrix2, 1.0f);
    }

    @Override // com.tencent.tav.decoder.Filter
    public com.tencent.tav.coremedia.TextureInfo applyFilter(com.tencent.tav.coremedia.TextureInfo textureInfo, android.graphics.Matrix matrix, android.graphics.Matrix matrix2, float f17) {
        if (!this.renderForScreen && this.frameBuffer == -1) {
            initFrameBuffer();
        }
        if (this.program == 0) {
            initShaderForTextureInfo(textureInfo);
        }
        com.tencent.tav.decoder.RenderContext.checkEglError("onDrawFrame start");
        com.tencent.tav.decoder.Rectangle rectangle = new com.tencent.tav.decoder.Rectangle(0.0f, 0.0f, textureInfo.width, textureInfo.height);
        float f18 = rectangle.f215334x;
        float f19 = rectangle.f215335y;
        float f27 = rectangle.height;
        float f28 = rectangle.width;
        this.triangleVertices.rewind();
        this.triangleVertices.put(new float[]{f18, f19 + f27, f18, f19, f18 + f28, f27 + f19, f18 + f28, f19});
        android.opengl.GLES20.glGetIntegerv(2978, this.defaultViewport, 0);
        int i17 = this.frameBuffer;
        if (i17 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i17);
            android.opengl.GLES20.glGetIntegerv(2978, this.defaultViewport, 0);
            android.opengl.GLES20.glViewport(0, 0, this.rendererWidth, this.rendererHeight);
        }
        android.opengl.GLES20.glUseProgram(this.program);
        com.tencent.tav.decoder.RenderContext.checkEglError("glUseProgram");
        android.opengl.GLES20.glUniformMatrix3fv(this.stMatrixHandle, 1, false, com.tencent.tav.decoder.DecoderUtils.toOpenGL2DMatrix(matrix2), 0);
        android.opengl.GLES20.glUniform1f(this.uAlphaHandle, f17);
        prepareDraw(textureInfo, com.tencent.tav.decoder.DecoderUtils.toOpenGL2DMatrix(matrix));
        int i18 = this.bgColor;
        android.opengl.GLES20.glClearColor(((16711680 & i18) >> 16) / 255.0f, ((65280 & i18) >> 8) / 255.0f, (i18 & 255) / 255.0f, 1.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        com.tencent.tav.decoder.RenderContext.checkEglError("glDrawArrays");
        finishDraw(textureInfo);
        if (this.frameBuffer != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            int[] iArr = this.defaultViewport;
            android.opengl.GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        if (this.renderForScreen) {
            return null;
        }
        return this._textureInfo;
    }

    @Override // com.tencent.tav.decoder.Filter
    /* renamed from: clone */
    public com.tencent.tav.decoder.LookUpFilter mo417clone() {
        return new com.tencent.tav.decoder.LookUpFilter(this.lutBitmap);
    }
}
