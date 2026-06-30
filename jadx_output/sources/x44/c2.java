package x44;

/* loaded from: classes4.dex */
public final class c2 extends k64.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f451805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(yz5.p pVar) {
        super(2944);
        this.f451805e = pVar;
    }

    @Override // k64.s
    public void b(int i17, com.tencent.mm.modelbase.m1 m1Var) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$queryHbCoverState$1");
        if (m1Var != null) {
            java.lang.Object obj = null;
            try {
                java.lang.Object a17 = k64.t.a(m1Var);
                if (a17 instanceof r45.nh5) {
                    obj = a17;
                }
            } catch (java.lang.Throwable unused) {
            }
            r45.nh5 nh5Var = (r45.nh5) obj;
            if (nh5Var != null) {
                i18 = nh5Var.f381401d;
                this.f451805e.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$queryHbCoverState$1");
            }
        }
        i18 = -1;
        this.f451805e.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$queryHbCoverState$1");
    }
}
