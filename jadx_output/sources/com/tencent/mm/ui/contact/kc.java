package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class kc extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f207000n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f207001o;

    public kc(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.lang.String str) {
        super(mMBaseSelectContactUI, new java.util.ArrayList(), false, false);
        this.f207000n = str;
        t();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f207001o.getCount();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        if (i17 < 0 || !this.f207001o.moveToPosition(i17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpecialContactAdapter", "create Data Item Error position=%d", java.lang.Integer.valueOf(i17));
            return null;
        }
        com.tencent.mm.ui.contact.item.u uVar = new com.tencent.mm.ui.contact.item.u(i17);
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(this.f207001o);
        uVar.f(z3Var);
        uVar.f206836e = this.f207078f;
        return uVar;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.SpecialContactAdapter", "finish!");
        android.database.Cursor cursor = this.f207001o;
        if (cursor != null) {
            cursor.close();
            this.f207001o = null;
        }
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        t();
        h();
        notifyDataSetChanged();
    }

    public final void t() {
        gm0.j1.i();
        this.f207001o = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().x(this.f207000n, "", this.f206588m);
    }
}
