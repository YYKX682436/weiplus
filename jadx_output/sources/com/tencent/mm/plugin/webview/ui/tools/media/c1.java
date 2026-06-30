package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes.dex */
public final class c1 {
    public c1(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.webview.ui.tools.media.e1 a() {
        if (com.tencent.mm.plugin.webview.ui.tools.media.e1.f185760k == null) {
            synchronized (com.tencent.mm.plugin.webview.ui.tools.media.e1.class) {
                if (com.tencent.mm.plugin.webview.ui.tools.media.e1.f185760k == null) {
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    com.tencent.mm.plugin.webview.ui.tools.media.e1 e1Var = new com.tencent.mm.plugin.webview.ui.tools.media.e1(context, null);
                    com.tencent.mm.plugin.webview.ui.tools.media.e1.f185760k = e1Var;
                    com.tencent.mm.sdk.event.IListener iListener = e1Var.f185765e;
                    if (iListener != null) {
                        iListener.alive();
                    }
                }
            }
        }
        return com.tencent.mm.plugin.webview.ui.tools.media.e1.f185760k;
    }
}
