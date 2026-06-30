package te2;

/* loaded from: classes3.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.c4 f417875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(te2.c4 c4Var) {
        super(1);
        this.f417875d = c4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        te2.c4 c4Var = this.f417875d;
        c4Var.getClass();
        com.tencent.mars.xlog.Log.i(c4Var.f417923g, "handleRecvLuckyMoneyErr errCode:" + intValue);
        qo0.c cVar = c4Var.f417921e;
        if (intValue == 1) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 1);
            cVar.statusChange(qo0.b.f365332b4, bundle);
        } else if (intValue == 2) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 2);
            cVar.statusChange(qo0.b.f365332b4, bundle2);
        }
        return jz5.f0.f302826a;
    }
}
