package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public abstract class a5 {
    public static android.content.Intent a(android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewShortcutManager", "buildIntent, install = %b", java.lang.Boolean.valueOf(z17));
        if (bitmap == null && z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewShortcutManager", "no bmp");
            return null;
        }
        android.content.Intent intent = new android.content.Intent(z17 ? "com.android.launcher.action.INSTALL_SHORTCUT" : "com.android.launcher.action.UNINSTALL_SHORTCUT");
        intent.putExtra("android.intent.extra.shortcut.NAME", str2);
        intent.putExtra("duplicate", false);
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.action.WX_SHORTCUT");
        intent2.putExtra("type", 4);
        try {
            intent2.putExtra("ext_info", java.net.URLEncoder.encode(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        intent2.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        intent2.addFlags(67108864);
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        if (bitmap != null) {
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
            intent.putExtra("shortcut_is_adaptive_icon", true);
        }
        return intent;
    }

    public static void b(com.tencent.mm.plugin.webview.model.z4 z4Var, boolean z17) {
        if (z4Var != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean(ya.b.SUCCESS, z17);
            ((com.tencent.mm.plugin.webview.luggage.menu.f) z4Var).f182565a.a(bundle);
        }
    }
}
