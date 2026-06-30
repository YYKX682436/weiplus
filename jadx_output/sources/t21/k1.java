package t21;

/* loaded from: classes12.dex */
public class k1 implements m11.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f414812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t21.l1 f414813b;

    public k1(t21.l1 l1Var, t21.v2 v2Var) {
        this.f414813b = l1Var;
        this.f414812a = v2Var;
    }

    @Override // m11.a0
    public void a(int i17, int i18, long j17, java.lang.String str) {
        if (i17 == 4 && i18 == 102) {
            gm0.j1.e().j(new t21.j1(this));
        } else {
            t21.w0 w0Var = this.f414813b.f414831a;
            w0Var.f415031d.onSceneEnd(i17, i18, "", w0Var);
        }
    }
}
