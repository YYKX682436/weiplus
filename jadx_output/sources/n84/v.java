package n84;

/* loaded from: classes14.dex */
public class v extends n84.a0 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    public static final float[] G = {-1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
    public static final short[] H = {0, 1, 2, 0, 2, 3};
    public static final float[] I = {0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f, 0.0f, 1.0f};

    /* renamed from: J, reason: collision with root package name */
    public static final float[] f335690J = {0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f, 0.0f, 1.0f};
    public boolean A;
    public final int B;
    public final kotlinx.coroutines.flow.i2 C;
    public long D;
    public int E;
    public long F;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f335691r;

    /* renamed from: s, reason: collision with root package name */
    public java.nio.FloatBuffer f335692s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f335693t;

    /* renamed from: u, reason: collision with root package name */
    public int f335694u;

    /* renamed from: v, reason: collision with root package name */
    public java.nio.FloatBuffer f335695v;

    /* renamed from: w, reason: collision with root package name */
    public java.nio.ShortBuffer f335696w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.SurfaceTexture f335697x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f335698y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f335699z;

    public v(android.content.Context context, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19) {
        super(surfaceTexture, i17, i18);
        this.f335693t = new int[1];
        this.f335699z = false;
        this.A = false;
        this.C = kotlinx.coroutines.flow.r2.a(0, 1, u26.u.DROP_OLDEST);
        this.D = 0L;
        this.F = 0L;
        this.f335691r = context;
        this.f335698y = new float[16];
        this.B = i19;
        ((ku5.t0) ku5.t0.f312615d).a(this);
    }

