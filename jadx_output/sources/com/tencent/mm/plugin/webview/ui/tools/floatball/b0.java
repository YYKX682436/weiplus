package com.tencent.mm.plugin.webview.ui.tools.floatball;

/* loaded from: classes8.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.floatball.y f184189d;

    public b0(com.tencent.mm.plugin.webview.ui.tools.floatball.y yVar) {
        this.f184189d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.floatball.y yVar = this.f184189d;
        java.lang.String str = yVar.f184239a;
        boolean z17 = false;
        if ((str == null || r26.n0.N(str)) || com.tencent.mm.sdk.platformtools.t8.K0(yVar.f184241c)) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0 h0Var = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a;
        if (com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184204d.containsKey(yVar.f184241c)) {
            return;
        }
        java.lang.String str2 = yVar.f184239a;
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        if (a0Var != null && ((yq1.z) a0Var).o(str2)) {
            z17 = true;
        }
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", yVar.f184239a);
            intent.putExtra("float_ball_key", yVar.f184241c);
            java.lang.String str3 = com.tencent.mm.pluginsdk.model.g4.b() ? com.tencent.mm.sdk.platformtools.w9.f193053a : com.tencent.mm.sdk.platformtools.w9.f193055c;
            kotlin.jvm.internal.o.d(str3);
            com.tencent.mm.ipcinvoker.f.a(str3, intent, com.tencent.mm.plugin.webview.ui.tools.floatball.z.f184243d, new com.tencent.mm.plugin.webview.ui.tools.floatball.a0(yVar));
        }
    }
}
