package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public final class ji implements l41.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.li f199292a;

    public ji(com.tencent.mm.ui.chatting.component.li liVar) {
        this.f199292a = liVar;
    }

    @Override // l41.j2
    public void a(android.os.Bundle bundle) {
        java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("result_key_action")) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuComponent", "startConversation result action: %s", valueOf);
        if (valueOf != null && valueOf.intValue() == 3) {
            this.f199292a.getClass();
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.ui.chatting.component.ii iiVar = com.tencent.mm.ui.chatting.component.ii.f199232d;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(iiVar, 100L, false);
        }
    }
}
