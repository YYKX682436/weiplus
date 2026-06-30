package i74;

/* loaded from: classes4.dex */
public class f implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f289481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i74.i f289482e;

    public f(i74.i iVar, android.view.ViewTreeObserver viewTreeObserver) {
        this.f289482e = iVar;
        this.f289481d = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$1");
        this.f289481d.removeOnPreDrawListener(this);
        i74.i iVar = this.f289482e;
        m74.b bVar = iVar.f289492e;
        if (bVar != null && iVar.f289494g != null && bVar.getContentView() != null) {
            int c17 = iVar.c(iVar.f289494g, iVar.f289492e.getContentView());
            iVar.n(c17);
            iVar.f289492e.update(iVar.f289494g, 0, c17, -1, -1);
            com.tencent.mars.xlog.Log.i("FeedbackPromptManager", "onNoInterestingClick onPreDraw, yOff is " + c17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackPromptManager$1");
        return true;
    }
}
