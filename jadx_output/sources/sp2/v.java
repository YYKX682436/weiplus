package sp2;

/* loaded from: classes2.dex */
public final class v extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.b0 f411237d;

    public v(sp2.b0 b0Var) {
        this.f411237d = b0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        int w17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("LiveEntranceFragmentUICMoreIcon", "onDoubleTap");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sp2.b0 b0Var = this.f411237d;
        if (currentTimeMillis - b0Var.f410983i > 1000) {
            b0Var.f410983i = java.lang.System.currentTimeMillis();
            androidx.appcompat.app.AppCompatActivity activity = b0Var.getActivity();
            com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI finderLiveSquareNewEntranceUI = activity instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI ? (com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI) activity : null;
            if (finderLiveSquareNewEntranceUI != null) {
                com.tencent.mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragment fragment = finderLiveSquareNewEntranceUI.f121545w;
                kotlin.jvm.internal.o.g(fragment, "fragment");
                androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(fragment).a(sp2.r.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                sp2.o2 o2Var = ((sp2.r) a17).f411192d;
                if (o2Var == null) {
                    kotlin.jvm.internal.o.o("liveFriendsCallback");
                    throw null;
                }
                com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = o2Var.f411139j;
                if (finderParentRecyclerView == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderParentRecyclerView.getLayoutManager();
                if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
                    int[] iArr = new int[2];
                    ((androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager).u(iArr);
                    w17 = iArr[0];
                } else {
                    w17 = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w() : 0;
                }
                com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView2 = o2Var.f411139j;
                if (finderParentRecyclerView2 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "[onActionbarClick] position=" + w17 + " childRecyclerView: " + finderParentRecyclerView2.g1());
                com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView3 = o2Var.f411139j;
                if (finderParentRecyclerView3 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                finderParentRecyclerView3.setCanScrollVertically(true);
                com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView4 = o2Var.f411139j;
                if (finderParentRecyclerView4 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                boolean z17 = w17 <= 12;
                com.tencent.mars.xlog.Log.i("FinderParentRecyclerView", "scrollToTop isNeedSmooth: " + z17);
                com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView g17 = finderParentRecyclerView4.g1();
                if (g17 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(g17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView", "scrollToTop", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
                    g17.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(g17, "com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView", "scrollToTop", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
                }
                if (z17) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(finderParentRecyclerView4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView", "scrollToTop", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    finderParentRecyclerView4.c1(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(finderParentRecyclerView4, "com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView", "scrollToTop", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
                if (w17 <= 12) {
                    com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = o2Var.f411155r;
                    if (wxRefreshLayout == null) {
                        kotlin.jvm.internal.o.o("refreshLayout");
                        throw null;
                    }
                    wxRefreshLayout.postDelayed(new sp2.f0(o2Var), 20L);
                } else {
                    com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = o2Var.f411155r;
                    if (wxRefreshLayout2 == null) {
                        kotlin.jvm.internal.o.o("refreshLayout");
                        throw null;
                    }
                    wxRefreshLayout2.postDelayed(new sp2.f0(o2Var), 100L);
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("LiveEntranceFragmentUICMoreIcon", "onSingleTapConfirmed");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("LiveEntranceFragmentUICMoreIcon", "onSingleTapUp");
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon$initTitleView$gestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
