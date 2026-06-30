package j0;

/* loaded from: classes14.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.u4 f296500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(j0.u4 u4Var) {
        super(1);
        this.f296500d = u4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        j0.u4 u4Var = this.f296500d;
        float a17 = u4Var.a() + floatValue;
        n0.v2 v2Var = u4Var.f296584b;
        if (a17 > ((java.lang.Number) ((n0.q4) v2Var).getValue()).floatValue()) {
            floatValue = ((java.lang.Number) ((n0.q4) v2Var).getValue()).floatValue() - u4Var.a();
        } else if (a17 < 0.0f) {
            floatValue = -u4Var.a();
        }
        float a18 = u4Var.a() + floatValue;
        ((n0.q4) u4Var.f296583a).setValue(java.lang.Float.valueOf(a18));
        return java.lang.Float.valueOf(floatValue);
    }
}
