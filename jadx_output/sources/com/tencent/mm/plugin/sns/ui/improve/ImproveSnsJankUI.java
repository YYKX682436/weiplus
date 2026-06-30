package com.tencent.mm.plugin.sns.ui.improve;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lf4/g;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public abstract class ImproveSnsJankUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements f4.g {

    /* renamed from: r, reason: collision with root package name */
    public static int f168628r;

    /* renamed from: i, reason: collision with root package name */
    public f4.i f168634i;

    /* renamed from: n, reason: collision with root package name */
    public long f168636n;

    /* renamed from: o, reason: collision with root package name */
    public long f168637o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f168638p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f168639q;

    /* renamed from: d, reason: collision with root package name */
    public final int f168629d = hashCode();

    /* renamed from: e, reason: collision with root package name */
    public long f168630e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f168631f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct f168632g = new com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct();

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f168633h = jz5.h.b(new hc4.c(this));

    /* renamed from: m, reason: collision with root package name */
    public final hc4.e f168635m = new hc4.e(0, 0, 0, 0, 0, 0, 0, 0, 255, null);

    public ImproveSnsJankUI() {
        java.lang.String scrollWord = (3 & 2) != 0 ? "idle" : null;
        kotlin.jvm.internal.o.g(scrollWord, "scrollWord");
        this.f168639q = jz5.h.b(new hc4.b(this));
    }

    public final float U6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRefreshRate", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        float floatValue = ((java.lang.Number) ((jz5.n) this.f168633h).getValue()).floatValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRefreshRate", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        return floatValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005f  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        super.onDestroy();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy PageEnterCount:");
        sb6.append(f168628r);
        sb6.append(" jank info:\nfreshRate:");
        sb6.append(U6());
        sb6.append('\n');
        hc4.e eVar = this.f168635m;
        sb6.append(eVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsJankActivity", sb6.toString());
        this.f168634i = null;
        java.lang.String valueOf = java.lang.String.valueOf(this.f168629d);
        com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct = this.f168632g;
        sNSJankReportStruct.f60146r = sNSJankReportStruct.b("SessionId", valueOf, true);
        yc4.s sVar = yc4.s.f460864a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        java.lang.String str = yc4.s.f460866c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        sNSJankReportStruct.f60149u = sNSJankReportStruct.b("CpuInfo", str, true);
        sNSJankReportStruct.f60144p = java.lang.System.currentTimeMillis();
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        long j17 = eVar.f280363c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        sNSJankReportStruct.f60134f = (int) j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        long j18 = eVar.f280366f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        sNSJankReportStruct.f60135g = (int) j18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        long j19 = eVar.f280364d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        sNSJankReportStruct.f60136h = (int) j19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i17 = eVar.f280362b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        sNSJankReportStruct.f60137i = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i18 = eVar.f280365e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        sNSJankReportStruct.f60138j = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i19 = eVar.f280368h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        sNSJankReportStruct.f60139k = i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i27 = eVar.f280367g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        sNSJankReportStruct.f60140l = i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        long j27 = eVar.f280361a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        sNSJankReportStruct.f60142n = (int) j27;
        int i28 = f168628r;
        f168628r = i28 + 1;
        sNSJankReportStruct.f60147s = i28;
        sNSJankReportStruct.f60148t = ld4.a.f318105a.a() ? 1 : 2;
        sNSJankReportStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsJankActivity", "[" + hashCode() + "]onPause");
        super.onPause();
        f4.i iVar = this.f168634i;
        if (iVar != null) {
            iVar.a(false);
        }
        hc4.e eVar = this.f168635m;
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        long j17 = eVar.f280361a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        long currentTimeMillis = j17 + (java.lang.System.currentTimeMillis() - this.f168636n);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        eVar.f280361a = currentTimeMillis;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageTotalTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsJankActivity", "[" + hashCode() + "]onResume");
        super.onResume();
        f4.i iVar = this.f168634i;
        if (iVar != null) {
            iVar.a(true);
        }
        this.f168636n = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        super.onWindowFocusChanged(z17);
        if (this.f168631f < 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f168631f = currentTimeMillis;
            long j17 = this.f168630e;
            if (j17 > 0) {
                int i17 = (int) (currentTimeMillis - j17);
                com.tencent.mm.autogen.mmdata.rpt.SNSJankReportStruct sNSJankReportStruct = this.f168632g;
                sNSJankReportStruct.f60145q = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsJankActivity", "[" + hashCode() + "]enter page cost:" + sNSJankReportStruct.f60145q);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
    }

    @Override // f4.g
    public void q1(f4.d frameData) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFrame", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        kotlin.jvm.internal.o.g(frameData, "frameData");
        hc4.e eVar = this.f168635m;
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        int i17 = eVar.f280362b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        eVar.f280362b = i17 + 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTotalFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        if (this.f168638p) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            int i18 = eVar.f280368h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            eVar.f280368h = i18 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollFrameCount", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        }
        if (frameData.f259381c) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_jank_frame_report, false);
            long j17 = frameData.f259380b;
            if (fj6) {
                com.tencent.mm.autogen.mmdata.rpt.SnsFrameJankReportStruct snsFrameJankReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFrameJankReportStruct();
                snsFrameJankReportStruct.f60583d = snsFrameJankReportStruct.b("SessionId", java.lang.String.valueOf(this.f168629d), true);
                yc4.s sVar = yc4.s.f460864a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
                java.lang.String str = yc4.s.f460866c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
                snsFrameJankReportStruct.f60590k = snsFrameJankReportStruct.b("CpuInfo", str, true);
                snsFrameJankReportStruct.f60584e = frameData.f259379a;
                snsFrameJankReportStruct.f60585f = j17;
                snsFrameJankReportStruct.f60588i = snsFrameJankReportStruct.b("JankState", r26.i0.v(frameData.f259382d.toString(), ",", ";", false, 4, null), true);
                snsFrameJankReportStruct.f60589j = ld4.a.f318105a.a() ? 1 : 2;
                if (frameData instanceof f4.e) {
                    snsFrameJankReportStruct.f60586g = ((f4.e) frameData).f259383e;
                }
                if (frameData instanceof f4.f) {
                    snsFrameJankReportStruct.f60587h = ((f4.f) frameData).f259385g;
                }
                snsFrameJankReportStruct.k();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            int i19 = eVar.f280365e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            eVar.f280365e = i19 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            long j18 = eVar.f280366f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            long j19 = j17 / 1000000;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            eVar.f280366f = j18 + j19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setJankFrameTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            if (this.f168638p) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                int i27 = eVar.f280367g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                eVar.f280367g = i27 + 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollJankFrame", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                long j27 = eVar.f280364d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
                eVar.f280364d = j27 + j19;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageScrollJankTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsJankActivity", "jank frame:" + frameData);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.frameClear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFrame", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
    }
}
