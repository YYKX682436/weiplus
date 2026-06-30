package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes.dex */
public abstract class g5 {
    public static boolean a() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return (c01.z1.j() & 2097152) == 2097152;
        }
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, null, com.tencent.mm.plugin.webview.ui.tools.fts.f5.class);
        if (iPCBoolean == null) {
            return false;
        }
        return iPCBoolean.f68400d;
    }
}
