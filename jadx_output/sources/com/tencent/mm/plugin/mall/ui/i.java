package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class i extends android.widget.BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.mall.ui.h f148393f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f148394g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.LayoutInflater f148395h;

    /* renamed from: i, reason: collision with root package name */
    public final int f148396i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f148391d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public android.util.SparseArray f148392e = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f148397m = true;

    /* renamed from: n, reason: collision with root package name */
    public int f148398n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f148399o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f148400p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f148401q = false;

    public i(android.content.Context context, int i17) {
        this.f148394g = context;
        this.f148396i = i17;
        this.f148395h = android.view.LayoutInflater.from(context);
    }

    public static boolean d(com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction) {
        com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = mallFunction.f179827o;
        return (mallNews == null || com.tencent.mm.sdk.platformtools.t8.K0(mallNews.f179836i) || !g(mallFunction) || bt4.g.b().c(mallFunction.f179819d) == null) ? false : true;
    }

    public static boolean g(com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction) {
        com.tencent.mm.plugin.wallet_core.model.mall.MallNews c17 = bt4.g.b().c(mallFunction.f179819d);
        if (c17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(c17.f179834g) && c17.f179834g.equals(mallFunction.f179827o.f179834g)) {
            return "0".equals(c17.f179831d);
        }
        java.lang.String str = mallFunction.f179827o.f179834g;
        bt4.g.b().a(mallFunction.f179827o);
        return true;
    }

    public final void a(android.view.View view, com.tencent.mm.plugin.mall.ui.g gVar, int i17, int i18) {
        if (view == null) {
            return;
        }
        com.tencent.mm.plugin.mall.ui.e eVar = (com.tencent.mm.plugin.mall.ui.e) view.getTag();
        com.tencent.mm.plugin.wallet_core.model.mall.MallFunction mallFunction = gVar.f148381a;
        int i19 = gVar.f148382b;
        eVar.f148361f = mallFunction.f179823h;
        hf3.f.a(eVar.f148357b, mallFunction.f179822g, com.tencent.mm.R.raw.mall_index_icon_default);
        eVar.f148359d.setText(mallFunction.f179820e);
        eVar.f148358c.setVisibility(8);
        com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = mallFunction.f179827o;
        if (mallNews == null || com.tencent.mm.sdk.platformtools.t8.K0(mallNews.f179836i) || !g(mallFunction)) {
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews2 = mallFunction.f179827o;
            if (mallNews2 == null || mallNews2.f179841q != 1) {
                eVar.f148360e.setText("");
                eVar.f148360e.setVisibility(8);
            } else {
                eVar.f148360e.setText(mallNews2.f179836i);
                eVar.f148360e.setVisibility(0);
            }
            eVar.f148358c.setImageBitmap(null);
            eVar.f148358c.setVisibility(8);
            eVar.f148356a.setTag(com.tencent.mm.R.id.nwn, mallFunction.f179820e);
        } else {
            if (bt4.g.b().c(mallFunction.f179819d) != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FunctionListAdapter", "show the news : " + bt4.g.b().c(mallFunction.f179819d).f179836i);
                eVar.f148360e.setText(mallFunction.f179827o.f179836i);
                eVar.f148360e.setVisibility(0);
            } else {
                eVar.f148360e.setVisibility(8);
            }
            hf3.f.a(eVar.f148358c, eVar.f148361f, 0);
            eVar.f148358c.setVisibility(0);
            eVar.f148356a.setTag(com.tencent.mm.R.id.nwn, mallFunction.f179820e + this.f148394g.getString(com.tencent.mm.R.string.f489804c6));
        }
        view.setOnClickListener(new com.tencent.mm.plugin.mall.ui.d(this, i19, mallFunction));
        android.view.View view2 = eVar.f148356a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionItem", "(Landroid/view/View;Lcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$MallFunctionWrapper;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionItem", "(Landroid/view/View;Lcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$MallFunctionWrapper;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setEnabled(true);
        view.setClickable(true);
        view.setFocusable(true);
        eVar.f148365j.setVisibility(4);
        if (i17 == 0) {
            eVar.f148363h.setVisibility(0);
        } else if (i17 == 1) {
            eVar.f148363h.setVisibility(0);
        } else if (i17 == 2) {
            eVar.f148363h.setVisibility(4);
        }
        if (i18 == 0) {
            eVar.f148362g.setVisibility(0);
            eVar.f148364i.setVisibility(4);
        } else if (i18 == 1) {
            eVar.f148362g.setVisibility(4);
            eVar.f148364i.setVisibility(0);
        } else {
            eVar.f148362g.setVisibility(0);
            eVar.f148364i.setVisibility(0);
        }
    }

    public final void c(int i17, com.tencent.mm.plugin.mall.ui.f fVar, int i18) {
        boolean z17;
        android.view.View.OnClickListener onClickListener;
        android.view.View view;
        boolean z18;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f148391d;
        java.util.List list = (java.util.List) arrayList.get(i17);
        int i19 = ((com.tencent.mm.plugin.mall.ui.g) list.get(0)).f148381a.f179828p;
        android.view.View.OnClickListener onClickListener2 = null;
        if (list.size() > 0) {
            int i27 = ((com.tencent.mm.plugin.mall.ui.g) list.get(0)).f148381a.f179828p;
            android.util.SparseArray sparseArray = this.f148392e;
            java.lang.String str = sparseArray == null ? null : (java.lang.String) sparseArray.get(i27);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                z17 = false;
                z18 = false;
            } else {
                if (i17 != 0) {
                    int i28 = i17 - 1;
                    if (((java.util.ArrayList) arrayList.get(i28)).size() <= 0 || i27 == ((com.tencent.mm.plugin.mall.ui.g) ((java.util.ArrayList) arrayList.get(i28)).get(0)).f148381a.f179828p) {
                        z18 = false;
                        z17 = i17 == arrayList.size() - 1 || i27 != ((com.tencent.mm.plugin.mall.ui.g) ((java.util.ArrayList) arrayList.get(i17 + 1)).get(0)).f148381a.f179828p;
                    }
                }
                z18 = true;
                if (i17 == arrayList.size() - 1) {
                }
            }
            if (z18) {
                fVar.f148370b.setText(str);
                fVar.f148370b.setVisibility(0);
                android.view.View view2 = fVar.f148371c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = fVar.f148372d;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                fVar.f148370b.setMinHeight(com.tencent.mm.plugin.mall.ui.b.f148334c);
                fVar.f148372d.setBackgroundColor(com.tencent.mm.plugin.mall.ui.n2.a());
            } else {
                fVar.f148370b.setVisibility(8);
                android.view.View view4 = fVar.f148371c;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = fVar.f148372d;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            fVar.f148370b.setVisibility(8);
            android.view.View view6 = fVar.f148371c;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = fVar.f148372d;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = false;
        }
        android.view.ViewGroup viewGroup = fVar.f148369a;
        viewGroup.setFocusable(true);
        int i29 = 0;
        while (i29 < 3) {
            if (i29 >= viewGroup.getChildCount() || viewGroup.getChildAt(i29) == null) {
                com.tencent.mm.plugin.mall.ui.e eVar = new com.tencent.mm.plugin.mall.ui.e(this);
                android.view.View inflate = this.f148395h.inflate(com.tencent.mm.R.layout.bvz, viewGroup, false);
                eVar.f148356a = inflate.findViewById(com.tencent.mm.R.id.j9t);
                eVar.f148357b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.j9q);
                eVar.f148359d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j9v);
                eVar.f148360e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j9p);
                eVar.f148358c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.k9w);
                eVar.f148362g = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.d1v);
                eVar.f148363h = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.d1t);
                eVar.f148364i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.d1f);
                eVar.f148365j = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.d1n);
                inflate.setTag(eVar);
                if (i29 < list.size()) {
                    a(inflate, (com.tencent.mm.plugin.mall.ui.g) list.get(i29), i29, i18);
                    onClickListener = null;
                } else {
                    inflate.setFocusable(false);
                    com.tencent.mm.plugin.mall.ui.e eVar2 = (com.tencent.mm.plugin.mall.ui.e) inflate.getTag();
                    android.view.View view8 = eVar2.f148356a;
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList8.add(4);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    onClickListener = null;
                    inflate.setOnClickListener(null);
                    inflate.setEnabled(false);
                    inflate.setClickable(false);
                    eVar2.f148362g.setVisibility(0);
                    eVar2.f148363h.setVisibility(4);
                    eVar2.f148364i.setVisibility(4);
                    eVar2.f148365j.setVisibility(4);
                }
                viewGroup.addView(inflate, new android.widget.LinearLayout.LayoutParams(-2, com.tencent.mm.plugin.mall.ui.b.f148335d, 1.0f));
                view = inflate;
            } else {
                view = viewGroup.getChildAt(i29);
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view, arrayList9.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (i29 < list.size()) {
                    a(view, (com.tencent.mm.plugin.mall.ui.g) list.get(i29), i29, i18);
                } else {
                    viewGroup.getChildAt(i29).setFocusable(false);
                    viewGroup.getChildAt(i29).setOnClickListener(onClickListener2);
                    com.tencent.mm.plugin.mall.ui.e eVar3 = (com.tencent.mm.plugin.mall.ui.e) viewGroup.getChildAt(i29).getTag();
                    android.view.View view9 = eVar3.f148356a;
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    arrayList10.add(4);
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(view9, arrayList10.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapter$LineViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setEnabled(false);
                    view.setClickable(false);
                    eVar3.f148362g.setVisibility(0);
                    eVar3.f148363h.setVisibility(4);
                    eVar3.f148364i.setVisibility(4);
                    eVar3.f148365j.setVisibility(4);
                }
                onClickListener = null;
            }
            android.content.Context context = this.f148394g;
            if (i18 != 0 || !z17) {
                view.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.anj));
            } else if (i29 == 0) {
                view.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.anf));
            } else if (i29 == 1) {
                view.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.anj));
            } else {
                view.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.ang));
            }
            i29++;
            onClickListener2 = onClickListener;
        }
    }

    public final boolean f(int i17) {
        if (this.f148398n <= 9) {
            return false;
        }
        int i18 = 0;
        for (int i19 = 0; i19 <= i17; i19++) {
            i18 += ((java.util.ArrayList) ((java.util.ArrayList) this.f148391d).get(i19)).size();
        }
        int i27 = this.f148399o;
        int i28 = i27 <= 3 ? i27 : 3;
        if (i18 < 9) {
            return false;
        }
        boolean z17 = this.f148397m;
        return (z17 && i17 == i28) || (i17 == i27 && !z17);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f148391d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        int i18;
        com.tencent.mm.plugin.mall.ui.f fVar;
        android.view.View view2;
        int i19;
        boolean f17 = f(i17);
        if (this.f148398n > 9) {
            i18 = this.f148399o;
            if (i18 > 3) {
                i18 = 3;
            }
        } else {
            i18 = -1;
        }
        int i27 = f17 ? 1 : (f17 || (i19 = i17 + 1) >= ((java.util.ArrayList) this.f148391d).size()) ? false : f(i19) ? 2 : 0;
        if (view == null) {
            fVar = new com.tencent.mm.plugin.mall.ui.f(this);
            view2 = this.f148395h.inflate(com.tencent.mm.R.layout.bvs, viewGroup, false);
            fVar.f148369a = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.j9j);
            fVar.f148370b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.j9i);
            fVar.f148371c = view2.findViewById(com.tencent.mm.R.id.d0v);
            fVar.f148372d = view2.findViewById(com.tencent.mm.R.id.i2a);
            fVar.f148373e = view2.findViewById(com.tencent.mm.R.id.jay);
            fVar.f148375g = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.jaz);
            fVar.f148374f = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.jax);
            fVar.f148376h = view2.findViewById(com.tencent.mm.R.id.f485977jr3);
            fVar.f148377i = view2.findViewById(com.tencent.mm.R.id.auc);
            fVar.f148373e.setOnClickListener(new com.tencent.mm.plugin.mall.ui.c(this));
            view2.setTag(fVar);
        } else {
            fVar = (com.tencent.mm.plugin.mall.ui.f) view.getTag();
            view2 = view;
        }
        if (f17) {
            fVar.f148370b.setVisibility(8);
            android.view.View view3 = fVar.f148371c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = fVar.f148372d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = fVar.f148373e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fVar.f148374f.setImageResource(com.tencent.mm.R.raw.icons_outlined_arrow);
            android.widget.ImageView imageView = fVar.f148374f;
            android.content.Context context = this.f148394g;
            imageView.setColorFilter(context.getResources().getColor(com.tencent.mm.R.color.f479308vo), android.graphics.PorterDuff.Mode.SRC_ATOP);
            fVar.f148374f.setPivotX(r2.getWidth() / 2);
            fVar.f148374f.setPivotY(r2.getHeight() / 2);
            fVar.f148374f.setRotation(90.0f);
            fVar.f148375g.setText(context.getString(com.tencent.mm.R.string.f492471gr4));
            if (!this.f148400p || this.f148401q) {
                android.view.View view6 = fVar.f148376h;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view7 = fVar.f148376h;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (this.f148397m) {
                fVar.f148369a.setVisibility(8);
                fVar.f148375g.setText(context.getString(com.tencent.mm.R.string.f492471gr4));
            } else {
                fVar.f148369a.setVisibility(0);
                c(i17, fVar, i27);
                fVar.f148374f.setImageResource(com.tencent.mm.R.raw.icons_outlined_arrow);
                fVar.f148374f.setColorFilter(context.getResources().getColor(com.tencent.mm.R.color.f479308vo), android.graphics.PorterDuff.Mode.SRC_ATOP);
                fVar.f148374f.setPivotX(r2.getWidth() / 2);
                fVar.f148374f.setPivotY(r2.getHeight() / 2);
                fVar.f148374f.setRotation(270.0f);
                fVar.f148375g.setText(context.getString(com.tencent.mm.R.string.f492469gr2));
            }
        } else if (i18 <= 0 || !this.f148397m || i17 < i18 || i17 > this.f148399o) {
            fVar.f148369a.setVisibility(0);
            c(i17, fVar, i27);
            android.view.View view8 = fVar.f148373e;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = fVar.f148376h;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            fVar.f148369a.setVisibility(8);
            android.view.View view10 = fVar.f148373e;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view10, arrayList8.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view11 = fVar.f148376h;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view11, arrayList9.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fVar.f148370b.setVisibility(8);
            android.view.View view12 = fVar.f148371c;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view12, arrayList10.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view13 = fVar.f148372d;
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(view13, arrayList11.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i17 == getCount() - 1) {
            fVar.f148377i.setBackgroundColor(com.tencent.mm.plugin.mall.ui.n2.a());
            android.view.View view14 = fVar.f148377i;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(0);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view14, arrayList12.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view14.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view14, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view15 = fVar.f148377i;
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(8);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(view15, arrayList13.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(view15, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }
}
