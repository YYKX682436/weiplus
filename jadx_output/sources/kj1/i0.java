package kj1;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkj1/i0;", "Lcom/tencent/mm/ipcinvoker/i;", "Landroid/os/Bundle;", "Lcom/tencent/mm/plugin/appbrand/shortlink/WxaShortLinkRiskManager$UploadResult;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class i0 implements com.tencent.mm.ipcinvoker.i<android.os.Bundle, com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        byte[] a17;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult(false, null, 2, null));
                return;
            }
            return;
        }
        java.lang.String string = bundle.getString("linkUrl");
        if (android.text.TextUtils.isEmpty(bundle.getString("data_mmkv_key", ""))) {
            a17 = bundle.getByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        } else {
            za1.b bVar = za1.b.f470878a;
            java.lang.String string2 = bundle.getString("data_mmkv_key");
            kotlin.jvm.internal.o.d(string2);
            a17 = bVar.a(string2, true);
        }
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_WxaMpShortLinkScreenshot";
        mVar.field_fileType = 20304;
        mVar.field_bzScene = 2;
        mVar.field_appType = 302;
        mVar.field_mediaId = new kk.v(gm0.j1.b().h()).longValue() + '_' + java.lang.System.currentTimeMillis() + '_' + com.tencent.mm.sdk.platformtools.w2.a(string);
        mVar.f241792m = a17;
        mVar.field_needStorage = false;
        mVar.f241787f = new kj1.h0(rVar);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            return;
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.shortlink.WxaShortLinkRiskManager$UploadResult(false, null, 2, null));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaShortLinkRiskManager", "cdn upload add task fail");
    }
}
