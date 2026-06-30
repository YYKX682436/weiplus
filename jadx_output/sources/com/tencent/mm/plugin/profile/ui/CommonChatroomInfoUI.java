package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes11.dex */
public class CommonChatroomInfoUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public com.tencent.mm.storage.z3 C;
    public hr3.u0 D;
    public hr3.w0 E;

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        if (this.D == null) {
            this.D = new hr3.u0(this, this.A, this.C);
        }
        return this.D;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        if (this.E == null) {
            this.E = new hr3.w0(this, this.A, this.C);
        }
        return this.E;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        int i17 = this.C.I;
        return i17 == 1 ? getString(com.tencent.mm.R.string.bcy) : i17 == 2 ? getString(com.tencent.mm.R.string.bcx) : getString(com.tencent.mm.R.string.f490958bd2);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.item.c0 c0Var = (com.tencent.mm.ui.contact.item.c0) this.f206446d.getAdapter().getItem(i17);
        if (c0Var != null) {
            if ((com.tencent.mm.storage.z3.m4(c0Var.B.d1()) || com.tencent.mm.storage.z3.n4(c0Var.B.d1())) && !com.tencent.mm.sdk.platformtools.f9.GlobalWeCom.k(view.getContext(), null)) {
                return;
            }
            j45.l.u(this, ".ui.chatting.ChattingUI", new android.content.Intent().putExtra("Chat_User", c0Var.B.d1()).putExtra("finish_direct", true), null);
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        hr3.u0 u0Var = this.D;
        u0Var.getClass();
        p13.u uVar = new p13.u();
        uVar.f351141c = u0Var.f284037n.d1();
        uVar.f351151m = u0Var;
        uVar.f351152n = u0Var.f284038o;
        uVar.f351140b = 6;
        uVar.f351150l = new hr3.t0(null);
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.C = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(getIntent().getStringExtra("Select_Talker_Name"), true);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }
}
