package j0;

/* loaded from: classes14.dex */
public final class h4 implements n0.a2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f296317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.o f296318b;

    public h4(n0.v2 v2Var, c0.o oVar) {
        this.f296317a = v2Var;
        this.f296318b = oVar;
    }

    @Override // n0.a2
    public void dispose() {
        n0.v2 v2Var = this.f296317a;
        c0.r rVar = (c0.r) v2Var.getValue();
        if (rVar != null) {
            c0.q qVar = new c0.q(rVar);
            c0.o oVar = this.f296318b;
            if (oVar != null) {
                ((c0.p) oVar).b(qVar);
            }
            v2Var.setValue(null);
        }
    }
}
