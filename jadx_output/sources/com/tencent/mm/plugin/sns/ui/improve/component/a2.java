package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class a2 extends com.tencent.mm.plugin.sns.ui.improve.component.j implements bd4.v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // bd4.v0
    public boolean K1(android.view.MotionEvent ev6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveTouchUIC");
        kotlin.jvm.internal.o.g(ev6, "ev");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleInteractionPopWindow", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveTouchUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowing", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        android.widget.PopupWindow popupWindow = ad4.w.f3206d;
        boolean z17 = popupWindow != null && popupWindow.isShowing();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowing", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.improve.component.a aVar = com.tencent.mm.plugin.sns.ui.improve.component.j.Companion;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            android.widget.PopupWindow popupWindow2 = ad4.w.f3206d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            if (!aVar.a(popupWindow2 != null ? popupWindow2.getContentView() : null, ev6)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                pm0.v.X(new ad4.n(true));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleInteractionPopWindow", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveTouchUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDownEvent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveTouchUIC");
        return false;
    }
}
