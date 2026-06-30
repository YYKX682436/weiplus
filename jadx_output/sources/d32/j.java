package d32;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f226148a;

    /* renamed from: b, reason: collision with root package name */
    public final t85.j f226149b;

    /* renamed from: c, reason: collision with root package name */
    public final javax.microedition.khronos.egl.EGL10 f226150c;

    /* renamed from: d, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLDisplay f226151d;

    /* renamed from: e, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLContext f226152e;

    /* renamed from: f, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLSurface f226153f;

    /* renamed from: g, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLConfig f226154g;

    /* renamed from: h, reason: collision with root package name */
    public javax.microedition.khronos.opengles.GL10 f226155h;

    /* renamed from: i, reason: collision with root package name */
    public d32.k f226156i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.Surface f226157j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f226158k;

    /* renamed from: l, reason: collision with root package name */
    public final android.os.HandlerThread f226159l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f226160m;

    public j(int i17, int i18, boolean z17, t85.j jVar) {
        this.f226148a = z17;
        this.f226149b = jVar;
        javax.microedition.khronos.egl.EGL egl = javax.microedition.khronos.egl.EGLContext.getEGL();
        kotlin.jvm.internal.o.e(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        this.f226150c = (javax.microedition.khronos.egl.EGL10) egl;
        this.f226151d = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY;
        this.f226152e = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        this.f226153f = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        int i19 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("EmojiCaptureMixEGLPixelBuffer_GLThread", 5);
        this.f226159l = a17;
        a17.start();
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
        this.f226158k = n3Var;
        n3Var.post(new d32.d(this));
    }
}
