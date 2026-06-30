package sc2;

/* loaded from: classes2.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.i2 f405937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f405939f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405940g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405941h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405942i;

    public h2(sc2.i2 i2Var, xc2.p0 p0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, android.view.View view, java.lang.String str) {
        this.f405937d = i2Var;
        this.f405938e = p0Var;
        this.f405939f = baseFinderFeed;
        this.f405940g = s0Var;
        this.f405941h = view;
        this.f405942i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc2.i2 i2Var = this.f405937d;
        xc2.p0 p0Var = i2Var.f3147h;
        if (p0Var == null) {
            p0Var = this.f405938e;
        }
        xc2.p0 p0Var2 = p0Var;
        i2Var.J(this.f405939f, this.f405940g, this.f405941h, p0Var2, this.f405942i, i2Var.M(p0Var2), true);
        sc2.i2 i2Var2 = this.f405937d;
        r45.su Q = i2Var2.Q(p0Var2);
        r45.su M = i2Var2.M(p0Var2);
        android.view.View view = this.f405941h;
        i2Var2.H(view, Q, M);
        i2Var2.W(this.f405940g, view, p0Var2, "tryDelayExpand");
        xc2.z2 z2Var = i2Var2.f3151o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        if (bVar == null || p0Var2.f453261w != 0 || bVar.f453069m <= 0) {
            return;
        }
        p0Var2.f453261w = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f453069m) / 1000);
    }
}
