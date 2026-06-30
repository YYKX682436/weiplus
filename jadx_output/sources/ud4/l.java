package ud4;

/* loaded from: classes4.dex */
public class l implements ud4.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView f426718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f426719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud4.t f426720c;

    public l(ud4.t tVar, com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView, android.view.View view) {
        this.f426720c = tVar;
        this.f426718a = dynamicGridView;
        this.f426719b = view;
    }

    public boolean a(android.graphics.Rect rect) {
        boolean intersect;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isIntersect", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        ud4.t tVar = this.f426720c;
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkIntersectDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        if (rect == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIntersectDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
            intersect = false;
        } else {
            intersect = pm0.v.r(tVar.f426738g).intersect(rect);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIntersectDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isIntersect", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
        return intersect;
    }
}
