package sc2;

/* loaded from: classes2.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.k2 f405984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f405985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405987g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405988h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405989i;

    public j2(sc2.k2 k2Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, android.view.View view, xc2.p0 p0Var, java.lang.String str) {
        this.f405984d = k2Var;
        this.f405985e = baseFinderFeed;
        this.f405986f = s0Var;
        this.f405987g = view;
        this.f405988h = p0Var;
        this.f405989i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc2.k2 k2Var = this.f405984d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f405985e;
        in5.s0 s0Var = this.f405986f;
        android.view.View view = this.f405987g;
        xc2.p0 p0Var = this.f405988h;
        k2Var.I(baseFinderFeed, s0Var, view, p0Var, this.f405989i, k2Var.M(p0Var), true);
        sc2.k2 k2Var2 = this.f405984d;
        xc2.p0 p0Var2 = this.f405988h;
        r45.i55 P = k2Var2.P(p0Var2);
        r45.i55 M = k2Var2.M(p0Var2);
        android.view.View view2 = this.f405987g;
        k2Var2.G(view2, P, M);
        k2Var2.Y(this.f405986f, view2, "tryDelayExpand");
        xc2.z2 z2Var = k2Var2.f3151o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        if (bVar == null || p0Var2.f453261w != 0 || bVar.f453069m <= 0) {
            return;
        }
        p0Var2.f453261w = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f453069m) / 1000);
    }
}
