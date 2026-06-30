package com.tencent.thumbplayer.core.postprocessor.filter;

/* loaded from: classes14.dex */
public class BlurFilter {
    private static final int FLOAT_SIZE_BYTES = 4;
    private static final java.lang.String TAG = "sifeng: BlurFilter";
    private static final float[] positoins = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    private static final float[] texcoords = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    private java.lang.String FRAGMENT_SHADER;
    private java.lang.String VERTEX_SHADER;
    private java.nio.FloatBuffer mPositoins;
    private java.nio.FloatBuffer mTexcoords;
    private int muMVPMatrixHandle;
    private int muSTMatrixHandle;
    private float[] mMVPMatrix = new float[16];
    private float[] mSTMatrix = new float[16];
    private int mProgramHandle = 0;
    private int mWidth = 0;
    private int mHeight = 0;
    private int mpositionid = 0;
    private int mtexcoordid = 0;
    private int mtexSizeid = 0;
    private int mOffsetid = 0;
    private int minputImageTextureid = 0;
    private int[] mFrameBuffer = new int[3];
    private int[] mTextureid = new int[3];

    public BlurFilter(java.lang.String str) {
        for (int i17 = 0; i17 < 3; i17++) {
            this.mFrameBuffer[i17] = 0;
            this.mTextureid[i17] = 0;
        }
        float[] fArr = positoins;
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.mPositoins = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = texcoords;
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(fArr2.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTexcoords = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        android.opengl.Matrix.setIdentityM(this.mSTMatrix, 0);
        java.io.InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(str + "/vertex_blur.glsl");
        byte[] bArr = new byte[1024];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        if (resourceAsStream != null) {
            while (true) {
                int read = resourceAsStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
        }
        resourceAsStream.close();
        byteArrayOutputStream.close();
        this.VERTEX_SHADER = new java.lang.String(byteArrayOutputStream.toByteArray());
        java.io.InputStream resourceAsStream2 = getClass().getClassLoader().getResourceAsStream(str + "/fragment_blur.glsl");
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        if (resourceAsStream2 != null) {
            while (true) {
                int read2 = resourceAsStream2.read(bArr);
                if (read2 == -1) {
                    break;
                } else {
                    byteArrayOutputStream2.write(bArr, 0, read2);
                }
            }
        }
        resourceAsStream2.close();
        byteArrayOutputStream2.close();
        this.FRAGMENT_SHADER = new java.lang.String(byteArrayOutputStream2.toByteArray());
        if (!compileShaders() || checkGlError("BlurFilter") != 0) {
            throw new java.lang.RuntimeException("sifeng: BlurFilter create failed");
        }
    }

    private int checkGlError(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        java.lang.Integer.toHexString(glGetError);
        return glGetError;
    }

    public int compileShader(java.lang.String str, int i17) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        android.opengl.GLES20.glGetShaderInfoLog(glCreateShader);
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public boolean compileShaders() {
        int compileShader;
        int compileShader2 = compileShader(this.VERTEX_SHADER, 35633);
        if (compileShader2 == 0 || (compileShader = compileShader(this.FRAGMENT_SHADER, 35632)) == 0) {
            return false;
        }
        this.mProgramHandle = android.opengl.GLES20.glCreateProgram();
        if (checkGlError("glCreateProgram") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.mProgramHandle, compileShader2);
        if (checkGlError("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.mProgramHandle, compileShader);
        if (checkGlError("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glLinkProgram(this.mProgramHandle);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.mProgramHandle, 35714, iArr, 0);
        if (iArr[0] != 1) {
            android.opengl.GLES20.glGetProgramInfoLog(this.mProgramHandle);
            android.opengl.GLES20.glDeleteProgram(this.mProgramHandle);
            this.mProgramHandle = 0;
            return false;
        }
        android.opengl.GLES20.glUseProgram(this.mProgramHandle);
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.mProgramHandle, "position");
        this.mpositionid = glGetAttribLocation;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.mProgramHandle, "texCoord");
        this.mtexcoordid = glGetAttribLocation2;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.mtexSizeid = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, "texSize");
        this.mOffsetid = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, "Offset");
        this.minputImageTextureid = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, "inputImageTexture");
        this.muMVPMatrixHandle = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, "uMVPMatrix");
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, "uSTMatrix");
        this.muSTMatrixHandle = glGetUniformLocation;
        return (this.mpositionid == -1 || this.mtexcoordid == -1 || this.minputImageTextureid == -1 || this.muMVPMatrixHandle == -1 || glGetUniformLocation == -1 || this.mtexSizeid == -1 || this.mOffsetid == -1) ? false : true;
    }

    public void destroyBuffers() {
        for (int i17 = 0; i17 < 3; i17++) {
            int[] iArr = this.mFrameBuffer;
            if (iArr[i17] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr, i17);
                this.mFrameBuffer[i17] = 0;
            }
            int[] iArr2 = this.mTextureid;
            if (iArr2[i17] != 0) {
                android.opengl.GLES20.glDeleteTextures(1, iArr2, i17);
                this.mTextureid[i17] = 0;
            }
        }
        int i18 = this.mProgramHandle;
        if (i18 != 0) {
            android.opengl.GLES20.glDeleteProgram(i18);
            this.mProgramHandle = 0;
        }
    }

    public int getTexid(int i17) {
        return this.mTextureid[i17];
    }

    public void process(int i17, int i18, int i19) {
        if (this.mWidth != i18 || this.mHeight != i19) {
            updatebuffer(i18, i19);
        }
        int i27 = i17;
        int i28 = 1;
        int i29 = 0;
        while (i29 < 3) {
            i28 = (i29 != 0 || i18 * i19 >= 921600) ? i28 * 2 : i28 * 1;
            android.opengl.GLES20.glBindFramebuffer(36160, this.mFrameBuffer[i29]);
            android.opengl.GLES20.glUseProgram(this.mProgramHandle);
            android.opengl.GLES20.glViewport(0, 0, i18 / i28, i19 / i28);
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            android.opengl.GLES20.glClear(16384);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, i27);
            android.opengl.GLES20.glUniform1i(this.minputImageTextureid, 0);
            android.opengl.GLES20.glUniform2f(this.mtexSizeid, r8 * 2, r10 * 2);
            android.opengl.GLES20.glUniform1f(this.mOffsetid, 1.0f);
            android.opengl.Matrix.setIdentityM(this.mMVPMatrix, 0);
            android.opengl.GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
            android.opengl.GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
            android.opengl.GLES20.glEnableVertexAttribArray(this.mpositionid);
            android.opengl.GLES20.glEnableVertexAttribArray(this.mtexcoordid);
            this.mPositoins.position(0);
            this.mTexcoords.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.mpositionid, 3, 5126, false, 0, (java.nio.Buffer) this.mPositoins);
            android.opengl.GLES20.glVertexAttribPointer(this.mtexcoordid, 2, 5126, false, 0, (java.nio.Buffer) this.mTexcoords);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.mpositionid);
            android.opengl.GLES20.glDisableVertexAttribArray(this.mtexcoordid);
            i27 = this.mTextureid[i29];
            if (checkGlError("BlurFilter") != 0) {
                throw new java.lang.RuntimeException("sifeng: BlurFilter process failed");
            }
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            i29++;
        }
    }

    public void updatebuffer(int i17, int i18) {
        int i19 = 1;
        int i27 = 0;
        while (i27 < 3) {
            int[] iArr = this.mFrameBuffer;
            if (iArr[i27] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr, i27);
                this.mFrameBuffer[i27] = 0;
            }
            int[] iArr2 = this.mTextureid;
            if (iArr2[i27] != 0) {
                android.opengl.GLES20.glDeleteTextures(1, iArr2, i27);
                this.mTextureid[i27] = 0;
            }
            i19 = (i27 != 0 || i17 * i18 >= 921600) ? i19 * 2 : i19 * 1;
            android.opengl.GLES20.glGenFramebuffers(1, this.mFrameBuffer, i27);
            android.opengl.GLES20.glBindFramebuffer(36160, this.mFrameBuffer[i27]);
            android.opengl.GLES20.glGenTextures(1, this.mTextureid, i27);
            android.opengl.GLES20.glBindTexture(3553, this.mTextureid[i27]);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, i17 / i19, i18 / i19, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mTextureid[i27], 0);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            i27++;
        }
        this.mWidth = i17;
        this.mHeight = i18;
    }
}
