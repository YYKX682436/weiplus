package v74;

/* loaded from: classes2.dex */
public final class p0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f433875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAnimContainer f433876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f433877f;

    public p0(android.view.View view, com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAnimContainer adLookbookAnimContainer, int i17) {
        this.f433875d = view;
        this.f433876e = adLookbookAnimContainer;
        this.f433877f = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$setBreakFrame$1");
        android.view.View view = this.f433875d;
        if (!view.isAttachedToWindow()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$setBreakFrame$1");
            return true;
        }
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$setBreakFrame$1");
            return true;
        }
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAnimContainer adLookbookAnimContainer = this.f433876e;
        android.view.ViewGroup.LayoutParams layoutParams = adLookbookAnimContainer != null ? adLookbookAnimContainer.getLayoutParams() : null;
        if (layoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$setBreakFrame$1");
            return true;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        int width = view.getWidth() + rect.left;
        com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "onPreDraw, curW=" + view.getWidth() + ", targetW=" + width + ", rect=" + rect);
        if (layoutParams.width != width) {
            layoutParams.height = this.f433877f;
            layoutParams.width = view.getWidth() + rect.left;
            if (adLookbookAnimContainer != null) {
                adLookbookAnimContainer.setLayoutParams(layoutParams);
            }
            if (adLookbookAnimContainer != null) {
                adLookbookAnimContainer.setTranslationX(-rect.left);
            }
        }
        android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic$setBreakFrame$1");
        return true;
    }
}
