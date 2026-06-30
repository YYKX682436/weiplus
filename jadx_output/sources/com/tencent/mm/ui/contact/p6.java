package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class p6 extends com.tencent.mm.ui.contact.a5 implements l75.z0 {
    public int A;
    public int B;
    public com.tencent.mm.ui.contact.o6 C;
    public com.tencent.mm.ui.contact.item.e1 D;
    public com.tencent.mm.ui.contact.item.q1 E;
    public com.tencent.mm.ui.contact.item.u0 F;
    public boolean G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f207082J;
    public final android.content.Context K;

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f207083n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f207084o;

    /* renamed from: p, reason: collision with root package name */
    public android.database.Cursor f207085p;

    /* renamed from: q, reason: collision with root package name */
    public int f207086q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f207087r;

    /* renamed from: s, reason: collision with root package name */
    public final int f207088s;

    /* renamed from: t, reason: collision with root package name */
    public final int f207089t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f207090u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f207091v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f207092w;

    /* renamed from: x, reason: collision with root package name */
    public int f207093x;

    /* renamed from: y, reason: collision with root package name */
    public int f207094y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f207095z;

    public p6(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, boolean z18, boolean z19, int i17) {
        super(mMBaseSelectContactUI, list, z17, z18);
        this.f207086q = -1;
        this.f207088s = 0;
        this.f207089t = 1;
        this.f207090u = false;
        this.f207091v = new java.util.HashMap();
        this.f207092w = new java.util.HashMap();
        this.f207093x = 0;
        this.f207094y = 0;
        this.f207095z = "";
        this.A = 0;
        this.B = 0;
        new java.util.ArrayList();
        this.G = false;
        this.H = false;
        this.I = false;
        this.f207082J = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRecentConversationAdapter", "create!");
        this.f207087r = z19;
        this.f207088s = i17;
        this.K = mMBaseSelectContactUI;
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        s();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f207085p != null) {
            return this.B != 0 ? this.A + 1 + 1 : this.A + 1;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NewRecentConversationAdapter", "getCount: dataCursor == null ");
        return 0;
    }

    @Override // com.tencent.mm.ui.contact.p4, android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (this.B == 0 || i17 >= this.f207086q) {
            return super.getItemViewType(i17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRecentConversationAdapter", "getItemViewType:  return HORIZONTAL_RECENT_FORWARD_LIST Type");
        return 9;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        int i18;
        com.tencent.mm.ui.contact.item.u0 u0Var;
        int i19 = this.f207086q;
        int i27 = this.B;
        if (i27 != 0 && i17 == 0) {
            return v(i17);
        }
        if (i17 == i19) {
            return u(i17);
        }
        if (i17 < 0) {
            return null;
        }
        if (this.f207089t == 1) {
            i18 = i27 != 0 ? i17 - 2 : i17 - 1;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewRecentConversationAdapter", "Actually dead branch. position=%d", java.lang.Integer.valueOf(i17));
            i18 = i17;
        }
        if (!this.f207085p.moveToPosition(i18)) {
            com.tencent.mm.ui.contact.item.k0 k0Var = new com.tencent.mm.ui.contact.item.k0(4, i17);
            com.tencent.mars.xlog.Log.e("MicroMsg.NewRecentConversationAdapter", "wrong case: %s, %s", java.lang.Boolean.valueOf(this.f207085p.isClosed()), java.lang.Integer.valueOf(i18));
            return k0Var;
        }
        com.tencent.mm.ui.contact.item.c0 c0Var = new com.tencent.mm.ui.contact.item.c0(i17);
        com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
        l4Var.convertFrom(this.f207085p);
        gm0.j1.i();
        c0Var.f(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(l4Var.h1()));
        if (c0Var.B == null) {
            gm0.j1.i();
            c0Var.f(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(l4Var.h1()));
        }
        c0Var.f206836e = this.f207078f;
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(l4Var.h1())) {
            c0Var.f206844m = true;
            if (i17 == this.f207086q + 1 && (u0Var = this.F) != null) {
                this.G = true;
                u0Var.h(com.tencent.mm.R.drawable.agd);
            }
        }
        if (i17 == this.f207086q - 1) {
            c0Var.f206843l = true;
        }
        java.lang.String str = c0Var.f206850s;
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(str)) {
            this.f207093x++;
        }
        ((java.util.HashMap) this.f207091v).put(str, java.lang.Integer.valueOf(i17 - this.f207086q));
        return c0Var;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRecentConversationAdapter", "finish!");
        t();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this);
    }

    @Override // com.tencent.mm.ui.contact.p4
    public boolean n(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.item.q1 q1Var = this.E;
        if (q1Var != null && i17 != q1Var.f206833b && q1Var != null) {
            q1Var.i(false);
        }
        return false;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void q(boolean z17) {
        super.q(z17);
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        android.database.Cursor cursor;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRecentConversationAdapter", "resetData");
        t();
        new java.util.ArrayList();
        this.B = 0;
        int i17 = this.f207088s;
        java.util.List list = null;
        if (com.tencent.mm.ui.contact.i5.d(i17, 4)) {
            if (!this.I) {
                list = com.tencent.mm.ui.contact.k3.c();
                if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                    com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                    java.util.List list2 = this.f206588m;
                    l75.e0 e0Var = pp.a.f357364e2;
                    this.f207084o = Di.t(list, 3, list2, null, this.f206587i, "");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NewRecentConversationAdapter", "resetData: recent forward control switch on");
            }
            com.tencent.mm.storage.m4 Di2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list3 = this.f206588m;
            l75.e0 e0Var2 = pp.a.f357364e2;
            this.f207083n = Di2.C(3, list3, null, this.f206587i, "");
        } else if (com.tencent.mm.ui.contact.i5.d(i17, 16)) {
            if (!this.I) {
                list = com.tencent.mm.ui.contact.k3.b();
                if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                    com.tencent.mm.storage.m4 Di3 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                    java.util.List list4 = this.f206588m;
                    l75.e0 e0Var3 = pp.a.f357364e2;
                    this.f207084o = Di3.t(list, 5, list4, null, this.f206587i, "");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NewRecentConversationAdapter", "resetData: recent forward control switch on");
            }
            com.tencent.mm.storage.m4 Di4 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list5 = this.f206588m;
            l75.e0 e0Var4 = pp.a.f357364e2;
            this.f207083n = Di4.C(5, list5, null, this.f206587i, "");
        } else {
            if (!this.I) {
                list = com.tencent.mm.ui.contact.k3.d();
                if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                    com.tencent.mm.storage.m4 Di5 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                    java.util.List list6 = this.f206588m;
                    l75.e0 e0Var5 = pp.a.f357364e2;
                    this.f207084o = Di5.t(list, 1, list6, null, this.f206587i, "");
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NewRecentConversationAdapter", "resetData: recent forward control switch on");
            com.tencent.mm.storage.m4 Di6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list7 = this.f206588m;
            l75.e0 e0Var6 = pp.a.f357364e2;
            this.f207083n = Di6.C(1, list7, null, this.f206587i, "");
        }
        int i18 = this.f207087r ? 2 : 0;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(list) && (cursor = this.f207084o) != null) {
            this.B = cursor.getCount();
        }
        int count = this.f207083n.getCount();
        this.A = count;
        if (count <= 0) {
            this.f207086q = this.f207076d.O3().getHeaderViewsCount();
        } else if (this.B == 0) {
            this.f207086q = 0 + i18;
        } else {
            this.f207086q = 0 + i18 + 1;
        }
        this.f207085p = this.f207083n;
        h();
    }

    public void t() {
        android.database.Cursor cursor = this.f207083n;
        if (cursor != null) {
            cursor.close();
            this.f207083n = null;
        }
        android.database.Cursor cursor2 = this.f207084o;
        if (cursor2 != null) {
            cursor2.close();
            this.f207084o = null;
        }
        android.database.Cursor cursor3 = this.f207085p;
        if (cursor3 != null) {
            cursor3.close();
            this.f207085p = null;
        }
    }

    public com.tencent.mm.ui.contact.item.u0 u(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRecentConversationAdapter", "createHeaderViewDataItem: isSupportForwardToWeWork:%s", java.lang.Boolean.valueOf(this.H));
        com.tencent.mm.ui.contact.item.u0 u0Var = new com.tencent.mm.ui.contact.item.u0(i17);
        u0Var.I = this.H;
        u0Var.H = this.f207082J;
        u0Var.C = new com.tencent.mm.ui.contact.k6(this);
        this.F = u0Var;
        return u0Var;
    }

    public com.tencent.mm.ui.contact.item.q1 v(int i17) {
        com.tencent.mm.ui.contact.item.q1 q1Var = new com.tencent.mm.ui.contact.item.q1(i17);
        this.E = q1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = this.f207084o;
        if (cursor != null && cursor.getCount() > 0) {
            int i18 = 1;
            while (this.f207084o.moveToNext()) {
                android.database.Cursor cursor2 = this.f207084o;
                java.lang.String contactUserName = cursor2.getString(cursor2.getColumnIndex(dm.i4.COL_USERNAME));
                gm0.j1.i();
                com.tencent.mm.storage.z3 L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(contactUserName);
                if (L == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewRecentConversationAdapter", "parse: contact == null");
                    gm0.j1.i();
                    L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(contactUserName);
                }
                java.lang.String displayNickName = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(L);
                kotlin.jvm.internal.o.g(contactUserName, "contactUserName");
                kotlin.jvm.internal.o.g(displayNickName, "displayNickName");
                com.tencent.mm.ui.contact.v8 v8Var = new com.tencent.mm.ui.contact.v8(new com.tencent.mm.ui.contact.w8(contactUserName, displayNickName, false, false, false, 28, null));
                arrayList.add(v8Var);
                this.f207092w.put(v8Var.f207220d.f207231a, java.lang.Integer.valueOf(i18));
                i18++;
            }
        }
        q1Var.C = arrayList;
        com.tencent.mm.ui.contact.v8 v8Var2 = new com.tencent.mm.ui.contact.v8(new com.tencent.mm.ui.contact.w8("", "", false, false, false, 28, null));
        v8Var2.f207221e = 1;
        arrayList.add(v8Var2);
        com.tencent.mm.ui.contact.item.q1 q1Var2 = this.E;
        q1Var2.f206836e = this.f207078f;
        com.tencent.mm.ui.contact.m6 m6Var = new com.tencent.mm.ui.contact.m6(this);
        q1Var2.getClass();
        q1Var2.D = m6Var;
        com.tencent.mm.ui.contact.item.q1 q1Var3 = this.E;
        com.tencent.mm.ui.contact.n6 n6Var = new com.tencent.mm.ui.contact.n6(this);
        q1Var3.getClass();
        q1Var3.E = n6Var;
        this.E.getClass();
        this.f207090u = true;
        return this.E;
    }

    public void w(java.util.List list) {
        com.tencent.mm.ui.contact.item.q1 q1Var = this.E;
        if (q1Var != null) {
            java.util.ArrayList<com.tencent.mm.ui.contact.v8> arrayList = q1Var.C;
            if (arrayList != null) {
                for (com.tencent.mm.ui.contact.v8 v8Var : arrayList) {
                    v8Var.f207220d.f207233c = false;
                    if (list != null) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            java.lang.String str = (java.lang.String) it.next();
                            com.tencent.mm.ui.contact.w8 w8Var = v8Var.f207220d;
                            if (kotlin.jvm.internal.o.b(w8Var.f207231a, str)) {
                                w8Var.f207233c = true;
                            }
                        }
                    }
                }
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = q1Var.G;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        }
    }
}
