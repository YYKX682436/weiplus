package mm2;

/* loaded from: classes3.dex */
public abstract class e extends androidx.lifecycle.c1 implements im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f328963d;

    /* renamed from: e, reason: collision with root package name */
    public final im5.c f328964e;

    public e(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f328963d = liveContext;
        this.f328964e = new im5.c();
    }

    public androidx.lifecycle.c1 business(java.lang.Class bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        gk2.e owner = this.f328963d;
        kotlin.jvm.internal.o.g(owner, "owner");
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(owner.getViewModel(), new gk2.a(owner)).a(bu6);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return a17;
    }

    @Override // im5.b
    public void keep(im5.a target) {
        kotlin.jvm.internal.o.g(target, "target");
        this.f328964e.keep(target);
    }
}
