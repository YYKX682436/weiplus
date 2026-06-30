package t21;

/* loaded from: classes12.dex */
public class e1 implements m11.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t21.w0 f414740a;

    public e1(t21.w0 w0Var) {
        this.f414740a = w0Var;
    }

    @Override // m11.a0
    public void a(int i17, int i18, long j17, java.lang.String str) {
        if (i17 == 4 && i18 == 102) {
            gm0.j1.e().j(new t21.d1(this));
            return;
        }
        t21.w0 w0Var = this.f414740a;
        t21.b.a(w0Var.f415038n, 0);
        w0Var.f415038n = t21.d3.h(w0Var.f415033f);
        t21.v2 v2Var = w0Var.f415038n;
        if (v2Var != null && v2Var.f415011i == 105) {
            w0Var.f415036i = 0 - (fp.k.a() + 10000);
        }
        w0Var.f415031d.onSceneEnd(i17, i18, "", w0Var);
    }
}
