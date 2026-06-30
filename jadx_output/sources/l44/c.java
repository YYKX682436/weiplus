package l44;

/* loaded from: classes4.dex */
public class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final l44.a f316060d;

    /* renamed from: e, reason: collision with root package name */
    public final int f316061e;

    /* renamed from: f, reason: collision with root package name */
    public final long f316062f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f316063g;

    public c(java.lang.String str, long j17, int i17, l44.a aVar) {
        this.f316063g = str;
        this.f316062f = j17;
        this.f316061e = i17;
        this.f316060d = aVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        com.tencent.mars.xlog.Log.i("ADAppointment.AdAppointmentHelper", "parseResp, snsId=" + this.f316063g + ", appointmentId=" + this.f316062f + ", opType=" + this.f316061e + ", errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        if (this.f316060d == null) {
            com.tencent.mars.xlog.Log.e("ADAppointment.AdAppointmentHelper", "parseResp callback==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new l44.b(this, i17, i18, m1Var));
        gm0.j1.d().q(5159, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
    }
}
