package he2;

/* loaded from: classes3.dex */
public final class f extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f280891d;

    /* renamed from: e, reason: collision with root package name */
    public int f280892e;

    public f(java.util.ArrayList plugins, int i17) {
        kotlin.jvm.internal.o.g(plugins, "plugins");
        this.f280891d = plugins;
        this.f280892e = i17;
    }

    public final void a() {
        for (ee2.a aVar : this.f280891d) {
            if (aVar.f251583g instanceof com.tencent.mm.plugin.finder.live.plugin.mg) {
                aVar.W();
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object object) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(object, "object");
        com.tencent.mars.xlog.Log.i("LiveViewPagerPluginAdap", "destroyItem pos:" + i17);
        container.removeView((android.view.View) object);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f280891d.size();
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object object) {
        kotlin.jvm.internal.o.g(object, "object");
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        kotlin.jvm.internal.o.g(container, "container");
        com.tencent.mars.xlog.Log.i("LiveViewPagerPluginAdap", "instantiateItem pos:" + i17 + " maxHeight: " + this.f280892e);
        java.util.ArrayList arrayList = this.f280891d;
        android.view.View W = ((ee2.a) arrayList.get(i17)).W();
        if (W.getParent() != null) {
            com.tencent.mars.xlog.Log.i("LiveViewPagerPluginAdap", "instantiateItem removeView " + W.getClass().getCanonicalName());
            android.view.ViewParent parent = W.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(W);
            }
        }
        ((ee2.a) arrayList.get(i17)).w(this.f280892e);
        if (W instanceof com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxConstraintLayout) {
            container.addView(W);
            return W;
        }
        android.content.Context context = container.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxConstraintLayout finderLiveBoxConstraintLayout = new com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxConstraintLayout(context);
        finderLiveBoxConstraintLayout.setTag("LiveViewPagerPluginAdap");
        android.view.ViewParent parent2 = W.getParent();
        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(W);
        }
        finderLiveBoxConstraintLayout.addView(W, new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(-1, -1));
        if (W.getId() == -1) {
            W.setId(android.view.View.generateViewId());
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.d(finderLiveBoxConstraintLayout);
        cVar.e(W.getId(), 1, 0, 1);
        cVar.e(W.getId(), 2, 0, 2);
        cVar.e(W.getId(), 4, 0, 4);
        cVar.b(finderLiveBoxConstraintLayout);
        finderLiveBoxConstraintLayout.setConstraintSet(null);
        container.addView(finderLiveBoxConstraintLayout);
        android.view.ViewParent parent3 = W.getParent();
        kotlin.jvm.internal.o.e(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
        return (android.view.ViewGroup) parent3;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object object) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(object, "object");
        return kotlin.jvm.internal.o.b(view, object);
    }
}
