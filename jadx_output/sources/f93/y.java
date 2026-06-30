package f93;

/* loaded from: classes11.dex */
public final class y extends com.tencent.mm.ui.contact.a5 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f260510n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f260511o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.SparseArray f260512p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f260513q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f260514r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactEditLabel f260515s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel, com.tencent.mm.ui.contact.l4 activity) {
        super(activity, null, true, false);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f260515s = contactEditLabel;
        this.f260511o = new java.util.HashMap();
        this.f260512p = new android.util.SparseArray();
        this.f260513q = "";
        this.f260514r = new java.util.LinkedList();
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int count;
        android.database.Cursor cursor = this.f260510n;
        if (cursor == null) {
            count = 0;
        } else {
            kotlin.jvm.internal.o.d(cursor);
            count = cursor.getCount();
        }
        android.util.SparseArray sparseArray = this.f260512p;
        return count + (sparseArray != null ? sparseArray.size() : 0) + 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        com.tencent.mm.ui.contact.item.u uVar;
        com.tencent.mm.ui.contact.item.u uVar2;
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = this.f260515s;
        if (i17 == 0) {
            java.lang.String string = contactEditLabel.getString(com.tencent.mm.R.string.f492721hl4);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i17);
            n0Var.f206903y = string;
            uVar = n0Var;
        } else {
            if (i17 == 1) {
                java.lang.String str = contactEditLabel.f143195h;
                kotlin.jvm.internal.o.d(str);
                f93.b5 b5Var = new f93.b5(i17, str);
                b5Var.G = new f93.x(contactEditLabel);
                uVar2 = b5Var;
            } else if (i17 == 2) {
                java.lang.String str2 = "标签成员 (" + contactEditLabel.f143201q.size() + ')';
                com.tencent.mm.ui.contact.item.n0 n0Var2 = new com.tencent.mm.ui.contact.item.n0(i17);
                n0Var2.f206903y = str2;
                uVar = n0Var2;
            } else if (i17 == 3) {
                f93.s4 s4Var = new f93.s4(i17);
                s4Var.C = new f93.w(contactEditLabel);
                uVar = s4Var;
            } else {
                android.util.SparseArray sparseArray = this.f260512p;
                if (sparseArray.indexOfKey(i17) >= 0) {
                    java.lang.Object obj = sparseArray.get(i17);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    com.tencent.mm.ui.contact.item.n0 n0Var3 = new com.tencent.mm.ui.contact.item.n0(i17);
                    n0Var3.f206903y = (java.lang.String) obj;
                    uVar = n0Var3;
                } else {
                    int i18 = 4;
                    int i19 = i17;
                    do {
                        if (sparseArray.indexOfKey(i19) >= 0) {
                            i18++;
                        }
                        i19--;
                    } while (i19 >= 0);
                    int i27 = i17 - i18;
                    android.database.Cursor cursor = this.f260510n;
                    kotlin.jvm.internal.o.d(cursor);
                    if (cursor.moveToPosition(i27)) {
                        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                        z3Var.convertFrom(this.f260510n);
                        com.tencent.mm.ui.contact.item.u uVar3 = new com.tencent.mm.ui.contact.item.u(i17);
                        uVar3.f(z3Var);
                        if (com.tencent.mm.storage.z3.R4(z3Var.d1())) {
                            uVar3.f206836e = false;
                            uVar3.f206839h = false;
                            uVar3.f206838g = false;
                            uVar3.F = true;
                            uVar2 = uVar3;
                        } else {
                            uVar3.f206836e = this.f207078f;
                            uVar3.f206839h = this.f207079g;
                            uVar3.F = false;
                            uVar2 = uVar3;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i(contactEditLabel.f143191d, "create contact item error: position=%d | index=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27));
                        uVar = null;
                    }
                }
            }
            uVar = uVar2;
        }
        kotlin.jvm.internal.o.d(uVar);
        return uVar;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        android.database.Cursor cursor = this.f260510n;
        if (cursor != null) {
            kotlin.jvm.internal.o.d(cursor);
            cursor.close();
            this.f260510n = null;
        }
    }

    @Override // com.tencent.mm.ui.contact.a5
    public int r(java.lang.String str) {
        java.util.HashMap hashMap = this.f260511o;
        if (!hashMap.containsKey(str)) {
            return -1;
        }
        java.lang.Object obj = hashMap.get(str);
        kotlin.jvm.internal.o.d(obj);
        return ((java.lang.Number) obj).intValue() + this.f207076d.O3().getHeaderViewsCount();
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = this.f260515s;
        com.tencent.mars.xlog.Log.i(contactEditLabel.f143191d, "resetData");
        android.database.Cursor cursor = this.f260510n;
        if (cursor != null) {
            kotlin.jvm.internal.o.d(cursor);
            cursor.close();
            this.f260510n = null;
        }
        java.util.HashMap hashMap = this.f260511o;
        hashMap.clear();
        android.util.SparseArray sparseArray = this.f260512p;
        sparseArray.clear();
        java.lang.String[] strArr = new java.lang.String[0];
        int[] iArr = new int[0];
        this.f260510n = null;
        java.util.ArrayList arrayList = contactEditLabel.f143201q;
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.i(contactEditLabel.f143191d, "mCurrentList is null | mCurrenList size == 0");
        } else {
            this.f260510n = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U((java.lang.String[]) contactEditLabel.f143201q.toArray(new java.lang.String[0]), this.f260513q, "@all.contact.android", "", null);
            strArr = c01.e2.y((java.lang.String[]) contactEditLabel.f143201q.toArray(new java.lang.String[0]), "@all.contact.android", "", this.f260513q, null);
            iArr = c01.e2.w((java.lang.String[]) contactEditLabel.f143201q.toArray(new java.lang.String[0]), "@all.contact.android", "", null, this.f260513q);
        }
        if (strArr != null && iArr != null) {
            int length = strArr.length;
            int i17 = 4;
            for (int i18 = 0; i18 < length; i18++) {
                if (i18 < iArr.length) {
                    hashMap.put(strArr[i18], java.lang.Integer.valueOf(iArr[i18] + i17));
                    sparseArray.put(iArr[i18] + i17, strArr[i18]);
                    i17++;
                }
            }
        }
        h();
        notifyDataSetChanged();
    }
}
