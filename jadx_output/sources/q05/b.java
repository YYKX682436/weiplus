package q05;

/* loaded from: classes14.dex */
public class b {

    /* renamed from: q, reason: collision with root package name */
    public static final float[] f359432q = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: r, reason: collision with root package name */
    public static final float[] f359433r = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.FloatBuffer f359434a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.FloatBuffer f359435b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f359436c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f359437d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f359438e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f359439f;

    /* renamed from: g, reason: collision with root package name */
    public int f359440g;

    /* renamed from: h, reason: collision with root package name */
    public int f359441h;

    /* renamed from: i, reason: collision with root package name */
    public int f359442i;

    /* renamed from: j, reason: collision with root package name */
    public int f359443j;

    /* renamed from: k, reason: collision with root package name */
    public int f359444k;

    /* renamed from: l, reason: collision with root package name */
    public int f359445l;

    /* renamed from: m, reason: collision with root package name */
    public int f359446m;

    /* renamed from: n, reason: collision with root package name */
    public int f359447n;

    /* renamed from: o, reason: collision with root package name */
    public int f359448o;

    /* renamed from: p, reason: collision with root package name */
    public final int f359449p;

    public b() {
        this.f359436c = new float[16];
        float[] fArr = new float[16];
        this.f359437d = fArr;
        this.f359440g = 0;
        this.f359443j = 0;
        this.f359444k = 0;
        this.f359445l = 0;
        this.f359446m = 0;
        this.f359447n = 0;
        this.f359448o = 0;
        this.f359449p = 0;
        this.f359449p = 0;
        this.f359438e = r3;
        int[] iArr = {0};
        this.f359439f = r3;
        int[] iArr2 = {0};
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f359434a = asFloatBuffer;
        asFloatBuffer.put(f359432q).position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f359435b = asFloatBuffer2;
        asFloatBuffer2.put(f359433r).position(0);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (!c() || a("OES2TextureFilter create0") != 0) {
            throw new java.lang.RuntimeException("sifeng: OES2TextureFilter create0 failed");
        }
    }

