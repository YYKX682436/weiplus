package com.tencent.tavkit.ciimage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class TextureFilter {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final java.lang.String FRAGMENT_SHADER = "#version 300 es\nuniform sampler2D sTexture;\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform float uAlpha;\nuniform int uIsCrop;\nuniform vec4 uCropRect;\nout vec4 outColor;\nvoid main() {\n  vec4 color;\n  if(uIsCrop == 1) {\n    ivec2 size = textureSize(sTexture, 0);\n    float cropWidth = uCropRect.z - uCropRect.x;\n    float cropHeight = uCropRect.w - uCropRect.y;\n    float sizeWidth = float(size.x);\n    float sizeHeight = float(size.y);\n    float pointX = vTextureCoord.x;\n    float pointY = vTextureCoord.y;\n    if(cropWidth <= sizeWidth) {\n        pointX = vTextureCoord.x * cropWidth / sizeWidth + (uCropRect.x / sizeWidth);\n    }\n    if(cropHeight <= sizeHeight) {\n        pointY = vTextureCoord.y * cropHeight / sizeHeight + (uCropRect.y / sizeHeight);\n    }\n    vec2 point = vec2(pointX, pointY);\n    color = texture(sTexture, point);\n  } else {\n    color = texture(sTexture, vTextureCoord);\n  }\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final java.lang.String FRAGMENT_SHADER_2 = "uniform sampler2D sTexture;\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final java.lang.String FRAGMENT_SHADER_END = "precision mediump float;\nin vec2 vTextureCoord;\nuniform float uAlpha;\nuniform int uIsCrop;\nuniform vec4 uCropRect;\nout vec4 outColor;\nvoid main() {\n  vec4 color;\n  if(uIsCrop == 1) {\n    ivec2 size = textureSize(sTexture, 0);\n    float cropWidth = uCropRect.z - uCropRect.x;\n    float cropHeight = uCropRect.w - uCropRect.y;\n    float sizeWidth = float(size.x);\n    float sizeHeight = float(size.y);\n    float pointX = vTextureCoord.x;\n    float pointY = vTextureCoord.y;\n    if(cropWidth <= sizeWidth) {\n        pointX = vTextureCoord.x * cropWidth / sizeWidth + (uCropRect.x / sizeWidth);\n    }\n    if(cropHeight <= sizeHeight) {\n        pointY = vTextureCoord.y * cropHeight / sizeHeight + (uCropRect.y / sizeHeight);\n    }\n    vec2 point = vec2(pointX, pointY);\n    color = texture(sTexture, point);\n  } else {\n    color = texture(sTexture, vTextureCoord);\n  }\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final java.lang.String FRAGMENT_SHADER_END_2 = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final java.lang.String FRAGMENT_SHADER_OES = "#version 300 es\n#extension GL_OES_EGL_image_external : require\n#extension GL_OES_EGL_image_external_essl3 : enable\nuniform samplerExternalOES sTexture;\nprecision mediump float;\nin vec2 vTextureCoord;\nuniform float uAlpha;\nuniform int uIsCrop;\nuniform vec4 uCropRect;\nout vec4 outColor;\nvoid main() {\n  vec4 color;\n  if(uIsCrop == 1) {\n    ivec2 size = textureSize(sTexture, 0);\n    float cropWidth = uCropRect.z - uCropRect.x;\n    float cropHeight = uCropRect.w - uCropRect.y;\n    float sizeWidth = float(size.x);\n    float sizeHeight = float(size.y);\n    float pointX = vTextureCoord.x;\n    float pointY = vTextureCoord.y;\n    if(cropWidth <= sizeWidth) {\n        pointX = vTextureCoord.x * cropWidth / sizeWidth + (uCropRect.x / sizeWidth);\n    }\n    if(cropHeight <= sizeHeight) {\n        pointY = vTextureCoord.y * cropHeight / sizeHeight + (uCropRect.y / sizeHeight);\n    }\n    vec2 point = vec2(pointX, pointY);\n    color = texture(sTexture, point);\n  } else {\n    color = texture(sTexture, vTextureCoord);\n  }\n  outColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final java.lang.String FRAGMENT_SHADER_OES_2 = "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES sTexture;\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 8;
    private static final java.lang.String VERTEX_SHADER = "#version 300 es\nuniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nin vec2 aPosition;\nout vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";
    private static final java.lang.String VERTEX_SHADER_2 = "uniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";
    private final java.lang.String TAG;
    private int aPositionHandle;
    private com.tencent.tavkit.ciimage.GLBlendStateCache glBlendStateCache;
    private int outputFrameBufferId;
    private com.tencent.tav.coremedia.TextureInfo outputTextureInfo;
    protected int program;
    private int rendererHeight;
    private int rendererWidth;
    private final int[] shaderIndexes;
    private int stMatrixHandle;
    private java.nio.FloatBuffer triangleVertices;
    private int uAlphaHandle;
    private int uCropHandle;
    private int uCropRectHandle;
    private int uMatrixHandle;
    private int uScreenSizeHandle;
    private int uTextureSizeHandle;

    public TextureFilter() {
        java.lang.String str = "TextureFilter@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str;
        this.uCropHandle = -1;
        this.uCropRectHandle = -1;
        this.shaderIndexes = new int[2];
        this.outputTextureInfo = null;
        this.outputFrameBufferId = -1;
        com.tencent.tav.decoder.logger.Logger.d(str, "TextureFilter() called");
    }

    private void checkAndInitFrameBuffer(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        int frameBuffer = textureInfo.getFrameBuffer();
        if (frameBuffer == -1) {
            android.opengl.GLES20.glBindTexture(3553, textureInfo.textureID);
            android.opengl.GLES20.glTexImage2D(3553, 0, textureInfo.getFormat(), textureInfo.width, textureInfo.height, 0, textureInfo.getFormat(), com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
            frameBuffer = iArr[0];
            android.opengl.GLES20.glBindFramebuffer(36160, frameBuffer);
            com.tencent.tav.decoder.RenderContext.checkEglError("glBindFramebuffer outputFrameBufferId");
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureInfo.textureID, 0);
            com.tencent.tav.decoder.RenderContext.checkEglError("glCheckFramebufferStatus outputFrameBufferId");
            if (android.opengl.GLES20.glCheckFramebufferStatus(36160) != 36053) {
                new java.lang.RuntimeException("EGL error encountered: FramebufferStatus is not complete.");
                return;
            }
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
        }
        this.outputFrameBufferId = frameBuffer;
        textureInfo.setFrameBuffer(frameBuffer);
        this.outputTextureInfo = textureInfo;
    }

    private void finishDraw(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(textureInfo.textureType, 0);
    }

    private void initShaderForTextureInfo(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        boolean z17 = textureInfo.getTextureRect() == null || com.tencent.tav.Utils.isOnlySupportLowVersionGl();
        if (textureInfo.textureType == 36197) {
            if (z17) {
                initShaders(VERTEX_SHADER_2, FRAGMENT_SHADER_OES_2, true);
                return;
            } else {
                initShaders(VERTEX_SHADER, FRAGMENT_SHADER_OES, false);
                return;
            }
        }
        if (z17) {
            initShaders(VERTEX_SHADER_2, FRAGMENT_SHADER_2, true);
        } else {
            initShaders(VERTEX_SHADER, FRAGMENT_SHADER, false);
        }
    }

    private void initShaders(java.lang.String str, java.lang.String str2, boolean z17) {
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
        if (!z17) {
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
                return;
            }
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

    private boolean isEqualsCurrentOutputTexture(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        com.tencent.tav.coremedia.TextureInfo textureInfo2 = this.outputTextureInfo;
        if (textureInfo2 == null) {
            return false;
        }
        if (textureInfo2.equals(textureInfo)) {
            return true;
        }
        com.tencent.tav.coremedia.TextureInfo textureInfo3 = this.outputTextureInfo;
        return textureInfo3.textureID == textureInfo.textureID && textureInfo3.width == textureInfo.width && textureInfo3.height == textureInfo.height;
    }

    private void prepareDraw(com.tencent.tav.coremedia.TextureInfo textureInfo, float[] fArr) {
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
    }

    public com.tencent.tav.coremedia.TextureInfo applyFilter(com.tencent.tav.coremedia.TextureInfo textureInfo, android.graphics.Matrix matrix, android.graphics.Matrix matrix2, float f17, com.tencent.tav.coremedia.CGRect cGRect) {
        com.tencent.tav.coremedia.CGRect cGRect2 = cGRect;
        if (textureInfo == null) {
            return null;
        }
        if (this.glBlendStateCache == null) {
            this.glBlendStateCache = new com.tencent.tavkit.ciimage.GLBlendStateCache();
        }
        this.glBlendStateCache.cache();
        if (this.program == 0) {
            initShaderForTextureInfo(textureInfo);
        }
        com.tencent.tav.decoder.RenderContext.checkEglError("onDrawFrame start");
        if (cGRect2 == null) {
            cGRect2 = new com.tencent.tav.coremedia.CGRect(0.0f, 0.0f, textureInfo.width, textureInfo.height);
        } else {
            com.tencent.tav.coremedia.CGSize cGSize = cGRect2.size;
            cGSize.width = java.lang.Math.min(textureInfo.width, cGSize.width);
            com.tencent.tav.coremedia.CGSize cGSize2 = cGRect2.size;
            cGSize2.height = java.lang.Math.min(textureInfo.height, cGSize2.height);
        }
        float f18 = cGRect2.origin.x + cGRect2.size.width;
        int i17 = textureInfo.width;
        if (f18 > i17) {
            f18 = i17;
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "applyFilter: crop right pixel exceed texture width");
        }
        float f19 = cGRect2.origin.y + cGRect2.size.height;
        int i18 = textureInfo.height;
        if (f19 > i18) {
            f19 = i18;
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "applyFilter: crop bottom pixel exceed texture height");
        }
        android.graphics.PointF pointF = cGRect2.origin;
        float f27 = pointF.x;
        float f28 = pointF.y;
        this.triangleVertices.rewind();
        this.triangleVertices.put(new float[]{f27, f19, f27, f28, f18, f19, f18, f28});
        int[] iArr = new int[4];
        android.opengl.GLES20.glGetIntegerv(2978, iArr, 0);
        int i19 = this.outputFrameBufferId;
        if (i19 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i19);
            android.opengl.GLES20.glGetIntegerv(2978, iArr, 0);
            android.opengl.GLES20.glViewport(0, 0, this.rendererWidth, this.rendererHeight);
        }
        android.opengl.GLES20.glUseProgram(this.program);
        com.tencent.tav.decoder.RenderContext.checkEglError("glUseProgram");
        android.opengl.GLES20.glUniformMatrix3fv(this.stMatrixHandle, 1, false, com.tencent.tav.decoder.DecoderUtils.toOpenGL2DMatrix(matrix2), 0);
        android.opengl.GLES20.glUniform1f(this.uAlphaHandle, f17);
        android.graphics.Rect textureRect = textureInfo.getTextureRect();
        if (textureRect != null && textureRect.right > textureRect.left && textureRect.bottom > textureRect.top) {
            android.opengl.GLES20.glUniform1i(this.uCropHandle, 1);
            android.opengl.GLES20.glUniform4f(this.uCropRectHandle, textureRect.left, textureRect.top, textureRect.right, textureRect.bottom);
        }
        android.opengl.GLES20.glEnable(3042);
        if (textureInfo.isMixAlpha()) {
            android.opengl.GLES20.glBlendEquationSeparate(32774, 32774);
            android.opengl.GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        } else {
            android.opengl.GLES20.glBlendEquationSeparate(32774, 32774);
            android.opengl.GLES20.glBlendFuncSeparate(1, 771, 1, 771);
        }
        prepareDraw(textureInfo, com.tencent.tav.decoder.DecoderUtils.toOpenGL2DMatrix(matrix));
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        com.tencent.tav.decoder.RenderContext.checkEglError("glDrawArrays");
        finishDraw(textureInfo);
        if (this.outputFrameBufferId != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.opengl.GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
        this.glBlendStateCache.restore();
        return this.outputTextureInfo;
    }

    public void clearBufferBuffer(int i17) {
        clearBufferBuffer(i17, 0.0f);
    }

    public void release() {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "release: start, thread = " + java.lang.Thread.currentThread().getName() + ", egl = " + android.opengl.EGL14.eglGetCurrentContext());
        com.tencent.tav.coremedia.TextureInfo textureInfo = this.outputTextureInfo;
        if (textureInfo != null) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{textureInfo.textureID}, 0);
            this.outputTextureInfo = null;
        }
        int i17 = this.outputFrameBufferId;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
            this.outputFrameBufferId = -1;
        }
        int i18 = this.program;
        if (i18 > 0) {
            android.opengl.GLES20.glDeleteProgram(i18);
            this.program = 0;
        }
        int i19 = 0;
        while (true) {
            int[] iArr = this.shaderIndexes;
            if (i19 >= iArr.length) {
                com.tencent.tav.decoder.logger.Logger.d(this.TAG, "release: end");
                return;
            }
            int i27 = iArr[i19];
            if (i27 > 0) {
                android.opengl.GLES20.glDeleteShader(i27);
                this.shaderIndexes[i19] = 0;
            }
            i19++;
        }
    }

    public void setOutputTextureInfo(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        if (textureInfo == null) {
            throw new java.lang.RuntimeException("outputTextureInfo 为空");
        }
        if (textureInfo.isReleased()) {
            throw new java.lang.RuntimeException("outputTextureInfo 已经被释放了");
        }
        if (textureInfo.textureType != 3553) {
            throw new java.lang.RuntimeException("目标纹理类型需要GLES20.GL_TEXTURE_2D");
        }
        this.rendererWidth = textureInfo.width;
        this.rendererHeight = textureInfo.height;
        if (isEqualsCurrentOutputTexture(textureInfo)) {
            return;
        }
        checkAndInitFrameBuffer(textureInfo);
    }

    public java.lang.String toString() {
        return "TextureFilter{program=" + this.program + ", rendererWidth=" + this.rendererWidth + ", rendererHeight=" + this.rendererHeight + ", outputTextureInfo=" + this.outputTextureInfo + ", outputFrameBufferId=" + this.outputFrameBufferId + '}';
    }

    public void clearBufferBuffer(int i17, float f17) {
        int i18 = this.outputFrameBufferId;
        if (i18 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i18);
            android.opengl.GLES20.glClearColor(((16711680 & i17) >> 16) / 255.0f, ((65280 & i17) >> 8) / 255.0f, (i17 & 255) / 255.0f, f17);
            android.opengl.GLES20.glClear(16384);
        }
    }
}
