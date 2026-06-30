package com.tencent.mm.plugin.webview.ui.tools.fts;

@mk0.a
/* loaded from: classes8.dex */
public class BaseSearchWebViewUI$$d implements com.tencent.mm.ipcinvoker.i<android.os.Bundle, com.tencent.mm.ipcinvoker.type.IPCString> {
    private BaseSearchWebViewUI$$d() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        int i17;
        int i18;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("key_image_path");
        int i19 = bundle.getInt("key_img_source");
        int i27 = bundle.getInt("key_scene");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "MMOpenCameraTask, chooseFilePath = " + string + ", source = " + i19 + ", originalScene = " + i27);
        try {
            if (i27 == 3147) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "MMOpenCameraTask, map ORDER1_SEARCH to CircleToSearchScene.OrderAndShop");
                i17 = 17;
            } else if (i27 == 4501) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "MMOpenCameraTask, map GIFT_SEARCH_MIN to CircleToSearchScene.Present");
                i17 = 18;
            } else if (((s50.u0) ((u50.z) i95.n0.c(u50.z.class))).Bi(i27)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSearchWebViewUI", "MMOpenCameraTask, map finder scene " + i27 + " to CircleToSearchScene.FinderEducationPic");
                i17 = 19;
            } else {
                i17 = 11;
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            int i28 = com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.E4;
            switch (i19) {
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
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI.D9(context, i17, i18, string, i19);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.BaseSearchWebViewUI", "doOpenCamera fail, ex = " + e17);
        }
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
