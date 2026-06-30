package uf5;

/* loaded from: classes10.dex */
public class q1 extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f427285n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f427286o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f427287p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f427288q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f427289r;

    /* renamed from: s, reason: collision with root package name */
    public final int f427290s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI f427291t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI, com.tencent.mm.ui.contact.l4 l4Var, int i17) {
        super(l4Var, k35.c.a(), true, false);
        this.f427291t = selectPrivacyContactsFromRangeUI;
        this.f427286o = new java.util.HashMap();
        this.f427287p = new android.util.SparseArray();
        this.f427288q = "";
        this.f427289r = new java.util.LinkedList();
        this.f427290s = i17;
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f427285n;
        if (cursor == null) {
            return 0;
        }
        int count = cursor.getCount();
        android.util.SparseArray sparseArray = this.f427287p;
        return count + (sparseArray != null ? sparseArray.size() : 0);
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        com.tencent.mm.ui.contact.item.u uVar;
        android.util.SparseArray sparseArray = this.f427287p;
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
        if (this.f427285n.moveToPosition(i17 - i19)) {
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            z3Var.convertFrom(this.f427285n);
            com.tencent.mm.ui.contact.item.u uVar2 = new com.tencent.mm.ui.contact.item.u(i17);
            uVar2.f(z3Var);
            if (com.tencent.mm.storage.z3.R4(z3Var.d1())) {
                uVar2.f206836e = false;
                uVar2.f206839h = false;
                uVar2.f206838g = false;
                uVar2.F = true;
            } else {
                uVar2.f206836e = p();
                uVar2.f206839h = this.f207079g;
                uVar2.F = false;
            }
            com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI = this.f427291t;
            if (selectPrivacyContactsFromRangeUI.p5(uVar2)) {
                ((java.util.LinkedList) selectPrivacyContactsFromRangeUI.C.f427289r).remove(z3Var.d1());
            }
            uVar = uVar2;
        } else {
            uVar = null;
        }
        uVar.f206836e = true;
        return uVar;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPrivacyContactsFromRangeUI", "finish!");
        android.database.Cursor cursor = this.f427285n;
        if (cursor != null) {
            cursor.close();
            this.f427285n = null;
        }
    }

    @Override // com.tencent.mm.ui.contact.p4
    public boolean p() {
        return !this.f427291t.M;
    }

    @Override // com.tencent.mm.ui.contact.a5
    public int r(java.lang.String str) {
        java.util.HashMap hashMap = this.f427286o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return ((java.lang.Integer) hashMap.get(str)).intValue() + this.f207076d.O3().getHeaderViewsCount();
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        java.lang.String[] strArr;
        android.database.Cursor cursor = this.f427285n;
        if (cursor != null) {
            cursor.close();
            this.f427285n = null;
        }
        java.util.HashMap hashMap = this.f427286o;
        hashMap.clear();
        android.util.SparseArray sparseArray = this.f427287p;
        sparseArray.clear();
        com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI = this.f427291t;
        if (("@all.contact.android".equals(selectPrivacyContactsFromRangeUI.F) || "@all.contact.without.chatroom.without.openim".equals(selectPrivacyContactsFromRangeUI.F)) && ((strArr = selectPrivacyContactsFromRangeUI.H) == null || strArr.length == 0)) {
            return;
        }
        gm0.j1.i();
        this.f427285n = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(selectPrivacyContactsFromRangeUI.H, this.f427288q, selectPrivacyContactsFromRangeUI.F, "", this.f206588m);
        java.lang.String[] strArr2 = selectPrivacyContactsFromRangeUI.H;
        java.lang.String str = selectPrivacyContactsFromRangeUI.F;
        java.lang.String str2 = this.f427288q;
        java.util.List list = this.f206588m;
        java.lang.String[] y17 = c01.e2.y(strArr2, str, "", str2, list);
        int[] w17 = c01.e2.w(selectPrivacyContactsFromRangeUI.H, selectPrivacyContactsFromRangeUI.F, "", list, this.f427288q);
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
        java.util.List list = this.f427289r;
        if (((java.util.LinkedList) list).contains(str)) {
            ((java.util.LinkedList) list).remove(str);
        } else {
            int size = ((java.util.LinkedList) list).size();
            int i17 = this.f427290s;
            if (size >= i17) {
                com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI = this.f427291t;
                db5.e1.t(selectPrivacyContactsFromRangeUI.getContext(), selectPrivacyContactsFromRangeUI.getString(com.tencent.mm.R.string.f489879ea, java.lang.Integer.valueOf(i17)), "", new uf5.p1(this));
                return;
            }
            ((java.util.LinkedList) list).add(str);
        }
        notifyDataSetChanged();
    }
}
