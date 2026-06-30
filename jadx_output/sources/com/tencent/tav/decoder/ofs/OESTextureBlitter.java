package com.tencent.tav.decoder.ofs;

/* loaded from: classes14.dex */
public class OESTextureBlitter {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final java.lang.String FRAGMENT_SHADER_OES = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTextureOES;\nvoid main() {\n  gl_FragColor = texture2D(sTextureOES, vTextureCoord);\n}\n";
    private static final java.lang.String FRAGMENT_SHADER_OES_LUT = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTextureOES;\nuniform sampler2D lookupTexture;\nvoid main() {\n  vec4 textureColor = texture2D(sTextureOES, vTextureCoord);\n     textureColor.b = clamp(textureColor.b, 0.0, 1.0);\n     textureColor.r = clamp(textureColor.r, 0.0, 1.0);\n     textureColor.g = clamp(textureColor.g, 0.0, 1.0);\n     highp float blueColor = textureColor.b * 63.0;\n\n     highp vec2 pointQuad1;\n     pointQuad1.y = floor(floor(blueColor) / 8.0);\n     pointQuad1.x = floor(blueColor) - (pointQuad1.y * 8.0);\n\n     highp vec2 pointQuad2;\n     pointQuad2.y = floor(ceil(blueColor) / 8.0);\n     pointQuad2.x = ceil(blueColor) - (pointQuad2.y * 8.0);\n\n     highp vec2 texPoint1;\n     texPoint1.x = (pointQuad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint1.y = (pointQuad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n     highp vec2 texPoint2;\n     texPoint2.x = (pointQuad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPoint2.y = (pointQuad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n\n     lowp vec4 newColor1 = texture2D(lookupTexture, texPoint1);\n     lowp vec4 newColor2 = texture2D(lookupTexture, texPoint2);\n\n     lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n     textureColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), 1.0);\n  gl_FragColor = textureColor;\n}\n";
    private static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    private static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 20;
    private static final int TRIANGLE_VERTICES_DATA_UV_OFFSET = 3;
    private static final java.lang.String VERTEX_SHADER = "attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nuniform mat4 uSTMatrix;\nuniform mat4 uMVPMatrix;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private static final float[] sVerticesData = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    private int aPositionHandle;
    private int aTextureCoordHandle;
    private android.graphics.Bitmap lutBitmap;
    private int mvpMatrixHandle;
    protected int program;
    private int stMatrixHandle;
    private final java.nio.FloatBuffer triangleVertices;
    private int lookupTextureHandle = -1;
    private int lookupTextureId = -1;
    private float[] mvpMatrix = new float[16];
    private final int[] shaderIndexes = new int[2];
    private int frameBuffer = -1;
    private final int[] defaultViewport = new int[4];

    public OESTextureBlitter() {
        float[] fArr = sVerticesData;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.triangleVertices = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        android.opengl.Matrix.setIdentityM(this.mvpMatrix, 0);
    }

    private void initFrameBuffer() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        this.frameBuffer = iArr[0];
    }

    private boolean isUseLut() {
        return this.lookupTextureId > -1;
    }

    public void applyScale(float f17) {
        android.opengl.Matrix.scaleM(this.mvpMatrix, 0, f17, f17, f17);
    }

    public void blitTo(com.tencent.tav.coremedia.TextureInfo textureInfo, float[] fArr, int i17) {
        blitTo(textureInfo, fArr, i17, textureInfo.width, textureInfo.height);
    }

    public void finishDraw(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(textureInfo.textureType, 0);
    }

    public void initShaders(java.lang.String str, java.lang.String str2) {
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
        this.aTextureCoordHandle = android.opengl.GLES20.glGetAttribLocation(this.program, "aTextureCoord");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetAttribLocation aTextureCoord");
        if (this.aTextureCoordHandle == -1) {
            new java.lang.RuntimeException("Could not get attribute location for aTextureCoord");
            return;
        }
        this.mvpMatrixHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uMVPMatrix");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation uMVPMatrix");
        if (this.mvpMatrixHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uMVPMatrix");
            return;
        }
        this.stMatrixHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "uSTMatrix");
        com.tencent.tav.decoder.RenderContext.checkEglError("glGetUniformLocation uSTMatrix");
        if (this.stMatrixHandle == -1) {
            new java.lang.RuntimeException("Could not get uniform location for uSTMatrix");
        } else {
            this.lookupTextureHandle = android.opengl.GLES20.glGetUniformLocation(this.program, "lookupTexture");
        }
    }

    public void release() {
        int i17 = this.frameBuffer;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
            this.frameBuffer = -1;
        }
        int i18 = this.program;
        if (i18 > 0) {
            android.opengl.GLES20.glDeleteProgram(i18);
            this.program = 0;
        }
        int i19 = this.lookupTextureId;
        if (i19 != -1) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i19}, 0);
            this.lookupTextureId = -1;
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

    public void setLut(android.graphics.Bitmap bitmap) {
        this.lutBitmap = bitmap;
        if (bitmap != null && bitmap.isRecycled()) {
            this.lutBitmap = null;
        }
        int i17 = this.program;
        if (i17 > 0) {
            android.opengl.GLES20.glDeleteProgram(i17);
            this.program = 0;
        }
        if (this.lutBitmap == null) {
            int i18 = this.lookupTextureId;
            if (i18 != -1) {
                android.opengl.GLES20.glDeleteTextures(1, new int[]{i18}, 0);
                this.lookupTextureId = -1;
                return;
            }
            return;
        }
        if (this.lookupTextureId == -1) {
            int[] iArr = {-1};
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            android.opengl.GLES20.glBindTexture(3553, iArr[0]);
            this.lookupTextureId = iArr[0];
        }
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
        android.opengl.GLUtils.texImage2D(3553, 0, this.lutBitmap, 0);
    }

    public void setMVPMatrix(float[] fArr) {
        this.mvpMatrix = fArr;
    }

    public void setRotationDegrees(int i17) {
        android.opengl.Matrix.setRotateM(this.mvpMatrix, 0, i17, 0.0f, 0.0f, 1.0f);
    }

    public void blitTo(com.tencent.tav.coremedia.TextureInfo textureInfo, float[] fArr, int i17, int i18, int i19) {
        if (this.frameBuffer == -1 && i17 >= 0) {
            initFrameBuffer();
        }
        boolean isUseLut = isUseLut();
        if (this.program == 0) {
            initShaders(VERTEX_SHADER, isUseLut ? FRAGMENT_SHADER_OES_LUT : FRAGMENT_SHADER_OES);
        }
        com.tencent.tav.decoder.RenderContext.checkEglError("onDrawFrame start");
        android.opengl.GLES20.glGetIntegerv(2978, this.defaultViewport, 0);
        int i27 = this.frameBuffer;
        if (i27 != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, i27);
            com.tencent.tav.decoder.RenderContext.checkEglError("glBindFramebuffer frameBuffer");
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
            com.tencent.tav.decoder.RenderContext.checkEglError("glCheckFramebufferStatus frameBuffer");
            if (android.opengl.GLES20.glCheckFramebufferStatus(36160) != 36053) {
                new java.lang.RuntimeException("EGL error encountered: FramebufferStatus is not complete.");
                return;
            } else {
                android.opengl.GLES20.glGetIntegerv(2978, this.defaultViewport, 0);
                android.opengl.GLES20.glViewport(0, 0, i18, i19);
            }
        }
        android.opengl.GLES20.glUseProgram(this.program);
        com.tencent.tav.decoder.RenderContext.checkEglError("glUseProgram");
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(textureInfo.textureType, textureInfo.textureID);
        if (this.lookupTextureId != -1) {
            android.opengl.GLES20.glActiveTexture(33987);
            android.opengl.GLES20.glBindTexture(3553, this.lookupTextureId);
            android.opengl.GLES20.glUniform1i(this.lookupTextureHandle, 3);
        }
        this.triangleVertices.position(0);
        android.opengl.GLES20.glVertexAttribPointer(this.aPositionHandle, 3, 5126, false, 20, (java.nio.Buffer) this.triangleVertices);
        com.tencent.tav.decoder.RenderContext.checkEglError("glVertexAttribPointer aPositionHandle");
        android.opengl.GLES20.glEnableVertexAttribArray(this.aPositionHandle);
        com.tencent.tav.decoder.RenderContext.checkEglError("glEnableVertexAttribArray aPositionHandle");
        this.triangleVertices.position(3);
        android.opengl.GLES20.glVertexAttribPointer(this.aTextureCoordHandle, 2, 5126, false, 20, (java.nio.Buffer) this.triangleVertices);
        com.tencent.tav.decoder.RenderContext.checkEglError("glVertexAttribPointer aTextureCoordHandle");
        android.opengl.GLES20.glEnableVertexAttribArray(this.aTextureCoordHandle);
        com.tencent.tav.decoder.RenderContext.checkEglError("glEnableVertexAttribArray aTextureCoordHandle");
        android.opengl.GLES20.glUniformMatrix4fv(this.stMatrixHandle, 1, false, fArr, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.mvpMatrixHandle, 1, false, this.mvpMatrix, 0);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        com.tencent.tav.decoder.RenderContext.checkEglError("glDrawArrays");
        finishDraw(textureInfo);
        android.opengl.GLES20.glFinish();
        if (this.frameBuffer != -1) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            int[] iArr = this.defaultViewport;
            android.opengl.GLES20.glViewport(iArr[0], iArr[1], iArr[2], iArr[3]);
        }
    }
}
