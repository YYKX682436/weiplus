package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.floatball.y f184193d;

    public d0(com.tencent.mm.plugin.webview.ui.tools.floatball.y yVar) {
        this.f184193d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.webview.ui.tools.floatball.y yVar = this.f184193d;
        intent.putExtra("rawUrl", yVar.f184239a);
        if (com.tencent.mm.sdk.platformtools.t8.K0(yVar.f184241c)) {
            return;
        }
        intent.putExtra("float_ball_key", yVar.f184241c);
        if (yVar.f184240b == null) {
            return;
        }
        java.lang.String str = com.tencent.mm.pluginsdk.model.g4.b() ? com.tencent.mm.sdk.platformtools.w9.f193053a : com.tencent.mm.sdk.platformtools.w9.f193055c;
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.ipcinvoker.f.a(str, intent, com.tencent.mm.plugin.webview.ui.tools.floatball.c0.f184190d, null);
    }
}
