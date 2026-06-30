package uf5;

/* loaded from: classes10.dex */
public abstract class w0 extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f427314n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f427315o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f427316p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f427317q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f427318r;

    public w0(com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase, com.tencent.mm.ui.contact.l4 l4Var) {
        super(l4Var, k35.c.a(), true, false);
        new java.util.ArrayList();
        new java.util.ArrayList();
        this.f427315o = new java.util.HashMap();
        this.f427316p = new android.util.SparseArray();
        this.f427317q = "";
        this.f427318r = new java.util.LinkedList();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f427314n;
        int count = cursor == null ? 0 : cursor.getCount();
        android.util.SparseArray sparseArray = this.f427316p;
        return count + (sparseArray != null ? sparseArray.size() : 0) + (!com.tencent.mm.sdk.platformtools.t8.K0("") ? 1 : 0);
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        if ((!com.tencent.mm.sdk.platformtools.t8.K0("")) && i17 == 0) {
            return t(i17, "");
        }
        android.util.SparseArray sparseArray = this.f427316p;
        if (sparseArray.indexOfKey(i17) >= 0) {
            return t(i17, (java.lang.String) sparseArray.get(i17));
        }
        int i18 = !com.tencent.mm.sdk.platformtools.t8.K0("") ? 1 : 0;
        int i19 = i17;
        while (i18 <= sparseArray.size()) {
            if (sparseArray.indexOfKey(i19) >= 0) {
                i18++;
            }
            i19--;
            if (i19 < 0) {
                break;
            }
        }
        int i27 = i17 - i18;
        if (!this.f427314n.moveToPosition(i27)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactMgrUIBase", "create contact item error: position=%d | index=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27));
            return null;
        }
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(this.f427314n);
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
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMgrUIBase", "finish!");
        android.database.Cursor cursor = this.f427314n;
        if (cursor != null) {
            cursor.close();
            this.f427314n = null;
        }
    }

    @Override // com.tencent.mm.ui.contact.a5
    public int r(java.lang.String str) {
        java.util.HashMap hashMap = this.f427315o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return ((java.lang.Integer) hashMap.get(str)).intValue() + this.f207076d.O3().getHeaderViewsCount();
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        android.database.Cursor cursor = this.f427314n;
        if (cursor != null) {
            cursor.close();
            this.f427314n = null;
        }
        java.util.HashMap hashMap = this.f427315o;
        hashMap.clear();
        android.util.SparseArray sparseArray = this.f427316p;
        sparseArray.clear();
        gm0.j1.i();
        this.f427314n = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(null, this.f427317q, v(), "", this.f206588m);
        java.lang.String v17 = v();
        java.lang.String str = this.f427317q;
        java.util.List list = this.f206588m;
        java.lang.String[] y17 = c01.e2.y(null, v17, "", str, list);
        int[] w17 = c01.e2.w(null, v(), "", list, this.f427317q);
        if (y17 != null && w17 != null) {
            int i17 = !com.tencent.mm.sdk.platformtools.t8.K0("") ? 1 : 0;
            for (int i18 = 0; i18 < y17.length; i18++) {
                if (i18 < w17.length) {
                    hashMap.put(y17[i18], java.lang.Integer.valueOf(w17[i18] + i17));
                    sparseArray.put(w17[i18] + i17, y17[i18]);
                    i17++;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMgrUIBase", "datacount:%d headerPosMap=%s, getdat: %s, this.query: %s.", java.lang.Integer.valueOf(this.f427314n.getCount()), hashMap.toString(), v(), this.f427317q);
        h();
        notifyDataSetChanged();
    }

    public com.tencent.mm.ui.contact.item.d t(int i17, java.lang.String str) {
        com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i17);
        n0Var.f206903y = str;
        return n0Var;
    }

    public int u() {
        android.database.Cursor cursor = this.f427314n;
        if (cursor != null) {
            return cursor.getCount();
        }
        return 0;
    }

    public abstract java.lang.String v();
}
