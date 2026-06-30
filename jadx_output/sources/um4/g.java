package um4;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback f429119d;

    public g(com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback iLiteAppUICallback) {
        this.f429119d = iLiteAppUICallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        android.view.View rootView = ((com.tencent.liteapp.ui.WxaLiteAppBaseView) this.f429119d).getRootView();
        ((lf0.h0) g0Var).getClass();
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.og_);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/feature/topstory/TopStoryUIService", "hideNavBarShadow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/feature/topstory/TopStoryUIService", "hideNavBarShadow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
