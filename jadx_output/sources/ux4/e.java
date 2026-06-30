package ux4;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lux4/e;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenCameraForImageSearch", "[openCameraForImageSearch] app = " + str + ", data = " + jSONObject);
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.f(c17, "getContext(...)");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.a((android.app.Activity) c17, "android.permission.CAMERA", 18, "", "")) {
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = new com.tencent.mm.modelcontrol.VideoTransPara();
            videoTransPara.f71195h = 10000;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider g17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.g("", "", videoTransPara, 10000000, 16);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            g17.f155681s = bool;
            g17.f155682t = java.lang.Boolean.FALSE;
            g17.f155684v = bool;
            g17.f155677o.f64783o = i65.a.r(c17, com.tencent.mm.R.string.hku);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("media_provider", g17);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
            intent.putExtra("proxyui_action_code_key", 14);
            intent.putExtra("record_provider", (android.os.Parcelable) bundle.get("media_provider"));
            intent.putExtra("request_code", 4300);
            int i17 = m93.j.f325065y + 1;
            m93.j.f325065y = i17;
            m93.j.f325066z.put(java.lang.Integer.valueOf(i17), this);
            intent.putExtra("callback_id", m93.j.f325065y);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/lite/LiteAppFeatureService", "startWxaLiteProxyUI", "(Lcom/tencent/mm/plugin/lite/api/LiteAppJsApi;Landroid/os/Bundle;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/lite/LiteAppFeatureService", "startWxaLiteProxyUI", "(Lcom/tencent/mm/plugin/lite/api/LiteAppJsApi;Landroid/os/Bundle;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void i(java.lang.String path, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiOpenCameraForImageSearch", "openSearchImgIPC, imgPath = " + path + ", source = " + i17);
        switch (i17) {
            case 18:
            case 20:
                i18 = 6;
                break;
            case 19:
            case 21:
                i18 = 7;
                break;
            default:
                i18 = 0;
                break;
        }
        tg0.f1 f1Var = (tg0.f1) i95.n0.c(tg0.f1.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((sg0.e) f1Var).wi(context, 11, i18, path);
    }
}
