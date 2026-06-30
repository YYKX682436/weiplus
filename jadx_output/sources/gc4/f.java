package gc4;

/* loaded from: classes4.dex */
public final class f implements android.view.ViewStub.OnInflateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gc4.h f270451a;

    public f(gc4.h hVar) {
        this.f270451a = hVar;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(android.view.ViewStub viewStub, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInflate", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback$initSnsMsgUIStopRemindTips$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setInflatedTipsUI$p", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback");
        gc4.h hVar = this.f270451a;
        hVar.f270455c = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setInflatedTipsUI$p", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback");
        java.lang.String str = hVar.f270454b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback");
        com.tencent.mars.xlog.Log.i(str, "initSnsMsgUIStopRemindTips onInflate callback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInflate", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindPreCheckCallback$initSnsMsgUIStopRemindTips$1");
    }
}
