package dr4;

/* loaded from: classes14.dex */
public final class n0 extends dr4.o {

    /* renamed from: w, reason: collision with root package name */
    public static final dr4.d0 f242670w = new dr4.d0(null);

    /* renamed from: t, reason: collision with root package name */
    public boolean f242671t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.l f242672u;

    /* renamed from: v, reason: collision with root package name */
    public oq4.b f242673v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(yz5.p scope) {
        super(false, f242670w.hashCode(), scope);
        kotlin.jvm.internal.o.g(scope, "scope");
    }

    @Override // dr4.o
    public void b(yz5.l lVar, dr4.c0 c0Var, boolean z17) {
        this.f242672u = lVar;
        m(false);
    }

    @Override // dr4.o
    public void d(final yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f242677c.invoke("DECODE", new java.lang.Runnable(callback) { // from class: dr4.k0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f242654d;

            {
                kotlin.jvm.internal.o.g(callback, "function");
                this.f242654d = callback;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f242654d.invoke();
            }
        });
    }

    @Override // dr4.o
    public void h() {
        d(new dr4.j0(this));
    }

    @Override // dr4.o
    public void l(android.util.Size renderSize) {
        kotlin.jvm.internal.o.g(renderSize, "renderSize");
        super.l(renderSize);
        dr4.r1 r1Var = this.f242686l;
        if (r1Var != null) {
            r1Var.w(renderSize.getWidth(), renderSize.getHeight());
        }
        gq4.v.wi().f365982p = renderSize;
    }

    public void m(boolean z17) {
        if (this.f242671t) {
            return;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.RemoteWindowSurfaceRenderer", "createEGLContext", new java.lang.Object[0]);
        d(new dr4.g0(this));
        this.f242671t = true;
        this.f242673v = new oq4.b();
    }
}
