package com.tencent.mm.ui.chatting.component;

/* loaded from: classes15.dex */
public final class b0 extends com.tencent.mm.ui.chatting.component.u {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.c0 f198687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f198688f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msgquote.model.MsgQuoteItem f198689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.ui.chatting.component.c0 c0Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem, int i17, java.lang.String str) {
        super(i17, str);
        this.f198687e = c0Var;
        this.f198688f = f9Var;
        this.f198689g = msgQuoteItem;
    }

    @Override // com.tencent.mm.ui.chatting.component.u
    public ot0.q a() {
        com.tencent.mm.storage.f9 b17 = b();
        if (b17 != null) {
            return this.f198687e.r0(b17);
        }
        return null;
    }

    @Override // com.tencent.mm.ui.chatting.component.u
    public com.tencent.mm.storage.f9 c() {
        com.tencent.mm.ui.chatting.component.c0 c0Var = this.f198687e;
        boolean D = c0Var.f198580d.D();
        java.lang.String x17 = c0Var.f198580d.x();
        com.tencent.mm.storage.f9 f9Var = this.f198688f;
        return com.tencent.mm.ui.chatting.viewitems.dc.b(D, x17, f9Var.getMsgId(), f9Var.Q0(), this.f198689g, "toParamsPack");
    }
}
