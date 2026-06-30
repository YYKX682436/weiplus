package sc2;

/* loaded from: classes2.dex */
public final class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.m2 f406039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f406041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406042g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406043h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406044i;

    public l2(sc2.m2 m2Var, xc2.p0 p0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, android.view.View view, java.lang.String str) {
        this.f406039d = m2Var;
        this.f406040e = p0Var;
        this.f406041f = baseFinderFeed;
        this.f406042g = s0Var;
        this.f406043h = view;
        this.f406044i = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc2.m2 m2Var = this.f406039d;
        xc2.p0 p0Var = m2Var.f3147h;
        xc2.p0 p0Var2 = this.f406040e;
        xc2.p0 p0Var3 = p0Var == null ? p0Var2 : p0Var;
        m2Var.K(this.f406041f, this.f406042g, this.f406043h, p0Var3, this.f406044i, m2Var.P(p0Var3), true);
        sc2.q8 q8Var = p0Var2.f453233J;
        if (q8Var != null) {
            q8Var.f406179c = 2;
        }
        sc2.m2 m2Var2 = this.f406039d;
        r45.su N = m2Var2.N(p0Var3);
        r45.su P = m2Var2.P(p0Var3);
        android.view.View view = this.f406043h;
        m2Var2.I(view, N, P);
        m2Var2.W(this.f406042g, view, p0Var3, "tryDelayExpand");
        xc2.z2 z2Var = m2Var2.f3151o;
        xc2.b bVar = z2Var instanceof xc2.b ? (xc2.b) z2Var : null;
        if (bVar == null || p0Var3.f453261w != 0 || bVar.f453069m <= 0) {
            return;
        }
        p0Var3.f453261w = (int) java.lang.Math.abs((android.os.SystemClock.uptimeMillis() - bVar.f453069m) / 1000);
    }
}
