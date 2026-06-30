package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class f0 extends sp2.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.e f121658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x f121659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f121660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f121661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 f121662e;

    public f0(vp2.e eVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x xVar, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0 m0Var) {
        this.f121658a = eVar;
        this.f121659b = xVar;
        this.f121660c = h0Var;
        this.f121661d = h0Var2;
        this.f121662e = m0Var;
    }

    @Override // sp2.a4, sp2.b4
    public void a(long j17) {
        int i17 = 0;
        int i18 = -1;
        for (java.lang.Object obj : this.f121658a.f438915e) {
            int i19 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) obj;
            if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getFeedObject().getId() == j17) {
                i18 = i17;
            }
            i17 = i19;
        }
        if (i18 != -1) {
            kotlin.jvm.internal.h0 h0Var = this.f121661d;
            int a07 = ((up2.c) h0Var.f310123d).a0();
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) this.f121660c.f310123d;
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x xVar = this.f121659b;
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m0.n(this.f121662e, this.f121658a, i18, (androidx.recyclerview.widget.f2) h0Var.f310123d, i18 + a07, recyclerView, xVar.f122016f, xVar);
        }
    }

    @Override // sp2.a4, sp2.b4
    public boolean b(int i17) {
        android.graphics.Rect rect = new android.graphics.Rect();
        kotlin.jvm.internal.h0 h0Var = this.f121660c;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) h0Var.f310123d;
        if (wxRecyclerView != null) {
            wxRecyclerView.getGlobalVisibleRect(rect);
        }
        int height = rect.height();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = (com.tencent.mm.view.recyclerview.WxRecyclerView) h0Var.f310123d;
        boolean z17 = height == (wxRecyclerView2 != null ? wxRecyclerView2.getHeight() : 0) && rect.top >= 0;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.x xVar = this.f121659b;
        gp2.l0 l0Var = xVar.f122016f;
        boolean z18 = l0Var != null && l0Var.K(i17, z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startAutoPlay by caller. playOrder=");
        sb6.append(i17);
        sb6.append(" isYAxisFullyVisible=");
        sb6.append(z17);
        sb6.append(" shouldPlay=");
        sb6.append(z18);
        sb6.append(" autoFocusPlayMode=");
        gp2.l0 l0Var2 = xVar.f122016f;
        sb6.append(l0Var2 != null ? java.lang.Integer.valueOf(l0Var2.f274262u.c()) : null);
        com.tencent.mars.xlog.Log.i("BigBannerListConvert", sb6.toString());
        if (z18) {
            gp2.l0 l0Var3 = xVar.f122016f;
            if (l0Var3 != null) {
                l0Var3.I(true);
            }
            return true;
        }
        gp2.l0 l0Var4 = xVar.f122016f;
        if (l0Var4 != null) {
            l0Var4.I(false);
        }
        return false;
    }

    @Override // sp2.a4, sp2.b4
    public boolean c(so2.j5 whichContainer) {
        kotlin.jvm.internal.o.g(whichContainer, "whichContainer");
        return kotlin.jvm.internal.o.b(whichContainer, this.f121658a);
    }

    @Override // sp2.a4, sp2.b4
    public void d(int i17, long j17) {
        java.util.LinkedList linkedList;
        r45.fa2 fa2Var = this.f121658a.f438914d;
        if (fa2Var.f374125d == i17 && (linkedList = fa2Var.f374129h) != null) {
            int i18 = 0;
            for (java.lang.Object obj : linkedList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.ea2) obj).getCustom(2);
                if (finderObject != null && finderObject.getId() == j17) {
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) this.f121660c.f310123d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$onBindViewHolder$6", "scrollToLiveIdPosition", "(IJ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    wxRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/BigBannerListConvert$onBindViewHolder$6", "scrollToLiveIdPosition", "(IJ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
                i18 = i19;
            }
        }
    }

    @Override // sp2.a4, sp2.b4
    public void f() {
        com.tencent.mars.xlog.Log.i("BigBannerListConvert", "stopAutoPlay by caller.");
        gp2.l0 l0Var = this.f121659b.f122016f;
        if (l0Var == null) {
            return;
        }
        l0Var.I(false);
    }

    @Override // sp2.b4
    public void g() {
        gp2.l0 l0Var = this.f121659b.f122016f;
        if (l0Var != null) {
            l0Var.j();
        }
    }
}
