package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public abstract class o {
    public static final com.tencent.mm.ui.widget.MMWebView a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0 h0Var = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a;
        java.lang.String key = ballInfo.f93049g;
        kotlin.jvm.internal.o.f(key, "key");
        com.tencent.mm.plugin.webview.core.e3 c17 = h0Var.c(key);
        if (c17 != null) {
            return c17.f181916a;
        }
        return null;
    }
}
