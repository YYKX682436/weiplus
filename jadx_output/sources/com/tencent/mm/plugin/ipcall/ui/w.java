package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class w extends com.tencent.mm.ui.z9 implements kv.e0 {

    /* renamed from: x, reason: collision with root package name */
    public static java.util.HashMap f143045x;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.ipcall.ui.c0 f143046o;

    /* renamed from: p, reason: collision with root package name */
    public final android.content.Context f143047p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f143048q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f143049r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f143050s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f143051t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f143052u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f143053v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f143054w;

    public w(android.content.Context context) {
        super(context, null);
        this.f143048q = new java.util.HashMap();
        this.f143049r = new java.util.HashMap();
        this.f143050s = new java.util.HashSet();
        this.f143052u = false;
        this.f143053v = false;
        this.f143054w = new com.tencent.mm.plugin.ipcall.ui.s(this);
        r(true);
        this.f143047p = context;
        this.f143046o = new com.tencent.mm.plugin.ipcall.ui.c0(context);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().d(this);
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        if (this.f143050s.contains(str)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ipcall.ui.t(this));
        }
    }

    @Override // com.tencent.mm.ui.z9
    public void c() {
        super.c();
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
        return super.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return super.getItemViewType(i17);
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        if (view == null) {
            android.view.View inflate = android.view.LayoutInflater.from(this.f212608e).inflate(com.tencent.mm.R.layout.blx, viewGroup, false);
            com.tencent.mm.plugin.ipcall.ui.v vVar = new com.tencent.mm.plugin.ipcall.ui.v(this, null);
            vVar.f143035i = inflate.findViewById(com.tencent.mm.R.id.hhq);
            vVar.f143036j = inflate.findViewById(com.tencent.mm.R.id.d1f);
            vVar.f143027a = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
            vVar.f143028b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbq);
            vVar.f143029c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kuz);
            vVar.f143030d = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.llw);
            vVar.f143031e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482752n1);
            vVar.f143032f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482744mr);
            vVar.f143033g = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f482745ms);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.hhw);
            vVar.f143034h = findViewById;
            findViewById.setClickable(true);
            vVar.f143037k = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.d0v);
            inflate.setTag(vVar);
            view2 = inflate;
        } else {
            view2 = view;
        }
        com.tencent.mm.plugin.ipcall.ui.v vVar2 = (com.tencent.mm.plugin.ipcall.ui.v) view2.getTag();
        vVar2.f143034h.setClickable(true);
        vVar2.f143034h.setTag(java.lang.Integer.valueOf(i17));
        vVar2.f143037k.setVisibility(8);
        if (p(i17)) {
            vVar2.f143028b.setVisibility(8);
            vVar2.f143029c.setVisibility(8);
            vVar2.f143030d.setVisibility(8);
            vVar2.f143027a.setVisibility(8);
            vVar2.f143027a.setTag(null);
            vVar2.f143032f.setVisibility(8);
            vVar2.f143031e.setVisibility(8);
            vVar2.f143033g.setVisibility(8);
        } else {
            s83.c item = getItem(i17);
            if (item != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(item.field_systemAddressBookUsername)) {
                    vVar2.f143028b.setVisibility(8);
                    vVar2.f143029c.setVisibility(8);
                } else {
                    vVar2.f143028b.setVisibility(0);
                    if (this.f143052u) {
                        vVar2.f143029c.setVisibility(0);
                        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) vVar2.f143035i.getLayoutParams();
                        layoutParams.height = (int) vVar2.f143029c.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480005af5);
                        vVar2.f143035i.setLayoutParams(layoutParams);
                        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) vVar2.f143027a.getLayoutParams();
                        layoutParams2.height = (int) vVar2.f143027a.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480001ld);
                        layoutParams2.width = (int) vVar2.f143027a.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480001ld);
                        vVar2.f143027a.setLayoutParams(layoutParams2);
                    } else {
                        vVar2.f143029c.setVisibility(8);
                        android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) vVar2.f143035i.getLayoutParams();
                        layoutParams3.height = (int) vVar2.f143029c.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480004le);
                        vVar2.f143035i.setLayoutParams(layoutParams3);
                        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) vVar2.f143027a.getLayoutParams();
                        layoutParams4.height = (int) vVar2.f143027a.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480002af3);
                        layoutParams4.width = (int) vVar2.f143027a.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f480002af3);
                        vVar2.f143027a.setLayoutParams(layoutParams4);
                    }
                    if (this.f143052u && item.f404869t == null && (hashMap2 = f143045x) != null && hashMap2.containsKey(item.field_contactId)) {
                        item.f404869t = ((s83.c) f143045x.get(item.field_contactId)).f404869t;
                    } else if (this.f143052u && item.f404869t == null && ((hashMap = f143045x) == null || hashMap.containsKey(item.field_contactId))) {
                        java.lang.String str = item.field_contactId;
                        java.lang.String str2 = s83.b.f404866a;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        ((sb0.f) jVar).getClass();
                        if (j35.u.d(context, "android.permission.READ_CONTACTS", true)) {
                            android.database.Cursor query = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new java.lang.String[]{str}, null);
                            if (query != null) {
                                try {
                                    try {
                                        if (query.moveToFirst()) {
                                            while (!query.isAfterLast()) {
                                                arrayList.add(query.getString(query.getColumnIndex("data1")));
                                                query.moveToNext();
                                            }
                                        }
                                    } catch (java.lang.Exception e17) {
                                        com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressBookInfoExtracter", "extractAddressItemFromCursor, error: %s, class: %s", e17.getMessage(), e17.getClass().getSimpleName());
                                    }
                                } finally {
                                    query.close();
                                }
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressBookInfoExtracter", "no contact permission");
                        }
                        item.f404869t = arrayList;
                    }
                    boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f143051t);
                    android.content.Context context2 = this.f143047p;
                    if (!K0 && (com.tencent.mm.sdk.platformtools.t8.O0(this.f143051t.charAt(0)) || this.f143051t.startsWith("+"))) {
                        vVar2.f143029c.setText(o13.q.c(context2, w(item, this.f143051t), com.tencent.mm.sdk.platformtools.c5.e(this.f143051t)));
                        vVar2.f143028b.setText(o13.q.c(context2, item.field_systemAddressBookUsername, this.f143051t));
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f143051t) && !com.tencent.mm.sdk.platformtools.t8.O0(this.f143051t.charAt(0))) {
                        java.lang.String str3 = item.field_systemAddressBookUsername;
                        java.lang.String str4 = this.f143051t;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str4) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                            str4 = "";
                        } else if (!com.tencent.mm.sdk.platformtools.t8.A0(str4) && com.tencent.mm.sdk.platformtools.t8.x0(str4)) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            int i18 = 0;
                            while (i18 < str3.length()) {
                                int i19 = i18 + 1;
                                java.lang.String substring = str3.substring(i18, i19);
                                arrayList2.add(new com.tencent.mm.plugin.ipcall.ui.u(this, x51.k.a(substring), substring));
                                i18 = i19;
                            }
                            for (int i27 = 2; i27 <= str3.length(); i27++) {
                                for (int i28 = 0; i28 <= str3.length() - i27; i28++) {
                                    java.lang.String substring2 = str3.substring(i28, i28 + i27);
                                    arrayList2.add(new com.tencent.mm.plugin.ipcall.ui.u(this, x51.k.a(substring2), substring2));
                                }
                            }
                            int i29 = 0;
                            while (true) {
                                if (i29 >= arrayList2.size()) {
                                    break;
                                }
                                com.tencent.mm.plugin.ipcall.ui.u uVar = (com.tencent.mm.plugin.ipcall.ui.u) arrayList2.get(i29);
                                if (uVar.f143015a.contains(str4)) {
                                    str4 = uVar.f143016b;
                                    break;
                                }
                                i29++;
                            }
                        }
                        vVar2.f143028b.setText(o13.q.c(context2, str3, str4));
                        vVar2.f143029c.setText(w(item, this.f143051t));
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f143051t)) {
                        vVar2.f143028b.setText(item.field_systemAddressBookUsername);
                    }
                }
                android.widget.ImageView imageView = vVar2.f143027a;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    imageView.setTag(null);
                    imageView.setImageResource(com.tencent.mm.R.drawable.c7l);
                    boolean K02 = com.tencent.mm.sdk.platformtools.t8.K0(item.field_contactId);
                    com.tencent.mm.plugin.ipcall.ui.c0 c0Var = this.f143046o;
                    if (!K02 && !com.tencent.mm.sdk.platformtools.t8.K0(item.field_wechatUsername)) {
                        c0Var.d(item.field_contactId, item.field_wechatUsername, imageView);
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(item.field_contactId)) {
                        c0Var.c(item.field_contactId, imageView);
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(item.field_wechatUsername)) {
                        c0Var.f(item.field_wechatUsername, imageView);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(item.field_wechatUsername)) {
                        this.f143050s.add(item.field_wechatUsername);
                    }
                }
                vVar2.f143030d.setVisibility(8);
                java.lang.String v17 = v(item.field_sortKey);
                if (i17 == 0) {
                    vVar2.f143031e.setVisibility(0);
                    vVar2.f143031e.setText(v17);
                    vVar2.f143032f.setVisibility(8);
                } else if (v(getItem(i17 - 1).field_sortKey).equals(v17)) {
                    vVar2.f143031e.setVisibility(8);
                    vVar2.f143031e.setText("");
                    vVar2.f143032f.setVisibility(8);
                } else {
                    vVar2.f143031e.setVisibility(0);
                    vVar2.f143031e.setText(v17);
                    vVar2.f143032f.setVisibility(8);
                }
            }
            android.view.View view3 = vVar2.f143034h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "handleAddresItem", "(ILcom/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "handleAddresItem", "(ILcom/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            vVar2.f143033g.setVisibility(8);
            vVar2.f143033g.setOnClickListener(this.f143054w);
        }
        int i37 = i17 + 1;
        boolean z17 = getItem(i37) == null || getItem(i17) == null || v(getItem(i37).field_sortKey).equals(v(getItem(i17).field_sortKey));
        if (i37 == super.getCount() || !z17) {
            android.view.View view4 = vVar2.f143036j;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = vVar2.f143036j;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        this.f143048q.clear();
        super.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        super.c();
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fc, code lost:
    
        if (r3 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c3, code lost:
    
        if (r5 == null) goto L31;
     */
    @Override // com.tencent.mm.ui.z9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q() {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ipcall.ui.w.q():void");
    }

    public int t() {
        return super.getCount();
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public s83.c getItem(int i17) {
        return (s83.c) super.getItem(i17);
    }

    public final java.lang.String v(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : str.startsWith(s83.b.f404866a) ? "#" : str.toUpperCase().substring(0, 1);
    }

    public final java.lang.String w(s83.c cVar, java.lang.String str) {
        java.util.ArrayList arrayList;
        if (cVar == null || (arrayList = cVar.f404869t) == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (str2.contains(str)) {
                return str2;
            }
        }
        return null;
    }
}
