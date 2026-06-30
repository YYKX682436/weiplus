package fy0;

/* loaded from: classes5.dex */
public final class r extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView f267224d;

    /* renamed from: e, reason: collision with root package name */
    public final fy0.p f267225e;

    /* renamed from: f, reason: collision with root package name */
    public final int f267226f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f267227g;

    /* renamed from: h, reason: collision with root package name */
    public int f267228h;

    /* renamed from: i, reason: collision with root package name */
    public int f267229i;

    /* renamed from: m, reason: collision with root package name */
    public double f267230m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f267231n;

    public r(com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView timelineView, fy0.p callback, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(timelineView, "timelineView");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f267224d = timelineView;
        this.f267225e = callback;
        this.f267226f = i17;
        this.f267227g = z17;
    }

    public final double a() {
        bx0.h timelineLayoutCalc;
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView = this.f267224d;
        ex0.a0 timelineVM = baseTimelineView.getTimelineVM();
        double d17 = 0.0d;
        if (timelineVM == null || (timelineLayoutCalc = baseTimelineView.getTimelineLayoutCalc()) == null) {
            return 0.0d;
        }
        int i17 = 0;
        for (java.lang.Object obj : timelineVM.f257097g.f257177e) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            d17 += timelineLayoutCalc.b(((ex0.r) obj).f257168b, false).width();
            i17 = i18;
        }
        return ((d17 + baseTimelineView.getInsets().f247044a) + baseTimelineView.getInsets().f247046c) - this.f267226f;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:13|(2:14|15)|(3:18|(2:20|(1:58)(9:25|26|(1:28)(1:48)|29|31|32|33|(3:39|(1:41)(1:43)|42)|44))(3:60|61|62)|16)|64|65|31|32|33|(5:35|37|39|(0)(0)|42)|44) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(double r16) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fy0.r.b(double):void");
    }

    public final void c(double d17) {
        if (this.f267228h == 0) {
            if (this.f267230m == d17) {
                return;
            }
            this.f267229i = 0;
            this.f267228h = 0;
            if (d17 < 0.0d) {
                d17 = 0.0d;
            }
            double a17 = a();
            if (d17 > a17) {
                d17 = a17;
            }
            e(d17, fy0.q.f267220d);
            ((fy0.e) this.f267225e).a(0, -a06.d.a(d17), false);
        }
    }

    public final void d(double d17, boolean z17) {
        if (this.f267228h == 0) {
            if (!(this.f267230m == d17) || z17) {
                if (d17 < 0.0d) {
                    d17 = 0.0d;
                }
                double a17 = a();
                if (d17 > a17) {
                    d17 = a17;
                }
                this.f267229i = 0;
                this.f267228h = 0;
                this.f267230m = d17;
                e(d17, fy0.q.f267220d);
                b(d17);
            }
        }
    }

    public final void e(double d17, fy0.q qVar) {
        qVar.name();
        this.f267230m = d17;
        fy0.e eVar = (fy0.e) this.f267225e;
        eVar.getClass();
        com.tencent.mm.mj_publisher.finder.widgets.timelineview.BaseTimelineView baseTimelineView = eVar.f267180a;
        fy0.b bVar = baseTimelineView.f69729p;
        if (bVar != null) {
            bVar.a(d17, qVar);
        }
        eVar.f267181b.f36279f = d17;
        baseTimelineView.j();
        baseTimelineView.getRecyclerView().D0();
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/widgets/timelineview/TimelineScrollHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        fy0.e eVar = (fy0.e) this.f267225e;
        eVar.getClass();
        fy0.a aVar = eVar.f267180a.f69731r;
        if (aVar != null) {
            aVar.a(i17);
        }
        this.f267229i = this.f267228h;
        this.f267228h = i17;
        if (i17 == 0) {
            e(this.f267230m, fy0.q.f267222f);
        }
        this.f267231n = true;
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/widgets/timelineview/TimelineScrollHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/widgets/timelineview/TimelineScrollHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        recyclerView.getScrollState();
        double d17 = this.f267230m + i17;
        this.f267230m = d17;
        if (d17 < 0.0d) {
            d17 = 0.0d;
        }
        double a17 = a();
        if (d17 > a17) {
            d17 = a17;
        }
        this.f267230m = d17;
        boolean z17 = this.f267228h == 0;
        if (!z17 || this.f267229i != 0) {
            if (z17) {
                this.f267229i = 0;
            }
            fy0.q qVar = z17 ? fy0.q.f267222f : fy0.q.f267221e;
            if (this.f267231n) {
                double d18 = d17 >= 0.0d ? d17 : 0.0d;
                double a18 = a();
                if (d18 > a18) {
                    d18 = a18;
                }
                e(d18, fy0.q.f267220d);
                b(d18);
                this.f267231n = false;
            }
            e(this.f267230m, qVar);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/widgets/timelineview/TimelineScrollHelper", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
