package t21;

/* loaded from: classes12.dex */
public class b1 implements m11.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t21.c1 f414704a;

    public b1(t21.c1 c1Var) {
        this.f414704a = c1Var;
    }

    @Override // m11.a0
    public void a(int i17, int i18, long j17, java.lang.String str) {
        if (i17 == 4 && i18 == 102) {
            gm0.j1.e().j(new t21.a1(this));
        } else {
            t21.w0 w0Var = this.f414704a.f414719a;
            w0Var.f415031d.onSceneEnd(i17, i18, "", w0Var);
        }
    }
}
