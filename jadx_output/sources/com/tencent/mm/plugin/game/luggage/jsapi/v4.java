package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class v4 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.b f139761e;

    public v4(com.tencent.mm.plugin.game.luggage.jsapi.x4 x4Var, java.lang.String str, sd.b bVar) {
        this.f139760d = str;
        this.f139761e = bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean z17 = bundle.getBoolean("backRet");
        java.io.OutputStream outputStream = null;
        sd.b bVar = this.f139761e;
        if (!z17) {
            bVar.c("exceed_size", null);
            return;
        }
        boolean z18 = bundle.getBoolean("backIsFile", false);
        java.lang.String string = bundle.getString("backFileName");
        if (z18 && !com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetGameData", "store data to file. fileName:%s", string);
            ew4.c.c().getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                java.lang.String str = this.f139760d;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    int length = str.getBytes().length;
                    java.lang.String str2 = ew4.d.P0() + string;
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(ew4.d.P0());
                    if (!r6Var.m() || !r6Var.y()) {
                        r6Var.J();
                    }
                    try {
                        byte[] bytes = str.getBytes();
                        outputStream = com.tencent.mm.vfs.w6.K(str2, false);
                        outputStream.write(bytes);
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewDataCenter", "savePageCache: " + e17.getMessage());
                    }
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (java.io.IOException unused) {
                        }
                    }
                }
            }
        }
        bVar.a();
    }
}
