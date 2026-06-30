package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class z3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.b4 f125993d;

    public z3(com.tencent.mm.plugin.finder.search.b4 b4Var) {
        this.f125993d = b4Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f125993d.f125638i;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f125993d.f125638i;
        kotlin.jvm.internal.o.d(list);
        return list.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.finder.search.w3 w3Var;
        android.view.View view2;
        int i18;
        int lineEnd;
        int i19;
        int i27;
        com.tencent.mm.plugin.finder.search.b4 b4Var = this.f125993d;
        if (view == null) {
            kotlin.jvm.internal.o.d(viewGroup);
            view2 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.b5e, viewGroup, false);
            w3Var = new com.tencent.mm.plugin.finder.search.w3(b4Var);
            android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.eho);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            w3Var.f125958a = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.ehn);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            w3Var.f125959b = (android.widget.TextView) findViewById2;
            android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.h0_);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            w3Var.f125960c = (android.widget.TextView) findViewById3;
            android.view.View findViewById4 = view2.findViewById(com.tencent.mm.R.id.d1y);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            w3Var.f125961d = findViewById4;
            android.view.View findViewById5 = view2.findViewById(com.tencent.mm.R.id.eif);
            kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
            w3Var.f125962e = findViewById5;
            view2.setTag(w3Var);
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderPopularListLogic.HotWordItemHolder");
            w3Var = (com.tencent.mm.plugin.finder.search.w3) tag;
            view2 = view;
        }
        java.util.List list = b4Var.f125638i;
        kotlin.jvm.internal.o.d(list);
        java.lang.String string = ((r45.lu2) list.get(i17)).getString(0);
        if (string == null) {
            string = "";
        }
        java.util.List list2 = b4Var.f125638i;
        kotlin.jvm.internal.o.d(list2);
        java.lang.String string2 = ((r45.lu2) list2.get(i17)).getString(5);
        if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            w3Var.b().setVisibility(0);
            w3Var.b().setText(string);
            android.widget.TextView textView = w3Var.f125959b;
            if (textView == null) {
                kotlin.jvm.internal.o.o("lastLineText");
                throw null;
            }
            textView.setVisibility(8);
            w3Var.a().setVisibility(8);
            i18 = 4;
        } else {
            int i28 = b4Var.f125630a;
            android.text.StaticLayout staticLayout = new android.text.StaticLayout(string, 0, string.length(), w3Var.b().getPaint(), i28, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
            if (staticLayout.getLineCount() > 0) {
                int lineCount = staticLayout.getLineCount();
                staticLayout.getLineEnd(0);
                if (lineCount > 1) {
                    i19 = staticLayout.getLineEnd(staticLayout.getLineCount() - 2);
                    lineEnd = staticLayout.getLineEnd(staticLayout.getLineCount() - 1);
                } else {
                    lineEnd = staticLayout.getLineEnd(staticLayout.getLineCount() - 1);
                    i19 = 0;
                }
                java.lang.String substring = string.substring(i19, lineEnd);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                com.tencent.mars.xlog.Log.i("Finder.FinderPopularListLogic", "lastLineText :".concat(substring));
                android.widget.TextView textView2 = w3Var.f125959b;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("lastLineText");
                    throw null;
                }
                android.text.TextPaint paint = textView2.getPaint();
                float measureText = paint != null ? paint.measureText(substring, 0, substring.length()) : 0.0f;
                android.text.TextPaint paint2 = w3Var.a().getPaint();
                float measureText2 = paint2 != null ? paint2.measureText(string2) : 0.0f;
                com.tencent.mars.xlog.Log.i("Finder.FinderPopularListLogic", "推荐原因不在同一行");
                w3Var.a().setVisibility(0);
                if (measureText + measureText2 + b4Var.f125631b > i28) {
                    w3Var.b().setVisibility(0);
                    w3Var.b().setText(string);
                    android.widget.TextView textView3 = w3Var.f125959b;
                    if (textView3 == null) {
                        kotlin.jvm.internal.o.o("lastLineText");
                        throw null;
                    }
                    textView3.setText("");
                    i18 = 4;
                    textView3.setVisibility(4);
                    android.view.View view3 = w3Var.f125962e;
                    if (view3 == null) {
                        kotlin.jvm.internal.o.o("lastLineDivider");
                        throw null;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "setHotWord", "(Lcom/tencent/mm/plugin/finder/search/FinderPopularListLogic$HotWordItemHolder;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "setHotWord", "(Lcom/tencent/mm/plugin/finder/search/FinderPopularListLogic$HotWordItemHolder;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    w3Var.a().setText(string2);
                } else {
                    i18 = 4;
                    com.tencent.mars.xlog.Log.i("Finder.FinderPopularListLogic", "推荐原因在同一行");
                    if (lineCount == 1) {
                        w3Var.b().setVisibility(8);
                        i27 = 0;
                    } else {
                        i27 = 0;
                        w3Var.b().setVisibility(0);
                        android.widget.TextView b17 = w3Var.b();
                        java.lang.String substring2 = string.substring(0, i19);
                        kotlin.jvm.internal.o.f(substring2, "substring(...)");
                        b17.setText(substring2);
                    }
                    android.widget.TextView textView4 = w3Var.f125959b;
                    if (textView4 == null) {
                        kotlin.jvm.internal.o.o("lastLineText");
                        throw null;
                    }
                    textView4.setVisibility(i27);
                    textView4.setText(substring);
                    android.view.View view4 = w3Var.f125962e;
                    if (view4 == null) {
                        kotlin.jvm.internal.o.o("lastLineDivider");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "setHotWord", "(Lcom/tencent/mm/plugin/finder/search/FinderPopularListLogic$HotWordItemHolder;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "setHotWord", "(Lcom/tencent/mm/plugin/finder/search/FinderPopularListLogic$HotWordItemHolder;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    w3Var.a().setText(string2);
                }
            } else {
                i18 = 4;
            }
        }
        if (i17 == getCount() - 1) {
            android.view.View view5 = w3Var.f125961d;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("dividerView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view6 = w3Var.f125961d;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("dividerView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int count = getCount();
        com.tencent.mm.ui.MMActivity mMActivity = b4Var.f125633d;
        if (count == 1) {
            if (i17 == 0) {
                view2.setBackground(mMActivity.getResources().getDrawable(com.tencent.mm.R.drawable.auk));
            }
        } else if (getCount() > 1) {
            if (i17 == 0) {
                view2.setBackground(mMActivity.getResources().getDrawable(com.tencent.mm.R.drawable.aum));
            } else if (i17 == getCount() - 1) {
                view2.setBackground(mMActivity.getResources().getDrawable(com.tencent.mm.R.drawable.aul));
            } else {
                view2.setBackgroundColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.aaw));
            }
        }
        return view2;
    }
}