    @Override // n84.a0
    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("draw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        try {
        } catch (java.lang.Throwable th6) {
            n84.w.c("AlphaTextureRenderer", "draw called error", th6);
        }
        synchronized (this) {
            try {
                if (this.f335699z) {
                    try {
                        this.f335697x.updateTexImage();
                        this.f335697x.getTransformMatrix(this.f335698y);
                        g();
                        this.f335699z = false;
                    } catch (java.lang.Exception e17) {
                        n84.w.d("AlphaTextureRenderer", e17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                        return false;
                    }
                } else {
                    kotlinx.coroutines.flow.i2 i2Var = this.C;
                    if (i2Var != null) {
                        ((kotlinx.coroutines.flow.q2) i2Var).e(java.lang.Boolean.FALSE);
                    }
                    android.content.Context context = this.f335691r;
                    boolean isPaused = context instanceof com.tencent.mm.ui.MMActivity ? ((com.tencent.mm.ui.MMActivity) context).isPaused() : false;
                    if (java.lang.System.currentTimeMillis() - this.F < 500 || isPaused) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                        return false;
                    }
                    n84.w.e("AlphaTextureRenderer", "flush without input! mFrameHasAvailabled = " + this.A);
                    if (!this.A) {
                        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        android.opengl.GLES20.glClear(16384);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                        return true;
                    }
                }
                f("gl draw texture");
                android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                android.opengl.GLES20.glClear(16384);
                f("gl draw texture");
                android.opengl.GLES20.glUseProgram(this.f335694u);
                f("gl draw texture");
                int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.f335694u, "texture");
                int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.f335694u, "vTexCoordinate");
                int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.f335694u, "vPosition");
                int glGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(this.f335694u, "textureTransform");
                android.opengl.GLES20.glUniform2f(android.opengl.GLES20.glGetUniformLocation(this.f335694u, "vSurfaceWidth"), this.f335665i, this.f335666m);
                android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 0, (java.nio.Buffer) this.f335695v);
                f("gl draw texture");
                android.opengl.GLES20.glBindTexture(36197, this.f335693t[0]);
                android.opengl.GLES20.glActiveTexture(33984);
                android.opengl.GLES20.glUniform1i(glGetUniformLocation, 0);
                android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                android.opengl.GLES20.glVertexAttribPointer(glGetAttribLocation, 4, 5126, false, 0, (java.nio.Buffer) this.f335692s);
                android.opengl.GLES20.glUniformMatrix4fv(glGetUniformLocation2, 1, false, this.f335698y, 0);
                f("gl draw texture");
                android.opengl.GLES20.glDrawElements(4, 6, 5123, this.f335696w);
                f("gl draw texture");
                android.opengl.GLES20.glDisableVertexAttribArray(glGetAttribLocation2);
                android.opengl.GLES20.glDisableVertexAttribArray(glGetAttribLocation);
                android.opengl.GLES20.glEnable(3042);
                android.opengl.GLES20.glBlendFunc(1, 771);
                f("gl draw texture");
                this.F = java.lang.System.currentTimeMillis();
                kotlinx.coroutines.flow.i2 i2Var2 = this.C;
                if (i2Var2 != null) {
                    ((kotlinx.coroutines.flow.q2) i2Var2).e(java.lang.Boolean.TRUE);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                return true;
            } catch (java.lang.Throwable th7) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                throw th7;
            }
        }
    }

    @Override // n84.a0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initGLComponents", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupVertexBuffer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(12);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.ShortBuffer asShortBuffer = allocateDirect.asShortBuffer();
        this.f335696w = asShortBuffer;
        asShortBuffer.put(H);
        this.f335696w.position(0);
        java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(48);
        allocateDirect2.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer = allocateDirect2.asFloatBuffer();
        this.f335695v = asFloatBuffer;
        asFloatBuffer.put(G);
        this.f335695v.position(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupVertexBuffer", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupTexture", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        int i17 = this.B;
        boolean z17 = i17 == 0;
        float[] fArr = I;
        float[] fArr2 = f335690J;
        java.nio.ByteBuffer allocateDirect3 = java.nio.ByteBuffer.allocateDirect((z17 ? fArr : fArr2).length * 4);
        allocateDirect3.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer2 = allocateDirect3.asFloatBuffer();
        this.f335692s = asFloatBuffer2;
        if (!z17) {
            fArr = fArr2;
        }
        asFloatBuffer2.put(fArr);
        this.f335692s.position(0);
        android.opengl.GLES20.glActiveTexture(33984);
        int[] iArr = this.f335693t;
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        f("gl generate texture");
        android.opengl.GLES20.glBindTexture(36197, iArr[0]);
        f("gl bind texture");
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(iArr[0]);
        this.f335697x = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupTexture", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadShaders", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        boolean z18 = i17 == 0;
        int i18 = z18 ? com.tencent.mm.R.raw.montage_horizontal_vertext_3_to_1 : com.tencent.mm.R.raw.montage_horizontal_vertext_1_to_1;
        android.content.Context context = this.f335691r;
        java.lang.String a17 = n84.y.a(context, i18);
        java.lang.String a18 = n84.y.a(context, z18 ? com.tencent.mm.R.raw.montage_alpha_shader_3_to_1 : com.tencent.mm.R.raw.montage_alpha_shader_1_to_1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
        int glCreateShader = android.opengl.GLES20.glCreateShader(35633);
        android.opengl.GLES20.glShaderSource(glCreateShader, a17);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr2 = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr2, 0);
        if (iArr2[0] != 1) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("load vertex shader:" + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
            throw illegalStateException;
        }
        int glCreateShader2 = android.opengl.GLES20.glCreateShader(35632);
        android.opengl.GLES20.glShaderSource(glCreateShader2, a18);
        android.opengl.GLES20.glCompileShader(glCreateShader2);
        android.opengl.GLES20.glGetShaderiv(glCreateShader2, 35713, iArr2, 0);
        if (iArr2[0] != 1) {
            java.lang.IllegalStateException illegalStateException2 = new java.lang.IllegalStateException("load fragment shader:" + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
            throw illegalStateException2;
        }
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        android.opengl.GLES20.glAttachShader(glCreateProgram, glCreateShader);
        android.opengl.GLES20.glAttachShader(glCreateProgram, glCreateShader2);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] != 1) {
            java.lang.IllegalStateException illegalStateException3 = new java.lang.IllegalStateException("link program:" + android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
            throw illegalStateException3;
        }
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        android.opengl.GLES20.glDeleteShader(glCreateShader2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadProgram", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
        this.f335694u = glCreateProgram;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadShaders", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        n84.w.a("AlphaTextureRenderer", "initGLComponents");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initGLComponents", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
    }

    public void f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkOpenGLError", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        while (true) {
            int glGetError = android.opengl.GLES20.glGetError();
            if (glGetError == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkOpenGLError", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                return;
            }
            n84.w.b("AlphaTextureRenderer", str + ": glError " + android.opengl.GLUtils.getEGLErrorString(glGetError));
        }
    }

    public final void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pingFps", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        if (this.D == 0) {
            this.D = java.lang.System.currentTimeMillis();
        }
        this.E++;
        if (java.lang.System.currentTimeMillis() - this.D > 1000) {
            n84.w.a("AlphaTextureRenderer", "FPS: " + this.E);
            this.D = java.lang.System.currentTimeMillis();
            this.E = 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pingFps", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFrameAvailable", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
        synchronized (this) {
            try {
                java.util.Objects.toString(surfaceTexture);
                this.f335699z = true;
                this.A = true;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFrameAvailable", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFrameAvailable", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AlphaTextureRenderer");
    }
}
