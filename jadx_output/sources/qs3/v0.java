package qs3;

/* loaded from: classes15.dex */
public final class v0 implements ns.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarViewController f366400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.oi5 f366402c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.e f366403d;

    public v0(com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController, java.lang.String str, r45.oi5 oi5Var, ps3.e eVar) {
        this.f366400a = radarViewController;
        this.f366401b = str;
        this.f366402c = oi5Var;
        this.f366403d = eVar;
    }

    @Override // ns.j
    public final void a(boolean z17) {
        ps3.e eVar = this.f366403d;
        r45.oi5 oi5Var = this.f366402c;
        java.lang.String str = this.f366401b;
        com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController = this.f366400a;
        if (!z17) {
            com.tencent.mm.plugin.radar.ui.RadarViewController.d(radarViewController, str, oi5Var, eVar);
            return;
        }
        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Bi(radarViewController.getContext(), 3, str, new qs3.u0(radarViewController, str, oi5Var, eVar));
    }
}
