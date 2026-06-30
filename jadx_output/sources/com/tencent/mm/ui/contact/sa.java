package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class sa extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f207178n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f207179o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f207180p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f207181q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f207182r;

    /* renamed from: s, reason: collision with root package name */
    public final int f207183s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactsFromRangeUI f207184t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(com.tencent.mm.ui.contact.SelectContactsFromRangeUI selectContactsFromRangeUI, com.tencent.mm.ui.contact.l4 l4Var, int i17) {
        super(l4Var, k35.c.a(), true, false);
        this.f207184t = selectContactsFromRangeUI;
        this.f207179o = new java.util.HashMap();
        this.f207180p = new android.util.SparseArray();
        this.f207181q = "";
        this.f207182r = new java.util.LinkedList();
        this.f207183s = i17;
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f207178n;
        if (cursor == null) {
            return 0;
        }
        int count = cursor.getCount();
        android.util.SparseArray sparseArray = this.f207180p;
        return count + (sparseArray != null ? sparseArray.size() : 0);
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        android.util.SparseArray sparseArray = this.f207180p;
        if (sparseArray.indexOfKey(i17) >= 0) {
            java.lang.String str = (java.lang.String) sparseArray.get(i17);
            com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i17);
            n0Var.f206903y = str;
            return n0Var;
        }
        int i18 = i17;
        int i19 = 0;
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
        if (!this.f207178n.moveToPosition(i27)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactsFromRangeUI", "create contact item error: position=%d | index=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27));
            return null;
        }
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(this.f207178n);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactsFromRangeUI", "finish!");
        android.database.Cursor cursor = this.f207178n;
        if (cursor != null) {
            cursor.close();
            this.f207178n = null;
        }
    }

    @Override // com.tencent.mm.ui.contact.a5
    public int r(java.lang.String str) {
        java.util.HashMap hashMap = this.f207179o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return ((java.lang.Integer) hashMap.get(str)).intValue() + this.f207076d.O3().getHeaderViewsCount();
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        java.lang.String[] strArr;
        android.database.Cursor cursor = this.f207178n;
        if (cursor != null) {
            cursor.close();
            this.f207178n = null;
        }
        java.util.HashMap hashMap = this.f207179o;
        hashMap.clear();
        android.util.SparseArray sparseArray = this.f207180p;
        sparseArray.clear();
        com.tencent.mm.ui.contact.SelectContactsFromRangeUI selectContactsFromRangeUI = this.f207184t;
        if (("@all.contact.android".equals(selectContactsFromRangeUI.F) || "@all.contact.without.chatroom.without.openim".equals(selectContactsFromRangeUI.F)) && ((strArr = selectContactsFromRangeUI.G) == null || strArr.length == 0)) {
            return;
        }
        gm0.j1.i();
        this.f207178n = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(selectContactsFromRangeUI.G, this.f207181q, selectContactsFromRangeUI.F, "", this.f206588m);
        java.lang.String[] strArr2 = selectContactsFromRangeUI.G;
        java.lang.String str = selectContactsFromRangeUI.F;
        java.lang.String str2 = this.f207181q;
        java.util.List list = this.f206588m;
        java.lang.String[] y17 = c01.e2.y(strArr2, str, "", str2, list);
        int[] w17 = c01.e2.w(selectContactsFromRangeUI.G, selectContactsFromRangeUI.F, "", list, this.f207181q);
        if (y17 != null && w17 != null) {
            int i17 = 0;
            for (int i18 = 0; i18 < y17.length; i18++) {
                if (i18 < w17.length) {
                    hashMap.put(y17[i18], java.lang.Integer.valueOf(w17[i18] + i17));
                    sparseArray.put(w17[i18] + i17, y17[i18]);
                    i17++;
                }
            }
        }
        h();
        notifyDataSetChanged();
    }

    public void t(java.lang.String str) {
        java.util.List list = this.f207182r;
        if (((java.util.LinkedList) list).contains(str)) {
            ((java.util.LinkedList) list).remove(str);
        } else {
            int size = ((java.util.LinkedList) list).size();
            int i17 = this.f207183s;
            if (size >= i17) {
                com.tencent.mm.ui.contact.SelectContactsFromRangeUI selectContactsFromRangeUI = this.f207184t;
                db5.e1.t(selectContactsFromRangeUI.getContext(), selectContactsFromRangeUI.getString(com.tencent.mm.R.string.f489879ea, java.lang.Integer.valueOf(i17)), "", new com.tencent.mm.ui.contact.ra(this));
                return;
            }
            ((java.util.LinkedList) list).add(str);
        }
        notifyDataSetChanged();
    }
}
