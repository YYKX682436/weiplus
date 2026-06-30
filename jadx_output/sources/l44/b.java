package l44;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f316033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f316034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f316035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l44.c f316036g;

    public b(l44.c cVar, int i17, int i18, com.tencent.mm.modelbase.m1 m1Var) {
        this.f316036g = cVar;
        this.f316033d = i17;
        this.f316034e = i18;
        this.f316035f = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.k0 k0Var;
        l44.c cVar = this.f316036g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback$1");
        try {
            if (this.f316033d == 0 && this.f316034e == 0 && (k0Var = (r45.k0) ((com.tencent.mm.modelbase.o) this.f316035f.getReqResp()).f70711b.f70700a) != null) {
                java.lang.String valueOf = java.lang.String.valueOf(k0Var.f378247d);
                com.tencent.mars.xlog.Log.i("ADAppointment.AdAppointmentHelper", "parseResp status=" + valueOf);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                java.lang.String str = cVar.f316063g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                long j17 = cVar.f316062f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                p34.o.h(str, l44.d.e(j17), valueOf);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                l44.a aVar = cVar.f316060d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                long j18 = cVar.f316062f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                int i17 = cVar.f316061e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
                aVar.a(j18, i17, true, valueOf);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback$1");
                return;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ADAppointment.AdAppointmentHelper", "parseResp exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        l44.a aVar2 = cVar.f316060d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        long j19 = cVar.f316062f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        int i18 = cVar.f316061e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback");
        aVar2.a(j19, i18, false, "-1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper$NetSceneCallback$1");
    }
}
