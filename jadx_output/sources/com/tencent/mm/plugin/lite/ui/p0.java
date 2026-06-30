package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes.dex */
public class p0 extends ut3.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f144458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI f144459e;

    public p0(com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI wxaLiteAppApiProxyUI, int i17) {
        this.f144459e = wxaLiteAppApiProxyUI;
        this.f144458d = i17;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        boolean z17;
        int i17;
        java.lang.String str = captureDataManager$CaptureVideoNormalModel.f155662f;
        int i18 = com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.f144319d;
        this.f144459e.getClass();
        if (captureDataManager$CaptureVideoNormalModel.a() != null) {
            i17 = ((java.lang.Integer) captureDataManager$CaptureVideoNormalModel.a().b("KEY_MEDIA_SOURCE_INT", -1)).intValue();
            z17 = (i17 == 1 || i17 == 2) ? false : true;
        } else {
            z17 = true;
            i17 = 0;
        }
        int i19 = z17 ? 21 : 20;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppApiProxyUI", "isSearchState = %b, source = %d, isFromAlbum = %b, model.getReportInfo() = %s, type = %d, path = %s.", java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17), captureDataManager$CaptureVideoNormalModel.a(), java.lang.Integer.valueOf(i17), str);
        java.util.HashMap hashMap = m93.j.f325066z;
        int i27 = this.f144458d;
        com.tencent.mm.plugin.lite.api.p pVar = (com.tencent.mm.plugin.lite.api.p) hashMap.get(java.lang.Integer.valueOf(i27));
        if (pVar != null) {
            pVar.i(str, i19);
            hashMap.remove(java.lang.Integer.valueOf(i27));
        }
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
