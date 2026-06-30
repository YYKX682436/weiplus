package cs2;

/* loaded from: classes2.dex */
public final class i implements c50.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f222071a;

    /* renamed from: b, reason: collision with root package name */
    public final int f222072b;

    /* renamed from: c, reason: collision with root package name */
    public final es2.h0 f222073c;

    /* renamed from: d, reason: collision with root package name */
    public final cs2.g f222074d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f222075e;

    public i(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f222071a = context;
        this.f222072b = i17;
        es2.h0 h0Var = new es2.h0((yr2.k) ((jz5.n) jz5.h.b(cs2.h.f222070d)).getValue(), "Grid#" + i17);
        this.f222073c = h0Var;
        cs2.g gVar = new cs2.g(this);
        this.f222074d = gVar;
        com.tencent.mars.xlog.Log.i("Finder.GridFeedPreloadCore", "init " + i17);
        h0Var.f256374g.add(gVar);
    }

    public static final void a(cs2.i iVar, int i17, int i18) {
        if (i18 > 0) {
            iVar.getClass();
            com.tencent.mars.xlog.Log.i("Finder.GridFeedPreloadCore", "onPreloadComplete return loading:" + i17 + " waiting:" + i18);
            return;
        }
        android.content.Context context = iVar.f222071a;
        jz5.f0 f0Var = null;
        com.tencent.mm.ui.vas.VASActivity vASActivity = context instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) context : null;
        if (vASActivity != null) {
            com.tencent.mars.xlog.Log.i("Finder.GridFeedPreloadCore", "onPreloadComplete loading:" + i17 + " waiting:" + i18);
            android.app.Activity parentActivity = vASActivity.getParentActivity();
            androidx.appcompat.app.AppCompatActivity appCompatActivity = parentActivity instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) parentActivity : null;
            if (appCompatActivity != null) {
                if (appCompatActivity instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
                    pf5.z zVar = pf5.z.f353948a;
                    com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment();
                    kotlin.jvm.internal.o.g(fragment, "fragment");
                    androidx.lifecycle.c1 a17 = zVar.b(fragment).a(cs2.k.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    ((cs2.k) a17).Q6();
                } else {
                    androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(appCompatActivity).a(cs2.k.class);
                    kotlin.jvm.internal.o.f(a18, "get(...)");
                    ((cs2.k) a18).Q6();
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                androidx.lifecycle.c1 a19 = pf5.z.f353948a.a(vASActivity).a(cs2.k.class);
                kotlin.jvm.internal.o.f(a19, "get(...)");
                ((cs2.k) a19).Q6();
            }
            iVar.f222075e = false;
        }
    }

    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView, r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        if (((c61.l7) i95.n0.c(c61.l7.class)).ek().N) {
            if (recyclerView.getTag(com.tencent.mm.R.id.dkl) != null) {
                com.tencent.mars.xlog.Log.i("Finder.GridFeedPreloadCore", "attachVideoExposeToPreload: return for commentScene=" + contextObj.getInteger(5));
            } else {
                in5.o.b(recyclerView, new cs2.e(contextObj, this), cs2.f.f222068d);
                com.tencent.mars.xlog.Log.i("Finder.GridFeedPreloadCore", "attachVideoExposeToPreload commentScene=" + contextObj.getInteger(5));
            }
        }
    }

    public final void c(in5.j item, r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        if (((c61.l7) i95.n0.c(c61.l7.class)).ek().N) {
            in5.c cVar = item.f293070a;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar : null;
            if (baseFinderFeed != null && baseFinderFeed.h() == 4) {
                com.tencent.mars.xlog.Log.i("Finder.GridFeedPreloadCore", "itemExposeEnd: commentScene=" + contextObj.getInteger(5) + " nick=" + baseFinderFeed.getFeedObject().getFeedObject().getNickname() + " id=" + pm0.v.u(baseFinderFeed.getItemId()) + ' ');
                long itemId = baseFinderFeed.getItemId();
                pm0.v.u(itemId);
                es2.h0 h0Var = this.f222073c;
                h0Var.getClass();
                h0Var.j("cancel", new es2.s(h0Var, itemId, "itemExposeEnd"));
            }
        }
    }

    public final void d(in5.j item, r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        if (((c61.l7) i95.n0.c(c61.l7.class)).ek().N) {
            in5.c cVar = item.f293070a;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar : null;
            if (baseFinderFeed != null && baseFinderFeed.h() == 4) {
                com.tencent.mars.xlog.Log.i("Finder.GridFeedPreloadCore", "itemExposeStartToPreload: commentScene=" + contextObj.getInteger(5) + ", nick=" + baseFinderFeed.getFeedObject().getFeedObject().getNickname() + ", id=" + pm0.v.u(baseFinderFeed.getItemId()));
                e(baseFinderFeed);
            }
        }
    }

    public final void e(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        pm0.v.u(baseFinderFeed.getItemId());
        this.f222073c.i(new ek4.b(1, -1, this.f222072b, 3, 0L, null, 1, 48, null), kz5.n0.V0(kz5.b0.c(baseFinderFeed)), 0, "Finder.GridFeedPreloadCore");
    }

    public final void f() {
        es2.h0 h0Var = this.f222073c;
        h0Var.f256370c = true;
        h0Var.f();
        h0Var.f256374g.remove(this.f222074d);
    }
}
