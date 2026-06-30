package gd4;

/* loaded from: classes4.dex */
public interface x0 {
    static /* synthetic */ java.lang.Object d(gd4.x0 x0Var, java.lang.String str, android.widget.FrameLayout.LayoutParams layoutParams, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepare$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IVideoControllerForBreakFrame");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepare");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepare$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IVideoControllerForBreakFrame");
            throw unsupportedOperationException;
        }
        if ((i17 & 2) != 0) {
            layoutParams = null;
        }
        if ((i17 & 4) != 0) {
            str2 = null;
        }
        java.lang.Object a17 = x0Var.a(str, layoutParams, str2, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepare$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IVideoControllerForBreakFrame");
        return a17;
    }

    java.lang.Object a(java.lang.String str, android.widget.FrameLayout.LayoutParams layoutParams, java.lang.String str2, kotlin.coroutines.Continuation continuation);

    void b(android.widget.FrameLayout.LayoutParams layoutParams);

    java.lang.Object c(long j17, boolean z17, yz5.a aVar, kotlin.coroutines.Continuation continuation);

    kotlinx.coroutines.flow.n2 getCompletionFlow();

    long getCurrentPosInMills();

    long getDurationMs();

    void pause();

    void resume();

    void setFrameLayoutAlpha(float f17);

    void start();

    void stop();
}
