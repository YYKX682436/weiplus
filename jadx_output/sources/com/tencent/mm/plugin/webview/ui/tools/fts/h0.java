package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class h0 extends ut3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f184425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI f184426e;

    public h0(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI, java.util.HashMap hashMap) {
        this.f184426e = baseSearchWebViewUI;
        this.f184425d = hashMap;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        boolean z17;
        int i17;
        java.lang.String str = captureDataManager$CaptureVideoNormalModel.f155662f;
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = this.f184426e;
        boolean X9 = baseSearchWebViewUI.X9();
        if (captureDataManager$CaptureVideoNormalModel.a() != null) {
            i17 = ((java.lang.Integer) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MEDIA_SOURCE_INT", -1)).intValue();
            z17 = (i17 == 1 || i17 == 2) ? false : true;
        } else {
            z17 = true;
            i17 = 0;
        }
        int i18 = X9 ? z17 ? 21 : 20 : z17 ? 19 : 18;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "isSearchState = %b, source = %d, isFromAlbum = %b, model.getReportInfo() = %s, type = %d, path = %s.", java.lang.Boolean.valueOf(X9), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), captureDataManager$CaptureVideoNormalModel.a(), java.lang.Integer.valueOf(i17), str);
        baseSearchWebViewUI.ca(str, i18, this.f184425d);
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.finish();
            if (z17) {
                activity.overridePendingTransition(0, com.tencent.mm.R.anim.f477856de);
            } else {
                activity.overridePendingTransition(0, com.tencent.mm.R.anim.f477779b8);
            }
        }
    }
}
