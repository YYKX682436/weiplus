package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes12.dex */
public class o5 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "uploadMediaFile";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadMediaFile", "invokeInOwn");
        java.lang.String optString = bVar.f406597b.f344506c.optString("appId");
        java.lang.String optString2 = bVar.f406597b.f344506c.optString(dm.i4.COL_LOCALID);
        boolean z17 = bVar.f406597b.f344506c.optInt("isShowProgressTips", 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadMediaFile", "uploadMediaFile, appid = %s, localid = %s, isShowProgressTips = %b", optString, optString2, java.lang.Boolean.valueOf(z17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadMediaFile", "appId or localid is null or nil.");
            bVar.c("missing arguments", null);
            return;
        }
        com.tencent.mm.plugin.webview.luggage.jsapi.l6 l6Var = new com.tencent.mm.plugin.webview.luggage.jsapi.l6();
        sd.d dVar = bVar.f406596a;
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) ((com.tencent.mm.plugin.webview.luggage.e0) dVar).f406610d;
        com.tencent.mm.plugin.webview.luggage.jsapi.n5 n5Var = new com.tencent.mm.plugin.webview.luggage.jsapi.n5(this, bVar, l6Var);
        l6Var.f182386a = mMActivity;
        l6Var.f182387b = (com.tencent.mm.plugin.webview.luggage.e0) dVar;
        l6Var.f182388c = optString;
        l6Var.f182389d = optString2;
        l6Var.f182390e = z17;
        l6Var.f182391f = n5Var;
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem a17 = com.tencent.mm.plugin.webview.luggage.util.g.a(optString2);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadMediaFileHelp", "item is null");
            ((com.tencent.mm.plugin.webview.luggage.jsapi.n5) l6Var.f182391f).a(false, null);
            return;
        }
        if (a17.f182742n == 1) {
            l6Var.c();
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17.f182738g) || !com.tencent.mm.vfs.w6.j(a17.f182738g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadMediaFileHelp", "origFilePath is not exist");
            ((com.tencent.mm.plugin.webview.luggage.jsapi.n5) l6Var.f182391f).a(false, null);
        } else {
            if (com.tencent.mm.network.y2.a(l6Var.f182386a)) {
                l6Var.d();
                return;
            }
            java.lang.String h07 = com.tencent.mm.sdk.platformtools.t8.h0((int) com.tencent.mm.vfs.w6.k(a17.f182738g));
            com.tencent.mm.ui.MMActivity mMActivity2 = l6Var.f182386a;
            db5.e1.H(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.l6k, h07), l6Var.f182386a.getString(com.tencent.mm.R.string.f490573yv), false, new com.tencent.mm.plugin.webview.luggage.jsapi.u5(l6Var), new com.tencent.mm.plugin.webview.luggage.jsapi.v5(l6Var));
        }
    }
}
