package e62;

/* loaded from: classes15.dex */
public final class j extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public l52.f f249768d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f249769e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f249770f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f249771g;

    public final void b(boolean z17) {
        java.lang.ref.WeakReference weakReference;
        android.view.ViewGroup viewGroup;
        l52.f fVar = this.f249768d;
        if (fVar == null || (weakReference = fVar.f316604x) == null || (viewGroup = (android.view.ViewGroup) weakReference.get()) == null) {
            return;
        }
        fVar.a(viewGroup, z17 ? 0 : fVar.f316605y, viewGroup.getChildCount());
        fVar.f316603w = true;
    }

    public final void c(java.lang.String sessionPageName, long j17) {
        android.app.Activity activity;
        kotlin.jvm.internal.o.g(sessionPageName, "sessionPageName");
        e(sessionPageName, j17);
        java.lang.ref.WeakReference weakReference = this.f249769e;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            return;
        }
        l52.f fVar = this.f249768d;
        if (fVar != null) {
            fVar.n(0, activity);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecycleViewFeedMonitor", "curSessionPage: " + this.f249770f + ", startMonitor: " + this.f249768d);
    }

    public final void d() {
        l52.f fVar = this.f249768d;
        if (fVar != null) {
            fVar.n(1, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecycleViewFeedMonitor", "curSessionPage: " + this.f249770f + ", stopMonitor: " + this.f249768d);
    }

    public final void e(java.lang.String sessionName, long j17) {
        l52.f fVar;
        kotlin.jvm.internal.o.g(sessionName, "sessionName");
        if (this.f249771g == 0) {
            this.f249771g = j17;
            com.tencent.mars.xlog.Log.i("MicroMsg.RecycleViewFeedMonitor", "updateAppInTime: " + this.f249771g + ", " + sessionName);
            if (e62.q.c(sessionName) || (fVar = this.f249768d) == null || java.lang.Long.valueOf(j17).longValue() - fVar.f316588h <= 30000) {
                return;
            }
            fVar.f316598r = false;
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FeedMonitor", "checkOtherPageAppIn: last sessionEnd");
            java.lang.String d17 = v52.c.g().d();
            java.lang.String b17 = w52.j.b();
            fVar.j();
            com.tencent.mm.sdk.platformtools.u3.h(new l52.b(fVar, fVar.f316598r, d17, b17));
            ((ku5.t0) ku5.t0.f312615d).k(new l52.d(fVar), 500L);
        }
    }

    public final void f(java.lang.String sessionName, long j17) {
        l52.f fVar;
        r45.va6 va6Var;
        kotlin.jvm.internal.o.g(sessionName, "sessionName");
        long j18 = this.f249771g;
        if (j18 != 0) {
            long j19 = j17 - j18;
            l52.f fVar2 = this.f249768d;
            if (fVar2 != null && fVar2.f316583c == 0 && (va6Var = fVar2.f316587g) != null) {
                long j27 = va6Var.f388044e + j19;
                va6Var.f388044e = j27;
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FeedMonitor", "updateTimeLineFrontStayTime, frontTime: %d", java.lang.Long.valueOf(j27));
            }
            this.f249771g = 0L;
            com.tencent.mars.xlog.Log.i("MicroMsg.RecycleViewFeedMonitor", "updateAppOutTime: " + j17);
            if (e62.q.c(sessionName) || (fVar = this.f249768d) == null) {
                return;
            }
            fVar.f316588h = java.lang.Long.valueOf(j17).longValue();
        }
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/hellhound/ext/sns/RecycleViewFeedMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        l52.f fVar = this.f249768d;
        if (fVar != null) {
            e62.q.a().getClass();
            if (i17 != 0) {
                i18 = 1;
                if (i17 != 1) {
                    i18 = 2;
                    if (i17 != 2) {
                        i18 = -1;
                    }
                }
            } else {
                i18 = 0;
            }
            fVar.p(recyclerView, i18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/expt/hellhound/ext/sns/RecycleViewFeedMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        android.app.Activity activity;
        int y17;
        int i19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/hellhound/ext/sns/RecycleViewFeedMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        java.lang.ref.WeakReference weakReference = this.f249769e;
        if (weakReference != null && (activity = (android.app.Activity) weakReference.get()) != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = !(layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) ? null : (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            int i27 = -1;
            if (linearLayoutManager != null) {
                try {
                    i27 = linearLayoutManager.w();
                    linearLayoutManager.getItemCount();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.RecycleViewFeedMonitor", "onScrolled: ", e17);
                }
            }
            int i28 = i27;
            recyclerView.getChildCount();
            if (activity.isFinishing() || activity.isDestroyed()) {
                yj0.a.h(this, "com/tencent/mm/plugin/expt/hellhound/ext/sns/RecycleViewFeedMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            l52.f fVar = this.f249768d;
            if (fVar != null) {
                int childCount = recyclerView.getChildCount();
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager2 : null;
                if (linearLayoutManager2 != null) {
                    try {
                        y17 = (linearLayoutManager2.y() - linearLayoutManager2.w()) + 1;
                    } catch (java.lang.Exception unused) {
                    }
                    if (y17 <= childCount) {
                        i19 = y17;
                        fVar.o(activity, recyclerView, i28, i19, i18);
                    }
                }
                i19 = childCount;
                fVar.o(activity, recyclerView, i28, i19, i18);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/expt/hellhound/ext/sns/RecycleViewFeedMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
