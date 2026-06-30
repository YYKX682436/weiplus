package com.tencent.tav.decoder.decodecache;

/* loaded from: classes14.dex */
class CopyFilter {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final java.lang.String FRAGMENT_SHADER = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform float uAlpha;\nvoid main() {\n   vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final java.lang.String FRAGMENT_SHADER_OES = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTextureOES;\nuniform float uAlpha;\nvoid main() {\n  vec4 color = texture2D(sTextureOES, vTextureCoord);\n  gl_FragColor = mix(vec4(0,0,0,1), color, uAlpha);\n}\n";
    private static final java.lang.String TAG = "MultiTextureFilter";
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 8;
    private static final java.lang.String VERTEX_SHADER = "uniform vec2 uScreenSize;\nuniform vec2 uTextureSize;\nuniform mat3 uMatrix;\nuniform mat3 stMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec3 position = uMatrix * vec3(aPosition, 1);\n  vec2 clipSpace = (position.xy / uScreenSize) * 2.0 - 1.0;\n  gl_Position = vec4(clipSpace, 0, 1);\n  vec3 coord = vec3(aPosition / uTextureSize, 1);\n  vTextureCoord = (stMatrix * coord).xy;\n}\n";
    private int aPositionHandle;
    protected int program;
    private int rendererHeight;
    private int rendererWidth;
    private int stMatrixHandle;
    private java.nio.FloatBuffer triangleVertices;
    private int uAlphaHandle;
    private int uMatrixHandle;
    private int uScreenSizeHandle;
    private int uTextureSizeHandle;
    private boolean renderForScreen = false;
    private final int[] shaderIndexes = new int[2];
    private com.tencent.tav.coremedia.TextureInfo _textureInfo = null;
    private int frameBuffer = -1;
    private int[] defaultViewport = new int[4];

    private void initFrameBuffer(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        if (textureInfo.textureType != 3553) {
            throw new java.lang.RuntimeException("纹理类型不可为OES");
        }
        android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB, this.rendererWidth, this.rendererHeight, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        this._textureInfo = textureInfo;
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        int i17 = iArr[0];
        android.opengl.GLES20.glBindFramebuffer(36160, i17);
        com.tencent.tav.decoder.RenderContext.checkEglError("glBindFramebuffer frameBuffer");
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureInfo.textureID, 0);
        com.tencent.tav.decoder.RenderContext.checkEglError("glCheckFramebufferStatus frameBuffer");
        if (android.opengl.GLES20.glCheckFramebufferStatus(36160) != 36053) {
            new java.lang.RuntimeException("EGL error encountered: FramebufferStatus is not complete.");
            return;
        }
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        this.frameBuffer = i17;
        textureInfo.setFrameBuffer(i17);
    }

    public com.tencent.tav.coremedia.TextureInfo applyFilter(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        return applyFilter(textureInfo, null);
    }

    public void clearBufferBuffer(int i17) {
        int i18 = this.frameBuffer;
        if (i18 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i18);
            android.opengl.GLES20.glClearColor(((16711680 & i17) >> 16) / 255.0f, ((65280 & i17) >> 8) / 255.0f, (i17 & 255) / 255.0f, 1.0f);
            android.opengl.GLES20.glClear(16384);
        }
    }

    public void finishDraw(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(textureInfo.textureType, 0);
    }

    public int getRendererHeight() {
        return this.rendererHeight;
    }

    public int getRendererWidth() {
        return this.rendererWidth;
    }

    public void initShaderForTextureInfo(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        if (textureInfo.textureType == 36197) {
            initShaders(VERTEX_SHADER, FRAGMENT_SHADER_OES);
        } else {
            initShaders(VERTEX_SHADER, FRAGMENT_SHADER);
        }
    }

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

    public void prepareDraw(com.tencent.tav.coremedia.TextureInfo textureInfo, float[] fArr) {
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

    public void release() {
        releaseTexture();
        releaseProgram();
        int i17 = 0;
        while (true) {
            int[] iArr = this.shaderIndexes;
            if (i17 >= iArr.length) {
                return;
            }
            int i18 = iArr[i17];
            if (i18 > 0) {
                android.opengl.GLES20.glDeleteShader(i18);
                this.shaderIndexes[i17] = 0;
            }
            i17++;
        }
    }

    public void releaseProgram() {
        int i17 = this.program;
        if (i17 > 0) {
            android.opengl.GLES20.glDeleteProgram(i17);
            this.program = 0;
        }
    }

    public void releaseTexture() {
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
    }

    public void setDesTextureInfo(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        if (textureInfo.getFrameBuffer() == -1) {
            initFrameBuffer(textureInfo);
        } else {
            this.frameBuffer = textureInfo.getFrameBuffer();
        }
        this._textureInfo = textureInfo;
    }

    public void setRenderForScreen(boolean z17) {
        this.renderForScreen = z17;
    }

    public void setRendererHeight(int i17) {
        this.rendererHeight = i17;
    }

    public void setRendererWidth(int i17) {
        this.rendererWidth = i17;
    }

    public com.tencent.tav.coremedia.TextureInfo textureInfo() {
        return this._textureInfo;
    }

    public com.tencent.tav.coremedia.TextureInfo applyFilter(com.tencent.tav.coremedia.TextureInfo textureInfo, android.graphics.Matrix matrix) {
        if (!this.renderForScreen && this.frameBuffer == -1) {
            initFrameBuffer(this._textureInfo);
        }
        if (this.program == 0) {
            initShaderForTextureInfo(textureInfo);
        }
        com.tencent.tav.decoder.RenderContext.checkEglError("onDrawFrame start");
        com.tencent.tav.coremedia.CGRect cGRect = new com.tencent.tav.coremedia.CGRect(0.0f, 0.0f, textureInfo.width, textureInfo.height);
        float f17 = cGRect.origin.x + cGRect.size.width;
        int i17 = textureInfo.width;
        if (f17 > i17) {
            f17 = i17;
            com.tencent.tav.decoder.logger.Logger.e(TAG, "applyFilter: crop right pixel exceed texture width");
        }
        float f18 = cGRect.origin.y + cGRect.size.height;
        int i18 = textureInfo.height;
        if (f18 > i18) {
            f18 = i18;
            com.tencent.tav.decoder.logger.Logger.e(TAG, "applyFilter: crop bottom pixel exceed texture height");
        }
        android.graphics.PointF pointF = cGRect.origin;
        float f19 = pointF.x;
        float f27 = pointF.y;
        this.triangleVertices.rewind();
        this.triangleVertices.put(new float[]{f19, f18, f19, f27, f17, f18, f17, f27});
        android.opengl.GLES20.glGetIntegerv(2978, this.defaultViewport, 0);
        int i19 = this.frameBuffer;
        if (i19 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i19);
            android.opengl.GLES20.glGetIntegerv(2978, this.defaultViewport, 0);
            android.opengl.GLES20.glViewport(0, 0, this.rendererWidth, this.rendererHeight);
        }
        android.opengl.GLES20.glUseProgram(this.program);
        com.tencent.tav.decoder.RenderContext.checkEglError("glUseProgram");
        android.opengl.GLES20.glUniformMatrix3fv(this.stMatrixHandle, 1, false, com.tencent.tav.decoder.DecoderUtils.toOpenGL2DMatrix(matrix), 0);
        android.opengl.GLES20.glUniform1f(this.uAlphaHandle, 1.0f);
        prepareDraw(textureInfo, com.tencent.tav.decoder.DecoderUtils.toOpenGL2DMatrix(null));
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
}
