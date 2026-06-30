package wk2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f446945a;

    /* renamed from: b, reason: collision with root package name */
    public final int f446946b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f446947c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f446948d;

    /* renamed from: e, reason: collision with root package name */
    public final tk2.a f446949e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f446950f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager f446951g;

    /* renamed from: h, reason: collision with root package name */
    public final wk2.c f446952h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f446953i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f446954j;

    public j(android.content.Context context, int i17, androidx.recyclerview.widget.RecyclerView recyclerView, java.util.ArrayList dataList, tk2.a service) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(service, "service");
        this.f446945a = context;
        this.f446946b = i17;
        this.f446947c = recyclerView;
        this.f446948d = dataList;
        this.f446949e = service;
        this.f446950f = new java.util.HashSet();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
        this.f446951g = (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager;
        this.f446952h = new wk2.c();
        this.f446953i = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        recyclerView.i(new wk2.h(this));
        this.f446954j = new wk2.e(this);
    }

    public final void a(int i17) {
        jz5.f0 f0Var;
        android.view.View findViewByPosition = this.f446951g.findViewByPosition(i17);
        if (findViewByPosition != null) {
            if (!((mm2.c1) ((com.tencent.mm.plugin.finder.live.plugin.zz) this.f446949e).P0(mm2.c1.class)).f8()) {
                uk2.a c17 = c(i17);
                if (c17 == null) {
                    com.tencent.mars.xlog.Log.w("MultiStreamAutoPlay", "checkAutoPlay pos:" + i17 + "  return for data = null");
                } else {
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewByPosition.findViewById(com.tencent.mm.R.id.icp);
                    if (frameLayout == null) {
                        com.tencent.mars.xlog.Log.w("MultiStreamAutoPlay", "checkAutoPlay pos:" + i17 + " return for view:" + findViewByPosition);
                    } else {
                        com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView multiStreamPreviewView = (com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView) frameLayout.findViewWithTag("nearby-live-preview-view-tag");
                        if (multiStreamPreviewView != null) {
                            com.tencent.mars.xlog.Log.i("MultiStreamAutoPlay", "getOrCreateLiveView get view:" + multiStreamPreviewView);
                        } else {
                            wk2.c cVar = this.f446952h;
                            cVar.getClass();
                            android.content.Context context = this.f446945a;
                            kotlin.jvm.internal.o.g(context, "context");
                            java.util.HashSet hashSet = cVar.f446935a;
                            com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView multiStreamPreviewView2 = (com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView) pm0.v.a0(hashSet, wk2.a.f446933d);
                            if (multiStreamPreviewView2 != null) {
                                com.tencent.mars.xlog.Log.i("FinderLivePlayerViewRecycler", "getOrCreate: get view success, view.hashcode = " + multiStreamPreviewView2.hashCode() + " recycledViews.size = " + hashSet.size());
                                multiStreamPreviewView = multiStreamPreviewView2;
                            } else {
                                com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView multiStreamPreviewView3 = new com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView(context);
                                cVar.f446936b.add(new java.lang.ref.WeakReference(multiStreamPreviewView3));
                                com.tencent.mars.xlog.Log.i("FinderLivePlayerViewRecycler", "createView view:" + multiStreamPreviewView3);
                                multiStreamPreviewView = multiStreamPreviewView3;
                            }
                            multiStreamPreviewView.setTag("nearby-live-preview-view-tag");
                            frameLayout.addView(multiStreamPreviewView);
                            com.tencent.mars.xlog.Log.i("MultiStreamAutoPlay", "getOrCreateLiveView create view:" + multiStreamPreviewView);
                        }
                        boolean d17 = d(multiStreamPreviewView);
                        java.util.HashSet hashSet2 = this.f446950f;
                        if (d17) {
                            com.tencent.mars.xlog.Log.e("MultiStreamAutoPlay", "checkAutoPlay pos:" + i17 + " isCurPlayerView true , data: " + c17 + " set:" + hashSet2.size());
                        } else {
                            hashSet2.add(new wk2.d(i17, multiStreamPreviewView, c17));
                            multiStreamPreviewView.c(c17);
                        }
                    }
                }
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("MultiStreamAutoPlay", "checkAutoPlayInternal invalid pos:" + i17 + " view:" + findViewByPosition);
        }
    }

    public final void b(int i17) {
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = this.f446951g;
        android.view.View findViewByPosition = finderStaggeredGridLayoutManager.findViewByPosition(i17);
        if (findViewByPosition != null) {
            int i18 = finderStaggeredGridLayoutManager.f11924h;
            android.graphics.Rect rect = new android.graphics.Rect();
            findViewByPosition.getGlobalVisibleRect(rect);
            if ((((float) (i18 == 0 ? rect.width() : rect.height())) * 1.0f) / ((float) (i18 == 0 ? findViewByPosition.getWidth() : findViewByPosition.getHeight())) < 0.5f) {
                com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView multiStreamPreviewView = (com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView) findViewByPosition.findViewWithTag("nearby-live-preview-view-tag");
                if (multiStreamPreviewView != null ? d(multiStreamPreviewView) : false) {
                    com.tencent.mars.xlog.Log.i("MultiStreamAutoPlay", "stopCurrentView: pos");
                    this.f446953i.removeCallbacks(this.f446954j);
                    java.util.HashSet hashSet = this.f446950f;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (((wk2.d) next).f446938a == i17) {
                            arrayList.add(next);
                        }
                    }
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        e((wk2.d) it6.next());
                    }
                    kz5.h0.A(hashSet, new wk2.i(i17));
                }
            }
        }
    }

    public final uk2.a c(int i17) {
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f446948d;
            if (i17 < arrayList.size()) {
                return (uk2.a) arrayList.get(i17);
            }
        }
        com.tencent.mars.xlog.Log.w("MultiStreamAutoPlay", "getFeedByPos return for invalid pos:" + i17);
        return null;
    }

    public final boolean d(com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView multiStreamPreviewView) {
        java.lang.Object obj;
        java.util.Iterator it = this.f446950f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((wk2.d) obj).f446939b, multiStreamPreviewView)) {
                break;
            }
        }
        return obj != null;
    }

    public final void e(wk2.d dVar) {
        dVar.f446939b.d();
        com.tencent.mm.plugin.finder.live.multistream.panel.preview.MultiStreamPreviewView multiStreamPreviewView = dVar.f446939b;
        android.view.ViewParent parent = multiStreamPreviewView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(multiStreamPreviewView);
        }
        wk2.c cVar = this.f446952h;
        cVar.getClass();
        if (multiStreamPreviewView.getParent() != null) {
            android.view.ViewParent parent2 = multiStreamPreviewView.getParent();
            kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent2).removeView(multiStreamPreviewView);
        }
        mn0.b0 b0Var = multiStreamPreviewView.f111756d;
        if (b0Var != null && ((mn0.y) b0Var).b(false)) {
            multiStreamPreviewView.d();
        }
        java.util.HashSet hashSet = cVar.f446935a;
        hashSet.add(multiStreamPreviewView);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recycleView view:");
        sb6.append(multiStreamPreviewView);
        sb6.append(" isPlaying:");
        mn0.b0 b0Var2 = multiStreamPreviewView.f111756d;
        sb6.append(b0Var2 != null && ((mn0.y) b0Var2).b(false));
        sb6.append(" size:");
        sb6.append(hashSet.size());
        com.tencent.mars.xlog.Log.i("FinderLivePlayerViewRecycler", sb6.toString());
    }
}
