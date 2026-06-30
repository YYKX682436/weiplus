package xn2;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f455503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f455505f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f455506g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f455507h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z17, xn2.p0 p0Var, kotlin.jvm.internal.f0 f0Var, so2.j5 j5Var, kotlin.jvm.internal.g0 g0Var) {
        super(0);
        this.f455503d = z17;
        this.f455504e = p0Var;
        this.f455505f = f0Var;
        this.f455506g = j5Var;
        this.f455507h = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xn2.b bVar;
        boolean z17 = this.f455503d;
        xn2.p0 p0Var = this.f455504e;
        if (z17) {
            pm0.v.I(p0Var.j().getDataListJustForAdapter(), new xn2.g(this.f455507h));
            kotlin.jvm.internal.f0 f0Var = this.f455505f;
            if (f0Var.f310116d >= 0 && (bVar = p0Var.f455547e) != null) {
                ((com.tencent.mm.plugin.finder.view.mj) ((xn2.f1) bVar).a()).onItemRangeRemoved(f0Var.f310116d, 1);
            }
        } else {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) this.f455506g;
            if (baseFinderFeed != null) {
                vn2.u0 u0Var = vn2.u0.f438387a;
                java.lang.String str = p0Var.f455545c;
                android.app.Activity activity = p0Var.f455543a;
                r45.qt2 l17 = p0Var.l();
                xn2.b bVar2 = p0Var.f455547e;
                u0Var.d(str, activity, l17, bVar2 != null ? ((xn2.f1) bVar2).a() : null, p0Var.j(), 0, baseFinderFeed, true, false);
            }
        }
        return jz5.f0.f302826a;
    }
}
