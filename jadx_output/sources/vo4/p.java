package vo4;

/* loaded from: classes10.dex */
public class p extends vo4.t {

    /* renamed from: e, reason: collision with root package name */
    public rs0.h f438665e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.HandlerThread f438666f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f438667g;

    /* renamed from: h, reason: collision with root package name */
    public final int f438668h;

    /* renamed from: i, reason: collision with root package name */
    public final int f438669i;

    public p(int i17, int i18) {
        super(i17, i18);
        int i19 = pu5.i.f358473b;
        this.f438666f = pu5.f.a("VLogRemuxSurface_EncodeThread", -4);
    }

    @Override // vo4.t
    public void a(android.view.Surface surface) {
        this.f438690d = surface;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[OpenGL] init egl environment before, surface: ");
        sb6.append(surface);
        sb6.append(", eglEnv: ");
        rs0.h hVar = this.f438665e;
        sb6.append(hVar != null ? hVar.f399294c : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLog.VLogRemuxSurface", sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.VLog.VLogRemuxSurface", "initGL");
        android.os.HandlerThread handlerThread = this.f438666f;
        handlerThread.start();
        this.f438667g = new com.tencent.mm.sdk.platformtools.n3(handlerThread.getLooper());
        b(new vo4.m(this));
    }

    @Override // vo4.t
    public void b(final yz5.a task) {
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f438667g;
        if (n3Var != null) {
            n3Var.post(new java.lang.Runnable(task) { // from class: vo4.o

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f438664d;

                {
                    kotlin.jvm.internal.o.g(task, "function");
                    this.f438664d = task;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f438664d.invoke();
                }
            });
        }
    }

    public p(int i17, int i18, int i19, int i27) {
        this(i17, i18);
        this.f438668h = i19;
        this.f438669i = i27;
        com.tencent.mars.xlog.Log.i("MicroMsg.VLog.VLogRemuxSurface", "create VLogRemuxSurface, surface:[" + i17 + ", " + i18 + "], texture:[" + i19 + ", " + i27 + ']');
    }
}
