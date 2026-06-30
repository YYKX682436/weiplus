package com.tencent.mm.plugin.webview.luggage.util;

/* loaded from: classes8.dex */
public abstract class c {
    public static void a(android.view.Window window, boolean z17) {
        if (z17) {
            window.getDecorView().setSystemUiVisibility(b(window, z17));
            window.setFlags(1024, 1024);
            window.getDecorView().setOnSystemUiVisibilityChangeListener(new com.tencent.mm.plugin.webview.luggage.util.b(window, z17));
            return;
        }
        window.getDecorView().setSystemUiVisibility(b(window, z17));
        window.clearFlags(1024);
        window.getDecorView().setOnSystemUiVisibilityChangeListener(null);
    }

    public static int b(android.view.Window window, boolean z17) {
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        return z17 ? systemUiVisibility | 1024 | 256 | 512 | 2 | 4 | 4096 : systemUiVisibility & (-1025) & (-257) & (-513) & (-3) & (-5) & (-4097);
    }
}
