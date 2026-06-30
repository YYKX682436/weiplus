package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class z8 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f208310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f208311e;

    public z8(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f208310d = openImKefuServiceConversationFmUI;
        this.f208311e = u3Var;
    }

    @Override // c01.da
    public boolean a() {
        return this.f208310d.f207405m;
    }

    @Override // c01.da
    public void c() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f208311e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
