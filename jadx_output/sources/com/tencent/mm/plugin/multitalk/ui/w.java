package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes11.dex */
public class w extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f150306n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f150307o;

    public w(com.tencent.mm.ui.contact.l4 l4Var, java.lang.String str) {
        super(l4Var, null, true, true);
        this.f150307o = str;
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f150306n.size();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) this.f150306n.get(i17), true);
        sj3.h1 h1Var = new sj3.h1(i17);
        h1Var.f(n17);
        h1Var.f206836e = this.f207078f;
        return h1Var;
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.multitalk.MultiTalkSelectInitAdapter", "resetData");
        java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(this.f150307o);
        this.f150306n = L0;
        if (L0 == null) {
            this.f150306n = new java.util.ArrayList();
        }
    }
}
