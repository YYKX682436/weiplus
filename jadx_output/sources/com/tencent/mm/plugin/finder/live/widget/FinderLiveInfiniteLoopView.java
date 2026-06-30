package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveInfiniteLoopView;", "Landroid/widget/FrameLayout;", "", "b", "Ljz5/f0;", "setCanScroll", "", "animationDuration", "setSmoothScrollDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/live/widget/yl", "com/tencent/mm/plugin/finder/live/widget/zl", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderLiveInfiniteLoopView extends android.widget.FrameLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f117640r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f117641d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f117642e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager f117643f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.wl f117644g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f117645h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f117646i;

    /* renamed from: m, reason: collision with root package name */
    public final long f117647m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.xl f117648n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f117649o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f117650p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f117651q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveInfiniteLoopView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f117641d = "Finder.FinderLiveInfiniteLoopView";
        this.f117644g = new com.tencent.mm.plugin.finder.live.widget.wl(this);
        this.f117645h = new android.widget.ImageView(getContext());
        this.f117646i = new android.widget.ImageView(getContext());
        this.f117647m = 5000L;
        this.f117648n = new com.tencent.mm.plugin.finder.live.widget.xl(this);
        this.f117649o = new java.util.LinkedList();
        this.f117650p = new java.util.LinkedList();
        d(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView) {
        android.graphics.Bitmap b07;
        android.view.View view = (android.view.View) finderLiveInfiniteLoopView.f117650p.getLast();
        com.tencent.mm.plugin.finder.live.widget.zl zlVar = view instanceof com.tencent.mm.plugin.finder.live.widget.zl ? (com.tencent.mm.plugin.finder.live.widget.zl) view : null;
        if (zlVar == null || (b07 = zlVar.getSnapshot()) == null) {
            b07 = com.tencent.mm.sdk.platformtools.x.b0(view);
        }
        finderLiveInfiniteLoopView.f117646i.setImageBitmap(b07);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView) {
        android.graphics.Bitmap b07;
        android.view.View view = (android.view.View) finderLiveInfiniteLoopView.f117650p.getFirst();
        com.tencent.mm.plugin.finder.live.widget.zl zlVar = view instanceof com.tencent.mm.plugin.finder.live.widget.zl ? (com.tencent.mm.plugin.finder.live.widget.zl) view : null;
        if (zlVar == null || (b07 = zlVar.getSnapshot()) == null) {
            b07 = com.tencent.mm.sdk.platformtools.x.b0(view);
        }
        finderLiveInfiniteLoopView.f117645h.setImageBitmap(b07);
    }

    public final void c(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.util.LinkedList linkedList = this.f117650p;
        if (linkedList.contains(view)) {
            return;
        }
        h();
        linkedList.addLast(view);
        java.util.LinkedList linkedList2 = this.f117649o;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        if (linkedList.size() > 1) {
            linkedList2.addLast(this.f117645h);
            linkedList2.addFirst(this.f117646i);
        }
        this.f117644g.notifyDataSetChanged();
        if (linkedList.size() == 0) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager = this.f117643f;
        if (finderLiveViewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        finderLiveViewPager.setOffscreenPageLimit(linkedList2.size());
        if (linkedList.size() <= 1) {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager2 = this.f117643f;
            if (finderLiveViewPager2 != null) {
                finderLiveViewPager2.setCurrentItem(0);
                return;
            } else {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
        }
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager3 = this.f117643f;
        if (finderLiveViewPager3 == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        finderLiveViewPager3.setCurrentItem(1);
        post(new com.tencent.mm.plugin.finder.live.widget.tl(this));
    }

    public final void d(android.content.Context context) {
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.drb, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f117642e = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.roc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager = (com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager) findViewById;
        this.f117643f = finderLiveViewPager;
        finderLiveViewPager.setAdapter(this.f117644g);
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager2 = this.f117643f;
        if (finderLiveViewPager2 == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        com.tencent.mm.plugin.finder.live.widget.xl xlVar = this.f117648n;
        finderLiveViewPager2.removeOnPageChangeListener(xlVar);
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager3 = this.f117643f;
        if (finderLiveViewPager3 != null) {
            finderLiveViewPager3.addOnPageChangeListener(xlVar);
        } else {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
    }

    public final boolean e() {
        if (this.f117650p.size() > 1) {
            java.util.LinkedList linkedList = this.f117649o;
            if (kotlin.jvm.internal.o.b(linkedList.getFirst(), this.f117646i) && kotlin.jvm.internal.o.b(linkedList.getLast(), this.f117645h)) {
                return true;
            }
        }
        return false;
    }

    public final void f(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        java.util.LinkedList linkedList = this.f117650p;
        if (linkedList.contains(view)) {
            h();
            linkedList.remove(view);
            java.util.LinkedList linkedList2 = this.f117649o;
            linkedList2.clear();
            linkedList2.addAll(linkedList);
            if (linkedList.size() > 1) {
                linkedList2.addLast(this.f117645h);
                linkedList2.addFirst(this.f117646i);
            }
            this.f117644g.notifyDataSetChanged();
            if (linkedList.size() == 0) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager = this.f117643f;
            if (finderLiveViewPager == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            finderLiveViewPager.setOffscreenPageLimit(linkedList2.size());
            if (linkedList.size() <= 1) {
                com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager2 = this.f117643f;
                if (finderLiveViewPager2 != null) {
                    finderLiveViewPager2.setCurrentItem(0);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("viewPager");
                    throw null;
                }
            }
            com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager3 = this.f117643f;
            if (finderLiveViewPager3 == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            finderLiveViewPager3.setCurrentItem(1);
            post(new com.tencent.mm.plugin.finder.live.widget.am(this));
        }
    }

    public final void g() {
        h();
        if (e()) {
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            this.f117651q = k0Var != null ? com.tencent.mm.plugin.finder.live.util.y.n(k0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.dm(this, null), 3, null) : null;
        } else {
            com.tencent.mars.xlog.Log.i(this.f117641d, "[startAutoScroll] return, size = " + this.f117649o.size());
        }
    }

    public final void h() {
        kotlinx.coroutines.r2 r2Var = this.f117651q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    public final void setCanScroll(boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager = this.f117643f;
        if (finderLiveViewPager != null) {
            finderLiveViewPager.setCanScroll(z17);
        } else {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
    }

    public final void setSmoothScrollDuration(int i17) {
        android.content.Context context = getContext();
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager = this.f117643f;
        if (finderLiveViewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        try {
            java.lang.reflect.Field declaredField = androidx.viewpager.widget.ViewPager.class.getDeclaredField("mScroller");
            kotlin.jvm.internal.o.f(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            declaredField.set(finderLiveViewPager, new zl2.b5(context, i17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiveViewPagerUtil", e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveInfiniteLoopView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f117641d = "Finder.FinderLiveInfiniteLoopView";
        this.f117644g = new com.tencent.mm.plugin.finder.live.widget.wl(this);
        this.f117645h = new android.widget.ImageView(getContext());
        this.f117646i = new android.widget.ImageView(getContext());
        this.f117647m = 5000L;
        this.f117648n = new com.tencent.mm.plugin.finder.live.widget.xl(this);
        this.f117649o = new java.util.LinkedList();
        this.f117650p = new java.util.LinkedList();
        d(context);
    }
}
