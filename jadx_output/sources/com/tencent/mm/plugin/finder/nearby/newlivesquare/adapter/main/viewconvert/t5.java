package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class t5 extends in5.r implements bq2.a, zp2.a {

    /* renamed from: e, reason: collision with root package name */
    public final sp2.c4 f121952e;

    /* renamed from: f, reason: collision with root package name */
    public final sp2.k f121953f;

    /* renamed from: g, reason: collision with root package name */
    public final float f121954g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.qt2 f121955h;

    /* renamed from: i, reason: collision with root package name */
    public final int f121956i;

    /* renamed from: m, reason: collision with root package name */
    public final ml2.d f121957m;

    /* renamed from: n, reason: collision with root package name */
    public r45.qt2 f121958n;

    /* renamed from: o, reason: collision with root package name */
    public tp2.f f121959o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f121960p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f121961q;

    /* renamed from: r, reason: collision with root package name */
    public int f121962r;

    /* renamed from: s, reason: collision with root package name */
    public float f121963s;

    public t5(sp2.c4 outsideEventListener, sp2.k outsideOperator, float f17, r45.qt2 contextObj, int i17) {
        kotlin.jvm.internal.o.g(outsideEventListener, "outsideEventListener");
        kotlin.jvm.internal.o.g(outsideOperator, "outsideOperator");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f121952e = outsideEventListener;
        this.f121953f = outsideOperator;
        this.f121954g = f17;
        this.f121955h = contextObj;
        this.f121956i = i17;
        this.f121957m = new ml2.d();
        this.f121962r = 3;
        this.f121963s = 0.5f;
    }

    public static final void n(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var, in5.s0 s0Var, int i17) {
        t5Var.getClass();
        android.content.Context context = s0Var.f293121e;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            pf5.z zVar = pf5.z.f353948a;
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            androidx.lifecycle.c1 a17 = zVar.a(mMActivity).a(rq2.w.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            rq2.w wVar = (rq2.w) a17;
            com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "foldElementReport type: " + i17);
            if (i17 == 0) {
                wVar.P6("", V6.getString(1), "focus_area_fold_button", null);
            } else {
                if (i17 != 1) {
                    return;
                }
                wVar.Q6(V6.getString(1), "focus_area_fold_button", null);
            }
        }
    }

    public static final void o(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var, vp2.l0 l0Var, int i17, androidx.recyclerview.widget.f2 f2Var, int i18, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 a5Var) {
        t5Var.getClass();
        l0Var.f438941e.remove(i17);
        f2Var.notifyItemRemoved(i18);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.c5 c5Var = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.c5(t5Var, a5Var.f121576d);
        java.util.List list = a5Var.f121580h;
        if (list != null) {
            ((java.util.ArrayList) list).add(c5Var);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = t5Var.f121960p;
        if (wxRecyclerView != null) {
            wxRecyclerView.postDelayed(c5Var, 100L);
        }
        if (l0Var.f438941e.isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "feedDataList is empty, check if need to load more");
            if (a5Var.f121579g) {
                com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "isLoadingMore=true, skip load more and container removal");
                return;
            }
            r45.fa2 fa2Var = l0Var.f438940d;
            if (!(fa2Var.f374130i > 0)) {
                com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "feedDataList is empty and no more data, notify outer to remove special column container");
                t5Var.f121953f.o(l0Var, fa2Var.f374125d);
            } else {
                com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "hasMoreData=true, loading more data for container " + fa2Var.f374125d);
                t5Var.r(l0Var, a5Var);
            }
        }
    }

    public static /* synthetic */ void u(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var, android.widget.TextView textView, android.view.View view, vp2.l0 l0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performExpand");
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        t5Var.t(textView, view, l0Var, z17);
    }

    @Override // bq2.a
    public java.util.ArrayList a(java.util.ArrayList collectScene) {
        kotlin.jvm.internal.o.g(collectScene, "collectScene");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f121960p;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f121961q;
        return (wxRecyclerView == null || wxRecyclerAdapter == null) ? new java.util.ArrayList() : sp2.n3.f411116a.c(wxRecyclerView, wxRecyclerAdapter, collectScene);
    }

    @Override // zp2.a
    public androidx.recyclerview.widget.RecyclerView b() {
        return this.f121960p;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c6z;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038d  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r37, in5.c r38, int r39, int r40, boolean r41, java.util.List r42) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        q(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) {
            ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = true;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) holder.p(com.tencent.mm.R.id.m96);
        if (wxRecyclerView != null) {
            in5.o.b(wxRecyclerView, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.r5(holder, this), new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.s5(this));
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "#onViewRecycled holder=" + holder);
        p(holder);
    }

    public final void p(in5.s0 s0Var) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        java.lang.Object obj = s0Var.f293124h;
        if (obj != null && (obj instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5)) {
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 a5Var = (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5) obj;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = a5Var.f121573a;
            if (wxRecyclerView2 != null) {
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                wxRecyclerView2.setAdapter(new up2.o(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.SpecialColumnItemConvertFactory((com.tencent.mm.ui.MMActivity) context, false, false, 0, this.f121953f, this.f121955h, this.f121956i, 0.0f, 128, null), new java.util.ArrayList()));
            }
            sp2.b4 b4Var = a5Var.f121574b;
            if (b4Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck] REMOVE caller=");
                sb6.append(b4Var);
                sb6.append(", item.hashCode=");
                sb6.append(a5Var.f121578f);
                sb6.append(", size before=");
                sp2.c4 c4Var = this.f121952e;
                sb6.append(((java.util.ArrayList) c4Var.f410997a).size());
                com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", sb6.toString());
                ((java.util.ArrayList) c4Var.f410997a).remove(b4Var);
            }
            androidx.recyclerview.widget.w2 w2Var = a5Var.f121575c;
            if (w2Var != null && (wxRecyclerView = a5Var.f121573a) != null) {
                wxRecyclerView.V0(w2Var);
            }
            java.util.List<java.lang.Runnable> list = a5Var.f121580h;
            for (java.lang.Runnable runnable : list) {
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = a5Var.f121573a;
                if (wxRecyclerView3 != null) {
                    wxRecyclerView3.removeCallbacks(runnable);
                }
            }
            ((java.util.ArrayList) list).clear();
            gp2.l0 l0Var = a5Var.f121576d;
            if (l0Var != null) {
                l0Var.o();
            }
            a5Var.f121576d = null;
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = a5Var.f121577e;
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

    public final void q(in5.s0 s0Var) {
        if (this.f121958n == null || this.f121959o == null) {
            com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "reportContext:" + this.f121958n + ", nearbyLiveViewItemClick:" + this.f121959o);
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f121959o = new tp2.f(V6, (com.tencent.mm.ui.MMActivity) context2, null, 0, this.f121953f);
            this.f121958n = V6;
        }
    }

    public final void r(vp2.l0 l0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 a5Var) {
        boolean z17 = l0Var.f438940d.f374130i > 0;
        r45.fa2 fa2Var = l0Var.f438940d;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "loadMoreDataIfNeeded skip as no more data (continue_flag=" + fa2Var.f374130i + ')');
            return;
        }
        if (a5Var.f121579g) {
            com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "loadMoreDataIfNeeded skip as isLoadingMore");
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "loadMoreDataIfNeeded: ready to load for container " + fa2Var.f374125d);
        a5Var.f121579g = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        rq2.o.f398847a.d(6, true);
        this.f121953f.h(fa2Var.f374125d, fa2Var.f374132n, fa2Var.f374138t, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.f5(a5Var, currentTimeMillis));
    }

    public final void s(in5.s0 s0Var, int i17, boolean z17) {
        android.content.Context context = s0Var.f293121e;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null) {
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(mMActivity).a(rq2.w.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            rq2.w wVar = (rq2.w) a17;
            cl0.g gVar = new cl0.g();
            gVar.s("column_id", java.lang.Integer.valueOf(i17));
            com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "moreIconReport columnId: " + i17 + " isExpose: " + z17);
            if (z17) {
                java.lang.String string = V6.getString(1);
                java.lang.String gVar2 = gVar.toString();
                kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                wVar.P6("", string, "main_page_column_right_more", r26.i0.t(gVar2, ",", ";", false));
                return;
            }
            java.lang.String string2 = V6.getString(1);
            java.lang.String gVar3 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar3, "toString(...)");
            wVar.Q6(string2, "main_page_column_right_more", r26.i0.t(gVar3, ",", ";", false));
        }
    }

    public final void t(android.widget.TextView textView, android.view.View view, vp2.l0 l0Var, boolean z17) {
        yz5.l lVar = l0Var.f438942f;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z17));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f121960p;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert", "performExpand", "(Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/SpecialColumnListConvertData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert", "performExpand", "(Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/SpecialColumnListConvertData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setText(l0Var.f438940d.f374127f);
    }
}
