package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class j5 extends sp2.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.l0 f121742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ up2.o f121743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 f121744c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 f121745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121746e;

    public j5(vp2.l0 l0Var, up2.o oVar, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 a5Var, in5.s0 s0Var) {
        this.f121742a = l0Var;
        this.f121743b = oVar;
        this.f121744c = t5Var;
        this.f121745d = a5Var;
        this.f121746e = s0Var;
    }

    @Override // sp2.a4, sp2.b4
    public void a(long j17) {
        int i17 = 0;
        int i18 = -1;
        for (java.lang.Object obj : this.f121742a.f438941e) {
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
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5.o(this.f121744c, this.f121742a, i18, this.f121743b, i18 + this.f121743b.a0(), this.f121745d);
        }
    }

    @Override // sp2.a4, sp2.b4
    public boolean b(int i17) {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var = this.f121744c;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = t5Var.f121960p;
        if (wxRecyclerView != null) {
            wxRecyclerView.getGlobalVisibleRect(rect);
        }
        int height = rect.height();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = t5Var.f121960p;
        boolean z17 = height == (wxRecyclerView2 != null ? wxRecyclerView2.getHeight() : 0) && rect.top >= 0;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 a5Var = this.f121745d;
        gp2.l0 l0Var = a5Var.f121576d;
        boolean z18 = l0Var != null && l0Var.K(i17, z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startAutoPlay by caller. playOrder=");
        sb6.append(i17);
        sb6.append(" isYAxisFullyVisible=");
        sb6.append(z17);
        sb6.append(" shouldPlay=");
        sb6.append(z18);
        sb6.append(" autoFocusPlayMode=");
        gp2.l0 l0Var2 = a5Var.f121576d;
        sb6.append(l0Var2 != null ? java.lang.Integer.valueOf(l0Var2.f274262u.c()) : null);
        com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", sb6.toString());
        if (!z18) {
            h();
            return false;
        }
        gp2.l0 l0Var3 = a5Var.f121576d;
        if (l0Var3 != null) {
            l0Var3.I(true);
        }
        return true;
    }

    @Override // sp2.a4, sp2.b4
    public boolean c(so2.j5 whichContainer) {
        kotlin.jvm.internal.o.g(whichContainer, "whichContainer");
        return kotlin.jvm.internal.o.b(whichContainer, this.f121742a);
    }

    @Override // sp2.a4, sp2.b4
    public void d(int i17, long j17) {
        java.util.LinkedList linkedList;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        r45.fa2 fa2Var = this.f121742a.f438940d;
        if (fa2Var.f374125d == i17 && (linkedList = fa2Var.f374129h) != null) {
            int i18 = 0;
            for (java.lang.Object obj : linkedList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.ea2) obj).getCustom(2);
                if ((finderObject != null && finderObject.getId() == j17) && (wxRecyclerView = this.f121744c.f121960p) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(wxRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$6", "scrollToLiveIdPosition", "(IJ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    wxRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(wxRecyclerView, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$6", "scrollToLiveIdPosition", "(IJ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
                i18 = i19;
            }
        }
    }

    @Override // sp2.a4, sp2.b4
    public void e(int i17, java.util.List cards) {
        kotlin.jvm.internal.o.g(cards, "cards");
        vp2.l0 l0Var = this.f121742a;
        if (i17 != l0Var.f438940d.f374125d) {
            return;
        }
        java.util.ArrayList feeds = l0Var.f438941e;
        kotlin.jvm.internal.o.g(feeds, "feeds");
        up2.o adapter = this.f121743b;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        so2.j5 j5Var = (so2.j5) kz5.n0.k0(feeds);
        if (j5Var != null && (j5Var instanceof vp2.c0)) {
            kz5.h0.E(feeds);
            adapter.notifyItemRemoved(feeds.size());
        }
        l0Var.f438940d.f374129h.addAll(cards);
        java.util.Iterator it = cards.iterator();
        while (it.hasNext()) {
            if (sp2.z3.f411300a.b(l0Var.f438941e, (r45.ea2) it.next(), l0Var, this.f121744c.f121958n, true) && adapter != null) {
                adapter.notifyItemInserted(l0Var.f438941e.size() - 1);
            }
        }
        java.util.ArrayList feeds2 = l0Var.f438941e;
        int i18 = l0Var.f438940d.f374130i;
        kotlin.jvm.internal.o.g(feeds2, "feeds");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        if (i18 > 0 && !(!kz5.j0.I(feeds2, vp2.c0.class).isEmpty())) {
            feeds2.add(new vp2.c0());
            adapter.notifyItemInserted(feeds2.size() - 1);
        }
    }

    @Override // sp2.a4, sp2.b4
    public void f() {
        com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "stopAutoPlay by caller");
        h();
    }

    @Override // sp2.b4
    public void g() {
        gp2.l0 l0Var = this.f121745d.f121576d;
        if (l0Var != null) {
            l0Var.j();
        }
    }

    public final void h() {
        gp2.l0 l0Var = this.f121745d.f121576d;
        if (l0Var != null) {
            l0Var.I(false);
        }
        android.content.Context context = this.f121746e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((sp2.x3) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sp2.x3.class)).Y6();
    }
}
