package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.k0 f199605d;

    public o0(com.tencent.mm.ui.chatting.component.k0 k0Var) {
        this.f199605d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.k0 k0Var = this.f199605d;
        yb5.d dVar = k0Var.f198580d;
        if (dVar == null || dVar.f460708c.a(sb5.z0.class) == null) {
            return;
        }
        try {
            k0Var.f198580d.S(((com.tencent.mm.plugin.messenger.foundation.h2) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.h2.class)).Bi().q(k0Var.f198580d.x()), k0Var.f198580d.n().getStringExtra("override_session_id"));
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) k0Var.f198580d.f460708c.a(sb5.z0.class))).C();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatBotComponent", th6, "[-] getContact on enter yuanbao chatting failed.", new java.lang.Object[0]);
        }
    }
}
