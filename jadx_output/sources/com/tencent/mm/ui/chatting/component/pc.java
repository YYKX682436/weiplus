package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.v0.class)
/* loaded from: classes5.dex */
public class pc extends com.tencent.mm.ui.chatting.component.a implements sb5.v0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f199682e = new java.util.ArrayList();

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitaireComponent", "onChattingExitAnimStart");
        ((java.util.ArrayList) this.f199682e).clear();
    }

    public boolean m0(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var != null) {
            r45.ad4 ad4Var = tg3.p1.f419206a.a(f9Var).f195029g;
            if (ad4Var == null) {
                ad4Var = f9Var.L0();
            }
            if (ad4Var != null) {
                return !((java.util.ArrayList) this.f199682e).contains(java.lang.Long.valueOf(f9Var.getMsgId()));
            }
        }
        return false;
    }
}
