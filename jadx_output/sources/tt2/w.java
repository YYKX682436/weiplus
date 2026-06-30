package tt2;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f422008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f422009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(tt2.e1 e1Var, java.lang.Object obj) {
        super(2);
        this.f422008d = e1Var;
        this.f422009e = obj;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue > 0) {
            tt2.e1 e1Var = this.f422008d;
            if (intValue >= 0 && intValue < e1Var.getItemCount()) {
                pm0.v.X(new tt2.v(e1Var, intValue, this.f422009e));
            }
        }
        return jz5.f0.f302826a;
    }
}
