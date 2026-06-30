package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class h0 extends com.tencent.mm.ui.contact.a5 implements l75.z0 {
    public int A;
    public final boolean B;
    public final boolean C;
    public final java.util.List D;
    public final java.util.List E;
    public final com.tencent.mm.ui.contact.k1 F;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.i0 f206737n;

    /* renamed from: o, reason: collision with root package name */
    public int f206738o;

    /* renamed from: p, reason: collision with root package name */
    public int f206739p;

    /* renamed from: q, reason: collision with root package name */
    public int f206740q;

    /* renamed from: r, reason: collision with root package name */
    public int f206741r;

    /* renamed from: s, reason: collision with root package name */
    public int f206742s;

    /* renamed from: t, reason: collision with root package name */
    public int f206743t;

    /* renamed from: u, reason: collision with root package name */
    public int f206744u;

    /* renamed from: v, reason: collision with root package name */
    public int f206745v;

    /* renamed from: w, reason: collision with root package name */
    public int f206746w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.HashMap f206747x;

    /* renamed from: y, reason: collision with root package name */
    public android.util.SparseArray f206748y;

    /* renamed from: z, reason: collision with root package name */
    public android.database.Cursor f206749z;

    public h0(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, boolean z17, boolean z18, com.tencent.mm.ui.contact.i0 i0Var, boolean z19, boolean z27, boolean z28) {
        super(mMBaseSelectContactUI, list4, z17, z18, z19);
        this.f206738o = Integer.MAX_VALUE;
        this.f206739p = Integer.MAX_VALUE;
        this.f206740q = Integer.MAX_VALUE;
        this.f206741r = Integer.MAX_VALUE;
        this.f206742s = Integer.MAX_VALUE;
        this.f206743t = Integer.MAX_VALUE;
        this.f206744u = Integer.MAX_VALUE;
        this.f206745v = Integer.MAX_VALUE;
        this.f206746w = Integer.MAX_VALUE;
        this.f206747x = null;
        this.f206748y = null;
        this.A = 0;
        this.B = false;
        this.C = false;
        this.F = new com.tencent.mm.ui.contact.k1();
        this.B = z27;
        this.C = z28;
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "create!");
        if (i0Var != null) {
            this.f206737n = i0Var;
        } else {
            this.f206737n = new com.tencent.mm.ui.contact.i0();
        }
        this.E = list;
        this.D = list2;
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "onNotifyChange evnet = " + i17);
        if (a1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "onNotifyChange stg = " + a1Var.toString());
        }
        if (obj != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "onNotifyChange obj = " + obj.toString());
        }
        if (obj != null) {
            gm0.j1.i();
            com.tencent.mm.storage.z3 L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(obj.toString());
            if (L == null || !L.r2()) {
                return;
            }
            s();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int count = this.f206749z.getCount();
        android.util.SparseArray sparseArray = this.f206748y;
        return count + (sparseArray == null ? 0 : sparseArray.size());
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        int i18 = this.f206746w;
        com.tencent.mm.ui.contact.l4 l4Var = this.f207076d;
        if (i17 == i18) {
            return t(i17, l4Var.getActivity().getString(com.tencent.mm.R.string.f492959ig1));
        }
        int i19 = this.f206738o;
        com.tencent.mm.ui.contact.i0 i0Var = this.f206737n;
        if (i17 == i19) {
            return t(i17, i0Var.f206773m);
        }
        if (i17 == this.f206739p) {
            return t(i17, l4Var.getActivity().getString(com.tencent.mm.R.string.ifm));
        }
        if (i17 == this.f206740q) {
            return t(i17, l4Var.getActivity().getString(com.tencent.mm.R.string.ifw));
        }
        if (i17 == this.f206741r) {
            return t(i17, l4Var.getActivity().getString(com.tencent.mm.R.string.ifx));
        }
        if (i17 == this.f206742s) {
            return t(i17, l4Var.getActivity().getString(com.tencent.mm.R.string.iff));
        }
        if (i17 == this.f206743t) {
            return t(i17, l4Var.getActivity().getString(com.tencent.mm.R.string.f489865dw));
        }
        if (i17 == this.f206744u) {
            return t(i17, l4Var.getActivity().getString(com.tencent.mm.R.string.ift));
        }
        if (i17 == this.f206745v) {
            return new com.tencent.mm.ui.contact.item.d1(i17);
        }
        if (this.f206748y.indexOfKey(i17) >= 0) {
            return t(i17, (java.lang.String) this.f206748y.get(i17));
        }
        int i27 = i17;
        int i28 = 0;
        while (i28 <= this.f206748y.size()) {
            if (this.f206748y.indexOfKey(i27) >= 0) {
                i28++;
            }
            i27--;
            if (i27 < 0) {
                break;
            }
        }
        int i29 = i17 - i28;
        if (!this.f206749z.moveToPosition(i29)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "create contact item error: position=%d | index=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i29));
            return null;
        }
        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
        z3Var.convertFrom(this.f206749z);
        com.tencent.mm.ui.contact.item.u uVar = new com.tencent.mm.ui.contact.item.u(i17);
        uVar.f(z3Var);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(i0Var.f206774n)) {
            uVar.f206849r = i0Var.f206774n;
        }
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
        uVar.f206834c = this.B;
        uVar.G = this.C;
        return uVar;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.AlphabetContactAdapter", "finish!");
        android.database.Cursor cursor = this.f206749z;
        if (cursor != null) {
            cursor.close();
            this.f206749z = null;
        }
        gm0.j1.i();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
    }

    @Override // com.tencent.mm.ui.contact.p4
    public int m() {
        return this.A;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public boolean o(com.tencent.mm.ui.contact.item.d dVar) {
        int i17 = dVar.f206833b + 1;
        int[] iArr = {this.f206746w, this.f206738o, this.f206739p, this.f206740q, this.f206741r, this.f206742s, this.f206743t, this.f206744u};
        for (int i18 = 0; i18 < 8; i18++) {
            if (i17 == iArr[i18]) {
                return true;
            }
        }
        return this.f206748y.indexOfKey(i17) >= 0;
    }

    @Override // com.tencent.mm.ui.contact.a5
    public int r(java.lang.String str) {
        if (str.equals("↑")) {
            return 0;
        }
        java.util.HashMap hashMap = this.f206747x;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1;
        }
        return ((java.lang.Integer) this.f206747x.get(str)).intValue() + this.f207076d.O3().getHeaderViewsCount();
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x022b, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x043d  */
    @Override // com.tencent.mm.ui.contact.a5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s() {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.h0.s():void");
    }

    public final com.tencent.mm.ui.contact.item.d t(int i17, java.lang.String str) {
        com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i17);
        n0Var.f206903y = str;
        n0Var.f206834c = this.B;
        return n0Var;
    }

    public final void u(int i17, java.lang.String str) {
        this.f206747x.put(str, java.lang.Integer.valueOf(i17));
        this.f206748y.put(i17, str);
    }

    public h0(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, boolean z18, com.tencent.mm.ui.contact.i0 i0Var) {
        this(mMBaseSelectContactUI, null, null, null, list, z17, z18, i0Var, false, false, false);
    }
}
