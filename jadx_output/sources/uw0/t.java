package uw0;

/* loaded from: classes5.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f431604d;

    public t(uw0.x xVar) {
        this.f431604d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View recommendTitleView;
        android.view.View recommendTitleView2;
        float initTranslationY;
        uw0.x xVar = this.f431604d;
        recommendTitleView = xVar.getRecommendTitleView();
        if (recommendTitleView.isAttachedToWindow()) {
            recommendTitleView2 = xVar.getRecommendTitleView();
            initTranslationY = xVar.getInitTranslationY();
            recommendTitleView2.setTranslationY(initTranslationY);
            xVar.getInitTranslationY();
            float f17 = xVar.f431622y1;
        }
    }
}
