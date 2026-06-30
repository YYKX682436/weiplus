package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class te extends com.tencent.mm.ui.bc {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pe f199994e;

    public te(com.tencent.mm.ui.chatting.component.pe peVar) {
        this.f199994e = peVar;
    }

    @Override // com.tencent.mm.ui.bc
    public void b(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f199994e.f198580d.g(), 1, true);
        k0Var.f211872n = new com.tencent.mm.ui.chatting.component.re(this);
        k0Var.f211881s = new com.tencent.mm.ui.chatting.component.se(this);
        k0Var.v();
    }
}
