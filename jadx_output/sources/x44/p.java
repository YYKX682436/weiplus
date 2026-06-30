package x44;

/* loaded from: classes4.dex */
public final class p extends k64.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f451875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(yz5.p pVar, int i17) {
        super(i17);
        this.f451875e = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k64.s
    public void b(int i17, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$followRequest$2");
        yz5.p pVar = this.f451875e;
        if (i17 != 0) {
            pVar.invoke(java.lang.Integer.valueOf(i17), "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$followRequest$2");
            return;
        }
        if (m1Var instanceof ns.l) {
            java.lang.String J2 = ((com.tencent.mm.pluginsdk.model.m3) ((ns.l) m1Var)).J();
            pVar.invoke(0, J2 != null ? J2 : "");
        } else if (m1Var instanceof ab0.s) {
            java.lang.String str = ((l41.o) ((ab0.s) m1Var)).f315884f;
            pVar.invoke(0, str != null ? str : "");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.FollowBrandUser$followRequest$2");
    }
}
