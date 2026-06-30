package k64;

/* loaded from: classes4.dex */
public class o extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f304602d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f304603e;

    public o(java.lang.String str, long j17, int i17) {
        this(str, j17, i17, "");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        this.f304603e = u0Var;
        int dispatch = dispatch(sVar, this.f304602d, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        int i17 = this.f304602d.f70713d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        return i17;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
        com.tencent.mars.xlog.Log.i("NetSceneAdAppointment", "errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f304603e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdAppointment");
    }

    public o(java.lang.String str, long j17, int i17, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.j0();
        lVar.f70665b = new r45.k0();
        lVar.f70666c = "/cgi-bin/mmoc-bin/adplayinfo/ad_appointment";
        lVar.f70667d = 5159;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f304602d = a17;
        r45.j0 j0Var = (r45.j0) a17.f70710a.f70684a;
        j0Var.f377432d = str;
        j0Var.f377433e = j17;
        j0Var.f377434f = i17;
        j0Var.f377435g = str2;
        com.tencent.mars.xlog.Log.i("NetSceneAdAppointment", "appointmentId=" + j17 + ", opType=" + i17 + ", uxInfo=" + str + ", phoneNumber=" + str2);
    }
}
