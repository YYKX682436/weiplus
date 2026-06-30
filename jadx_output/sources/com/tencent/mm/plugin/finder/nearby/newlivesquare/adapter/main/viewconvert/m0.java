package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class m0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final sp2.c4 f121795e;

    /* renamed from: f, reason: collision with root package name */
    public final sp2.k f121796f;

    /* renamed from: g, reason: collision with root package name */
    public final ml2.d f121797g;

    /* renamed from: h, reason: collision with root package name */
    public tp2.f f121798h;

    /* renamed from: i, reason: collision with root package name */
    public r45.qt2 f121799i;

    public m0(sp2.c4 outsideEventListener, sp2.k outsideOperator) {
        kotlin.jvm.internal.o.g(outsideEventListener, "outsideEventListener");
        kotlin.jvm.internal.o.g(outsideOperator, "outsideOperator");
        this.f121795e = outsideEventListener;
        this.f121796f = outsideOperator;
        this.f121797g = new ml2.d();
    }

    public static final void n(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 m0Var, vp2.e eVar, int i17, androidx.recyclerview.widget.f2 f2Var, int i18, androidx.recyclerview.widget.RecyclerView recyclerView, gp2.l0 l0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x xVar) {
        java.util.List list;
        m0Var.getClass();
        eVar.f438915e.remove(i17);
        f2Var.notifyItemRemoved(i18);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.z zVar = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.z(recyclerView, l0Var);
        if (xVar != null && (list = xVar.f122019i) != null) {
            ((java.util.ArrayList) list).add(zVar);
        }
        if (recyclerView != null) {
            recyclerView.postDelayed(zVar, 100L);
        }
        if (eVar.f438915e.isEmpty()) {
            com.tencent.mars.xlog.Log.i("BigBannerListConvert", "feedDataList is empty, notify outer to remove big banner container");
            m0Var.f121796f.o(eVar, eVar.f438914d.f374125d);
        }
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c6n;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        int i19;
        vp2.e item = (vp2.e) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#onBindViewHolder holder=");
        sb6.append(holder);
        sb6.append(" position=");
        sb6.append(i17);
        sb6.append(" name=");
        r45.fa2 fa2Var = item.f438914d;
        sb6.append(fa2Var.f374127f);
        com.tencent.mars.xlog.Log.i("BigBannerListConvert", sb6.toString());
        o(holder);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x xVar = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x(this);
        xVar.f122018h = item.hashCode();
        java.lang.String str2 = fa2Var.f374128g;
        java.lang.String str3 = fa2Var.f374127f;
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.ho8);
        if (imageView != null) {
            if (str2 != null) {
                java.lang.String str4 = str2.length() > 0 ? str2 : null;
                if (str4 != null) {
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    g1Var.a().c(new mn2.n(str4, null, 2, null), imageView, g1Var.h(mn2.f1.f329965s));
                }
            }
            imageView.setVisibility(str2 == null || str2.length() == 0 ? 8 : 0);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ho6);
        if (textView != null) {
            textView.setText(str3);
            textView.setVisibility(str3 == null || str3.length() == 0 ? 8 : 0);
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.iiz);
        if (p17 != null) {
            if (str2 == null || str2.length() == 0) {
                if (str3 == null || str3.length() == 0) {
                    i19 = 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i19));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/BigBannerListConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/BigBannerListConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            i19 = 0;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/BigBannerListConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/BigBannerListConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.nearby.newlivesquare.commonview.IndicatorView indicatorView = (com.tencent.mm.plugin.finder.nearby.newlivesquare.commonview.IndicatorView) holder.p(com.tencent.mm.R.id.hcc);
        java.util.ArrayList arrayList3 = item.f438915e;
        if (indicatorView == null) {
            indicatorView = null;
        } else if (arrayList3.size() <= 1) {
            indicatorView.setVisibility(8);
        } else {
            indicatorView.setPointCount(arrayList3.size());
            indicatorView.setSelectPoint(0);
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.view.View p18 = holder.p(com.tencent.mm.R.id.m8s);
        xVar.f122012b = (com.tencent.mm.view.recyclerview.WxRecyclerView) p18;
        h0Var.f310123d = p18;
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        up2.c cVar2 = new up2.c(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BigBannerItemConvertFactory((com.tencent.mm.ui.MMActivity) context, false, false, 0, this.f121796f), arrayList3);
        cVar2.f293105o = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.b0(item, this);
        cVar2.f293104n = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.d0(item, this, h0Var, xVar);
        h0Var2.f310123d = cVar2;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = (com.tencent.mm.view.recyclerview.WxRecyclerView) h0Var.f310123d;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(cVar2);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = (com.tencent.mm.view.recyclerview.WxRecyclerView) h0Var.f310123d;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(1, 0));
        }
        if (((com.tencent.mm.view.recyclerview.WxRecyclerView) h0Var.f310123d).getItemDecorationCount() == 0 && (wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) h0Var.f310123d) != null) {
            wxRecyclerView.N(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.w(com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12), com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12)));
        }
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.e0 e0Var = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.e0(this, indicatorView);
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) h0Var.f310123d).i(e0Var);
        xVar.f122013c = e0Var;
        xVar.f122014d.b((androidx.recyclerview.widget.RecyclerView) h0Var.f310123d);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.f0 f0Var = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.f0(item, xVar, h0Var, h0Var2, this);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[AutoPlayCheck] ADD caller=");
        sb7.append(f0Var);
        sb7.append(", item.hashCode=");
        sb7.append(item.hashCode());
        sb7.append(", size before=");
        sp2.c4 c4Var = this.f121795e;
        sb7.append(((java.util.ArrayList) c4Var.f410997a).size());
        com.tencent.mars.xlog.Log.i("BigBannerListConvert", sb7.toString());
        ((java.util.ArrayList) c4Var.f410997a).add(f0Var);
        xVar.f122015e = f0Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) h0Var.f310123d;
        mn0.d0 d0Var = mn0.d0.f329714m;
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
            str = "";
        }
        gp2.l0 l0Var = new gp2.l0(context, recyclerView, arrayList3, false, 0, true, false, true, null, d0Var, 6, str, 0, false, null, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.h0(item, h0Var2, xVar, h0Var, holder, this), 28928, null);
        l0Var.G = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.i0(this);
        xVar.f122016f = l0Var;
        l0Var.e(new hp2.h(arrayList3));
        gp2.l0 l0Var2 = xVar.f122016f;
        if (l0Var2 != null) {
            l0Var2.H(item.f438916f);
        }
        gp2.l0 l0Var3 = xVar.f122016f;
        if (l0Var3 != null) {
            l0Var3.g();
        }
        xVar.f122017g = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a0(holder, xVar, this);
        android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(xVar.f122017g);
        }
        java.lang.Object element = h0Var.f310123d;
        kotlin.jvm.internal.o.f(element, "element");
        kotlinx.coroutines.l.d(xVar.f122011a, null, null, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l0(item, (com.tencent.mm.view.recyclerview.WxRecyclerView) element, this, null), 3, null);
        holder.f293124h = xVar;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "live_square_hotdot_card");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.itemView, 40, 25388);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.itemView, 40, 26236);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f121798h = new tp2.f(V6, (com.tencent.mm.ui.MMActivity) context, null, 0, this.f121796f);
        this.f121799i = V6;
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) holder.p(com.tencent.mm.R.id.m8s);
        if (wxRecyclerView != null) {
            in5.o.b(wxRecyclerView, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.j0(holder, this), com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.k0.f121751d);
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("BigBannerListConvert", "#onViewRecycled holder=" + holder);
        o(holder);
    }

    public final void o(in5.s0 s0Var) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        java.lang.Object obj = s0Var.f293124h;
        if (obj != null && (obj instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x)) {
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x xVar = (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x) obj;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = xVar.f122012b;
            if (wxRecyclerView2 != null) {
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                wxRecyclerView2.setAdapter(new up2.c(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.BigBannerItemConvertFactory((com.tencent.mm.ui.MMActivity) context, false, false, 0, this.f121796f), new java.util.ArrayList()));
            }
            kotlinx.coroutines.z0.e(xVar.f122011a, null, 1, null);
            sp2.b4 b4Var = xVar.f122015e;
            if (b4Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck] REMOVE caller=");
                sb6.append(b4Var);
                sb6.append(", item.hashCode=");
                sb6.append(xVar.f122018h);
                sb6.append(", size before=");
                sp2.c4 c4Var = this.f121795e;
                sb6.append(((java.util.ArrayList) c4Var.f410997a).size());
                com.tencent.mars.xlog.Log.i("BigBannerListConvert", sb6.toString());
                ((java.util.ArrayList) c4Var.f410997a).remove(b4Var);
            }
            androidx.recyclerview.widget.w2 w2Var = xVar.f122013c;
            if (w2Var != null && (wxRecyclerView = xVar.f122012b) != null) {
                wxRecyclerView.V0(w2Var);
            }
            xVar.f122014d.b(null);
            java.util.List<java.lang.Runnable> list = xVar.f122019i;
            for (java.lang.Runnable runnable : list) {
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = xVar.f122012b;
                if (wxRecyclerView3 != null) {
                    wxRecyclerView3.removeCallbacks(runnable);
                }
            }
            ((java.util.ArrayList) list).clear();
            gp2.l0 l0Var = xVar.f122016f;
            if (l0Var != null) {
                l0Var.o();
            }
            xVar.f122016f = null;
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = xVar.f122017g;
            if (activityLifecycleCallbacks != null) {
                android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
                android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        s0Var.f293124h = null;
    }
}
