package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes11.dex */
public class f2 extends com.tencent.mm.ui.contact.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f157701n;

    /* renamed from: o, reason: collision with root package name */
    public int f157702o;

    /* renamed from: p, reason: collision with root package name */
    public int f157703p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f157704q;

    /* renamed from: r, reason: collision with root package name */
    public final int f157705r;

    /* renamed from: s, reason: collision with root package name */
    public int f157706s;

    public f2(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, java.util.List list2, int i17, boolean z17) {
        super(mMBaseSelectContactUI, list2, z17, false);
        this.f157706s = 0;
        this.f157704q = list;
        this.f157705r = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationAdapter", "create!");
        s();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().a(this);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        s();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f157701n.getCount() + this.f157706s;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        int i18;
        int i19 = this.f157703p;
        if (i17 == i19 || i17 == this.f157702o) {
            com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i17);
            int i27 = this.f157702o;
            com.tencent.mm.ui.contact.l4 l4Var = this.f207076d;
            if (i17 != i27) {
                if (i17 != this.f157703p) {
                    return n0Var;
                }
                n0Var.f206903y = l4Var.getActivity().getResources().getString(com.tencent.mm.R.string.kz9);
                return n0Var;
            }
            int i28 = this.f157705r;
            if (i28 == 1) {
                n0Var.f206903y = l4Var.getActivity().getResources().getString(com.tencent.mm.R.string.f489753aq);
                return n0Var;
            }
            if (i28 == 3) {
                n0Var.f206903y = l4Var.getActivity().getResources().getString(com.tencent.mm.R.string.g_9);
                return n0Var;
            }
            n0Var.f206903y = l4Var.getActivity().getResources().getString(com.tencent.mm.R.string.i0w);
            return n0Var;
        }
        int i29 = this.f157706s;
        if (i29 == 2) {
            if (i17 > i19) {
                i18 = i17 - 2;
            }
            i18 = i17 - 1;
        } else {
            if (i29 != 1) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RecentConversationAdapter", "Actually dead branch. position=%d", java.lang.Integer.valueOf(i17));
                i18 = i17;
            }
            i18 = i17 - 1;
        }
        if (!this.f157701n.moveToPosition(i18)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecentConversationAdapter", "wrong case: %s, %s", java.lang.Boolean.valueOf(this.f157701n.isClosed()), java.lang.Integer.valueOf(i18));
            return new com.tencent.mm.plugin.remittance.ui.e2(this, 4, i17);
        }
        ((qd0.e) ((rd0.x0) i95.n0.c(rd0.x0.class))).getClass();
        com.tencent.mm.ui.contact.item.c0 c0Var = new com.tencent.mm.ui.contact.item.c0(i17);
        com.tencent.mm.storage.l4 l4Var2 = new com.tencent.mm.storage.l4();
        l4Var2.convertFrom(this.f157701n);
        gm0.j1.i();
        c0Var.f(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(l4Var2.h1()));
        if (c0Var.B != null) {
            return c0Var;
        }
        gm0.j1.i();
        c0Var.f(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(l4Var2.h1()));
        return c0Var;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationAdapter", "finish!");
        android.database.Cursor cursor = this.f157701n;
        if (cursor != null) {
            cursor.close();
            this.f157701n = null;
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this);
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        int i17;
        java.util.List list;
        android.database.Cursor C;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationAdapter", "resetData");
        android.database.Cursor cursor = this.f157701n;
        if (cursor != null) {
            cursor.close();
            this.f157701n = null;
        }
        this.f157706s = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f157702o = -1;
        this.f157703p = -1;
        com.tencent.mm.ui.contact.l4 l4Var = this.f207076d;
        java.util.List list2 = this.f157704q;
        if (list2 == null || list2.size() <= 0) {
            i17 = 0;
        } else {
            gm0.j1.i();
            android.database.Cursor C2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().C(list2);
            arrayList.add(C2);
            i17 = C2.getCount();
            if (i17 > 0) {
                this.f157702o = l4Var.O3().getHeaderViewsCount();
                this.f157706s++;
            } else {
                this.f157702o = -1;
            }
        }
        java.util.List list3 = this.f206588m;
        if (list3 != null) {
            list3.addAll(list2);
            list = list3;
        } else {
            list = list2;
        }
        int i18 = this.f157705r;
        if (i18 == 1 || i18 == 3) {
            com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            l75.e0 e0Var = pp.a.f357364e2;
            C = Di.C(1, list, null, this.f206587i, "");
        } else {
            com.tencent.mm.storage.m4 Di2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            l75.e0 e0Var2 = pp.a.f357364e2;
            C = Di2.C(3, list, null, this.f206587i, "");
        }
        if (C.getCount() > 0) {
            this.f157706s++;
            if (i17 > 0) {
                this.f157703p = this.f157702o + i17 + 1;
            } else {
                this.f157703p = l4Var.O3().getHeaderViewsCount();
            }
        } else {
            this.f157703p = -1;
        }
        arrayList.add(C);
        this.f157701n = new android.database.MergeCursor((android.database.Cursor[]) arrayList.toArray(new android.database.Cursor[0]));
    }
}
