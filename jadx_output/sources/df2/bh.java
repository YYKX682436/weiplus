package df2;

/* loaded from: classes3.dex */
public final class bh extends if2.b implements android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f229804m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f229805n;

    /* renamed from: o, reason: collision with root package name */
    public final u26.w f229806o;

    /* renamed from: p, reason: collision with root package name */
    public final long f229807p;

    /* renamed from: q, reason: collision with root package name */
    public long f229808q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f229809r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.GestureDetector f229810s;

    /* renamed from: t, reason: collision with root package name */
    public if2.d0 f229811t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229804m = "Live.LiveDoubleClickLikeController";
        this.f229806o = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
        this.f229807p = 600L;
        this.f229809r = new java.util.LinkedList();
        jz5.h.b(new df2.vg(this));
    }

    public final void Z6(int i17, int i18) {
        boolean z17 = ((mm2.c1) business(mm2.c1.class)).F;
        java.lang.String str = this.f229804m;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "[sendXy] live room can not like");
            return;
        }
        df2.hh hhVar = (df2.hh) controller(df2.hh.class);
        if (hhVar != null && !hhVar.f230327n) {
            kotlinx.coroutines.r2 r2Var = hhVar.f230328o;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            hhVar.f230327n = true;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DOUBLE_CLICK_GUIDE_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        int i19 = i17 - 50;
        if (i19 < 0) {
            i19 = 0;
        }
        int dimension = (i18 - 100) - ((int) O6().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
        int i27 = dimension >= 0 ? dimension : 0;
        com.tencent.mars.xlog.Log.i(str, "[sendXy] clickX = " + i19 + ", clickY = " + i27);
        this.f229808q = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.ah(this, i19, i27, null), 3, null);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeController", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeController", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.String str = this.f229804m;
        com.tencent.mars.xlog.Log.i(str, "onDown");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i(str, "[checkIsLegalInterval] now = " + currentTimeMillis + ", lastClickTimeStamp = " + this.f229808q + ", interval = " + (currentTimeMillis - this.f229808q));
        if (currentTimeMillis - this.f229808q < this.f229807p) {
            com.tencent.mars.xlog.Log.i(str, "onDown, legal interval");
            Z6((int) e17.getX(), (int) e17.getY());
        } else {
            com.tencent.mars.xlog.Log.i(str, "onDown, not legal interval");
            com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = (com.tencent.mm.plugin.finder.live.plugin.x80) R6(com.tencent.mm.plugin.finder.live.plugin.x80.class);
            if (x80Var != null) {
                com.tencent.mm.plugin.finder.live.plugin.x80.A1(x80Var, null, e17, 1, null);
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeController", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeController", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeController", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeController", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) S6(com.tencent.mm.R.id.ti7);
        this.f229805n = frameLayout;
        if (frameLayout != null) {
            frameLayout.setClickable(true);
        }
        android.widget.FrameLayout frameLayout2 = this.f229805n;
        if (frameLayout2 != null) {
            frameLayout2.setFocusable(true);
        }
        android.widget.FrameLayout frameLayout3 = this.f229805n;
        if (frameLayout3 != null) {
            frameLayout3.removeAllViews();
        }
        android.widget.FrameLayout frameLayout4 = this.f229805n;
        if (frameLayout4 != null) {
            frameLayout4.setVisibility(8);
        }
        if (this.f229810s == null) {
            android.view.GestureDetector gestureDetector = new android.view.GestureDetector(O6(), this);
            this.f229810s = gestureDetector;
            gestureDetector.setOnDoubleTapListener(this);
            android.widget.FrameLayout frameLayout5 = this.f229805n;
            if (frameLayout5 != null) {
                frameLayout5.setOnTouchListener(new df2.xg(this));
            }
        }
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.zg(this, null), 3, null);
        android.widget.FrameLayout frameLayout6 = this.f229805n;
        if (frameLayout6 != null) {
            if2.d0 d0Var = new if2.d0(frameLayout6, this);
            this.f229811t = d0Var;
            this.f291103i = new df2.wg(d0Var);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f229805n = null;
        this.f229810s = null;
        this.f229809r.clear();
        this.f229811t = null;
    }
}
