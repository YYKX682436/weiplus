package x74;

/* loaded from: classes4.dex */
public final class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x74.b f452449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f452450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452451f;

    public a(x74.b bVar, android.view.View view, java.lang.String str) {
        this.f452449d = bVar;
        this.f452450e = view;
        this.f452451f = str;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper$update$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setHasPreDrawListenerAdded$p", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        x74.b bVar = this.f452449d;
        bVar.f452457f = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setHasPreDrawListenerAdded$p", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        android.view.View view = this.f452450e;
        java.lang.String str = this.f452451f;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItemRootWidth", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            bVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootWidth", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            android.view.ViewGroup viewGroup = bVar.f452453b;
            int width = viewGroup != null ? viewGroup.getWidth() : 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootWidth", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItemRootWidth", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getItemRootHeight", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootHeight", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            android.view.ViewGroup viewGroup2 = bVar.f452453b;
            int height = viewGroup2 != null ? viewGroup2.getHeight() : 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootHeight", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getItemRootHeight", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            com.tencent.mars.xlog.Log.i("SnsAd.PreviewHelper", "the root width is " + width + ", height is " + height);
            if (height > 0 && width > 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setSnsId$p", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
                bVar.f452455d = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setSnsId$p", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
                x74.b.a(bVar, width, height);
                com.tencent.mars.xlog.Log.i("SnsAd.PreviewHelper", "the water mark view has been calculated!!");
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper$update$1");
        return true;
    }
}
