package xn2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderTimelineRefreshEvent f455478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.autogen.events.FinderTimelineRefreshEvent finderTimelineRefreshEvent, xn2.p0 p0Var) {
        super(0);
        this.f455478d = finderTimelineRefreshEvent;
        this.f455479e = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FinderTimelineRefreshEvent finderTimelineRefreshEvent = this.f455478d;
        if (finderTimelineRefreshEvent.f54334g.f7420a == 23) {
            vn2.u0 u0Var = vn2.u0.f438387a;
            xn2.p0 p0Var = this.f455479e;
            u0Var.m(p0Var.f455545c, "autoRefreshEventListener: trigger refresh tabType = " + finderTimelineRefreshEvent.f54334g.f7420a);
            xn2.b bVar = p0Var.f455547e;
            if (bVar != null) {
                xn2.b.n(bVar, 150L, false, false, 4, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
