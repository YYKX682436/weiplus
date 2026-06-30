package com.tencent.mm.plugin.game.luggage.page;

@mk0.a
/* loaded from: classes8.dex */
final class t implements com.tencent.mm.ipcinvoker.j {
    private t() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameWebActionBar", "InvokeTask, mm received invalid data");
            return;
        }
        java.lang.String string = bundle.getString("userName");
        java.lang.String string2 = bundle.getString("exportId");
        java.lang.String string3 = bundle.getString("byPass");
        int j17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(string);
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).r(com.tencent.mm.sdk.platformtools.x2.f193071a, string, string2, 9, j17, string3, null);
    }
}
