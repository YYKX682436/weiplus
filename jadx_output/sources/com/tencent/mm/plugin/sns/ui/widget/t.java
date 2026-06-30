package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class t extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f171269d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f171270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView f171271f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView, android.content.Context context) {
        super(context);
        this.f171271f = snsAdBreakFrameVideoView;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-16711936);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f171269d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(-16711936);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f171270e = paint2;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$initDebugOverlay$1");
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView = this.f171271f;
        if (!a84.b0.b(snsAdBreakFrameVideoView.getGestureDebugInfo().f402688a) && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigAdGestureShowSamplePoints()) == 1) {
            for (android.graphics.PointF pointF : snsAdBreakFrameVideoView.getGestureDebugInfo().f402688a) {
                canvas.drawCircle(pointF.x + snsAdBreakFrameVideoView.getGestureDebugInfo().f402690c, pointF.y + snsAdBreakFrameVideoView.getGestureDebugInfo().f402691d, 10.0f, this.f171269d);
                canvas.drawCircle(pointF.x + snsAdBreakFrameVideoView.getGestureDebugInfo().f402690c, pointF.y + snsAdBreakFrameVideoView.getGestureDebugInfo().f402691d, snsAdBreakFrameVideoView.getGestureDebugInfo().f402689b, this.f171270e);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$initDebugOverlay$1");
    }
}
