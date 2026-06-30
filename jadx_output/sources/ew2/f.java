package ew2;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: q, reason: collision with root package name */
    public static final ew2.b f257039q = new ew2.b(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f257040r = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f257041a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f257042b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLContext f257043c;

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLDisplay f257044d;

    /* renamed from: e, reason: collision with root package name */
    public android.opengl.EGLSurface f257045e;

    /* renamed from: f, reason: collision with root package name */
    public int f257046f;

    /* renamed from: g, reason: collision with root package name */
    public ew2.h f257047g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f257048h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f257049i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f257050j;

    /* renamed from: k, reason: collision with root package name */
    public ew2.g f257051k;

    /* renamed from: l, reason: collision with root package name */
    public int f257052l;

    /* renamed from: m, reason: collision with root package name */
    public int f257053m;

    /* renamed from: n, reason: collision with root package name */
    public int f257054n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f257055o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f257056p;

    public f() {
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("TP-ProcessSurface-RenderThread", 0);
        this.f257041a = a17;
        android.opengl.EGLContext EGL_NO_CONTEXT = android.opengl.EGL14.EGL_NO_CONTEXT;
        kotlin.jvm.internal.o.f(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        this.f257043c = EGL_NO_CONTEXT;
        android.opengl.EGLDisplay EGL_NO_DISPLAY = android.opengl.EGL14.EGL_NO_DISPLAY;
        kotlin.jvm.internal.o.f(EGL_NO_DISPLAY, "EGL_NO_DISPLAY");
        this.f257044d = EGL_NO_DISPLAY;
        android.opengl.EGLSurface EGL_NO_SURFACE = android.opengl.EGL14.EGL_NO_SURFACE;
        kotlin.jvm.internal.o.f(EGL_NO_SURFACE, "EGL_NO_SURFACE");
        this.f257045e = EGL_NO_SURFACE;
        this.f257048h = new java.util.concurrent.CountDownLatch(1);
        this.f257055o = "vPosition";
        this.f257056p = "vTexCoord";
        a17.start();
        this.f257042b = new android.os.Handler(a17.getLooper());
    }

    public final void a() {
        android.opengl.EGLDisplay eGLDisplay = this.f257044d;
        android.opengl.EGLSurface eGLSurface = this.f257045e;
        b(eGLDisplay, eGLSurface, eGLSurface, this.f257043c);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, this.f257046f);
        ew2.g gVar = this.f257051k;
        ew2.b bVar = f257039q;
        if (gVar == null) {
            ew2.g gVar2 = new ew2.g();
            gVar2.c();
            int i17 = gVar2.f257059a;
            if (i17 == -1) {
                throw new java.lang.RuntimeException("The program has been released");
            }
            int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(i17, androidx.camera.core.processing.util.GLUtils.VAR_TEXTURE);
            if (glGetUniformLocation < 0) {
                throw new java.lang.RuntimeException("Could not locate uniform 'sTexture' in program");
            }
            this.f257054n = glGetUniformLocation;
            this.f257052l = gVar2.b(this.f257055o);
            this.f257053m = gVar2.b(this.f257056p);
            bVar.a("Create shader");
            this.f257051k = gVar2;
        }
        ew2.g gVar3 = this.f257051k;
        if (gVar3 != null) {
            gVar3.c();
            android.opengl.GLES20.glEnableVertexAttribArray(this.f257052l);
            android.opengl.GLES20.glVertexAttribPointer(this.f257052l, 2, 5126, false, 0, (java.nio.Buffer) ew2.g.f257057b);
            android.opengl.GLES20.glEnableVertexAttribArray(this.f257053m);
            android.opengl.GLES20.glVertexAttribPointer(this.f257053m, 2, 5126, false, 0, (java.nio.Buffer) ew2.g.f257058c);
            android.opengl.GLES20.glUniform1i(this.f257054n, 0);
            bVar.a("Prepare shader");
        }
        int[] iArr = new int[1];
        android.opengl.EGL14.eglQuerySurface(this.f257044d, this.f257045e, 12375, iArr, 0);
        int i18 = iArr[0];
        int[] iArr2 = new int[1];
        android.opengl.EGL14.eglQuerySurface(this.f257044d, this.f257045e, 12374, iArr2, 0);
        android.opengl.GLES20.glViewport(0, 0, i18, iArr2[0]);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        android.opengl.GLES20.glBindTexture(36197, 0);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f257052l);
        android.opengl.GLES20.glDisableVertexAttribArray(this.f257053m);
        android.opengl.EGL14.eglSwapBuffers(this.f257044d, this.f257045e);
        yz5.a aVar = this.f257050j;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f257050j = null;
        this.f257049i = true;
    }

    public final void b(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLSurface eGLSurface, android.opengl.EGLSurface eGLSurface2, android.opengl.EGLContext eGLContext) {
        if (android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface2, eGLContext)) {
            return;
        }
        throw new android.opengl.GLException(android.opengl.EGL14.eglGetError(), "eglMakeCurrent failed: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
    }

    public final void c() {
        this.f257042b.post(new ew2.c(this));
        this.f257041a.quitSafely();
    }

    public final void d() {
        this.f257042b.post(new ew2.d(this));
    }
}
