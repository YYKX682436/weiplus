package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class q extends oz5.a implements kotlinx.coroutines.r0 {
    public q(kotlinx.coroutines.q0 q0Var) {
        super(q0Var);
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$$inlined$CoroutineExceptionHandler$1");
        com.tencent.mars.xlog.Log.e("SnsAdBreakFrameVideoView", "the exception is " + th6.getMessage());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$$inlined$CoroutineExceptionHandler$1");
    }
}
