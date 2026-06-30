package or2;

/* loaded from: classes10.dex */
public final class s extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f347671d;

    /* renamed from: e, reason: collision with root package name */
    public or2.i f347672e;

    /* renamed from: f, reason: collision with root package name */
    public int f347673f;

    /* renamed from: g, reason: collision with root package name */
    public final android.os.Handler f347674g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f347675h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f347676i;

    /* renamed from: m, reason: collision with root package name */
    public long f347677m;

    /* renamed from: n, reason: collision with root package name */
    public int f347678n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f347679o;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r6 < r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        if (r6 < r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        if (r6 < r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        if (r6 < r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        if (r6 < r5) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: or2.s.<init>(java.lang.String):void");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.storage.FeedData feedData2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        boolean z18 = this.f347679o;
        boolean z19 = this.f347676i;
        if (!z18 && !z19) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if (z19 && !this.f347675h) {
            this.f347675h = true;
            android.content.Context context = recyclerView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.Window window = ((android.app.Activity) context).getWindow();
            kotlin.jvm.internal.o.f(window, "getWindow(...)");
            int a17 = 1000 / or2.k.a(window);
            java.lang.Object layoutManager = recyclerView.getLayoutManager();
            rx2.x xVar = layoutManager instanceof rx2.x ? (rx2.x) layoutManager : null;
            if (xVar != null) {
                xVar.k(new or2.q(a17, this));
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(recyclerView)) {
                recyclerView.addOnAttachStateChangeListener(new or2.p(recyclerView, this));
            } else {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (this.f347678n > 0) {
                    jSONObject.put("avgScrollCostMs", a06.d.c((((float) this.f347677m) * 1.0f) / r8));
                    or2.o.f347664a.a(this.f347671d, jSONObject);
                }
                or2.o.f347664a.b(or2.j.f347657b);
            }
        }
        android.content.Context context2 = recyclerView.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        android.view.Window window2 = ((android.app.Activity) context2).getWindow();
        if (i17 == 0) {
            str = "(Landroidx/recyclerview/widget/RecyclerView;I)V";
            if (recyclerView.getScrollState() == 0) {
                recyclerView.post(new or2.r(this));
            }
        } else if ((i17 == 1 || i17 == 2) && this.f347673f == 0) {
            or2.i iVar = this.f347672e;
            if (iVar != null) {
                iVar.a();
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = or2.u.f347681a;
            or2.u.f347682b--;
            or2.u.f347684d--;
            java.lang.String str3 = this.f347671d;
            kotlin.jvm.internal.o.d(window2);
            android.os.Handler handler = this.f347674g;
            java.lang.Object tag = recyclerView.getTag(com.tencent.mm.R.id.tcy);
            java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
            str = "(Landroidx/recyclerview/widget/RecyclerView;I)V";
            or2.i iVar2 = new or2.i(str3, recyclerView, window2, handler, bool != null ? bool.booleanValue() : false, this.f347676i);
            android.content.Context context3 = recyclerView.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            or2.h hVar = iVar2.f347652i;
            long j17 = hVar.f347635h;
            long j18 = 0;
            if (hVar.f347634g <= 0) {
                hVar.f347634g = java.lang.System.nanoTime();
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                iVar2.f347653j = hVar.f347634g;
                iVar2.f347655l = true;
                cw2.da S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) ((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class))).S6(context3);
                if (S6 != null) {
                    cw2.wa f130607n = S6.getF130607n();
                    if (f130607n != null && (feedData2 = f130607n.f224099f) != null) {
                        j18 = feedData2.getFeedId();
                    }
                    hVar.f347642o = j18;
                    cw2.wa f130607n2 = S6.getF130607n();
                    if (f130607n2 == null || (feedData = f130607n2.f224099f) == null || (str2 = hc2.b0.g(feedData, 0, 1, null)) == null) {
                        str2 = "";
                    }
                    hVar.f347643p = str2;
                }
                iVar2.f347646c.addOnFrameMetricsAvailableListener(iVar2, iVar2.f347647d);
            }
            this.f347672e = iVar2;
            if (z19) {
                ((v40.u) ((c50.t0) i95.n0.c(c50.t0.class))).f433196e = java.lang.System.currentTimeMillis();
            }
        } else {
            str = "(Landroidx/recyclerview/widget/RecyclerView;I)V";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScrollStateChanged newState:");
        sb6.append(i17);
        sb6.append(" lastState:");
        sb6.append(this.f347673f);
        sb6.append(" dropFrameCount:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = or2.u.f347681a;
        sb6.append(or2.u.f347682b);
        sb6.append(" dropFramesIncreaseCount:");
        sb6.append(or2.u.f347683c);
        sb6.append(" dropFramesIncreaseCountInRuntime:");
        sb6.append(or2.u.f347684d);
        com.tencent.mars.xlog.Log.i("PerformanceDelegator", sb6.toString());
        this.f347673f = i17;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", str);
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        int i19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int i27 = this.f347673f;
        if (i27 == 1 || i27 == 2) {
            int i28 = 100;
            if (or2.u.f347682b > 0) {
                while (true) {
                    int i29 = i28 - 1;
                    if (i28 <= 0) {
                        break;
                    }
                    try {
                        java.lang.Thread.sleep(1L);
                    } catch (java.lang.Throwable unused) {
                    }
                    i28 = i29;
                }
            } else if (or2.u.f347683c > 0 && (i19 = or2.u.f347684d) >= 0) {
                int max = (int) (100 * (1 - ((java.lang.Math.max(i19, 0) * 1.0f) / or2.u.f347683c)));
                while (true) {
                    int i37 = max - 1;
                    if (max <= 0) {
                        break;
                    }
                    try {
                        java.lang.Thread.sleep(1L);
                    } catch (java.lang.Throwable unused2) {
                    }
                    max = i37;
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
