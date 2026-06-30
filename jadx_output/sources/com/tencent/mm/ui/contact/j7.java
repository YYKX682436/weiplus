package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class j7 extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f206962n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f206963o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f206964p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f206965q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f206966r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OnlyChatContactMgrUI f206967s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI, com.tencent.mm.ui.contact.l4 l4Var) {
        super(l4Var, k35.c.a(), true, false);
        this.f206967s = onlyChatContactMgrUI;
        this.f206963o = new java.util.HashMap();
        this.f206964p = new android.util.SparseArray();
        this.f206965q = "";
        this.f206966r = new java.util.LinkedList();
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int count = this.f206962n.getCount();
        android.util.SparseArray sparseArray = this.f206964p;
        return count + (sparseArray == null ? 0 : sparseArray.size()) + 1;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        if (i17 == 0) {
            java.lang.String string = this.f206967s.getString(com.tencent.mm.R.string.f489883ee);
            com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i17);
            n0Var.f206903y = string;
            return n0Var;
        }
        android.util.SparseArray sparseArray = this.f206964p;
        if (sparseArray.indexOfKey(i17) >= 0) {
            java.lang.String str = (java.lang.String) sparseArray.get(i17);
            com.tencent.mm.ui.contact.item.n0 n0Var2 = new com.tencent.mm.ui.contact.item.n0(i17);
            n0Var2.f206903y = str;
            return n0Var2;
        }
        int i18 = i17;
        int i19 = 1;
        while (i19 <= sparseArray.size()) {
            if (sparseArray.indexOfKey(i18) >= 0) {
                i19++;
            }
            i18--;
            if (i18 < 0) {
                break;
            }
        }
        int i27 = i17 - i19;
        if (!this.f206962n.moveToPosition(i27)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OnlyChatContactMgrUI", "create contact item error: position=%d | index=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27));
            return null;
        }
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(this.f206962n);
        com.tencent.mm.ui.contact.item.u uVar = new com.tencent.mm.ui.contact.item.u(i17);
        uVar.f(z3Var);
        if (com.tencent.mm.storage.z3.R4(z3Var.d1())) {
            uVar.f206836e = false;
            uVar.f206839h = false;
            uVar.f206838g = false;
            uVar.F = true;
        } else {
            uVar.f206836e = this.f207078f;
            uVar.f206839h = this.f207079g;
            uVar.F = false;
        }
        return uVar;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlyChatContactMgrUI", "finish!");
        android.database.Cursor cursor = this.f206962n;
        if (cursor != null) {
            cursor.close();
            this.f206962n = null;
        }
    }

    @Override // com.tencent.mm.ui.contact.a5
    public int r(java.lang.String str) {
        java.util.HashMap hashMap = this.f206963o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return ((java.lang.Integer) hashMap.get(str)).intValue() + this.f207076d.O3().getHeaderViewsCount();
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        android.database.Cursor cursor = this.f206962n;
        if (cursor != null) {
            cursor.close();
            this.f206962n = null;
        }
        java.util.HashMap hashMap = this.f206963o;
        hashMap.clear();
        android.util.SparseArray sparseArray = this.f206964p;
        sparseArray.clear();
        gm0.j1.i();
        this.f206962n = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(null, this.f206965q, "@social.black.android", "", this.f206588m);
        java.lang.String str = this.f206965q;
        java.util.List list = this.f206588m;
        java.lang.String[] y17 = c01.e2.y(null, "@social.black.android", "", str, list);
        int[] w17 = c01.e2.w(null, "@social.black.android", "", list, this.f206965q);
        if (y17 != null && w17 != null) {
            int i17 = 1;
            for (int i18 = 0; i18 < y17.length; i18++) {
                if (i18 < w17.length) {
                    hashMap.put(y17[i18], java.lang.Integer.valueOf(w17[i18] + i17));
                    sparseArray.put(w17[i18] + i17, y17[i18]);
                    i17++;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OnlyChatContactMgrUI", "datacount:%d headerPosMap=%s", java.lang.Integer.valueOf(this.f206962n.getCount()), hashMap.toString());
        h();
        notifyDataSetChanged();
    }

    public int t() {
        android.database.Cursor cursor = this.f206962n;
        if (cursor != null) {
            return cursor.getCount();
        }
        return 0;
    }
}
