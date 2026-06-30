package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class l3 extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f207006n;

    public l3(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, boolean z17, java.util.List list, java.util.List list2) {
        super(mMBaseSelectContactUI, list2, true, z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.removeAll(list2);
        }
        if (arrayList.isEmpty()) {
            gm0.j1.i();
            this.f207006n = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().D();
        } else {
            gm0.j1.i();
            this.f207006n = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().B(arrayList);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f207006n.getCount();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        if (i17 < 0 || !this.f207006n.moveToPosition(i17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CustomContactAdapter", "create Data Item Error position=%d", java.lang.Integer.valueOf(i17));
            return null;
        }
        com.tencent.mm.ui.contact.item.u uVar = new com.tencent.mm.ui.contact.item.u(i17);
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(this.f207006n);
        uVar.f(z3Var);
        uVar.f206836e = this.f207078f;
        return uVar;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.CustomContactAdapter", "finish!");
        android.database.Cursor cursor = this.f207006n;
        if (cursor != null) {
            cursor.close();
            this.f207006n = null;
        }
    }
}
