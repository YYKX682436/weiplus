package ud4;

/* loaded from: classes4.dex */
public class o implements ud4.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView f426722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f426723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud4.t f426724c;

    public o(ud4.t tVar, com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView, android.view.View view) {
        this.f426724c = tVar;
        this.f426722a = dynamicGridView;
        this.f426723b = view;
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActionDrop", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$4");
        com.tencent.mars.xlog.Log.i("DynamicGrid", "gridView onActionDrop: ");
        com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView = this.f426722a;
        dynamicGridView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mars.xlog.Log.i("DynamicGridView", "stopEditMode: ");
        dynamicGridView.B = false;
        dynamicGridView.requestDisallowInterceptTouchEvent(false);
        dynamicGridView.s();
        if (dynamicGridView.F) {
            dynamicGridView.y(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        float f17 = this.f426724c.f426737f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        dynamicGridView.setElevation(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActionDrop", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$4");
    }
}
