package t21;

/* loaded from: classes12.dex */
public class g1 implements m11.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dn.h f414764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t21.h1 f414765b;

    public g1(t21.h1 h1Var, dn.h hVar) {
        this.f414765b = h1Var;
        this.f414764a = hVar;
    }

    @Override // m11.a0
    public void a(int i17, int i18, long j17, java.lang.String str) {
        if (i17 == 4 && i18 == 102) {
            gm0.j1.e().j(new t21.f1(this));
            return;
        }
        t21.h1 h1Var = this.f414765b;
        t21.b.a(h1Var.f414778d.f415038n, 0);
        h1Var.f414778d.M(this.f414764a);
        t21.w0 w0Var = h1Var.f414778d;
        w0Var.f415038n = t21.d3.h(w0Var.f415033f);
        t21.w0 w0Var2 = h1Var.f414778d;
        t21.v2 v2Var = w0Var2.f415038n;
        if (v2Var != null && v2Var.f415011i == 105) {
            w0Var2.f415036i = 0 - (fp.k.a() + 10000);
        }
        t21.w0 w0Var3 = h1Var.f414778d;
        w0Var3.f415031d.onSceneEnd(i17, i18, "", w0Var3);
    }
}
