package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes7.dex */
public class o implements android.webkit.ValueCallback {
    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (!"undefined".equals(str)) {
            float L = com.tencent.mm.sdk.platformtools.t8.L(str, -1.0f);
            if (L > 0.0f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameWebUtil", "update density with window.devicePixelRatio = %s", str);
                if (L > 0.0f) {
                    ik1.w.f291843b = java.lang.Float.valueOf(L);
                    return;
                } else {
                    android.util.DisplayMetrics displayMetrics = ik1.w.f291842a;
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.GameWebUtil", "invalid window.devicePixelRatio %s", str);
    }
}
