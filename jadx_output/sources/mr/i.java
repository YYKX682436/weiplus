package mr;

/* loaded from: classes10.dex */
public class i extends androidx.recyclerview.widget.y1 {

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f330818f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f330819g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f330820h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f330822j;

    /* renamed from: n, reason: collision with root package name */
    public mr.a f330826n;

    /* renamed from: o, reason: collision with root package name */
    public mr.b f330827o;

    /* renamed from: p, reason: collision with root package name */
    public mr.c f330828p;

    /* renamed from: i, reason: collision with root package name */
    public float f330821i = 50.0f;

    /* renamed from: k, reason: collision with root package name */
    public final mr.h f330823k = new mr.h(this);

    /* renamed from: l, reason: collision with root package name */
    public final mr.g f330824l = new mr.g(this);

    /* renamed from: m, reason: collision with root package name */
    public int f330825m = -1;

    @Override // androidx.recyclerview.widget.r3
    public void b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.f2 adapter2;
        super.b(recyclerView);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f330820h;
        mr.h hVar = this.f330823k;
        if (recyclerView2 != null) {
            recyclerView2.V0(hVar);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f330820h;
        mr.g gVar = this.f330824l;
        if (recyclerView3 != null && (adapter2 = recyclerView3.getAdapter()) != null) {
            adapter2.unregisterAdapterDataObserver(gVar);
        }
        this.f330820h = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(hVar);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f330820h;
        if (recyclerView4 != null && (adapter = recyclerView4.getAdapter()) != null) {
            adapter.registerAdapterDataObserver(gVar);
        }
        n();
    }

    @Override // androidx.recyclerview.widget.r3
    public androidx.recyclerview.widget.g3 d(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof androidx.recyclerview.widget.f3)) {
            return null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f330820h;
        return new mr.d(this, layoutManager, recyclerView != null ? recyclerView.getContext() : null);
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        android.view.View o17 = o(layoutManager);
        android.view.ViewGroup.LayoutParams layoutParams = o17 != null ? o17.getLayoutParams() : null;
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams ? (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams : null;
        int a17 = layoutParams2 != null ? layoutParams2.a() : -1;
        if (this.f330825m != a17) {
            this.f330825m = a17;
            mr.a aVar = this.f330826n;
            if (aVar != null) {
                aVar.onPageSelected(a17);
            }
        }
        return o17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public int g(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        int i19;
        int i27;
        android.graphics.PointF a17;
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        androidx.recyclerview.widget.w1 m17 = layoutManager.getF123307r() ? m(layoutManager) : l(layoutManager);
        android.view.View j17 = j(layoutManager, m17);
        if (j17 == null) {
            return -1;
        }
        int position = layoutManager.getPosition(j17);
        if (m17.e(j17) < m17.k()) {
            i27 = position + 1;
            i19 = position;
        } else {
            i19 = position - 1;
            i27 = position;
        }
        if (position == -1) {
            return -1;
        }
        boolean z17 = !layoutManager.canScrollHorizontally() ? i18 <= 0 : i17 <= 0;
        if (!((layoutManager instanceof androidx.recyclerview.widget.f3) && (a17 = ((androidx.recyclerview.widget.f3) layoutManager).a(itemCount + (-1))) != null && (a17.x < 0.0f || a17.y < 0.0f)) ? z17 : !z17) {
            i19 = i27;
        }
        int i28 = i19 >= 0 ? i19 : 0;
        if (i28 >= itemCount) {
            i28 = itemCount - 1;
        }
        if (i28 != this.f330825m) {
            this.f330825m = i28;
            mr.a aVar = this.f330826n;
            if (aVar != null) {
                aVar.onPageSelected(i28);
            }
        }
        return this.f330825m;
    }

    public final android.view.View j(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.w1 helper) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(helper, "helper");
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        if (childCount == 0) {
            return null;
        }
        int k17 = layoutManager.getClipToPadding() ? helper.k() + (helper.l() / 2) : helper.f() / 2;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = layoutManager.getChildAt(i18);
            int abs = java.lang.Math.abs((helper.e(childAt) + (helper.c(childAt) / 2)) - k17);
            if (p(childAt, layoutManager, helper)) {
                return childAt;
            }
            if (abs < i17) {
                view = childAt;
                i17 = abs;
            }
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0.f12259a != r2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.w1 l(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
        /*
            r1 = this;
            java.lang.String r0 = "layoutManager"
            kotlin.jvm.internal.o.g(r2, r0)
            androidx.recyclerview.widget.w1 r0 = r1.f330819g
            if (r0 == 0) goto L10
            kotlin.jvm.internal.o.d(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.f12259a
            if (r0 == r2) goto L17
        L10:
            androidx.recyclerview.widget.u1 r0 = new androidx.recyclerview.widget.u1
            r0.<init>(r2)
            r1.f330819g = r0
        L17:
            androidx.recyclerview.widget.w1 r2 = r1.f330819g
            kotlin.jvm.internal.o.d(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.i.l(androidx.recyclerview.widget.RecyclerView$LayoutManager):androidx.recyclerview.widget.w1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0.f12259a != r2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.w1 m(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
        /*
            r1 = this;
            java.lang.String r0 = "layoutManager"
            kotlin.jvm.internal.o.g(r2, r0)
            androidx.recyclerview.widget.w1 r0 = r1.f330818f
            if (r0 == 0) goto L10
            kotlin.jvm.internal.o.d(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.f12259a
            if (r0 == r2) goto L17
        L10:
            androidx.recyclerview.widget.v1 r0 = new androidx.recyclerview.widget.v1
            r0.<init>(r2)
            r1.f330818f = r0
        L17:
            androidx.recyclerview.widget.w1 r2 = r1.f330818f
            kotlin.jvm.internal.o.d(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.i.m(androidx.recyclerview.widget.RecyclerView$LayoutManager):androidx.recyclerview.widget.w1");
    }

    public final void n() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        android.view.View f17;
        mr.b bVar;
        if (this.f330827o == null || (recyclerView = this.f330820h) == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f17 = f(layoutManager)) == null) {
            return;
        }
        int[] c17 = c(layoutManager, f17);
        if ((c17[0] == 0 || c17[1] == 0) && (bVar = this.f330827o) != null) {
            bVar.a(this.f330825m);
        }
    }

    public android.view.View o(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        return super.f(layoutManager);
    }

    public boolean p(android.view.View view, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.w1 helper) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(helper, "helper");
        return false;
    }
}
