package df2;

/* loaded from: classes.dex */
public final class ta extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(df2.zb zbVar) {
        super(1);
        this.f231430d = zbVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List<r45.mf1> results = (java.util.List) obj;
        kotlin.jvm.internal.o.g(results, "results");
        for (r45.mf1 mf1Var : results) {
            com.tencent.mars.xlog.Log.i(this.f231430d.f231939m, "[aiAssistant] mockEcho: " + mf1Var.getString(3) + " success=" + mf1Var.getString(5));
        }
        return jz5.f0.f302826a;
    }
}
