package tl5;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final sl5.d f420385a;

    /* renamed from: b, reason: collision with root package name */
    public final sl5.a f420386b;

    /* renamed from: c, reason: collision with root package name */
    public tl5.l f420387c;

    /* renamed from: d, reason: collision with root package name */
    public tl5.d f420388d;

    /* renamed from: e, reason: collision with root package name */
    public tl5.c f420389e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f420390f;

    /* renamed from: g, reason: collision with root package name */
    public tl5.a f420391g;

    /* renamed from: h, reason: collision with root package name */
    public int f420392h;

    /* renamed from: i, reason: collision with root package name */
    public int f420393i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f420394j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f420395k;

    /* renamed from: l, reason: collision with root package name */
    public float f420396l;

    /* renamed from: m, reason: collision with root package name */
    public tl5.k f420397m;

    public s(sl5.d host, sl5.a config) {
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(config, "config");
        this.f420385a = host;
        this.f420386b = config;
        this.f420387c = tl5.l.f420369d;
    }

    public final void a(boolean z17) {
        tl5.a aVar;
        com.tencent.mars.xlog.Log.i("PinchZoomEngine", "finishTransition: applied=" + z17);
        java.lang.ref.WeakReference weakReference = this.f420390f;
        androidx.recyclerview.widget.RecyclerView recyclerView = weakReference != null ? (androidx.recyclerview.widget.RecyclerView) weakReference.get() : null;
        if (recyclerView != null) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                recyclerView.suppressLayout(false);
            } else {
                recyclerView.setLayoutFrozen(false);
            }
        }
        sl5.d dVar = this.f420385a;
        if (z17 && (aVar = this.f420391g) != null && recyclerView != null) {
            int i17 = this.f420393i;
            cd5.a aVar2 = (cd5.a) dVar;
            aVar2.f(i17, aVar.f420330a, aVar.f420331b);
            yz5.l lVar = aVar2.f40660b;
            if (lVar != null) {
                lVar.invoke(java.lang.Integer.valueOf(i17));
            }
        }
        tl5.c cVar = this.f420389e;
        if (cVar != null) {
            cVar.a();
        }
        this.f420389e = null;
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = (com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) ((cd5.a) dVar).f40659a;
        msgHistoryGalleryUI.x7(false);
        msgHistoryGalleryUI.z7();
        if (recyclerView != null) {
            b(recyclerView, 0);
            recyclerView.post(new tl5.n(this, recyclerView));
            return;
        }
        this.f420388d = null;
        this.f420387c = tl5.l.f420369d;
        this.f420392h = 0;
        this.f420393i = 0;
        this.f420391g = null;
        this.f420394j = null;
        this.f420395k = false;
        this.f420396l = 0.0f;
        this.f420397m = null;
        java.lang.ref.WeakReference weakReference2 = this.f420390f;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f420390f = null;
    }

    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        int childCount = recyclerView.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = recyclerView.getChildAt(i18);
            if (childAt != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/ui/widget/pinchzoom/transition/PinchZoomTransitionEngine", "setChildrenVisibility", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/ui/widget/pinchzoom/transition/PinchZoomTransitionEngine", "setChildrenVisibility", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public final void c(boolean z17, float f17) {
        java.lang.ref.WeakReference weakReference = this.f420390f;
        androidx.recyclerview.widget.RecyclerView recyclerView = weakReference != null ? (androidx.recyclerview.widget.RecyclerView) weakReference.get() : null;
        if (recyclerView == null) {
            a(false);
            return;
        }
        this.f420387c = tl5.l.f420372g;
        float f18 = z17 ? 1.0f : 0.0f;
        com.tencent.mars.xlog.Log.i("PinchZoomEngine", "startAutoTransition: " + f17 + (char) 8594 + f18 + ", apply=" + z17);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            recyclerView.suppressLayout(true);
        } else {
            recyclerView.setLayoutFrozen(true);
        }
        tl5.c cVar = this.f420389e;
        if (cVar != null) {
            cVar.a();
        }
        tl5.c cVar2 = new tl5.c(recyclerView, this.f420386b.f409285c, new tl5.p(this), new tl5.q(this, z17));
        cVar2.a();
        cVar2.f420338i = f18;
        cVar2.f420337h.startScroll((int) (f17 * 1.0E8f), 0, (int) ((f18 - f17) * 1.0E8f), 0, cVar2.f420333d);
        android.view.View view = (android.view.View) cVar2.f420336g.get();
        if (view != null) {
            view.postOnAnimation(cVar2);
        }
        this.f420389e = cVar2;
    }

    public final void d() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        tl5.a aVar;
        this.f420395k = true;
        java.lang.ref.WeakReference weakReference = this.f420390f;
        if (weakReference == null || (recyclerView = (androidx.recyclerview.widget.RecyclerView) weakReference.get()) == null || (aVar = this.f420391g) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("PinchZoomEngine", "startToSideCollection: switching to spanCount=" + this.f420393i);
        ((cd5.a) this.f420385a).f(this.f420393i, aVar.f420330a, aVar.f420331b);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new tl5.r(recyclerView, this));
        recyclerView.requestLayout();
    }
}
