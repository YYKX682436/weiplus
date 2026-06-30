package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class j3 extends com.tencent.mm.ui.z9 implements kv.e0 {

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.ipcall.ui.c0 f142878o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f142879p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f142880q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashSet f142881r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f142882s;

    public j3(android.content.Context context) {
        super(context, null);
        this.f142879p = new java.util.HashMap();
        this.f142881r = new java.util.HashSet();
        this.f142882s = new com.tencent.mm.plugin.ipcall.ui.g3(this);
        r(true);
        this.f142878o = new com.tencent.mm.plugin.ipcall.ui.c0(context);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().d(this);
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        if (this.f142881r.contains(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ipcall.ui.h3(this));
        }
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s83.c cVar = (s83.c) obj;
        if (cVar == null) {
            cVar = new s83.c();
        }
        cVar.convertFrom(cursor);
        return cVar;
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public int getCount() {
        if (this.f142880q == null) {
            t();
        }
        java.util.ArrayList arrayList = this.f142880q;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return super.getItemViewType(i17);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        s83.c cVar;
        if (view == null) {
            view = android.view.LayoutInflater.from(this.f212608e).inflate(com.tencent.mm.R.layout.blx, viewGroup, false);
            com.tencent.mm.plugin.ipcall.ui.i3 i3Var = new com.tencent.mm.plugin.ipcall.ui.i3(this, null);
            i3Var.f142869k = view.findViewById(com.tencent.mm.R.id.hhq);
            i3Var.f142870l = view.findViewById(com.tencent.mm.R.id.d1f);
            i3Var.f142859a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a_4);
            i3Var.f142860b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kbq);
            i3Var.f142861c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kuz);
            i3Var.f142862d = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.llw);
            i3Var.f142863e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.lm6);
            i3Var.f142864f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.lm8);
            i3Var.f142865g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482752n1);
            i3Var.f142866h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482744mr);
            i3Var.f142867i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f482745ms);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hhw);
            i3Var.f142868j = findViewById;
            findViewById.setClickable(true);
            i3Var.f142871m = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.d0v);
            view.setTag(i3Var);
        }
        com.tencent.mm.plugin.ipcall.ui.i3 i3Var2 = (com.tencent.mm.plugin.ipcall.ui.i3) view.getTag();
        i3Var2.f142868j.setClickable(true);
        i3Var2.f142868j.setTag(java.lang.Integer.valueOf(i17));
        i3Var2.f142871m.setVisibility(8);
        if (p(i17)) {
            i3Var2.f142860b.setVisibility(8);
            i3Var2.f142861c.setVisibility(8);
            i3Var2.f142862d.setVisibility(8);
            i3Var2.f142859a.setVisibility(8);
            i3Var2.f142859a.setTag(null);
            i3Var2.f142866h.setVisibility(8);
            i3Var2.f142865g.setVisibility(8);
            i3Var2.f142867i.setVisibility(8);
        } else {
            s83.l lVar = (s83.l) this.f142880q.get(i17);
            if (lVar != null) {
                if (i17 == 0) {
                    i3Var2.f142866h.setVisibility(0);
                    i3Var2.f142865g.setVisibility(8);
                    i3Var2.f142866h.setText(this.f212608e.getString(com.tencent.mm.R.string.g4a));
                } else {
                    i3Var2.f142866h.setVisibility(8);
                    i3Var2.f142865g.setVisibility(8);
                }
                i3Var2.f142871m.setVisibility(0);
                i3Var2.f142860b.setVisibility(0);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) i3Var2.f142869k.getLayoutParams();
                layoutParams.height = (int) i3Var2.f142861c.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480004le);
                i3Var2.f142869k.setLayoutParams(layoutParams);
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) i3Var2.f142859a.getLayoutParams();
                layoutParams2.height = (int) i3Var2.f142859a.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480002af3);
                layoutParams2.width = (int) i3Var2.f142859a.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480002af3);
                i3Var2.f142859a.setLayoutParams(layoutParams2);
                long j17 = lVar.field_addressId;
                if (j17 > 0) {
                    java.util.HashMap hashMap = this.f142879p;
                    cVar = hashMap.containsKey(java.lang.Long.valueOf(j17)) ? (s83.c) hashMap.get(java.lang.Long.valueOf(lVar.field_addressId)) : com.tencent.mm.plugin.ipcall.model.r.wi().J0(lVar.field_addressId);
                    if (cVar != null) {
                        hashMap.put(java.lang.Long.valueOf(lVar.field_addressId), cVar);
                        i3Var2.f142860b.setText(cVar.field_systemAddressBookUsername);
                    }
                } else {
                    i3Var2.f142860b.setText(t83.c.c(lVar.field_phonenumber));
                    cVar = null;
                }
                i3Var2.f142861c.setVisibility(8);
                i3Var2.f142862d.setVisibility(0);
                i3Var2.f142864f.setText(t83.f.b(lVar.field_calltime));
                long j18 = lVar.field_duration;
                if (j18 > 0) {
                    i3Var2.f142863e.setText(t83.f.a(j18));
                } else {
                    i3Var2.f142863e.setText(t83.f.h(lVar.field_status));
                }
                android.widget.ImageView imageView = i3Var2.f142859a;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    imageView.setTag(null);
                    imageView.setImageResource(com.tencent.mm.R.drawable.c7l);
                    if (cVar != null) {
                        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(cVar.field_contactId);
                        com.tencent.mm.plugin.ipcall.ui.c0 c0Var = this.f142878o;
                        if (!K0 && !com.tencent.mm.sdk.platformtools.t8.K0(cVar.field_wechatUsername)) {
                            c0Var.d(cVar.field_contactId, cVar.field_wechatUsername, imageView);
                        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.field_contactId)) {
                            c0Var.c(cVar.field_contactId, imageView);
                        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.field_wechatUsername)) {
                            c0Var.f(cVar.field_wechatUsername, imageView);
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(cVar.field_wechatUsername)) {
                            this.f142881r.add(cVar.field_wechatUsername);
                        }
                    }
                }
            }
            android.view.View view2 = i3Var2.f142868j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter", "handleRencetContactView", "(ILcom/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter", "handleRencetContactView", "(ILcom/tencent/mm/plugin/ipcall/ui/IPCallRecentRecordAdapter$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i3Var2.f142867i.setVisibility(0);
            i3Var2.f142868j.setOnClickListener(this.f142882s);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        t();
        this.f142879p.clear();
        super.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        t();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        t();
    }

    public final void t() {
        java.lang.System.currentTimeMillis();
        s83.m Vi = com.tencent.mm.plugin.ipcall.model.r.Vi();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.add(6, -30);
        long timeInMillis = calendar.getTimeInMillis();
        l75.k0 k0Var = Vi.f404888d;
        java.lang.String[] strArr = s83.m.f404887f;
        android.database.Cursor E = k0Var.E("IPCallRecord", strArr, "calltime>=?", new java.lang.String[]{timeInMillis + ""}, "addressId, phonenumber", null, "calltime desc");
        if (E.getCount() < 30) {
            E.close();
            E = com.tencent.mm.plugin.ipcall.model.r.Vi().f404888d.E("IPCallRecord", strArr, null, null, "addressId, phonenumber", null, "calltime desc");
        }
        java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            try {
                if (E.moveToFirst()) {
                    while (!E.isAfterLast() && arrayList.size() <= 30) {
                        s83.l lVar = new s83.l();
                        lVar.convertFrom(E);
                        if (lVar.field_addressId != -1) {
                            if (!hashMap.containsKey(lVar.field_addressId + "")) {
                                hashMap.put(lVar.field_addressId + "", lVar);
                                arrayList.add(lVar);
                            }
                        } else {
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            java.lang.String e17 = t83.c.e(context, lVar.field_phonenumber);
                            s83.c L0 = com.tencent.mm.plugin.ipcall.model.r.wi().L0(!com.tencent.mm.sdk.platformtools.t8.K0(e17) ? o25.b.c(e17, context) : null);
                            if (L0 != null) {
                                l75.k0 k0Var2 = com.tencent.mm.plugin.ipcall.model.r.Vi().f404888d;
                                long b17 = k0Var2 != null ? k0Var2.b() : -1L;
                                android.database.Cursor E2 = com.tencent.mm.plugin.ipcall.model.r.Vi().f404888d.E("IPCallRecord", s83.m.f404887f, "phonenumber=?", new java.lang.String[]{lVar.field_phonenumber}, null, null, "calltime desc");
                                if (E2.moveToFirst()) {
                                    while (!E2.isAfterLast()) {
                                        s83.l lVar2 = new s83.l();
                                        lVar2.convertFrom(E2);
                                        lVar2.field_addressId = L0.systemRowid;
                                        com.tencent.mm.plugin.ipcall.model.r.Vi().z0(lVar2);
                                        E2.moveToNext();
                                    }
                                }
                                l75.k0 k0Var3 = com.tencent.mm.plugin.ipcall.model.r.Vi().f404888d;
                                if (k0Var3 != null && b17 != -1) {
                                    k0Var3.w(java.lang.Long.valueOf(b17));
                                }
                                if (!hashMap.containsKey(lVar.field_addressId + "")) {
                                    hashMap.put(lVar.field_addressId + "", lVar);
                                    arrayList.add(lVar);
                                }
                            } else if (!hashMap.containsKey(lVar.field_phonenumber)) {
                                hashMap.put(lVar.field_phonenumber, lVar);
                                arrayList.add(lVar);
                            }
                        }
                        E.moveToNext();
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallRecordStorageLogic", "getRecentRecordGroupByUser error: %s", e18.getMessage());
            }
            E.close();
            java.lang.System.currentTimeMillis();
            this.f142880q = arrayList;
        } catch (java.lang.Throwable th6) {
            E.close();
            throw th6;
        }
    }
}
