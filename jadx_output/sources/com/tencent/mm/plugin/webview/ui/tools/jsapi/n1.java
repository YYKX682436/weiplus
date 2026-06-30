package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class n1 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f185282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185283b;

    public n1(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, android.content.Intent intent) {
        this.f185283b = c1Var;
        this.f185282a = intent;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.webview.stub.z0 z0Var;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185283b;
        c1Var.f184991t = null;
        if (c1Var.f184975d == null || (z0Var = c1Var.f184998y) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "getNow callback, msghandler has already been detached!");
            c1Var.i5(c1Var.f184976e, "profile:fail", null);
            return;
        }
        try {
            z0Var.i(199, null);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "hide dialog fail %s", e17.getMessage());
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) <= 0) {
            n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(str);
        }
        if (n17 == null || ((int) n17.E2) <= 0) {
            z17 = false;
        } else {
            str = n17.d1();
        }
        if (!z17) {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, j65.q.a(c1Var.f184975d).getString(com.tencent.mm.R.string.fds, 3, -1), 0).show();
            c1Var.i5(c1Var.f184976e, "profile:fail", null);
            return;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        com.tencent.mm.modelavatar.g.f(str, 3);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.wi().i(str);
        android.content.Intent intent = this.f185282a;
        intent.addFlags(268435456);
        intent.putExtra("Contact_User", str);
        if (n17.k2()) {
            android.os.Bundle bundle = c1Var.f184984o;
            int i17 = bundle != null ? bundle.getInt("Contact_Scene", 42) : 42;
            if (c1Var.M) {
                i17 = com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + "," + i17);
            intent.putExtra("Contact_Scene", i17);
        }
        c1Var.i7(intent);
        c1Var.i5(c1Var.f184976e, "profile:ok", null);
    }
}
