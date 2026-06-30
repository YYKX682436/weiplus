package ud4;

/* loaded from: classes13.dex */
public class i0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView f426715a;

    public i0(com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView, ud4.w wVar) {
        this.f426715a = dynamicGridView;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
        if (message.what == 1) {
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f426715a;
            dynamicGridView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("detectedLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            android.view.View childAt = dynamicGridView.getChildAt(dynamicGridView.T);
            com.tencent.mars.xlog.Log.i("DynamicGridView", "detectedLongPress downPos:%d, lastTouchX:%f, lastTouchY:%f, downX:%d, downY:%d, mTotalOffsetRawX:%f, mTotalOffsetRawY:%f", java.lang.Integer.valueOf(dynamicGridView.T), java.lang.Float.valueOf(dynamicGridView.U), java.lang.Float.valueOf(dynamicGridView.V), java.lang.Integer.valueOf(dynamicGridView.f170268q), java.lang.Integer.valueOf(dynamicGridView.f170269r), java.lang.Float.valueOf(dynamicGridView.f170265o), java.lang.Float.valueOf(dynamicGridView.f170266p));
            if (dynamicGridView.D || dynamicGridView.E || !ud4.u.a(childAt, dynamicGridView.U, dynamicGridView.V) || java.lang.Math.abs(dynamicGridView.U - dynamicGridView.f170268q) >= 50.0f || java.lang.Math.abs(dynamicGridView.V - dynamicGridView.f170269r) >= 50.0f) {
                com.tencent.mars.xlog.Log.i("DynamicGridView", "touch outside");
            } else {
                int i17 = dynamicGridView.T;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                if (dynamicGridView.G) {
                    com.tencent.mars.xlog.Log.i("DynamicGridView", "startEditMode: ");
                    dynamicGridView.requestDisallowInterceptTouchEvent(true);
                    dynamicGridView.s();
                    if (dynamicGridView.F) {
                        dynamicGridView.x();
                    }
                    if (i17 != -1) {
                        boolean w17 = dynamicGridView.w(i17);
                        dynamicGridView.B = w17;
                        if (w17) {
                            dynamicGridView.f170275x = true;
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("detectedLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
    }
}
