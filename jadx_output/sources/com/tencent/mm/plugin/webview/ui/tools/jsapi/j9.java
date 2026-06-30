package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public abstract class j9 {
    public static java.lang.String a(nw4.y2 y2Var, java.lang.String str) {
        java.util.Map map = y2Var.f341018h;
        return (map == null || !((java.util.HashMap) map).containsKey(str)) ? "" : java.lang.String.valueOf(((java.util.HashMap) y2Var.f341018h).get(str));
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        try {
            java.lang.String a17 = fp.s0.a(str);
            return a17 == null ? "" : a17;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
