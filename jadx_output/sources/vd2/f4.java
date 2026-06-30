package vd2;

/* loaded from: classes3.dex */
public final class f4 implements gc2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView f435731b;

    public f4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView finderLiveRecyclerView) {
        this.f435730a = finderLiveViewCallback;
        this.f435731b = finderLiveRecyclerView;
    }

    @Override // gc2.c
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435730a;
        if (finderLiveViewCallback.L) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "selectItemView onPageSelected position:" + i17);
        com.tencent.mm.plugin.finder.report.q1.e(com.tencent.mm.plugin.finder.report.q1.f125255a, false, finderLiveViewCallback.E, 1, null);
        mn0.i0.H.b("LiveOnPageSelected", android.os.SystemClock.elapsedRealtime());
        finderLiveViewCallback.G = false;
        finderLiveViewCallback.E = false;
    }

    @Override // gc2.c
    public void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        km2.m E;
        int i18;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435730a;
        if (finderLiveViewCallback.L) {
            return;
        }
        if (finderLiveViewCallback.f111484f.isFinishing() || finderLiveViewCallback.f111498w) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "onPageScrollStateChanged return with activity finish");
            pm0.z.b(xy2.b.f458155b, "onPageScrollStateChangedWhenActivityFinish", false, null, null, false, false, null, 124, null);
            return;
        }
        if (i17 == 1) {
            finderLiveViewCallback.f111481J = true;
            ae2.in inVar = ae2.in.f3688a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3937z4).getValue()).r()).intValue() == 1) {
                com.tencent.mm.plugin.finder.report.q1.f125262h = false;
                com.tencent.mm.plugin.finder.report.p1 p1Var = com.tencent.mm.plugin.finder.report.q1.f125258d;
                if (p1Var != null) {
                    p1Var.f125236g = android.os.SystemClock.elapsedRealtime();
                }
                com.tencent.mm.plugin.finder.report.q1.f125257c = 2L;
            }
        }
        if (i17 == 0) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3937z4).getValue()).r()).intValue() == 1) {
                com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager = finderLiveViewCallback.f111493r;
                int w17 = finderLiveLayoutManager != null ? finderLiveLayoutManager.w() : -1;
                com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager2 = finderLiveViewCallback.f111493r;
                int y17 = finderLiveLayoutManager2 != null ? finderLiveLayoutManager2.y() : -1;
                if (finderLiveViewCallback.G) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "firstVisiblePos:" + w17 + " lastVisiblePos:" + y17 + " lastPlayPos: " + finderLiveViewCallback.F);
                    if (w17 == y17 && w17 != (i18 = finderLiveViewCallback.F)) {
                        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.s(finderLiveViewCallback, i18);
                    }
                }
                if (w17 == y17) {
                    androidx.recyclerview.widget.f2 adapter = finderLiveViewCallback.f111492q.getAdapter();
                    if ((adapter instanceof vd2.s1) && (E = ((vd2.s1) adapter).E(w17)) != null) {
                        co0.a aVar = co0.b.f43709e2;
                        long j17 = E.f309129d.f68537e;
                        java.util.Set<java.util.Map.Entry> entrySet = co0.b.f43710f2.entrySet();
                        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
                        int i19 = 0;
                        for (java.util.Map.Entry entry : entrySet) {
                            if (((co0.b) entry.getValue()).R1.h()) {
                                i19++;
                                java.lang.Long l17 = (java.lang.Long) entry.getKey();
                                if (l17 == null || l17.longValue() != j17) {
                                    ((co0.b) entry.getValue()).T0(false);
                                }
                            }
                        }
                        if (i19 > 1) {
                            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "playingCount more thran one playingCount:" + i19 + " liveId:" + E.f309129d.f68537e);
                            pm0.z.b(xy2.b.f458155b, "LivePlayingCountMoreThanOne", false, null, null, false, false, new vd2.r4(i19, E), 60, null);
                        }
                    }
                }
            }
        }
    }

    @Override // gc2.c
    public void c(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, float f17, int i18) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435730a;
        if (finderLiveViewCallback.L) {
            return;
        }
        if (finderLiveViewCallback.f111484f.isFinishing() || finderLiveViewCallback.f111498w) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "ViewCallback onPageScrolled return with activity finish");
            return;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager = finderLiveViewCallback.f111493r;
        if (finderLiveLayoutManager != null) {
            int w17 = finderLiveLayoutManager.w();
            int y17 = finderLiveLayoutManager.y();
            zl2.r4 r4Var = zl2.r4.f473950a;
            boolean z17 = true;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3937z4).getValue()).r()).intValue() == 1) {
                if (com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.N != 0 && !finderLiveViewCallback.f111481J) {
                    z17 = false;
                }
                if (z17) {
                    if (w17 != y17) {
                        int i19 = finderLiveViewCallback.H;
                        if (w17 < i19) {
                            int i27 = finderLiveViewCallback.I;
                            if (y17 < i27) {
                                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.s(finderLiveViewCallback, i27);
                            }
                            finderLiveViewCallback.F = w17;
                            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.l(finderLiveViewCallback, w17);
                            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.o(finderLiveViewCallback, finderLiveViewCallback.F);
                        } else if (y17 > finderLiveViewCallback.I) {
                            if (w17 > i19) {
                                com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.s(finderLiveViewCallback, i19);
                            }
                            finderLiveViewCallback.F = y17;
                            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.l(finderLiveViewCallback, y17);
                            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.o(finderLiveViewCallback, finderLiveViewCallback.F);
                        }
                    } else if (finderLiveViewCallback.H == -1 && w17 == 0) {
                        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.o(finderLiveViewCallback, 0);
                    }
                }
            }
            if (w17 != y17 && (w17 < finderLiveViewCallback.H || y17 > finderLiveViewCallback.I)) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "notifyNewItemScroll firstVisiblePos:" + w17 + ",lastVisiblePos:" + y17);
                android.content.Context context = finderLiveViewCallback.f111483e.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (!((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f) {
                    float dimensionPixelOffset = this.f435731b.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
                    com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager2 = finderLiveViewCallback.f111493r;
                    android.view.View findViewByPosition = finderLiveLayoutManager2 != null ? finderLiveLayoutManager2.findViewByPosition(w17) : null;
                    com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout = findViewByPosition instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) findViewByPosition : null;
                    if (roundCornerRelativeLayout != null) {
                        roundCornerRelativeLayout.c(0.0f, 0.0f, dimensionPixelOffset, dimensionPixelOffset);
                    }
                    com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager3 = finderLiveViewCallback.f111493r;
                    android.view.KeyEvent.Callback findViewByPosition2 = finderLiveLayoutManager3 != null ? finderLiveLayoutManager3.findViewByPosition(y17) : null;
                    com.tencent.mm.ui.widget.RoundCornerRelativeLayout roundCornerRelativeLayout2 = findViewByPosition2 instanceof com.tencent.mm.ui.widget.RoundCornerRelativeLayout ? (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) findViewByPosition2 : null;
                    if (roundCornerRelativeLayout2 != null) {
                        roundCornerRelativeLayout2.c(dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f);
                    }
                }
            }
            finderLiveViewCallback.H = w17;
            finderLiveViewCallback.I = y17;
        }
    }
}
