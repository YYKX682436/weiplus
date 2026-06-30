package cy3;

/* loaded from: classes10.dex */
public final class a0 extends androidx.recyclerview.widget.y1 {

    /* renamed from: f, reason: collision with root package name */
    public final int f224749f;

    /* renamed from: h, reason: collision with root package name */
    public cy3.v f224751h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f224752i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f224753j;

    /* renamed from: g, reason: collision with root package name */
    public int f224750g = -1;

    /* renamed from: k, reason: collision with root package name */
    public final cy3.z f224754k = new cy3.z(this);

    /* renamed from: l, reason: collision with root package name */
    public final cy3.y f224755l = new cy3.y(this);

    public a0(int i17) {
        this.f224749f = i17;
    }

    @Override // androidx.recyclerview.widget.r3
    public void b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.f2 adapter2;
        super.b(recyclerView);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f224753j;
        cy3.z zVar = this.f224754k;
        if (recyclerView2 != null) {
            recyclerView2.V0(zVar);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f224753j;
        cy3.y yVar = this.f224755l;
        if (recyclerView3 != null && (adapter2 = recyclerView3.getAdapter()) != null) {
            adapter2.unregisterAdapterDataObserver(yVar);
        }
        this.f224753j = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(zVar);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f224753j;
        if (recyclerView4 == null || (adapter = recyclerView4.getAdapter()) == null) {
            return;
        }
        adapter.registerAdapterDataObserver(yVar);
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View targetView) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        int[] iArr = new int[2];
        androidx.recyclerview.widget.w1 m17 = m(layoutManager);
        int e17 = m17.e(targetView);
        int k17 = m17.k();
        if (this.f224750g > 0) {
            k17 += this.f224749f;
        }
        iArr[1] = e17 - k17;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.r3
    public androidx.recyclerview.widget.g3 d(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        return e(layoutManager);
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        android.view.View n17 = n(layoutManager, m(layoutManager));
        android.view.ViewGroup.LayoutParams layoutParams = n17 != null ? n17.getLayoutParams() : null;
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams ? (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams : null;
        int a17 = layoutParams2 != null ? layoutParams2.a() : -1;
        int i17 = this.f224750g;
        if (i17 == 0 && a17 == 1) {
            return null;
        }
        if (i17 != a17) {
            this.f224750g = a17;
            cy3.v vVar = this.f224751h;
            if (vVar != null) {
                vVar.onPageSelected(a17);
            }
        }
        return n17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(androidx.recyclerview.widget.RecyclerView.LayoutManager r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r8 = "layoutManager"
            kotlin.jvm.internal.o.g(r7, r8)
            int r8 = r7.getItemCount()
            r0 = -1
            if (r8 != 0) goto Ld
            return r0
        Ld:
            androidx.recyclerview.widget.w1 r1 = r6.m(r7)
            android.view.View r1 = r6.n(r7, r1)
            if (r1 != 0) goto L18
            return r0
        L18:
            int r1 = r7.getPosition(r1)
            if (r1 != r0) goto L1f
            return r0
        L1f:
            r2 = 0
            r3 = 1
            if (r9 <= 0) goto L25
            r9 = r3
            goto L26
        L25:
            r9 = r2
        L26:
            boolean r4 = r7 instanceof androidx.recyclerview.widget.f3
            if (r4 == 0) goto L43
            androidx.recyclerview.widget.f3 r7 = (androidx.recyclerview.widget.f3) r7
            int r4 = r8 + (-1)
            android.graphics.PointF r7 = r7.a(r4)
            if (r7 == 0) goto L43
            float r4 = r7.x
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L41
            float r7 = r7.y
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 >= 0) goto L43
        L41:
            r7 = r3
            goto L44
        L43:
            r7 = r2
        L44:
            int r4 = r6.f224750g
            if (r1 == r4) goto L49
            goto L55
        L49:
            if (r7 == 0) goto L4e
            if (r9 == 0) goto L50
            goto L53
        L4e:
            if (r9 == 0) goto L53
        L50:
            int r1 = r1 + 1
            goto L55
        L53:
            int r1 = r1 + (-1)
        L55:
            if (r4 == r0) goto L63
            int r4 = r4 + r3
            int r7 = java.lang.Math.min(r1, r4)
            int r1 = r6.f224750g
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r7, r1)
        L63:
            int r7 = r6.f224749f
            if (r7 <= 0) goto L72
            if (r9 != 0) goto L72
            if (r1 != r3) goto L72
            int r7 = r6.f224750g
            if (r7 == r0) goto L71
            if (r7 != 0) goto L72
        L71:
            r1 = r2
        L72:
            if (r1 >= 0) goto L75
            goto L76
        L75:
            r2 = r1
        L76:
            if (r2 < r8) goto L7a
            int r2 = r8 + (-1)
        L7a:
            int r7 = r6.f224750g
            if (r2 == r7) goto L87
            r6.f224750g = r2
            cy3.v r7 = r6.f224751h
            if (r7 == 0) goto L87
            r7.onPageSelected(r2)
        L87:
            int r7 = r6.f224750g
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cy3.a0.g(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r0.f12259a != r2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.w1 m(androidx.recyclerview.widget.RecyclerView.LayoutManager r2) {
        /*
            r1 = this;
            androidx.recyclerview.widget.w1 r0 = r1.f224752i
            if (r0 == 0) goto Lb
            kotlin.jvm.internal.o.d(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.f12259a
            if (r0 == r2) goto L12
        Lb:
            androidx.recyclerview.widget.v1 r0 = new androidx.recyclerview.widget.v1
            r0.<init>(r2)
            r1.f224752i = r0
        L12:
            androidx.recyclerview.widget.w1 r2 = r1.f224752i
            kotlin.jvm.internal.o.d(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cy3.a0.m(androidx.recyclerview.widget.RecyclerView$LayoutManager):androidx.recyclerview.widget.w1");
    }

    public final android.view.View n(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.w1 w1Var) {
        int childCount;
        int abs;
        android.view.View view = null;
        if (layoutManager == null || (childCount = layoutManager.getChildCount()) == 0) {
            return null;
        }
        int k17 = w1Var.k();
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = layoutManager.getChildAt(i18);
            if (childAt != null && layoutManager.getPosition(childAt) != 0 && (abs = java.lang.Math.abs(w1Var.e(childAt) - k17)) < i17) {
                view = childAt;
                i17 = abs;
            }
        }
        return view;
    }
}
