package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes14.dex */
public class u extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("action", "resume");
        com.tencent.mars.xlog.Log.i("ChangeViewStatus", "Invoke changeViewStatus %s", optString);
        com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback uICallback = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(this.f143442e.f299024a);
        if (uICallback == null) {
            this.f143443f.a("cannot find half screen view");
            return;
        }
        com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView = uICallback instanceof com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView ? (com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView) uICallback : null;
        com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment = uICallback instanceof com.tencent.liteapp.ui.WxaLiteAppFragment ? (com.tencent.liteapp.ui.WxaLiteAppFragment) uICallback : null;
        if (wxaHalfScreenLiteAppView == null && wxaLiteAppFragment == null) {
            this.f143443f.a("cannot find half screen view");
            return;
        }
        if (wxaHalfScreenLiteAppView != null) {
            if (optString.equals("fullscreen")) {
                if (wxaHalfScreenLiteAppView.landscape) {
                    wxaHalfScreenLiteAppView.i(com.tencent.mm.plugin.lite.ui.a.f144379e, 300L, new com.tencent.mm.plugin.lite.ui.b0(wxaHalfScreenLiteAppView));
                } else if (wxaHalfScreenLiteAppView.enablePullUp) {
                    com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollContentView = wxaHalfScreenLiteAppView.getScrollContentView();
                    if (scrollContentView != null) {
                        scrollContentView.i();
                    }
                } else if (wxaHalfScreenLiteAppView.getScrollContentView() != null) {
                    wxaHalfScreenLiteAppView.setEnablePullUp(true);
                    wxaHalfScreenLiteAppView.needResetEnablePullUp = true;
                    new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.lite.ui.c0(wxaHalfScreenLiteAppView));
                }
            } else if (optString.equals("hide")) {
                wxaHalfScreenLiteAppView.l();
            } else if (wxaHalfScreenLiteAppView.landscape) {
                wxaHalfScreenLiteAppView.i(com.tencent.mm.plugin.lite.ui.a.f144380f, 300L, new com.tencent.mm.plugin.lite.ui.z(wxaHalfScreenLiteAppView));
            } else if (wxaHalfScreenLiteAppView.needResetEnablePullUp) {
                wxaHalfScreenLiteAppView.setEnablePullUp(!wxaHalfScreenLiteAppView.enablePullUp);
                wxaHalfScreenLiteAppView.needResetEnablePullUp = false;
                new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.lite.ui.a0(wxaHalfScreenLiteAppView));
            } else {
                com.tencent.mm.plugin.lite.ui.ScrollableFrameLayout scrollContentView2 = wxaHalfScreenLiteAppView.getScrollContentView();
                if (scrollContentView2 != null) {
                    scrollContentView2.g();
                }
            }
        }
        if (wxaLiteAppFragment != null) {
            if (optString.equals("fullscreen")) {
                androidx.activity.k activity = wxaLiteAppFragment.getActivity();
                if (activity instanceof com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback) {
                    ((com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback) activity).halfScreenScrollToTop();
                }
            } else if (optString.equals("hide")) {
                androidx.activity.k activity2 = wxaLiteAppFragment.getActivity();
                if (activity2 instanceof com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback) {
                    ((com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback) activity2).halfScreenScrollToBottom();
                }
            } else {
                androidx.activity.k activity3 = wxaLiteAppFragment.getActivity();
                if (activity3 instanceof com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback) {
                    ((com.tencent.mm.plugin.lite.LiteAppCenter.IFragmentCallback) activity3).halfScreenScrollToResume();
                }
            }
        }
        this.f143443f.d(false);
    }
}