    public final int a(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("SharpenFilter.OES2Texture", str + ": EGL error: 0x" + java.lang.Integer.toHexString(glGetError));
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
        int b17 = b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 position;\nattribute vec4 texCoord;\nvarying vec2 coordinate;\nvoid main()\n{\n   gl_Position = uMVPMatrix * position;\n   coordinate = (uSTMatrix * texCoord).xy;\n}\n", 35633);
        if (b17 == 0) {
            return false;
        }
        int b18 = this.f359449p == 2 ? b("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying highp vec2 coordinate;\nuniform samplerExternalOES inputImageTexture;\nuniform int outputFormat;\nvec3 RGB2YUV(vec3 rgb)\n{\nvec3 yuv = vec3(0.0);\nyuv.x = rgb.r * 0.257 + rgb.g * 0.504 + rgb.b * 0.098 + 0.0627;\nyuv.y = rgb.r * -0.148 + rgb.g * -0.291 + rgb.b * 0.439 + 0.50196;\nyuv.z = rgb.r * 0.439 + rgb.g * -0.368 + rgb.b * -0.071 + 0.50196;\nreturn yuv;\n}\nvoid main()\n{\nvec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\nvec3 yuvColor = outputFormat==1?RGB2YUV(orgColor):orgColor;\ngl_FragColor = vec4(yuvColor, 1.0);\n}\n", 35632) : b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform sampler2D inputImageTexture;\nuniform int outputFormat;\nvec3 RGB2YUV(vec3 rgb)\n{\nvec3 yuv = vec3(0.0);\nyuv.x = rgb.r * 0.257 + rgb.g * 0.504 + rgb.b * 0.098 + 0.06275;\nyuv.y = rgb.r * -0.148 + rgb.g * -0.291 + rgb.b * 0.439 + 0.50196;\nyuv.z = rgb.r * 0.439 + rgb.g * -0.368 + rgb.b * -0.071 + 0.50196;\nreturn yuv;\n}\nvoid main()\n{\nvec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\nvec3 yuvColor = outputFormat==1?RGB2YUV(orgColor):orgColor;\ngl_FragColor = vec4(yuvColor, 1.0);\n}\n", 35632);
        if (b18 == 0) {
            return false;
        }
        this.f359440g = android.opengl.GLES20.glCreateProgram();
        if (a("glCreateProgram") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f359440g, b17);
        if (a("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glAttachShader(this.f359440g, b18);
        if (a("glAttachShader") != 0) {
            return false;
        }
        android.opengl.GLES20.glLinkProgram(this.f359440g);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.f359440g, 35714, iArr, 0);
        if (iArr[0] != 1) {
            android.opengl.GLES20.glGetProgramInfoLog(this.f359440g);
            android.opengl.GLES20.glDeleteProgram(this.f359440g);
            this.f359440g = 0;
            return false;
        }
        android.opengl.GLES20.glUseProgram(this.f359440g);
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f359440g, "position");
        this.f359445l = glGetAttribLocation;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f359440g, "texCoord");
        this.f359446m = glGetAttribLocation2;
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.f359447n = android.opengl.GLES20.glGetUniformLocation(this.f359440g, "inputImageTexture");
        this.f359441h = android.opengl.GLES20.glGetUniformLocation(this.f359440g, "uMVPMatrix");
        this.f359442i = android.opengl.GLES20.glGetUniformLocation(this.f359440g, "uSTMatrix");
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f359440g, "outputFormat");
        this.f359448o = glGetUniformLocation;
        return (this.f359445l == -1 || this.f359446m == -1 || this.f359447n == -1 || this.f359441h == -1 || this.f359442i == -1 || glGetUniformLocation == -1) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public int d(int i17, int i18, int i19, int i27) {
        ?? r37;
        int i28;
        int i29 = this.f359443j;
        int[] iArr = this.f359439f;
        int[] iArr2 = this.f359438e;
        if (i29 == i18 && this.f359444k == i19) {
            r37 = 0;
            i28 = 36160;
        } else {
            if (iArr2[0] != 0) {
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr2, 0);
                iArr2[0] = 0;
            }
            if (iArr[0] != 0) {
                android.opengl.GLES20.glDeleteTextures(1, iArr, 0);
                iArr[0] = 0;
            }
            android.opengl.GLES20.glGenFramebuffers(1, iArr2, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, iArr2[0]);
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            android.opengl.GLES20.glBindTexture(3553, iArr[0]);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, i18, i19, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
            android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
            android.opengl.GLES20.glTexParameteri(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
            r37 = 0;
            i28 = 36160;
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
            android.opengl.GLES20.glBindTexture(3553, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            this.f359443j = i18;
            this.f359444k = i19;
        }
        android.opengl.GLES20.glBindFramebuffer(i28, iArr2[r37]);
        android.opengl.GLES20.glUseProgram(this.f359440g);
        android.opengl.GLES20.glViewport(r37, r37, i18, i19);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        android.opengl.GLES20.glActiveTexture(33984);
        if (this.f359449p == 2) {
            android.opengl.GLES20.glBindTexture(36197, i17);
        } else {
            android.opengl.GLES20.glBindTexture(3553, i17);
        }
        android.opengl.GLES20.glUniform1i(this.f359447n, r37);
        android.opengl.GLES20.glUniform1i(this.f359448o, i27);
        float[] fArr = this.f359436c;
        android.opengl.Matrix.setIdentityM(fArr, r37);
        float[] fArr2 = this.f359437d;
        android.opengl.Matrix.setIdentityM(fArr2, r37);
        android.opengl.GLES20.glUniformMatrix4fv(this.f359441h, 1, r37, fArr, r37);
        android.opengl.GLES20.glUniformMatrix4fv(this.f359442i, 1, r37, fArr2, r37);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f359445l);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f359446m);
        this.f359434a.position(r37);
        this.f359435b.position(r37);
        android.opengl.GLES20.glVertexAttribPointer(this.f359445l, 3, 5126, false, 0, (java.nio.Buffer) this.f359434a);
        android.opengl.GLES20.glVertexAttribPointer(this.f359446m, 2, 5126, false, 0, (java.nio.Buffer) this.f359435b);
        android.opengl.GLES20.glDrawArrays(5, r37, 4);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f359445l);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f359446m);
        android.opengl.GLES20.glBindFramebuffer(i28, r37);
        if (a("OES2TextureFilter") == 0) {
            return iArr[r37];
        }
        throw new java.lang.RuntimeException("sifeng: OES2TextureFilter process failed");
    }

    public b(int i17) {
        this.f359436c = new float[16];
        float[] fArr = new float[16];
        this.f359437d = fArr;
        this.f359440g = 0;
        this.f359443j = 0;
        this.f359444k = 0;
        this.f359445l = 0;
        this.f359446m = 0;
        this.f359447n = 0;
        this.f359448o = 0;
        this.f359449p = 0;
        this.f359449p = i17;
        this.f359438e = r2;
        int[] iArr = {0};
        this.f359439f = r2;
        int[] iArr2 = {0};
        java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(48).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f359434a = asFloatBuffer;
        asFloatBuffer.put(f359432q).position(0);
        java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(32).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
        this.f359435b = asFloatBuffer2;
        asFloatBuffer2.put(f359433r).position(0);
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (!c() || a("OES2TextureFilter create1") != 0) {
            throw new java.lang.RuntimeException("sifeng: OES2TextureFilter create1 failed");
        }
    }
}
