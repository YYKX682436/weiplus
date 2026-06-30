package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public final class od implements z41.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.pd f186741a;

    public od(com.tencent.mm.plugin.webview.ui.tools.pd pdVar) {
        this.f186741a = pdVar;
    }

    @Override // z41.b
    public final void a(z41.a aVar, z41.a aVar2) {
        int i17;
        nw4.n nVar;
        int i18 = aVar2 == null ? -1 : com.tencent.mm.plugin.webview.ui.tools.nd.f185871a[aVar2.ordinal()];
        if (i18 == 1) {
            i17 = 90;
        } else if (i18 == 2) {
            i17 = -90;
        } else if (i18 == 3) {
            i17 = 0;
        } else if (i18 != 4) {
            return;
        } else {
            i17 = 180;
        }
        com.tencent.mm.plugin.webview.ui.tools.pd pdVar = this.f186741a;
        pdVar.f186760b = i17;
        int i19 = pdVar.f186760b;
        if (i19 == pdVar.f186761c) {
            return;
        }
        pdVar.f186761c = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFullScreenHelper", "onOrientationsChange currentOrientation=" + pdVar.f186760b);
        try {
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = pdVar.c();
            if (c17 == null || (nVar = c17.f183844p0) == null) {
                return;
            }
            int i27 = pdVar.f186760b;
            pdVar.getClass();
            int i28 = android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "accelerometer_rotation", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFullScreenHelper", "accRotation=" + i28);
            nVar.Y(i27, i28 == 0 ? 1 : 0);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewVideoFullScreenHelper", "onOrientationsChange fail", e17);
        }
    }
}
