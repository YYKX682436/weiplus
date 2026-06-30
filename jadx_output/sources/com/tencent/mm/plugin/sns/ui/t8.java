package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class t8 implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f170500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.u8 f170501e;

    public t8(com.tencent.mm.plugin.sns.ui.u8 u8Var, int i17) {
        this.f170501e = u8Var;
        this.f170500d = i17;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhenLess", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5$1");
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5$1");
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.plugin.sns.ui.u8 u8Var = this.f170501e;
        com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI = u8Var.f170568d;
        int i17 = com.tencent.mm.plugin.sns.ui.SightUploadUI.f166633v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.z4 z4Var = sightUploadUI.f166635e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI2 = u8Var.f170568d;
        int i18 = sightUploadUI2.f166645r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        java.lang.String str2 = sightUploadUI2.f166637g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter snsSightUploadSayFooter = sightUploadUI2.f166638h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        r45.ed4 location = snsSightUploadSayFooter.getLocation();
        int i19 = this.f170500d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        boolean z17 = sightUploadUI2.f166644q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        java.util.ArrayList arrayList = sightUploadUI2.f166643p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        int i27 = sightUploadUI2.f166641n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        int i28 = sightUploadUI2.f166642o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        ((com.tencent.mm.plugin.sns.ui.j9) z4Var).c(i18, 0, null, str2, null, location, null, i19, z17, arrayList, pInt, "", i27, i28);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        long j17 = sightUploadUI2.f166647t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        boolean z18 = sightUploadUI2.f166646s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        g0Var.d(13303, valueOf, valueOf2, java.lang.Integer.valueOf(!z18 ? 1 : 0), java.lang.Integer.valueOf(pInt.value), "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        long j18 = sightUploadUI2.f166647t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.sdk.platformtools.t8.i1();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        boolean z19 = sightUploadUI2.f166646s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhenOK", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5$1");
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5$1");
        db5.e1.i(this.f170501e.f170568d, com.tencent.mm.R.string.f493259jh1, com.tencent.mm.R.string.f493260jh2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWhenMore", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5$1");
    }
}
