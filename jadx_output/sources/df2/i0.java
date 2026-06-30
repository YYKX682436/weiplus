package df2;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.j0 f230369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(df2.j0 j0Var) {
        super(2);
        this.f230369d = j0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        df2.j0 j0Var = this.f230369d;
        com.tencent.mars.xlog.Log.i(j0Var.f230440m, "startChargeLiveCountDown OutAnim " + floatValue + ",finish:" + booleanValue + '!');
        if (booleanValue) {
            df2.j0.b7(j0Var);
        }
        return jz5.f0.f302826a;
    }
}
