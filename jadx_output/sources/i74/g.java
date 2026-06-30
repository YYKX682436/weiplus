package i74;

/* loaded from: classes4.dex */
public class g implements com.tencent.mm.ui.widget.snackbar.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a84.r0 f289483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f289484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.q2 f289485c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i74.i f289486d;

    public g(i74.i iVar, a84.r0 r0Var, boolean[] zArr, com.tencent.mm.plugin.sns.model.q2 q2Var) {
        this.f289486d = iVar;
        this.f289483a = r0Var;
        this.f289484b = zArr;
        this.f289485c = q2Var;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onHide() {
        boolean f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        try {
            i74.i iVar = this.f289486d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            f17 = iVar.f();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FeedbackPromptManager", "onHide failed", th6);
        }
        if (f17) {
            com.tencent.mars.xlog.Log.w("FeedbackPromptManager", "onHide: host invalid, skip report");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
            return;
        }
        if (this.f289484b[0]) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
            return;
        }
        com.tencent.mm.plugin.sns.model.q2 q2Var = this.f289485c;
        if (q2Var == null) {
            com.tencent.mars.xlog.Log.i("FeedbackPromptManager", "snackBar onHide: no pending op, skip");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        } else {
            com.tencent.mars.xlog.Log.i("FeedbackPromptManager", "snackBar onHide, report feedback snackbar exposed but not clicked!");
            gm0.j1.i();
            gm0.j1.n().f273288b.g(q2Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHide", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        }
    }

    @Override // com.tencent.mm.ui.widget.snackbar.h
    public void onShow() {
        boolean f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        try {
            com.tencent.mars.xlog.Log.i("FeedbackPromptManager", "snackBar onShow");
            i74.i iVar = this.f289486d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            f17 = iVar.f();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FeedbackPromptManager", "onShow failed", th6);
        }
        if (f17) {
            com.tencent.mars.xlog.Log.w("FeedbackPromptManager", "onShow: host invalid, skip ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
            return;
        }
        a84.r0 r0Var = this.f289483a;
        if (r0Var == null) {
            com.tencent.mars.xlog.Log.w("FeedbackPromptManager", "snackBar onShow: exposeReport is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        } else {
            a84.t0.a(r0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShow", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$2");
        }
    }
}
