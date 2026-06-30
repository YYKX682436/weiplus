package u94;

/* loaded from: classes4.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u94.p f425873d;

    public l(u94.o oVar, u94.p pVar) {
        this.f425873d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
        u94.p pVar = this.f425873d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = pVar.f425884b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
        if (u3Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = pVar.f425884b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            u3Var2.dismiss();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            pVar.f425884b = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = pVar.f425885c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
        if (k0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = pVar.f425885c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            if (k0Var2.i()) {
                com.tencent.mars.xlog.Log.i("HalfSubscribeController", "mmBottomSheet tryHide due to send subscribe");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                com.tencent.mm.ui.widget.dialog.k0 k0Var3 = pVar.f425885c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                k0Var3.u();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$1");
    }
}
