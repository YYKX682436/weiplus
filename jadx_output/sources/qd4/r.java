package qd4;

/* loaded from: classes15.dex */
public class r extends ql5.d {

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f361890k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f361891l;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f361892m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.LayoutInflater f361893n;

    /* renamed from: o, reason: collision with root package name */
    public int f361894o;

    /* renamed from: d, reason: collision with root package name */
    public int f361883d = 4;

    /* renamed from: e, reason: collision with root package name */
    public int f361884e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f361885f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f361886g = 2;

    /* renamed from: h, reason: collision with root package name */
    public int f361887h = 3;

    /* renamed from: i, reason: collision with root package name */
    public int[] f361888i = {com.tencent.mm.R.string.jbq, com.tencent.mm.R.string.jbo, com.tencent.mm.R.string.jbj, com.tencent.mm.R.string.jba};

    /* renamed from: j, reason: collision with root package name */
    public int[] f361889j = {com.tencent.mm.R.string.jbr, com.tencent.mm.R.string.jbp, com.tencent.mm.R.string.jbk, com.tencent.mm.R.string.jbb};

    /* renamed from: p, reason: collision with root package name */
    public int f361895p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f361896q = false;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f361897r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f361898s = new java.util.ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.ArrayList f361899t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public java.util.ArrayList f361900u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public qd4.p f361901v = null;

