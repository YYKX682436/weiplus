package lv4;

/* loaded from: classes12.dex */
public final class m implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final kv4.m f321526a;

    /* renamed from: b, reason: collision with root package name */
    public final mv4.e f321527b;

    /* renamed from: c, reason: collision with root package name */
    public final jv4.m f321528c;

    public m(kv4.m delegate, mv4.e data) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        kotlin.jvm.internal.o.g(data, "data");
        this.f321526a = delegate;
        this.f321527b = data;
        this.f321528c = jv4.m.f302246i;
    }

    @Override // jv4.n
    public void c(androidx.recyclerview.widget.k3 holder) {
        android.content.res.Resources resources;
        int i17;
        kotlin.jvm.internal.o.g(holder, "holder");
        lv4.n nVar = holder instanceof lv4.n ? (lv4.n) holder : null;
        if (nVar == null) {
            return;
        }
        qv4.z zVar = (qv4.z) nVar;
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) zVar.f367030e).getValue();
        mv4.e eVar = this.f321527b;
        if (textView != null) {
            textView.setText(((rv4.h) eVar).f400477f);
        }
        rv4.h hVar = (rv4.h) eVar;
        hVar.f400476e = hVar.f400475d;
        android.view.View view = ((qv4.z) ((lv4.n) holder)).f367029d;
        if (view != null) {
            view.getMeasuredHeight();
        }
        eVar.getClass();
        if (view != null) {
            com.tencent.mm.ui.kk.f(view, ((rv4.h) eVar).f400476e);
        }
        rv4.h hVar2 = (rv4.h) eVar;
        boolean z17 = hVar2.f400482k;
        jz5.g gVar = zVar.f367032g;
        jz5.g gVar2 = zVar.f367033h;
        if (z17) {
            if (hVar2.f400483l) {
                android.view.View i18 = nVar.i();
                if (i18 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(i18, arrayList.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(i18, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view3 = (android.view.View) ((jz5.n) gVar2).getValue();
                if (view3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View i19 = nVar.i();
                if (i19 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(i19, arrayList4.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i19.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(i19, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.view.View j17 = nVar.j();
            if (j17 == null) {
                return;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(j17, arrayList5.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j17.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(j17, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (hVar2.f400483l) {
            android.view.View i27 = nVar.i();
            if (i27 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(i27, arrayList6.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i27.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(i27, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = (android.view.View) ((jz5.n) gVar).getValue();
            if (view4 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = (android.view.View) ((jz5.n) gVar2).getValue();
            if (view5 != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view5, arrayList8.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View j18 = nVar.j();
            if (j18 != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(j18, arrayList9.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j18.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(j18, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view6 = (android.view.View) ((jz5.n) zVar.f367034i).getValue();
            if (view6 != null) {
                view6.setOnClickListener(new lv4.d(this));
            }
            android.view.View view7 = (android.view.View) ((jz5.n) gVar2).getValue();
            if (view7 != null) {
                view7.setOnClickListener(new lv4.g(this));
            }
            android.view.View view8 = (android.view.View) ((jz5.n) zVar.f367031f).getValue();
            if (view8 != null) {
                view8.setOnClickListener(new lv4.j(this));
                return;
            }
            return;
        }
        android.view.View i28 = nVar.i();
        if (i28 != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(i28, arrayList10.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i28.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(i28, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View j19 = nVar.j();
        if (j19 != null) {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal11 = zj0.c.f473285a;
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(j19, arrayList11.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j19.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(j19, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view9 = (android.view.View) ((jz5.n) zVar.f367039q).getValue();
        if (view9 != null) {
            view9.setOnClickListener(new lv4.k(this));
        }
        int i29 = ((java.util.ArrayList) hVar2.f400478g).size() > hVar2.f400480i ? 0 : 8;
        jz5.g gVar3 = zVar.f367035m;
        android.view.View view10 = (android.view.View) ((jz5.n) gVar3).getValue();
        if (view10 != null) {
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal12 = zj0.c.f473285a;
            arrayList12.add(java.lang.Integer.valueOf(i29));
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view10, arrayList12.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view11 = (android.view.View) ((jz5.n) zVar.f367038p).getValue();
        if (view11 != null) {
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal13 = zj0.c.f473285a;
            arrayList13.add(java.lang.Integer.valueOf(i29));
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(view11, arrayList13.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view12 = (android.view.View) ((jz5.n) gVar3).getValue();
        if (view12 != null) {
            view12.setOnClickListener(new lv4.l(this));
        }
        android.view.View view13 = (android.view.View) ((jz5.n) zVar.f367036n).getValue();
        if (view13 != null) {
            view13.setRotation(hVar2.f400484m ? 180.0f : 0.0f);
        }
        android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) zVar.f367037o).getValue();
        if (textView2 != null) {
            if (hVar2.f400484m) {
                resources = textView2.getResources();
                i17 = com.tencent.mm.R.string.o4q;
            } else {
                resources = textView2.getResources();
                i17 = com.tencent.mm.R.string.o3s;
            }
            textView2.setText(resources.getString(i17));
        }
    }

    @Override // jv4.n
    public jv4.m getType() {
        return this.f321528c;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return ((rv4.h) this.f321527b).v();
    }

    @Override // nv4.g
    public void w() {
        ((rv4.h) this.f321527b).w();
    }
}
