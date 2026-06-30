package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.n0 f137161d;

    public m0(com.tencent.mm.plugin.flash.action.n0 n0Var) {
        this.f137161d = n0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckAction use http timeout!");
        com.tencent.mm.plugin.flash.action.s0 s0Var = this.f137161d.f137164f;
        s0Var.r(90036, i65.a.r(s0Var.f423271p, com.tencent.mm.R.string.net_fetch_failed), "cgi failed");
    }
}
