package com.tencent.mm.plugin.webview.ui.tools;

@mk0.a
/* loaded from: classes8.dex */
final class kd implements com.tencent.mm.ipcinvoker.j {
    private kd() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUIStyleHelper", "InvokeTask, mm received invalid data");
            return;
        }
        java.lang.String string = bundle.getString("userName");
        java.lang.String string2 = bundle.getString("exportId");
        int j17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(string);
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).s(com.tencent.mm.sdk.platformtools.x2.f193071a, string, string2, 9, j17, null);
    }
}
