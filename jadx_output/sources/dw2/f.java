package dw2;

/* loaded from: classes2.dex */
public final class f implements gc2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dw2.o f244119a;

    public f(dw2.o oVar) {
        this.f244119a = oVar;
    }

    @Override // gc2.c
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        dw2.o oVar = this.f244119a;
        com.tencent.mars.xlog.Log.i(oVar.f244136a, "handleOnPageSelected position:" + i17);
        kz2.c cVar = oVar.f244145j;
        cVar.a("handleOnPageSelected begin");
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
        java.util.List data = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).getData();
        com.tencent.mm.plugin.finder.assist.p0 j17 = oVar.j(i17, null);
        if (j17 == null) {
            com.tencent.mars.xlog.Log.w(oVar.f244136a, "handleOnPageSelected return for valid feed.");
            return;
        }
        if (j17.f102443f == 9) {
            mn0.i0.H.b("FinderFeedSelector", android.os.SystemClock.elapsedRealtime());
        }
        ae2.b2 b2Var = ae2.b2.f3461a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.W).getValue()).r()).intValue() == 0 && j17.f102443f == 9) {
            com.tencent.mars.xlog.Log.w(oVar.f244136a, "handleOnPageSelected return for valid feed type:" + j17.f102443f + '.');
            return;
        }
        if (oVar.m(j17, "handleOnPageSelected")) {
            com.tencent.mm.plugin.finder.storage.FeedData feedData = j17.f102442e;
            if (!(feedData != null && feedData.getMediaType() == 15)) {
                oVar.n(recyclerView, j17.f102439b);
            }
            android.content.Context context = recyclerView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).Z6(oVar.f244139d);
            if (Z6 != null) {
                fc2.v vVar = new fc2.v(1);
                vVar.f260998e = i17;
                vVar.f260999f = j17.f102439b;
                recyclerView.post(new dw2.m(Z6, vVar));
            }
        }
        oVar.g(j17);
        com.tencent.mm.plugin.finder.assist.p0 p0Var = oVar.f244142g;
        long j18 = p0Var.f102439b;
        if (j18 > 0 && j18 == j17.f102439b) {
            com.tencent.mars.xlog.Log.w(oVar.f244136a, "handleOnPageSelected return for selected same feed:" + oVar.f244142g);
            return;
        }
        oVar.i(data, p0Var);
        com.tencent.mm.plugin.finder.storage.FeedData feedData2 = j17.f102442e;
        if (feedData2 != null && feedData2.getMediaType() == 9) {
            com.tencent.mm.plugin.finder.report.q1.e(com.tencent.mm.plugin.finder.report.q1.f125255a, false, oVar.f244146k, 1, null);
        }
        oVar.f244146k = false;
        oVar.h(data, j17);
        cVar.b("handleOnPageSelected end");
    }

    @Override // gc2.c
    public void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        dw2.o oVar = this.f244119a;
        oVar.f244150o = i17;
        if (oVar.f244153r == 0 && i17 == 1) {
            oVar.f244151p = true;
        }
        oVar.f244153r = i17;
        dw2.a0 a0Var = oVar.f244140e;
        if (a0Var != null) {
            com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager finderVideoAutoPlayManager = (com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager) a0Var;
            com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "onPageScrollStateChanged state:" + i17);
            if (i17 == 0) {
                finderVideoAutoPlayManager.f130780p.b("onViewIdle");
            }
        }
    }

    @Override // gc2.c
    public void c(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, float f17, int i18) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        dw2.o oVar = this.f244119a;
        if (oVar.f244151p) {
            ae2.b2 b2Var = ae2.b2.f3461a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.W).getValue()).r()).intValue() != 0) {
                oVar.f244151p = false;
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                int w17 = linearLayoutManager != null ? linearLayoutManager.w() : 0;
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2 : null;
                int y17 = linearLayoutManager2 != null ? linearLayoutManager2.y() : 0;
                int i19 = oVar.f244142g.f102444g;
                oVar.f244152q = -1;
                if (w17 != y17) {
                    if (w17 != i19) {
                        oVar.f244152q = w17;
                    } else if (y17 != i19) {
                        oVar.f244152q = y17;
                    }
                    int i27 = oVar.f244152q;
                    if (i27 >= 0) {
                        oVar.a(i27, true);
                    }
                }
            }
        }
    }
}
