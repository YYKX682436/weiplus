package um4;

/* loaded from: classes5.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback f429122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f429123e;

    public j(com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback iLiteAppUICallback, java.util.List list) {
        this.f429122d = iLiteAppUICallback;
        this.f429123e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        android.view.View rootView = ((com.tencent.liteapp.ui.WxaLiteAppBaseView) this.f429122d).getRootView();
        ((lf0.h0) g0Var).getClass();
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager topStoryViewPager = (com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager) rootView.findViewById(com.tencent.mm.R.id.ogd);
        if (topStoryViewPager != null) {
            topStoryViewPager.setDisableDragArea(this.f429123e);
        }
    }
}
