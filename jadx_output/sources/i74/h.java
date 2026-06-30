package i74;

/* loaded from: classes4.dex */
public class h implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a84.r0 f289487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f289488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s34.p0 f289489c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i74.i f289490d;

    public h(i74.i iVar, a84.r0 r0Var, boolean[] zArr, s34.p0 p0Var) {
        this.f289490d = iVar;
        this.f289487a = r0Var;
        this.f289488b = zArr;
        this.f289489c = p0Var;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public void a() {
        boolean f17;
        i74.i iVar = this.f289490d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMessageClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$3");
        try {
            com.tencent.mars.xlog.Log.i("FeedbackPromptManager", "onMessageClick");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
            f17 = iVar.f();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FeedbackPromptManager", "onMessageClick failed", th6);
        }
        if (f17) {
            com.tencent.mars.xlog.Log.w("FeedbackPromptManager", "onMessageClick: host invalid, skip");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMessageClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$3");
            return;
        }
        a84.r0 r0Var = this.f289487a;
        if (r0Var == null) {
            com.tencent.mars.xlog.Log.w("FeedbackPromptManager", "onMessageClick: clickReport is null, skip report");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMessageClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$3");
        } else {
            a84.t0.a(r0Var);
            this.f289488b[0] = true;
            n74.x.a(iVar.f289491d, this.f289489c);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMessageClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$3");
        }
    }
}
