package n34;

/* loaded from: classes4.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334579e;

    public d3(java.lang.String str, java.lang.String str2) {
        this.f334578d = str;
        this.f334579e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$2");
        wa4.e0 e0Var = null;
        java.lang.String d17 = dw3.h.d(dw3.h.f244211a, null, null, 3, null);
        com.tencent.mm.vfs.w6.c(this.f334578d, d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFinderData$p", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        java.util.HashMap hashMap = n34.h3.f334611e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFinderData$p", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        java.lang.String str = this.f334579e;
        n34.w3 w3Var = (n34.w3) hashMap.get(str);
        if (w3Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.SnsPostFinderData");
            w3Var.f334769c = d17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.SnsPostFinderData");
        }
        wa4.f0 b17 = wa4.b0.f444203a.b(str);
        if (b17 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideo", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideo", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo");
            e0Var = b17.f444227c;
        }
        if (e0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
            e0Var.f444220a = d17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Video");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFinderPostManager", "video path copy finish");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.SnsFinderPostManager$saveFinderPostData$2");
    }
}
