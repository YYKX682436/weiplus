package q05;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: p, reason: collision with root package name */
    public static final float[] f359415p = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: q, reason: collision with root package name */
    public static final float[] f359416q = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.FloatBuffer f359417a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.FloatBuffer f359418b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f359419c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f359420d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f359421e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f359422f;

    /* renamed from: g, reason: collision with root package name */
    public int f359423g;

    /* renamed from: h, reason: collision with root package name */
    public int f359424h;

    /* renamed from: i, reason: collision with root package name */
    public int f359425i;

    /* renamed from: j, reason: collision with root package name */
    public int f359426j;

    /* renamed from: k, reason: collision with root package name */
    public int f359427k;

    /* renamed from: l, reason: collision with root package name */
    public int f359428l;

    /* renamed from: m, reason: collision with root package name */
    public int f359429m;

    /* renamed from: n, reason: collision with root package name */
    public int f359430n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f359431o;

    public a() {
        this.f359419c = new float[16];
        this.f359420d = new float[16];
        this.f359423g = 0;
        this.f359426j = 0;
        this.f359427k = 0;
        this.f359428l = 0;
        this.f359429m = 0;
        this.f359430n = 0;
        this.f359431o = false;
        this.f359421e = new int[3];
        this.f359422f = new int[3];
        for (int i17 = 0; i17 < 3; i17++) {
            this.f359421e[i17] = 0;
            this.f359422f[i17] = 0;
        }
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f359417a = asFloatBuffer;
        asFloatBuffer.put(f359415p).position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f359418b = asFloatBuffer2;
        asFloatBuffer2.put(f359416q).position(0);
        android.opengl.Matrix.setIdentityM(this.f359420d, 0);
        if (!c() || a("BlurFilter") != 0) {
            throw new java.lang.RuntimeException("sifeng: BlurFilter create failed");
        }
    }

    public final int a(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("BlurFilter.OES2Texture", str + ": EGL error: 0x" + java.lang.Integer.toHexString(glGetError));
        return glGetError;
    }

    public int b(java.lang.String str, int i17) {
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

    public boolean c() {
        int b17;
        int b18 = b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 position;\nattribute vec4 texCoord;\nuniform highp vec2 texSize;\nuniform highp float Offset;\nvarying vec2 TexCoord;\nvoid main()\n{\n   gl_Position = uMVPMatrix * position;\n   TexCoord = (uSTMatrix * texCoord).xy;\n}\n", 35633);
        if (b18 == 0 || (b17 = b("precision mediump float;\nvarying vec2 TexCoord;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\ngl_FragColor = vec4(texture2D(inputImageTexture, TexCoord).rgb, 1.0);\n}\n", 35632)) == 0) {
            return false;
        }
        this.f359423g = android.opengl.GLES20.glCreateProgram();
        if (a("glCreateProgram") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f359423g, b18);
        if (a("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f359423g, b17);
        if (a("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glLinkProgram(this.f359423g);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.f359423g, 35714, iArr, 0);
        if (iArr[0] != 1) {
            android.opengl.GLES20.glGetProgramInfoLog(this.f359423g);
            android.opengl.GLES20.glDeleteProgram(this.f359423g);
            this.f359423g = 0;
            return false;
        }
        android.opengl.GLES20.glUseProgram(this.f359423g);
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f359423g, "position");
        this.f359428l = glGetAttribLocation;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f359423g, "texCoord");
        this.f359429m = glGetAttribLocation2;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.f359430n = android.opengl.GLES20.glGetUniformLocation(this.f359423g, "inputImageTexture");
        this.f359424h = android.opengl.GLES20.glGetUniformLocation(this.f359423g, "uMVPMatrix");
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f359423g, "uSTMatrix");
        this.f359425i = glGetUniformLocation;
        return (this.f359428l == -1 || this.f359429m == -1 || this.f359430n == -1 || this.f359424h == -1 || glGetUniformLocation == -1) ? false : true;
    }

    public void d(int i17, int i18, int i19, int i27) {
        int i28 = this.f359426j;
        int i29 = 3553;
        float f17 = 1.5f;
        boolean z17 = this.f359431o;
        int[] iArr = this.f359422f;
        int[] iArr2 = this.f359421e;
        int i37 = 1;
        if ((i28 != i18 || this.f359427k != i19) && (i28 != i18 || this.f359427k != i19)) {
            float[] fArr = {1.25f, 1.5f, 3.0f};
            int i38 = 0;
            float f18 = 1.0f;
            while (i38 < 3) {
                if (iArr2[i38] != 0) {
                    android.opengl.GLES20.glDeleteFramebuffers(i37, iArr2, i38);
                    iArr2[i38] = 0;
                }
                if (iArr[i38] != 0) {
                    android.opengl.GLES20.glDeleteTextures(i37, iArr, i38);
                    iArr[i38] = 0;
                }
                f18 = z17 ? fArr[i38] : f18 * 1.5f;
                android.opengl.GLES20.glGenFramebuffers(i37, iArr2, i38);
                android.opengl.GLES20.glBindFramebuffer(36160, iArr2[i38]);
                android.opengl.GLES20.glGenTextures(i37, iArr, i38);
                android.opengl.GLES20.glBindTexture(3553, iArr[i38]);
                android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, (int) (i18 / f18), (int) (i19 / f18), 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
                android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
                android.opengl.GLES20.glTexParameteri(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729);
                android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
                android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
                android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[i38], 0);
                android.opengl.GLES20.glBindTexture(3553, 0);
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                i38++;
                i37 = 1;
            }
            this.f359426j = i18;
            this.f359427k = i19;
        }
        float[] fArr2 = {1.25f, 1.5f, 3.0f};
        int i39 = i17;
        int i47 = 0;
        float f19 = 1.0f;
        while (i47 < 3) {
            f19 = z17 ? fArr2[i47] : f19 * f17;
            android.opengl.GLES20.glBindFramebuffer(36160, iArr2[i47]);
            android.opengl.GLES20.glUseProgram(this.f359423g);
            android.opengl.GLES20.glViewport(0, 0, (int) (i18 / f19), (int) (i19 / f19));
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            android.opengl.GLES20.glClear(16384);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(i29, i39);
            android.opengl.GLES20.glUniform1i(this.f359430n, 0);
            float[] fArr3 = this.f359419c;
            android.opengl.Matrix.setIdentityM(fArr3, 0);
            android.opengl.GLES20.glUniformMatrix4fv(this.f359424h, 1, false, fArr3, 0);
            android.opengl.GLES20.glUniformMatrix4fv(this.f359425i, 1, false, this.f359420d, 0);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f359428l);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f359429m);
            this.f359417a.position(0);
            this.f359418b.position(0);
            android.opengl.GLES20.glVertexAttribPointer(this.f359428l, 3, 5126, false, 0, (java.nio.Buffer) this.f359417a);
            android.opengl.GLES20.glVertexAttribPointer(this.f359429m, 2, 5126, false, 0, (java.nio.Buffer) this.f359418b);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f359428l);
            android.opengl.GLES20.glDisableVertexAttribArray(this.f359429m);
            i39 = iArr[i47];
            if (a("BlurFilter") != 0) {
                throw new java.lang.RuntimeException("sifeng: BlurFilter process failed");
            }
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            i47++;
            i29 = 3553;
            f17 = 1.5f;
        }
    }

    public a(int i17) {
        this.f359419c = new float[16];
        this.f359420d = new float[16];
        this.f359423g = 0;
        this.f359426j = 0;
        this.f359427k = 0;
        this.f359428l = 0;
        this.f359429m = 0;
        this.f359430n = 0;
        this.f359431o = false;
        if (i17 != 2 && i17 != 3 && i17 != 4) {
            this.f359431o = false;
        } else {
            this.f359431o = true;
        }
        this.f359421e = new int[3];
        this.f359422f = new int[3];
        for (int i18 = 0; i18 < 3; i18++) {
            this.f359421e[i18] = 0;
            this.f359422f[i18] = 0;
        }
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f359417a = asFloatBuffer;
        asFloatBuffer.put(f359415p).position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f359418b = asFloatBuffer2;
        asFloatBuffer2.put(f359416q).position(0);
        android.opengl.Matrix.setIdentityM(this.f359420d, 0);
        if (!c() || a("BlurFilter") != 0) {
            throw new java.lang.RuntimeException("sifeng: BlurFilter create failed");
        }
    }
}
