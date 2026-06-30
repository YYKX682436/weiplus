package ln5;

/* loaded from: classes15.dex */
public final class i extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.refreshLayout.WxRefreshLayout f319940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f319941e;

    public i(com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout, boolean z17) {
        this.f319940d = wxRefreshLayout;
        this.f319941e = z17;
    }

    @Override // qn5.a
    public void b(android.animation.Animator animator) {
        boolean z17 = false;
        if (animator != null && animator.getDuration() == 0) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f319940d;
        wxRefreshLayout.getCValues().f330227t = java.lang.System.currentTimeMillis();
        wxRefreshLayout.f213738h.c(sn5.b.f410164w);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRefresh ");
        boolean z18 = this.f319941e;
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i("WxRefreshLayout", sb6.toString());
        qn5.c onSimpleAction = wxRefreshLayout.getOnSimpleAction();
        if (onSimpleAction != null) {
            onSimpleAction.a(z18);
        }
        on5.g headerPlugin = wxRefreshLayout.getHeaderPlugin();
        if (headerPlugin != null) {
            headerPlugin.f(wxRefreshLayout, wxRefreshLayout.getHeaderConfig().f330235a, (int) (wxRefreshLayout.getHeaderConfig().f330237c < 10.0f ? wxRefreshLayout.getHeaderConfig().f330235a * wxRefreshLayout.getHeaderConfig().f330237c : wxRefreshLayout.getHeaderConfig().f330237c));
        }
    }
}
