package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class la implements java.lang.Runnable {
    public la(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.mm.plugin.webview.ui.tools.WebViewUI.f183798w3 <= 0) {
            java.util.HashSet hashSet = com.tencent.mm.sdk.platformtools.b.f192466a;
            try {
                com.tencent.mars.xlog.Log.i("AccessibilityUtil", "recoverAccessibilityEnable");
                android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
                boolean isEnabled = accessibilityManager.isEnabled();
                java.lang.reflect.Field declaredField = android.view.accessibility.AccessibilityManager.class.getDeclaredField("mIsHighTextContrastEnabled");
                declaredField.setAccessible(true);
                boolean booleanValue = ((java.lang.Boolean) declaredField.get(accessibilityManager)).booleanValue();
                com.tencent.mars.xlog.Log.i("AccessibilityUtil", "recoverAccessibilityEnable enabledNow = " + isEnabled);
                if (!isEnabled) {
                    com.tencent.mm.sdk.platformtools.b.b(accessibilityManager, booleanValue);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.i("AccessibilityUtil", "enableAccessibility failed -> " + th6.getMessage());
            }
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "now force sync the cookie between ram and db");
            com.tencent.xweb.d.g().flush();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI", "syncCookie, error:%s", e17);
        }
    }
}
