package cw2;

/* loaded from: classes2.dex */
public final class g4 implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar f223727d;

    public g4(com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar) {
        this.f223727d = finderLongVideoPlayerSeekBar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent p17, float f17, float f18) {
        kotlin.jvm.internal.o.g(p17, "p1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent p07) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p07);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$setVideoLongPressStateChangeListener$1", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar = this.f223727d;
        finderLongVideoPlayerSeekBar.N = true;
        yz5.l lVar = finderLongVideoPlayerSeekBar.L;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$setVideoLongPressStateChangeListener$1", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent p17, float f17, float f18) {
        kotlin.jvm.internal.o.g(p17, "p1");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent p07) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(p07);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$setVideoLongPressStateChangeListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(p07, "p0");
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$setVideoLongPressStateChangeListener$1", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
