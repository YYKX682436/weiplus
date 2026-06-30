package k74;

/* loaded from: classes4.dex */
public final class g implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k74.h f304788d;

    public g(k74.h hVar) {
        this.f304788d = hVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer b17;
        android.view.View c17;
        com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer b18;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer b19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$updateView$1");
        k74.h hVar = this.f304788d;
        k74.j a17 = k74.h.a(hVar);
        int i39 = 0;
        if ((a17 == null || (b19 = a17.b()) == null || b19.getVisibility() != 0) ? false : true) {
            k74.j a18 = k74.h.a(hVar);
            if (a18 != null && (b18 = a18.b()) != null && (layoutParams = b18.getLayoutParams()) != null) {
                i39 = layoutParams.width;
            }
            int i47 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("FeedbackNewStyleDisplayer", "topLayWidth = SelectItemContainer.w", null);
        } else {
            k74.j a19 = k74.h.a(hVar);
            if (a19 != null && (b17 = a19.b()) != null) {
                i39 = b17.getDefaultPanelWidth();
            }
            int i48 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("FeedbackNewStyleDisplayer", "topLayWidth = defaultW", null);
        }
        k74.j a27 = k74.h.a(hVar);
        android.view.ViewGroup.LayoutParams layoutParams2 = (a27 == null || (c17 = a27.c()) == null) ? null : c17.getLayoutParams();
        if (i39 > 0 && layoutParams2 != null && layoutParams2.width != i39) {
            com.tencent.mars.xlog.Log.i("FeedbackNewStyleDisplayer", "onLayoutChange, topLayoutWidth=" + i39 + ", topLayoutParamsW=" + java.lang.Integer.valueOf(layoutParams2.width), null);
            layoutParams2.width = i39;
            k74.j a28 = k74.h.a(hVar);
            android.view.View c18 = a28 != null ? a28.c() : null;
            if (c18 != null) {
                c18.setLayoutParams(layoutParams2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$updateView$1");
    }
}
