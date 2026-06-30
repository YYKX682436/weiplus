package gc2;

/* loaded from: classes10.dex */
public final class h extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f270410d;

    /* renamed from: e, reason: collision with root package name */
    public gc2.c f270411e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f270412f;

    /* renamed from: g, reason: collision with root package name */
    public int f270413g;

    /* renamed from: h, reason: collision with root package name */
    public int f270414h;

    /* renamed from: i, reason: collision with root package name */
    public final gc2.g f270415i;

    /* renamed from: m, reason: collision with root package name */
    public int f270416m;

    /* renamed from: n, reason: collision with root package name */
    public int f270417n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f270418o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f270419p;

    /* renamed from: q, reason: collision with root package name */
    public int f270420q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f270421r;

    public h(androidx.recyclerview.widget.RecyclerView mRecyclerView) {
        kotlin.jvm.internal.o.g(mRecyclerView, "mRecyclerView");
        this.f270410d = mRecyclerView;
        this.f270420q = -1;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) mRecyclerView.getLayoutManager();
        kotlin.jvm.internal.o.d(linearLayoutManager);
        this.f270412f = linearLayoutManager;
        this.f270415i = new gc2.g();
        c();
    }

    public final void a(int i17) {
        gc2.c cVar = this.f270411e;
        if (cVar != null) {
            kotlin.jvm.internal.o.d(cVar);
            cVar.a(this.f270410d, i17);
        }
    }

    public final void b(int i17) {
        int i18;
        if ((this.f270413g == 3 && this.f270414h == 0) || this.f270414h == i17) {
            return;
        }
        this.f270414h = i17;
        gc2.c cVar = this.f270411e;
        if (cVar != null) {
            kotlin.jvm.internal.o.d(cVar);
            cVar.b(this.f270410d, i17);
        }
        if (i17 != 0 || (i18 = this.f270420q) == -1) {
            return;
        }
        this.f270420q = -1;
        if (this.f270416m != i18) {
            a(i18);
        }
    }

    public final void c() {
        this.f270413g = 0;
        this.f270414h = 0;
        gc2.g gVar = this.f270415i;
        gVar.f270407a = -1;
        gVar.f270408b = 0.0f;
        gVar.f270409c = 0;
        this.f270416m = -1;
        this.f270417n = -1;
        this.f270418o = false;
        this.f270419p = false;
        this.f270420q = -1;
    }

    public final void d(boolean z17) {
        this.f270413g = z17 ? 4 : 1;
        int i17 = this.f270417n;
        if (i17 != -1) {
            this.f270416m = i17;
            this.f270417n = -1;
        } else if (this.f270416m == -1) {
            this.f270416m = this.f270412f.w();
        }
        b(1);
    }

    public final void e() {
        int top;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.f270412f;
        int w17 = linearLayoutManager.w();
        gc2.g gVar = this.f270415i;
        gVar.f270407a = w17;
        if (w17 == -1) {
            gVar.f270407a = -1;
            gVar.f270408b = 0.0f;
            gVar.f270409c = 0;
            return;
        }
        android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(w17);
        if (findViewByPosition == null) {
            gVar.f270407a = -1;
            gVar.f270408b = 0.0f;
            gVar.f270409c = 0;
            return;
        }
        int leftDecorationWidth = linearLayoutManager.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = linearLayoutManager.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = linearLayoutManager.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = linearLayoutManager.getBottomDecorationHeight(findViewByPosition);
        android.view.ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        boolean z17 = linearLayoutManager.H() == 0;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f270410d;
        if (z17) {
            top = (findViewByPosition.getLeft() - leftDecorationWidth) - recyclerView.getPaddingLeft();
            height = width;
        } else {
            top = (findViewByPosition.getTop() - topDecorationHeight) - recyclerView.getPaddingTop();
        }
        int i17 = -top;
        gVar.f270409c = i17;
        if (i17 < 0) {
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "Page can only be offset by a positive amount, not by %d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            com.tencent.mars.xlog.Log.e("FinderScrollEventAdapter", format);
        }
        gVar.f270408b = height != 0 ? gVar.f270409c / height : 0.0f;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        gc2.c cVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int i18 = this.f270413g;
        boolean z17 = true;
        if (!(i18 == 1 && this.f270414h == 1) && i17 == 1) {
            d(false);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if ((i18 == 1 || i18 == 4) && i17 == 2) {
            if (this.f270419p) {
                b(2);
                this.f270418o = true;
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if ((i18 == 1 || i18 == 4) && i17 == 0) {
            e();
            boolean z18 = this.f270419p;
            gc2.g gVar = this.f270415i;
            if (!z18) {
                int i19 = gVar.f270407a;
                if (i19 != -1 && (cVar = this.f270411e) != null) {
                    cVar.c(this.f270410d, i19, 0.0f, 0);
                }
            } else if (gVar.f270409c == 0) {
                int i27 = this.f270416m;
                int i28 = gVar.f270407a;
                if (i27 != i28) {
                    a(i28);
                }
            } else {
                z17 = false;
            }
            if (z17) {
                b(0);
                c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        if ((r8 < 0) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    @Override // androidx.recyclerview.widget.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r7, int r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r2 = "onScrolled"
            java.lang.String r3 = "(Landroidx/recyclerview/widget/RecyclerView;II)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4.add(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.g(r7, r0)
            r7 = 1
            r6.f270419p = r7
            r6.e()
            boolean r0 = r6.f270418o
            r1 = -1
            gc2.g r2 = r6.f270415i
            r3 = 0
            if (r0 == 0) goto L6c
            r6.f270418o = r3
            if (r9 > 0) goto L4e
            if (r9 != 0) goto L4c
            if (r8 >= 0) goto L48
            r8 = r7
            goto L49
        L48:
            r8 = r3
        L49:
            if (r8 != 0) goto L4c
            goto L4e
        L4c:
            r8 = r3
            goto L4f
        L4e:
            r8 = r7
        L4f:
            if (r8 == 0) goto L59
            int r8 = r2.f270409c
            if (r8 == 0) goto L59
            int r8 = r2.f270407a
            int r8 = r8 + r7
            goto L5b
        L59:
            int r8 = r2.f270407a
        L5b:
            r6.f270417n = r8
            int r9 = r6.f270416m
            if (r9 == r8) goto L78
            boolean r9 = r6.f270421r
            if (r9 == 0) goto L68
            r6.f270420q = r8
            goto L78
        L68:
            r6.a(r8)
            goto L78
        L6c:
            int r8 = r6.f270413g
            if (r8 != 0) goto L78
            int r8 = r2.f270407a
            if (r8 != r1) goto L75
            r8 = r3
        L75:
            r6.a(r8)
        L78:
            int r8 = r2.f270407a
            if (r8 != r1) goto L7d
            r8 = r3
        L7d:
            float r9 = r2.f270408b
            int r0 = r2.f270409c
            gc2.c r4 = r6.f270411e
            if (r4 == 0) goto L8a
            androidx.recyclerview.widget.RecyclerView r5 = r6.f270410d
            r4.c(r5, r8, r9, r0)
        L8a:
            int r8 = r2.f270407a
            int r9 = r6.f270417n
            if (r8 == r9) goto L92
            if (r9 != r1) goto La0
        L92:
            int r8 = r2.f270409c
            if (r8 != 0) goto La0
            int r8 = r6.f270414h
            if (r8 == r7) goto La0
            r6.b(r3)
            r6.c()
        La0:
            java.lang.String r7 = "com/tencent/mm/plugin/finder/event/recyclerview/FinderScrollEventAdapter"
            java.lang.String r8 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r9 = "onScrolled"
            java.lang.String r0 = "(Landroidx/recyclerview/widget/RecyclerView;II)V"
            yj0.a.h(r6, r7, r8, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gc2.h.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
