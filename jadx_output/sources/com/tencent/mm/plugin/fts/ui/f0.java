package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public abstract class f0 extends android.widget.BaseAdapter implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.fts.ui.w0 f138047d;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.SparseArray f138049f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f138050g;

    /* renamed from: h, reason: collision with root package name */
    public long f138051h;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.d0 f138054n;

    /* renamed from: o, reason: collision with root package name */
    public int f138055o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.e0 f138056p;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f138048e = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f138052i = false;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.j3 f138053m = new com.tencent.mm.plugin.fts.ui.j3();

    public f0(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseAdapter", "Create FTSBaseAdapter");
        this.f138047d = w0Var;
        this.f138049f = new android.util.SparseArray();
        ((s50.m0) ((u50.x) i95.n0.c(u50.x.class))).x1();
    }

    public void c() {
        this.f138049f.clear();
    }

    public abstract u13.g d(int i17);

    public abstract void f();

    public void g() {
        p();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f138048e.keySet());
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        Di.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
        sb6.append("select unReadCount, status, isSend, conversationTime, username, content, msgType,flag, digest, digestUser, attrflag, editingMsg, atCount, unReadMuteCount, UnReadInvite, editingQuoteMsgId, hasTodo, hbMarkRed, remitMarkRed, hasSpecialFollow, parentRef from rconversation where username in (");
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            if (i17 > 0) {
                sb6.append(',');
            }
            sb6.append('\'');
            sb6.append((java.lang.String) arrayList.get(i17));
            sb6.append('\'');
        }
        sb6.append(") and ");
        l75.e0 e0Var = pp.a.f357364e2;
        sb6.append("parentRef = 'hidden_conv_parent' ");
        com.tencent.mm.sdk.platformtools.t8.n("hidden_conv_parent");
        java.lang.String a17 = c01.e2.a(false, 1);
        if (a17 == null) {
            a17 = "";
        }
        sb6.append(a17);
        android.database.Cursor B = Di.f195117d.B(sb6.toString(), null);
        if (B != null) {
            while (B.moveToNext()) {
                com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
                l4Var.convertFrom(B);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21170, 1, l4Var.h1(), java.lang.Integer.valueOf(c01.h2.b(l4Var.h1())));
            }
            B.close();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f138053m.f138087d) {
            return this.f138055o;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (getItem(i17) != null) {
            return getItem(i17).f423758a;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSBaseAdapter", "getItemViewType: get data item fail, return unknown Type, count=%d | position = %s", java.lang.Integer.valueOf(getCount()), java.lang.Integer.valueOf(i17));
        return -1;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        u13.g item = getItem(i17);
        if (view == null) {
            view = item.k().c(h(), viewGroup, view);
        }
        u13.e eVar = (u13.e) view.getTag();
        if (!item.f423760c) {
            item.a(h(), eVar, new java.lang.Object[0]);
            m(h(), item);
            item.f423760c = true;
        }
        item.k().b(h(), eVar, item, new java.lang.Object[0]);
        com.tencent.mm.plugin.fts.ui.e0 e0Var = this.f138056p;
        if (e0Var != null) {
            com.tencent.mm.plugin.fts.ui.q0 q0Var = ((com.tencent.mm.plugin.fts.ui.m0) e0Var).f138113a.G1;
            q0Var.getClass();
            com.tencent.mm.plugin.fts.ui.v2 v2Var = new com.tencent.mm.plugin.fts.ui.v2();
            v2Var.f138201a = item instanceof e23.b1 ? 256 : 16386;
            q0Var.a(v2Var, item);
            q0Var.c(v2Var);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 25;
    }

    public android.content.Context h() {
        return this.f138047d.getContext();
    }

    @Override // android.widget.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public u13.g getItem(int i17) {
        android.util.SparseArray sparseArray = this.f138049f;
        if (sparseArray.indexOfKey(i17) >= 0) {
            return (u13.g) sparseArray.get(i17);
        }
        u13.g d17 = (i17 < 0 || i17 >= getCount()) ? null : d(i17);
        if (d17 == null) {
            return (u13.g) sparseArray.get(0);
        }
        sparseArray.put(i17, d17);
        return d17;
    }

    public abstract boolean k(android.view.View view, u13.g gVar, boolean z17);

    public void l(int i17, boolean z17) {
        com.tencent.mm.plugin.fts.ui.j3 j3Var = this.f138053m;
        if (j3Var.f138087d) {
            com.tencent.mm.plugin.fts.ui.d0 d0Var = this.f138054n;
            if (d0Var != null) {
                d0Var.R3(i17, z17);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.fts.ui.d0 d0Var2 = j3Var.f138088e;
        if (d0Var2 != null) {
            ((k23.a1) d0Var2).R3(i17, z17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m(android.content.Context context, u13.g gVar) {
        boolean z17 = gVar instanceof e23.u1;
        java.util.HashMap hashMap = this.f138048e;
        if (z17) {
            hashMap.put(((e23.u1) gVar).f246841s, java.lang.Boolean.TRUE);
            return;
        }
        if (gVar instanceof e23.s1) {
            hashMap.put(((e23.s1) gVar).f246960s, java.lang.Boolean.TRUE);
            return;
        }
        if (gVar instanceof e23.p0) {
            hashMap.put(((e23.p0) gVar).f246927s, java.lang.Boolean.TRUE);
            return;
        }
        if (!(gVar instanceof e23.d0)) {
            if (gVar instanceof zq1.e0) {
                hashMap.put(((sr1.a0) ((zq1.e0) gVar)).f411449s, java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        int i17 = ((e23.d0) gVar).f246814v.field_featureId;
        if (i17 == 23) {
            hashMap.put("qqmail", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 27) {
            hashMap.put("masssendapp", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 28) {
            hashMap.put("newsapp", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 39) {
            hashMap.put("filehelper", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 43) {
            hashMap.put("gh_43f2581f6fd6", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 71) {
            hashMap.put("appbrand_notify_message", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 69) {
            hashMap.put("appbrandcustomerservicemsg", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 50 || i17 == 63 || i17 == 67) {
            hashMap.put("officialaccounts", java.lang.Boolean.TRUE);
            return;
        }
        if (i17 == 74) {
            hashMap.put("opencustomerservicemsg", java.lang.Boolean.TRUE);
        } else if (i17 == 78) {
            hashMap.put("gh_25d9ac85a4bc", java.lang.Boolean.TRUE);
        } else if (i17 == 97) {
            hashMap.put("schedule_message", java.lang.Boolean.TRUE);
        }
    }

    public void n(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseAdapter", "setCount %d", java.lang.Integer.valueOf(i17));
        this.f138055o = i17;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        if (this.f138053m.f138087d) {
            super.notifyDataSetChanged();
        }
    }

    public void o(java.lang.String str, com.tencent.mm.plugin.fts.ui.j3 j3Var) {
        if (j3Var == null) {
            j3Var = com.tencent.mm.plugin.fts.ui.j3.f138083f;
        }
        this.f138053m = j3Var;
        p();
        this.f138050g = str;
        this.f138051h = java.lang.System.currentTimeMillis();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f138052i ? "voice" : "";
        objArr[1] = str;
        objArr[2] = j3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseAdapter", "[fts] adapter.startSearch %s query=%s, config=%s", objArr);
        f();
        this.f138052i = false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.fts.ui.w0 w0Var = this.f138047d;
        w0Var.hideVKB();
        u13.g item = getItem(i17 - w0Var.getListView().getHeaderViewsCount());
        if (item != null) {
            w0Var.x6(view, item, k(view, item, item.k().d(h(), view, item, new java.lang.Object[0])));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBaseAdapter", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }

    public void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSBaseAdapter", "[fts] adapter.stopSearch query=%s", this.f138050g);
        this.f138055o = 0;
        this.f138050g = "";
        c();
        notifyDataSetChanged();
    }
}
