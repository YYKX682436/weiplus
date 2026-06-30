package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public abstract class a extends yn.d implements com.tencent.mm.ui.chatting.component.hg, yn.l, yn.h {

    /* renamed from: d, reason: collision with root package name */
    public yb5.d f198580d;

    @Override // yn.h
    public void B(int i17) {
    }

    @Override // yn.l
    public void E() {
    }

    @Override // com.tencent.mm.ui.chatting.component.hg
    public void I() {
        ((com.tencent.mm.ui.chatting.component.y4) ((yn.j) this.f198580d.f460708c.a(yn.j.class))).c(this);
        ((com.tencent.mm.ui.chatting.component.g7) ((yn.k) this.f198580d.f460708c.a(yn.k.class))).f199082d.remove(this);
        com.tencent.mm.ui.chatting.component.w3 w3Var = (com.tencent.mm.ui.chatting.component.w3) ((yn.i) this.f198580d.f460708c.a(yn.i.class));
        w3Var.getClass();
        w3Var.f200149d.remove(this);
    }

    @Override // yn.l
    public void J() {
    }

    @Override // yn.l
    public void K() {
    }

    @Override // com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        this.f198580d = dVar;
        ((com.tencent.mm.ui.chatting.component.y4) ((yn.j) dVar.f460708c.a(yn.j.class))).b(this);
        ((com.tencent.mm.ui.chatting.component.g7) ((yn.k) this.f198580d.f460708c.a(yn.k.class))).f199082d.add(this);
        com.tencent.mm.ui.chatting.component.w3 w3Var = (com.tencent.mm.ui.chatting.component.w3) ((yn.i) this.f198580d.f460708c.a(yn.i.class));
        w3Var.getClass();
        w3Var.f200149d.add(this);
    }

    @Override // yn.l
    public void a() {
    }

    @Override // yn.h
    public void k(int i17, boolean z17) {
    }

    @Override // yn.l
    public void x() {
    }

    @Override // yn.l
    public void y() {
    }

    @Override // yn.l
    public void z() {
    }
}
