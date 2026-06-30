package ud4;

/* loaded from: classes4.dex */
public class p implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView f426725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f426726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ud4.t f426727f;

    public p(ud4.t tVar, com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView dynamicGridView, java.util.List list) {
        this.f426727f = tVar;
        this.f426725d = dynamicGridView;
        this.f426726e = list;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$5");
        this.f426725d.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f426727f.d(this.f426726e.size());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$5");
        return true;
    }
}
