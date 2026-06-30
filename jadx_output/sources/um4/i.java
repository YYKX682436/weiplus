package um4;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback f429120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f429121e;

    public i(com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback iLiteAppUICallback, boolean z17) {
        this.f429120d = iLiteAppUICallback;
        this.f429121e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        android.view.View rootView = ((com.tencent.liteapp.ui.WxaLiteAppBaseView) this.f429120d).getRootView();
        ((lf0.h0) g0Var).getClass();
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager topStoryViewPager = (com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager) rootView.findViewById(com.tencent.mm.R.id.ogd);
        if (topStoryViewPager != null) {
            topStoryViewPager.setEnableDrag(this.f429121e);
        }
    }
}