    public r(android.content.Context context) {
        this.f361892m = context;
        this.f361893n = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // ql5.d
    public android.view.View b(int i17, int i18, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        qd4.o oVar;
        android.view.View view2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRealChildView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (view == null) {
            int i19 = this.f361894o;
            android.view.LayoutInflater layoutInflater = this.f361893n;
            view2 = i19 == 1 ? layoutInflater.inflate(com.tencent.mm.R.layout.cs_, (android.view.ViewGroup) null) : layoutInflater.inflate(com.tencent.mm.R.layout.cs9, (android.view.ViewGroup) null);
            oVar = new qd4.o(this, null);
            oVar.f361875a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n9q);
            oVar.f361876b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n9p);
            oVar.f361877c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n9o);
            oVar.f361878d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n9n);
            oVar.f361879e = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.n9h);
            android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.n9m);
            oVar.f361880f = imageView;
            imageView.setOnClickListener(new qd4.n(this));
            view2.setTag(oVar);
        } else {
            oVar = (qd4.o) view.getTag();
            view2 = view;
        }
        android.widget.ImageView imageView2 = oVar.f361880f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initMoreBtnIndicator", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        java.lang.Object tag = imageView2.getTag();
        if (tag == null || !(tag instanceof qd4.q)) {
            qd4.q qVar = new qd4.q(this);
            qVar.f361881a = i17;
            qVar.f361882b = i18;
            imageView2.setTag(qVar);
        } else {
            qd4.q qVar2 = (qd4.q) imageView2.getTag();
            qVar2.f361881a = i17;
            qVar2.f361882b = i18;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initMoreBtnIndicator", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        int size = this.f361891l.size();
        java.lang.CharSequence charSequence = "";
        android.content.Context context = this.f361892m;
        if (i18 == size) {
            oVar.f361875a.setVisibility(8);
            oVar.f361876b.setVisibility(8);
            oVar.f361879e.setVisibility(8);
            oVar.f361880f.setVisibility(8);
            oVar.f361877c.setVisibility(0);
            oVar.f361878d.setVisibility(0);
            if (i17 == this.f361887h) {
                if (this.f361900u.size() > 0) {
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(i(this.f361900u), ",");
                    oVar.f361878d.setText("√" + c17);
                    oVar.f361878d.setVisibility(0);
                    oVar.f361878d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a6e));
                } else {
                    oVar.f361878d.setText("");
                    oVar.f361878d.setVisibility(8);
                }
            } else if (i17 == this.f361886g) {
                if (this.f361899t.size() > 0) {
                    java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(i(this.f361899t), ",");
                    oVar.f361878d.setText("√" + c18);
                    oVar.f361878d.setVisibility(0);
                    oVar.f361878d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a6d));
                } else {
                    oVar.f361878d.setText("");
                    oVar.f361878d.setVisibility(8);
                }
            }
        } else {
            oVar.f361875a.setVisibility(0);
            oVar.f361876b.setVisibility(0);
            oVar.f361879e.setVisibility(0);
            oVar.f361880f.setVisibility(4);
            oVar.f361877c.setVisibility(8);
            oVar.f361878d.setVisibility(8);
            java.lang.String str = (java.lang.String) this.f361891l.get(i18);
            android.widget.TextView textView = oVar.f361875a;
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
            android.widget.TextView textView2 = oVar.f361876b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            java.util.List<java.lang.String> j17 = ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e(str));
            if (j17 == null || j17.size() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(j17.size());
                for (java.lang.String str2 : j17) {
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    ((sg3.a) v0Var).getClass();
                    arrayList.add(c01.a2.e(str2));
                }
                java.lang.String c19 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ",");
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                charSequence = com.tencent.mm.pluginsdk.ui.span.c0.i(context, c19);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            }
            textView2.setText(charSequence);
            oVar.f361880f.setImageResource(com.tencent.mm.R.raw.sns_label_more_btn);
            if (this.f361894o == 1) {
                if (i17 == this.f361886g) {
                    if (f(1, str)) {
                        oVar.f361879e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected);
                    } else {
                        oVar.f361879e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected);
                    }
                } else if (i17 == this.f361887h) {
                    if (this.f361895p != i17) {
                        oVar.f361879e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected_red);
                    } else {
                        oVar.f361879e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected_red);
                    }
                    if (f(2, str)) {
                        oVar.f361879e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected_red);
                    } else {
                        oVar.f361879e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected_red);
                    }
                }
            } else if (i17 == this.f361886g) {
                if (f(1, str)) {
                    oVar.f361879e.setImageResource(com.tencent.mm.R.raw.checkbox_selected);
                } else {
                    oVar.f361879e.setImageResource(com.tencent.mm.R.drawable.f481256oo);
                }
            } else if (i17 == this.f361887h) {
                if (f(2, str)) {
                    oVar.f361879e.setImageResource(com.tencent.mm.R.raw.checkbox_selected_red);
                } else {
                    oVar.f361879e.setImageResource(com.tencent.mm.R.drawable.f481256oo);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealChildView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return view2;
    }

    @Override // ql5.d
    public int c(int i17) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if ((!"visible".equals(this.f361890k.get(i17)) && !"invisible".equals(this.f361890k.get(i17))) || (arrayList = this.f361891l) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return 0;
        }
        int size = arrayList.size() + 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealChildrenCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return size;
    }

    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addNewTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (e() != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(e());
            if (!g(arrayList, str)) {
                if (arrayList.size() == 5) {
                    arrayList.remove(4);
                    arrayList.add(0, str);
                } else {
                    arrayList.add(0, str);
                }
                java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ",");
                gm0.j1.i();
                gm0.j1.u().c().w(335875, c17);
            }
        } else {
            gm0.j1.i();
            gm0.j1.u().c().w(335875, str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addNewTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
    }

    public final java.util.List e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(335875, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return null;
        }
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(str.split(","));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopFive", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return P1;
    }

    public final boolean f(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (i17 == 1) {
            boolean g17 = g(this.f361897r, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return g17;
        }
        boolean g18 = g(this.f361898s, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContain", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return g18;
    }

    public final boolean g(java.util.List list, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equals(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isContains", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return false;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getChild(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChild", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        java.lang.Object obj = this.f361891l.get(i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChild", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return obj;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getGroup(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroup", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroup", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        int i17 = this.f361883d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupCount", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return i17;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupId", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return 0L;
    }

    @Override // android.widget.ExpandableListAdapter
    public android.view.View getGroupView(int i17, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate;
        qd4.o oVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (view == null || !(view.getTag() instanceof qd4.o)) {
            int i18 = this.f361894o;
            android.view.LayoutInflater layoutInflater = this.f361893n;
            inflate = i18 == 1 ? layoutInflater.inflate(com.tencent.mm.R.layout.csc, (android.view.ViewGroup) null) : layoutInflater.inflate(com.tencent.mm.R.layout.csb, (android.view.ViewGroup) null);
            oVar = new qd4.o(this, null);
            oVar.f361875a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n9q);
            oVar.f361879e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.n9h);
            oVar.f361876b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.n9p);
            inflate.setTag(oVar);
        } else {
            oVar = (qd4.o) view.getTag();
            inflate = view;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealWithGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        oVar.f361875a.setText(this.f361888i[i17]);
        oVar.f361876b.setText(this.f361889j[i17]);
        int i19 = this.f361885f;
        android.content.Context context = this.f361892m;
        if (i17 == i19 || i17 == this.f361884e) {
            if (this.f361895p != i17) {
                oVar.f361879e.setImageResource(com.tencent.mm.R.raw.radio_off);
            } else {
                oVar.f361879e.setImageResource(com.tencent.mm.R.raw.radio_on);
                oVar.f361879e.setContentDescription(context.getString(com.tencent.mm.R.string.igy));
            }
        } else if (i17 == this.f361886g) {
            if (this.f361895p != i17) {
                oVar.f361879e.setImageResource(com.tencent.mm.R.raw.radio_off);
            } else {
                oVar.f361879e.setImageResource(com.tencent.mm.R.raw.radio_on);
                oVar.f361879e.setContentDescription(context.getString(com.tencent.mm.R.string.igy));
            }
        } else if (i17 == this.f361887h) {
            if (this.f361894o == 1) {
                if (this.f361895p != i17) {
                    oVar.f361879e.setImageResource(com.tencent.mm.R.raw.radio_off);
                } else {
                    oVar.f361879e.setImageResource(com.tencent.mm.R.raw.round_selector_checked_orange);
                    oVar.f361879e.setContentDescription(context.getString(com.tencent.mm.R.string.igy));
                }
            } else if (this.f361895p != i17) {
                oVar.f361879e.setImageResource(com.tencent.mm.R.raw.radio_off);
            } else {
                oVar.f361879e.setImageResource(com.tencent.mm.R.raw.radio_on_red);
                oVar.f361879e.setContentDescription(context.getString(com.tencent.mm.R.string.igy));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealWithGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (!this.f361896q || i17 != this.f361885f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return inflate;
        }
        android.view.View view2 = new android.view.View(context);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/jsapi/JsapiSnsLabelUIAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGroupView", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return view2;
    }

    public void h(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        java.util.List e17 = e();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (e17 == null || arrayList == null) {
            this.f361891l = arrayList;
        } else {
            java.util.Iterator it = ((java.util.ArrayList) e17).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (g(arrayList, str)) {
                    arrayList.remove(str);
                    arrayList2.add(str);
                }
            }
            arrayList.addAll(0, arrayList2);
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList2, ",");
            gm0.j1.i();
            gm0.j1.u().c().w(335875, c17);
            this.f361891l = arrayList;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return false;
    }

    public final java.util.List i(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return linkedList;
        }
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            return linkedList;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            gm0.j1.i();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (n17 != null && ((int) n17.E2) != 0) {
                str = n17.g2();
            }
            linkedList.add(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("usernameToDisplayName", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return linkedList;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isChildSelectable", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isChildSelectable", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        return true;
    }
}
