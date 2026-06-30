package dr4;

/* loaded from: classes14.dex */
public class d2 extends dr4.o {

    /* renamed from: v, reason: collision with root package name */
    public static final dr4.y1 f242620v = new dr4.y1(null);

    /* renamed from: t, reason: collision with root package name */
    public boolean f242621t;

    /* renamed from: u, reason: collision with root package name */
    public android.opengl.EGLContext f242622u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(boolean z17, yz5.p scope) {
        super(z17, f242620v.hashCode(), scope);
        kotlin.jvm.internal.o.g(scope, "scope");
    }

    @Override // dr4.o
    public void b(yz5.l lVar, dr4.c0 c0Var, boolean z17) {
        if (c0Var == null) {
            m(false);
            return;
        }
        rs0.h hVar = c0Var.f242601d;
        android.opengl.EGLContext eGLContext = hVar != null ? hVar.f399294c : null;
        if (eGLContext != null) {
            this.f242622u = eGLContext;
            m(true);
        }
        if (z17) {
            dr4.z1 z1Var = new dr4.z1(this);
            java.util.ArrayList arrayList = c0Var.f242611n;
            if (!arrayList.contains(z1Var)) {
                arrayList.add(z1Var);
            }
        }
        this.f242688n = c0Var.f242598a;
        this.f242689o = c0Var.f242599b;
    }

    @Override // dr4.o
    public void d(final yz5.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f242677c.invoke("CAMERA", new java.lang.Runnable(callback) { // from class: dr4.c2

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f242617d;

            {
                kotlin.jvm.internal.o.g(callback, "function");
                this.f242617d = callback;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f242617d.invoke();
            }
        });
    }

    @Override // dr4.o
    public void h() {
        d(new dr4.b2(this));
    }

    @Override // dr4.o
    public void l(android.util.Size renderSize) {
        kotlin.jvm.internal.o.g(renderSize, "renderSize");
        super.l(renderSize);
        gq4.v.wi().f365981o = new android.util.Size(this.f242689o, this.f242688n);
    }

    public void m(boolean z17) {
        if (this.f242621t) {
            return;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.WindowSurfaceRenderer", "createEGLContext, isUseShareContext:" + z17 + ", shareGLContext:" + this.f242622u, new java.lang.Object[0]);
        if (!z17 || this.f242622u == null) {
            return;
        }
        d(new dr4.a2(this));
        this.f242621t = true;
    }
}
