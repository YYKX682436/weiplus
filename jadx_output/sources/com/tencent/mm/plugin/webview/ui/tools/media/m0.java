package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class m0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.n0 f185804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f185805e;

    public m0(com.tencent.mm.plugin.webview.ui.tools.media.n0 n0Var, android.app.Activity activity) {
        this.f185804d = n0Var;
        this.f185805e = activity;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        boolean z17 = ((android.os.Bundle) obj).getBoolean("ret", true);
        android.app.Activity activity = this.f185805e;
        com.tencent.mm.plugin.webview.ui.tools.media.n0 n0Var = this.f185804d;
        if (z17) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.media.k0(activity, n0Var));
            return;
        }
        n0Var.getClass();
        com.tencent.mars.xlog.Log.w("MicroMsg.MPVideoTransmit", "share fail");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.media.l0(activity, n0Var));
    }
}
