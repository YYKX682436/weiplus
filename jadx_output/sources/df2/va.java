package df2;

/* loaded from: classes.dex */
public final class va extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(df2.zb zbVar) {
        super(1);
        this.f231590d = zbVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List<r45.mf1> results = (java.util.List) obj;
        kotlin.jvm.internal.o.g(results, "results");
        for (r45.mf1 mf1Var : results) {
            com.tencent.mars.xlog.Log.i(this.f231590d.f231939m, "[aiAssistant] mockLotteryCreateCustom: " + mf1Var.getString(3) + " success=" + mf1Var.getBoolean(4) + " content=" + mf1Var.getString(5));
        }
        return jz5.f0.f302826a;
    }
}
