package r61;

/* loaded from: classes12.dex */
public class j1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.k1 f392890d;

    public j1(r61.k1 k1Var) {
        this.f392890d = k1Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        r61.k1 k1Var = this.f392890d;
        if (i17 == 0 && i18 == 0) {
            r61.m1 m1Var2 = k1Var.f392894e;
            m1Var2.doScene(m1Var2.dispatcher(), k1Var.f392894e.f392907e);
        } else {
            r61.m1 m1Var3 = k1Var.f392894e;
            m1Var3.f392907e.onSceneEnd(i17, i18, "", m1Var3);
        }
    }
}
