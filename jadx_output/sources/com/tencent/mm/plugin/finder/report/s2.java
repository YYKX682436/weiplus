package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class s2 extends fc2.o {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f125342r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f125343s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f125344t;

    public s2(fc2.c cVar) {
        super(cVar);
        this.f125342r = "Finder.FinderProfileAllFlowEventSubscriber";
        new android.graphics.Rect();
        this.f125343s = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.y0().r()).intValue() == 1;
    }

    @Override // fc2.o
    public fc2.a c(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        jz5.l lVar;
        int w17;
        int y17;
        int i18;
        int i19;
        int i27;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        fc2.y yVar = (fc2.y) h(i17);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
            androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
            java.lang.Integer j07 = kz5.z.j0(staggeredGridLayoutManager.u(null));
            w17 = j07 != null ? j07.intValue() : 0;
            java.lang.Integer h07 = kz5.z.h0(staggeredGridLayoutManager.v(null));
            y17 = h07 != null ? h07.intValue() : 0;
        } else {
            if (!(layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
                lVar = new jz5.l(-1, -1);
                int intValue = ((java.lang.Number) lVar.f302833d).intValue();
                int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
                yVar.f261009g = intValue;
                yVar.f261010h = intValue2;
                yVar.f261012j = i(intValue, intValue2, recyclerView);
                i18 = this.f260960e;
                i19 = yVar.f261009g;
                if (i18 == i19 || this.f260961f != yVar.f261010h) {
                    if (i18 != Integer.MAX_VALUE || (i27 = this.f260961f) == Integer.MAX_VALUE) {
                        i27 = yVar.f261010h;
                    } else {
                        if (i19 < i18) {
                            i18 = i19;
                        }
                        int i28 = yVar.f261010h;
                        if (i28 > i27) {
                            i27 = i28;
                        }
                        i19 = i18;
                    }
                    yVar.f261011i = i(i19, i27, recyclerView);
                }
                this.f260960e = yVar.f261009g;
                this.f260961f = yVar.f261010h;
                return yVar;
            }
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            w17 = linearLayoutManager.w();
            y17 = linearLayoutManager.y();
        }
        boolean z17 = this.f125343s;
        int j17 = hc2.f1.j(recyclerView, z17, w17, 1);
        int j18 = hc2.f1.j(recyclerView, z17, y17, -1);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (w17 <= y17) {
            int i29 = w17;
            while (true) {
                android.view.View childAt = layoutManager.getChildAt(i29);
                if (childAt != null) {
                    if (!(childAt.isShown() && childAt.getAlpha() > 0.0f && childAt.getGlobalVisibleRect(rect))) {
                        if (i29 == w17) {
                            j17++;
                        } else {
                            j18--;
                        }
                    }
                }
                if (i29 == y17) {
                    break;
                }
                i29++;
            }
        }
        lVar = new jz5.l(java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(j18));
        int intValue3 = ((java.lang.Number) lVar.f302833d).intValue();
        int intValue22 = ((java.lang.Number) lVar.f302834e).intValue();
        yVar.f261009g = intValue3;
        yVar.f261010h = intValue22;
        yVar.f261012j = i(intValue3, intValue22, recyclerView);
        i18 = this.f260960e;
        i19 = yVar.f261009g;
        if (i18 == i19) {
        }
        if (i18 != Integer.MAX_VALUE) {
        }
        i27 = yVar.f261010h;
        yVar.f261011i = i(i19, i27, recyclerView);
        this.f260960e = yVar.f261009g;
        this.f260961f = yVar.f261010h;
        return yVar;
    }

    @Override // fc2.o
    public void e() {
        com.tencent.mars.xlog.Log.i(this.f125342r, "onInvisible visible=" + this.f125344t);
        if (this.f125344t) {
            super.e();
        }
        this.f125344t = false;
    }

    @Override // fc2.o
    public void f() {
        com.tencent.mars.xlog.Log.i(this.f125342r, "onVisible visible=" + this.f125344t);
        if (!this.f125344t) {
            super.f();
        }
        this.f125344t = true;
    }

    public fc2.a h(int i17) {
        return new fc2.y(i17);
    }

    public final java.util.List i(int i17, int i18, androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (i17 < 0 || i18 < 0 || i17 > i18) {
            return kz5.n0.V0(linkedList);
        }
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter;
            java.util.List data = wxRecyclerAdapter.getData();
            if (i17 <= i18) {
                int i19 = 0;
                while (true) {
                    int a07 = i17 - wxRecyclerAdapter.a0();
                    if (a07 >= 0 && a07 < data.size()) {
                        in5.c cVar = (in5.c) data.get(a07);
                        if (cVar.getItemId() != 0 && (cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
                            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar;
                            if (baseFinderFeed.getFeedObject().getProfileTabScene() == 3 || baseFinderFeed.getFeedObject().getProfileTabScene() == 12 || baseFinderFeed.getFeedObject().getProfileTabScene() == 5) {
                                fc2.r rVar = new fc2.r((so2.j5) cVar, i19, null, 4, null);
                                in5.v0 v0Var = (in5.v0) wxRecyclerAdapter.f213721z.get(cVar.getItemId());
                                if (v0Var != null) {
                                    rVar.f260979c = v0Var;
                                }
                                linkedList.add(rVar);
                                i19++;
                            }
                        }
                    }
                    if (i17 == i18) {
                        break;
                    }
                    i17++;
                }
            }
        }
        return kz5.n0.V0(linkedList);
    }
}
