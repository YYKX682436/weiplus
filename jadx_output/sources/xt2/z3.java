package xt2;

/* loaded from: classes3.dex */
public final class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f457140d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f457141e;

    /* renamed from: f, reason: collision with root package name */
    public final xt2.i5 f457142f;

    /* renamed from: g, reason: collision with root package name */
    public final xt2.u3 f457143g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f457144h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f457145i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f457146m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f457147n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f457148o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f457149p;

    /* renamed from: q, reason: collision with root package name */
    public final tt2.i f457150q;

    public z3(android.view.View root, java.util.LinkedList shoppingListData, xt2.i5 config, xt2.u3 u3Var) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(shoppingListData, "shoppingListData");
        kotlin.jvm.internal.o.g(config, "config");
        this.f457140d = root;
        this.f457141e = shoppingListData;
        this.f457142f = config;
        this.f457143g = u3Var;
        this.f457144h = "FinderLiveShoppingEditWidget";
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.muz);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) root.findViewById(com.tencent.mm.R.id.mux);
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.muy);
        this.f457145i = root.findViewById(com.tencent.mm.R.id.od7);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) root.findViewById(com.tencent.mm.R.id.muq);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.mun);
        this.f457146m = findViewById;
        this.f457147n = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.mus);
        android.widget.TextView textView3 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.mur);
        this.f457148o = textView3;
        android.widget.TextView textView4 = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.mup);
        this.f457149p = textView4;
        tt2.i iVar = new tt2.i();
        this.f457150q = iVar;
        androidx.recyclerview.widget.g1 g1Var = new androidx.recyclerview.widget.g1(new xt2.v3(this));
        findViewById.setOnClickListener(this);
        weImageView.setOnClickListener(this);
        zl2.r4.c3(zl2.r4.f473950a, weImageView, 0, 0, 6, null);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        iVar.f421937n = new xt2.t3(this, iVar);
        recyclerView.setAdapter(iVar);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
        g1Var.d(recyclerView);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
    }

    public static void c(xt2.z3 z3Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        tt2.i iVar = z3Var.f457150q;
        if (!z17) {
            if (z18) {
                z3Var.f457140d.animate().translationY(com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y).setListener(new xt2.x3(z3Var)).start();
                return;
            }
            java.util.Iterator it = iVar.f421934h.iterator();
            while (it.hasNext()) {
                ((tt2.e) it.next()).f421873b = false;
            }
            android.view.View view = z3Var.f457140d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "setVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "setVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = z3Var.f457140d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "setVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "setVisible", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        iVar.getClass();
        java.util.LinkedList dataList = z3Var.f457141e;
        kotlin.jvm.internal.o.g(dataList, "dataList");
        xt2.i5 priceViewConfig = z3Var.f457142f;
        kotlin.jvm.internal.o.g(priceViewConfig, "priceViewConfig");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : dataList) {
            if (!(((so2.j5) obj2) instanceof cm2.m0)) {
                arrayList3.add(obj2);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateProductList otherItem:");
        java.util.Iterator it6 = arrayList3.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("[" + i18 + ',' + ((so2.j5) next).getItemId() + ']');
            i18 = i19;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveShoppingEditAdapter", sb6.toString());
        java.util.ArrayList arrayList4 = iVar.f421934h;
        arrayList4.clear();
        iVar.f421935i.clear();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(dataList, 10));
        java.util.Iterator it7 = dataList.iterator();
        while (it7.hasNext()) {
            arrayList5.add(new tt2.e((so2.j5) it7.next(), false, 2, null));
        }
        arrayList4.addAll(arrayList5);
        iVar.K(arrayList4, "updateProductList dataList");
        iVar.f421936m = priceViewConfig;
        iVar.notifyDataSetChanged();
        z3Var.a(false);
        z3Var.b();
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f457148o;
        android.widget.TextView textView2 = this.f457149p;
        if (z17) {
            textView2.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479044o8));
            textView2.setEnabled(true);
            textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479044o8));
            textView.setEnabled(true);
            return;
        }
        textView2.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
        textView2.setEnabled(false);
        textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
        textView.setEnabled(false);
    }

    public final void b() {
        int L = this.f457150q.L();
        android.widget.TextView textView = this.f457147n;
        if (L > 0) {
            textView.setText(textView.getContext().getString(com.tencent.mm.R.string.edv, java.lang.Integer.valueOf(L)));
            textView.setVisibility(0);
        } else {
            textView.setText("");
            textView.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        so2.j5 j5Var;
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        xt2.u3 u3Var = this.f457143g;
        tt2.i iVar = this.f457150q;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.mux) {
            if (((java.util.ArrayList) iVar.J()).isEmpty()) {
                if (u3Var != null) {
                    java.util.ArrayList allList = iVar.f421935i;
                    kotlin.jvm.internal.o.g(allList, "allList");
                    vt2.j jVar = ((vt2.h) u3Var).f439962a;
                    jVar.f439965b.a(allList, true);
                    jVar.f439964a.finish();
                }
            } else if (u3Var != null) {
                java.util.List J2 = iVar.J();
                vt2.j jVar2 = ((vt2.h) u3Var).f439962a;
                jVar2.f439965b.a(J2, false);
                jVar2.f439964a.finish();
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.muy) {
            if (u3Var != null) {
                vt2.g gVar = ((vt2.h) u3Var).f439962a.f439965b;
                r45.i56 i56Var = gVar.f439960e;
                java.lang.Object obj = "";
                if (i56Var == null || (str = i56Var.getString(0)) == null) {
                    str = "";
                }
                r45.i56 i56Var2 = gVar.f439960e;
                if (i56Var2 == null || (str2 = i56Var2.getString(1)) == null) {
                    str2 = "";
                }
                r45.i56 i56Var3 = gVar.f439960e;
                long j17 = i56Var3 != null ? i56Var3.getLong(2) : 0L;
                r45.i56 i56Var4 = gVar.f439960e;
                long j18 = i56Var4 != null ? i56Var4.getLong(3) : 0L;
                r45.i56 i56Var5 = gVar.f439960e;
                if (i56Var5 == null || (str3 = i56Var5.getString(4)) == null) {
                    str3 = "";
                }
                r45.i56 i56Var6 = gVar.f439960e;
                if (i56Var6 == null || (str4 = i56Var6.getString(5)) == null) {
                    str4 = "";
                }
                r45.i56 i56Var7 = gVar.f439960e;
                if (i56Var7 == null || (str5 = i56Var7.getString(6)) == null) {
                    str5 = "";
                }
                r45.i56 i56Var8 = gVar.f439960e;
                if (i56Var8 == null || (str6 = i56Var8.getString(7)) == null) {
                    str6 = "";
                }
                java.lang.String obj2 = com.tencent.mm.sdk.platformtools.t8.s0().toString();
                l81.b1 b1Var = new l81.b1();
                b1Var.f317014b = str;
                st2.c2 c2Var = st2.c2.f412249a;
                b1Var.f317022f = c2Var.a(str2, j17);
                b1Var.f317028i = new dk2.ah();
                b1Var.f317032k = 1176;
                b1Var.f317034l = "post_live_add:" + j18 + ':' + str3 + "::" + str4 + ':' + obj2 + ':' + str5 + ':' + str6;
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.y4 y4Var = ml2.j0.f327583i;
                java.lang.String sceneNote = b1Var.f317034l;
                kotlin.jvm.internal.o.f(sceneNote, "sceneNote");
                y4Var.getClass();
                y4Var.f328306n = sceneNote;
                p52.c cVar = p52.h.f352016a;
                kotlin.jvm.internal.o.g(obj2, "<set-?>");
                p52.h.f352029n = obj2;
                zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
                java.lang.String appId = b1Var.f317014b;
                kotlin.jvm.internal.o.f(appId, "appId");
                ((com.tencent.mm.plugin.finder.report.o3) qaVar).Ck(3L, appId, obj2, 1176L, str4, "post_live_add", str5);
                c2Var.k(b1Var);
                gk2.e eVar = dk2.ef.I;
                if (eVar != null) {
                    dk2.q4.f233938a.l(gVar.f439956a, eVar, b1Var, true, new vt2.d(gVar));
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                ml2.t2[] t2VarArr = ml2.t2.f328014d;
                jSONObject.put("type", 2);
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                jSONObject.put("sessionid", y4Var.f328306n);
                jSONObject.put("shopwindowid", "");
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                y4Var.Y = true;
                gk2.e eVar2 = gk2.e.f272471n;
                jSONObject.put("appid", eVar2 != null ? ((mm2.f6) eVar2.a(mm2.f6.class)).A : null);
                gk2.e eVar3 = gk2.e.f272471n;
                long j19 = (eVar3 == null || (nw1Var = ((mm2.e1) eVar3.a(mm2.e1.class)).f328988r) == null) ? -1L : nw1Var.getLong(0);
                if (j19 < 0) {
                    jSONObject.put("liveid", "");
                } else {
                    ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                    jSONObject.put("liveid", b52.b.q(j19));
                }
                jSONObject.put("clickid", p52.h.f352029n);
                p52.h.f352029n = "";
                gk2.e eVar4 = gk2.e.f272471n;
                if (eVar4 != null && (j5Var = ((mm2.f6) eVar4.a(mm2.f6.class)).f329049w) != null) {
                    obj = java.lang.Long.valueOf(j5Var.getItemId());
                }
                jSONObject.put("productid", obj);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, ml2.z4.f328366o, jSONObject.toString(), null, 4, null);
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.mur) {
            java.util.ArrayList arrayList2 = iVar.f421934h;
            try {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (((tt2.e) next).f421873b) {
                        arrayList3.add(next);
                    }
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    java.lang.Object next2 = it6.next();
                    if (!((tt2.e) next2).f421873b) {
                        arrayList4.add(next2);
                    }
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList3);
                arrayList2.addAll(arrayList4);
                iVar.K(arrayList2, "after moveSelectItem");
            } catch (java.lang.Exception e17) {
                hc2.c.a(e17, "FinderLiveShoppingEditAdapter,moveSelectItem:");
            }
            iVar.notifyDataSetChanged();
            java.util.Iterator it7 = iVar.f421934h.iterator();
            while (it7.hasNext()) {
                ((tt2.e) it7.next()).f421873b = false;
            }
            a(false);
            b();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.mup) {
            xt2.w3 w3Var = new xt2.w3(this);
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.g(com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.mou, java.lang.Integer.valueOf(iVar.L())));
            u1Var.a(true);
            u1Var.m(com.tencent.mm.R.string.mot);
            u1Var.j(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.mos));
            u1Var.b(new xt2.y3(w3Var));
            u1Var.q(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingEditWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
