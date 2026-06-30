package com.tencent.mm.plugin.webview.permission;

/* loaded from: classes7.dex */
public class h implements or5.c {
    public h(com.tencent.mm.plugin.webview.permission.d dVar) {
    }

    @Override // or5.c
    public void a(int i17, java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (i17 == 2) {
            return;
        }
        try {
            if (i17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8Key." + str, "%s", str2);
            } else if (i17 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8Key." + str, "%s", str2);
            } else if (i17 == 5) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LuggageGetA8Key." + str, "%s", str2);
            } else {
                if (i17 != 6) {
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8Key." + str, "%s", str2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuggageGetA8Key", e17, "", new java.lang.Object[0]);
        }
    }
}
