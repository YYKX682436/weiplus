package xs2;

/* loaded from: classes3.dex */
public final class r implements vp.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xs2.u f456372a;

    public r(xs2.u uVar) {
        this.f456372a = uVar;
    }

    @Override // vp.w
    public void a(boolean z17) {
    }

    @Override // vp.w
    public void b(wp.a danmaku, zp.m touchPoint, zp.d clickResult) {
        kotlin.jvm.internal.o.g(danmaku, "danmaku");
        kotlin.jvm.internal.o.g(touchPoint, "touchPoint");
        kotlin.jvm.internal.o.g(clickResult, "clickResult");
        yz5.p pVar = this.f456372a.f456386b;
        if (pVar != null) {
            pVar.invoke(danmaku, touchPoint);
        }
    }

    @Override // vp.w
    public void c(java.util.List list) {
    }
}
