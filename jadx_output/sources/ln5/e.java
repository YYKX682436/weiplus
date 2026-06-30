package ln5;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.refreshLayout.WxRefreshLayout f319926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f319927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f319928f;

    public e(com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout, int i17, boolean z17) {
        this.f319926d = wxRefreshLayout;
        this.f319927e = i17;
        this.f319928f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        android.animation.ValueAnimator valueAnimator;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f319926d;
        if (!wxRefreshLayout.getCommonConfig().f330200j || this.f319927e >= 0) {
            animatorUpdateListener = null;
        } else {
            on5.b contentPlugin = wxRefreshLayout.getContentPlugin();
            animatorUpdateListener = contentPlugin != null ? contentPlugin.a(wxRefreshLayout.getCValues().f330209b) : null;
            if (animatorUpdateListener != null) {
                animatorUpdateListener.onAnimationUpdate(android.animation.ValueAnimator.ofInt(0, 0));
            }
        }
        boolean z17 = this.f319928f;
        ln5.d dVar = new ln5.d(wxRefreshLayout, z17);
        if (wxRefreshLayout.getCValues().f330209b > 0) {
            valueAnimator = wxRefreshLayout.b(0);
        } else {
            if (animatorUpdateListener != null || wxRefreshLayout.getCValues().f330209b == 0) {
                wxRefreshLayout.A.b();
                wxRefreshLayout.s(0, false);
                wxRefreshLayout.f213738h.e(sn5.b.f410157p);
            } else if (!z17 || !wxRefreshLayout.getCommonConfig().f330198h) {
                valueAnimator = wxRefreshLayout.b(0);
            } else if (wxRefreshLayout.getCValues().f330209b >= (-wxRefreshLayout.getFooterConfig().f330231a)) {
                wxRefreshLayout.f213738h.c(sn5.b.f410157p);
            } else {
                valueAnimator = wxRefreshLayout.b(-wxRefreshLayout.getFooterConfig().f330231a);
            }
            valueAnimator = null;
        }
        if (valueAnimator != null) {
            valueAnimator.addListener(dVar);
        } else {
            dVar.b(null);
        }
    }
}
