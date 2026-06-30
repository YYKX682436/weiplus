package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes11.dex */
public class x extends com.tencent.mm.ui.contact.f5 {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String[] f150395n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f150396o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f150397p;

    public x(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.lang.String str) {
        super(mMBaseSelectContactUI, null, true, 0);
        java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(str);
        if (L0 != null) {
            this.f150395n = com.tencent.mm.sdk.platformtools.t8.d1(L0);
        }
    }

    @Override // com.tencent.mm.ui.contact.f5, android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f150396o;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // com.tencent.mm.ui.contact.f5, com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        if (!this.f150396o.moveToPosition(i17)) {
            return null;
        }
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(this.f150396o);
        sj3.h1 h1Var = new sj3.h1(i17);
        h1Var.f(z3Var);
        h1Var.f206836e = this.f207078f;
        h1Var.f206848q = this.f150397p;
        return h1Var;
    }

    @Override // com.tencent.mm.ui.contact.f5, com.tencent.mm.ui.contact.p4
    public void k() {
        super.k();
        android.database.Cursor cursor = this.f150396o;
        if (cursor != null) {
            cursor.close();
            this.f150396o = null;
        }
    }

    @Override // com.tencent.mm.ui.contact.f5, com.tencent.mm.ui.contact.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.multitalk.MultiTalkSelectSearchAdapter", "doSearch: %s", str);
        h();
        this.f150397p = str;
        android.database.Cursor cursor = this.f150396o;
        if (cursor != null) {
            cursor.close();
            this.f150396o = null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f150397p) && this.f150395n != null) {
            this.f150396o = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().V(this.f150395n, "@all.chatroom", this.f150397p, new java.util.LinkedList(), null);
        }
        notifyDataSetChanged();
        f(str, true);
    }
}
