package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.r0 f137173d;

    public q0(com.tencent.mm.plugin.flash.action.r0 r0Var) {
        this.f137173d = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionReflectManager", "GetFaceCheckResult use http timeout!");
        com.tencent.mm.plugin.flash.action.s0 s0Var = this.f137173d.f137177f;
        s0Var.r(90007, i65.a.r(s0Var.f423271p, com.tencent.mm.R.string.c7q), "cgi failed");
    }
}
