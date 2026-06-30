package s82;

/* loaded from: classes9.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f404737a;

    /* renamed from: b, reason: collision with root package name */
    public final int f404738b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.fav.ui.ra f404739c;

    /* renamed from: d, reason: collision with root package name */
    public final s82.f f404740d = new s82.f();

    /* renamed from: e, reason: collision with root package name */
    public s82.i f404741e = null;

    public c(com.tencent.mm.plugin.fav.ui.ra raVar) {
        this.f404739c = null;
        this.f404739c = raVar;
        this.f404738b = i65.a.h(raVar.f101384a, com.tencent.mm.R.dimen.f479776ex);
        this.f404737a = i65.a.h(raVar.f101384a, com.tencent.mm.R.dimen.f479776ex);
    }

    public static boolean h(android.view.View view, int i17) {
        return i(view, i17, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(android.view.View r4, int r5, r45.gp0 r6) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s82.c.i(android.view.View, int, r45.gp0):boolean");
    }

    public static boolean j(android.view.View view, o72.r2 r2Var) {
        if (r2Var == null) {
            return false;
        }
        return i(view, r2Var.field_type, null);
    }

    public android.view.View a(android.view.View view, s82.g gVar, o72.r2 r2Var) {
        if (view == null) {
            throw new java.lang.NullPointerException("base item view is null");
        }
        if (gVar == null) {
            throw new java.lang.NullPointerException("base holder is null");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f484331dx1);
        gVar.f404775b = weImageView;
        if (weImageView == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_type_iv");
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dvd);
        gVar.f404776c = textView;
        if (textView == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_name");
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.t_0);
        gVar.f404777d = textView2;
        if (textView2 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_auhtor");
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.t__);
        gVar.f404778e = findViewById;
        if (findViewById == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_name_divider");
        }
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dx6);
        gVar.f404779f = textView3;
        if (textView3 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_version_info");
        }
        android.widget.TextView textView4 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dwo);
        gVar.f404780g = textView4;
        if (textView4 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_time");
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.dv8);
        gVar.f404784k = linearLayout;
        if (linearLayout == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_fl_tag_list");
        }
        com.tencent.mm.ui.base.FlowLayout flowLayout = (com.tencent.mm.ui.base.FlowLayout) view.findViewById(com.tencent.mm.R.id.dwk);
        gVar.f404785l = flowLayout;
        if (flowLayout == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_fl_tag_list");
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.t_2);
        gVar.f404786m = viewGroup;
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_clean_mode_edit_view");
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.sst);
        gVar.f404787n = viewGroup2;
        if (viewGroup2 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named clean_mode_delete_btn");
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.t_4);
        gVar.f404788o = findViewById2;
        if (findViewById2 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_data_size_area");
        }
        android.widget.TextView textView5 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.t_a);
        gVar.f404789p = textView5;
        if (textView5 == null) {
            throw new java.lang.IllegalArgumentException("base item view do not contain id named fav_size_tv");
        }
        if (this.f404740d.f404768f && o72.x1.g0()) {
            gVar.f404781h = (android.widget.CheckBox) gVar.f404786m.findViewById(com.tencent.mm.R.id.t_1);
        } else {
            android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.dtq);
            gVar.f404781h = checkBox;
            if (checkBox == null) {
                throw new java.lang.IllegalArgumentException("base item view do not contain id named checkbox");
            }
        }
        gVar.f404781h.setOnCheckedChangeListener(new s82.d(this));
        gVar.f404774a = r2Var;
        view.setTag(gVar);
        gVar.f404782i = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.dwi);
        android.widget.TextView textView6 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dwh);
        gVar.f404783j = textView6;
        textView6.setOnClickListener(new s82.e(this));
        return view;
    }

    public void b(android.view.ViewGroup viewGroup) {
        float f17;
        float f18;
        if (viewGroup == null) {
            return;
        }
        s82.f fVar = this.f404740d;
        if (fVar.f404765c || fVar.f404768f) {
            f17 = viewGroup.getContext().getResources().getDisplayMetrics().density;
            f18 = 92.0f;
        } else {
            f17 = viewGroup.getContext().getResources().getDisplayMetrics().density;
            f18 = 56.0f;
        }
        this.f404737a = (int) ((viewGroup.getWidth() - (f17 * f18)) / 3.0f);
    }

    public java.lang.String c(s82.g gVar, o72.r2 r2Var) {
        return "";
    }

    public java.lang.Integer d(r45.gp0 gp0Var) {
        return null;
    }

    public abstract android.view.View e(android.view.View view, android.view.ViewGroup viewGroup, o72.r2 r2Var);

    public abstract void f(android.view.View view, r45.dq0 dq0Var);

    public void g(s82.g gVar, final o72.r2 r2Var) {
        java.lang.String str;
        s82.f fVar;
        java.util.ArrayList arrayList;
        s82.f fVar2;
        java.lang.String str2;
        s82.g gVar2 = gVar;
        gVar2.f404774a = r2Var;
        android.widget.TextView textView = gVar2.f404780g;
        textView.setText(com.tencent.mm.plugin.fav.ui.w6.a(textView.getContext(), gVar2.f404774a.field_updateTime));
        android.content.Context context = gVar2.f404776c.getContext();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(gVar2.f404774a.field_fromUser);
        o72.r2 r2Var2 = gVar2.f404774a;
        r45.bq0 bq0Var = r2Var2.field_favProto;
        if (bq0Var != null) {
            r45.jq0 jq0Var = bq0Var.f370962d;
            if (com.tencent.mm.storage.z3.R4(r2Var2.field_fromUser)) {
                str = o72.x1.w(jq0Var.f378036f);
                if (str == null || str.isEmpty()) {
                    str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nvr);
                }
            } else if (com.tencent.mm.storage.z3.R4(gVar2.f404774a.field_toUser)) {
                str = o72.x1.w(jq0Var.f378038h);
                if (str == null || str.isEmpty()) {
                    str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nvr);
                }
            } else {
                java.lang.String str3 = gVar2.f404774a.field_fromUser;
                str = (str3 == null || str3.isEmpty() || (str2 = gVar2.f404774a.field_toUser) == null || str2.isEmpty()) ? o72.x1.w(jq0Var.f378036f) : c01.z1.r().equals(jq0Var.f378038h) ? o72.x1.w(jq0Var.f378036f) : o72.x1.w(jq0Var.f378038h);
            }
        } else {
            str = "";
        }
        java.lang.String c17 = c(gVar2, gVar2.f404774a);
        int i17 = 0;
        if (c17 == null || c17.isEmpty()) {
            gVar2.f404777d.setVisibility(8);
            android.view.View view = gVar2.f404778e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderNameArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderNameArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            gVar2.f404777d.setVisibility(0);
            gVar2.f404777d.setText(c17);
            if (str == null || str.isEmpty()) {
                android.view.View view2 = gVar2.f404778e;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderNameArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderNameArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view3 = gVar2.f404778e;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderNameArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderNameArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.widget.TextView textView2 = gVar2.f404776c;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = gVar2.f404776c.getTextSize();
        ((ke0.e) xVar).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        if (gVar2.f404774a.P0()) {
            gVar2.f404782i.setVisibility(0);
        } else {
            gVar2.f404782i.setVisibility(8);
        }
        gVar2.f404781h.setTag(r2Var);
        s82.f fVar3 = this.f404740d;
        if (fVar3.f404765c || fVar3.f404768f) {
            gVar2.f404781h.setVisibility(0);
            if (r2Var.B1) {
                gVar2.f404781h.setChecked(fVar3.f404766d.get(r2Var.D1) != null);
            } else {
                gVar2.f404781h.setChecked(fVar3.f404766d.get(com.tencent.mm.sdk.platformtools.t8.f1(java.lang.Long.valueOf(r2Var.field_localId))) != null);
            }
        } else {
            gVar2.f404781h.setVisibility(8);
        }
        gVar2.f404783j.setTag(r2Var);
        if (fVar3.f404768f) {
            gVar2.f404785l.setVisibility(8);
            fVar = fVar3;
        } else {
            android.widget.LinearLayout linearLayout = gVar2.f404784k;
            linearLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = linearLayout.getMeasuredWidth();
            linearLayout.getMeasuredHeight();
            android.content.Context context2 = linearLayout.getContext();
            int b17 = (int) ym5.x.b(context2, measuredWidth);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "renderTag widthDp = " + b17);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.LinkedList linkedList = r2Var.field_tagProto.f385097f;
            com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "tagIdList = " + linkedList + ", tagList = " + arrayList5);
            if (linkedList.size() > 0) {
                t72.b bVar = t72.b.f416040a;
                p75.i0 i18 = dm.q3.f239384f.i();
                i18.f352657d = dm.q3.f239385g.k(linkedList);
                i18.f352656c = "MicroMsg.SDK.BaseFavTagInfo";
                p75.l0 a17 = i18.a();
                com.tencent.mars.xlog.Log.i("MicroMsg.FavTagStorage", "[queryByIds] sql = " + a17);
                java.util.ArrayList arrayList6 = (java.util.ArrayList) a17.k(t72.b.f416041b, t72.a.class);
                if (arrayList6.isEmpty()) {
                    arrayList5.addAll(r2Var.field_tagProto.f385096e);
                } else {
                    for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                        arrayList5.add(((t72.a) arrayList6.get(i19)).field_name);
                    }
                }
            } else {
                arrayList5.addAll(r2Var.field_tagProto.f385096e);
            }
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            int i27 = 0;
            int i28 = 0;
            while (i27 < arrayList5.size()) {
                final java.lang.String str4 = (java.lang.String) arrayList5.get(i27);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    fVar2 = fVar3;
                    arrayList = arrayList5;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "field_tagProto.userDefList [ " + i27 + " ] : " + str4);
                    android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context2);
                    linearLayout2.setOrientation(i17);
                    android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    float f17 = (float) 10;
                    arrayList = arrayList5;
                    linearLayout2.setPadding(0, 0, ym5.x.a(context2, f17), 0);
                    linearLayout2.setLayoutParams(layoutParams);
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(context2);
                    int a18 = ym5.x.a(context2, 16);
                    android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(a18, a18);
                    layoutParams2.gravity = 17;
                    weImageView.setLayoutParams(layoutParams2);
                    weImageView.setImageResource(com.tencent.mm.R.raw.fav_list_tag);
                    weImageView.setIconColor(i65.a.d(context2, com.tencent.mm.R.color.f478734fp));
                    android.widget.TextView textView3 = new android.widget.TextView(context2);
                    fVar2 = fVar3;
                    android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutParams3.leftMargin = ym5.x.a(context2, 5);
                    textView3.setLayoutParams(layoutParams3);
                    int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                    textView3.setTextSize(12);
                    textView3.setSingleLine(true);
                    textView3.setTextColor(i65.a.d(context2, com.tencent.mm.R.color.f478734fp));
                    textView3.setText(str4);
                    textView3.measure(makeMeasureSpec, makeMeasureSpec2);
                    int measuredWidth2 = textView3.getMeasuredWidth();
                    linearLayout2.addView(weImageView);
                    linearLayout2.addView(textView3);
                    android.util.Pair pair = new android.util.Pair(linearLayout2, java.lang.Integer.valueOf((int) (21 + ym5.x.b(context2, measuredWidth2) + f17)));
                    arrayList7.add((android.view.View) pair.first);
                    if (this.f404741e != null) {
                        ((android.view.View) pair.first).setOnClickListener(new android.view.View.OnClickListener() { // from class: s82.c$$b
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view4) {
                                s82.c cVar = s82.c.this;
                                cVar.getClass();
                                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                                java.lang.String str5 = str4;
                                arrayList8.add(str5);
                                arrayList8.add(view4);
                                java.lang.Object[] array = arrayList8.toArray();
                                arrayList8.clear();
                                yj0.a.b("com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cVar, array);
                                cVar.f404741e.a(str5);
                                yj0.a.h(cVar, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            }
                        });
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "tag name = " + str4 + ", set on tag click listener");
                    }
                    i28 += ((java.lang.Integer) pair.second).intValue();
                }
                i27++;
                arrayList5 = arrayList;
                fVar3 = fVar2;
                i17 = 0;
            }
            fVar = fVar3;
            com.tencent.mars.xlog.Log.i("MicroMsg.FavBaseListItem", "totalWidthDp = " + i28 + " , tagListFL widthDp = " + b17);
            linearLayout.removeAllViews();
            gVar2 = gVar;
            gVar2.f404785l.removeAllViews();
            for (int i29 = 0; i29 < arrayList7.size(); i29++) {
                final android.view.View view4 = (android.view.View) arrayList7.get(i29);
                int f18 = i65.a.f(context2, com.tencent.mm.R.dimen.f479646bl);
                int i37 = f18 / 2;
                view4.setPadding(0, i37, f18 * 2, i37);
                if (i28 < b17) {
                    gVar2.f404785l.setVisibility(8);
                    linearLayout.addView(view4);
                } else {
                    gVar2.f404785l.setVisibility(0);
                    gVar2.f404785l.addView((android.view.View) arrayList7.get(i29));
                }
                final int f19 = i65.a.f(context2, com.tencent.mm.R.dimen.f479738dv);
                final android.view.View view5 = (android.view.View) view4.getParent();
                view5.post(new java.lang.Runnable() { // from class: s82.c$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        android.view.View view6 = view4;
                        view6.getHitRect(rect);
                        int i38 = rect.top;
                        int i39 = f19;
                        rect.top = i38 - i39;
                        rect.bottom += i39;
                        rect.left -= i39;
                        rect.right += i39;
                        view5.setTouchDelegate(new android.view.TouchDelegate(rect, view6));
                    }
                });
            }
        }
        java.lang.Integer d17 = d(o72.x1.J(r2Var));
        if (d17 != null) {
            gVar2.f404775b.setVisibility(0);
            gVar2.f404775b.s(d17.intValue(), com.tencent.mm.R.color.FG_2);
        } else {
            gVar2.f404775b.setVisibility(8);
        }
        s82.f fVar4 = fVar;
        if (fVar4.f404768f && o72.x1.g0()) {
            gVar2.f404786m.setVisibility(0);
            if (fVar4.f404769g) {
                gVar2.f404781h.setVisibility(0);
                gVar2.f404787n.setVisibility(8);
            } else {
                gVar2.f404781h.setVisibility(8);
                gVar2.f404787n.setVisibility(0);
            }
            gVar2.f404787n.setOnClickListener(new android.view.View.OnClickListener() { // from class: s82.c$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view6) {
                    s82.c cVar = s82.c.this;
                    cVar.getClass();
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    o72.r2 r2Var3 = r2Var;
                    arrayList8.add(r2Var3);
                    arrayList8.add(view6);
                    java.lang.Object[] array = arrayList8.toArray();
                    arrayList8.clear();
                    yj0.a.b("com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cVar, array);
                    com.tencent.mm.plugin.fav.ui.a4 a4Var = cVar.f404740d.f404770h;
                    if (a4Var != null) {
                        com.tencent.mm.plugin.fav.ui.FavCleanUI favCleanUI = (com.tencent.mm.plugin.fav.ui.FavCleanUI) a4Var;
                        db5.e1.A(favCleanUI.getContext(), favCleanUI.getContext().getString(com.tencent.mm.R.string.c_h), "", favCleanUI.getString(com.tencent.mm.R.string.c9d), favCleanUI.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.fav.ui.y0(favCleanUI, r2Var3), null);
                    }
                    yj0.a.h(cVar, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        } else {
            gVar2.f404786m.setVisibility(8);
        }
        if (!fVar4.f404768f) {
            android.view.View view6 = gVar2.f404788o;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view6, arrayList8.toArray(), "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderSizeArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderSizeArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = gVar2.f404788o;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view7, arrayList9.toArray(), "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderSizeArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem", "renderSizeArea", "(Lcom/tencent/mm/plugin/fav/ui/listitem/FavBaseListItem$FavBaseHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        gVar2.f404789p.setText(o72.x1.V(gVar2.f404774a.field_datatotalsize));
    }

    public void k(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            return;
        }
        int i17 = this.f404737a;
        layoutParams.width = i17;
        layoutParams.height = i17;
        view.setLayoutParams(layoutParams);
    }
}
