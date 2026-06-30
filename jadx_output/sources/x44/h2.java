package x44;

/* loaded from: classes4.dex */
public final class h2 extends k64.s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f451834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f451835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(yz5.q qVar, int i17) {
        super(5159);
        this.f451834e = qVar;
        this.f451835f = i17;
    }

    @Override // k64.s
    public void b(int i17, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$makeAppointment$1");
        int i18 = this.f451835f;
        yz5.q qVar = this.f451834e;
        if (i17 == 0 && (m1Var instanceof k64.o)) {
            java.lang.Object obj = null;
            try {
                java.lang.Object a17 = k64.t.a(m1Var);
                if (a17 instanceof r45.k0) {
                    obj = a17;
                }
            } catch (java.lang.Throwable unused) {
            }
            r45.k0 k0Var = (r45.k0) obj;
            qVar.invoke(0, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(k0Var != null ? k0Var.f378247d : -1));
        } else {
            qVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), -1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$makeAppointment$1");
    }
}
