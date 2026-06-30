package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.o0 f181495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f181496e;

    public e0(com.tencent.mm.plugin.websearch.f0 f0Var, com.tencent.mm.plugin.websearch.o0 o0Var, org.json.JSONObject jSONObject) {
        this.f181495d = o0Var;
        this.f181496e = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.websearch.o0 o0Var = this.f181495d;
        int i17 = o0Var.f181578s;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "historySearchResultListener callback， id %d", java.lang.Integer.valueOf(i17));
            zg0.l3 l3Var = (zg0.l3) i95.n0.c(zg0.l3.class);
            int i18 = o0Var.f181578s;
            java.lang.String jSONObject = this.f181496e.toString();
            ((jw4.e) l3Var).getClass();
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i18);
            a17.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject);
            try {
                com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
                if (z0Var != null) {
                    z0Var.callback(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER, bundle);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "callbacker is null");
                }
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "onGetSearchHistory exception" + e17.getMessage());
            }
        }
    }
}
