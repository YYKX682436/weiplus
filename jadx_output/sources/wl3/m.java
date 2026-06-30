package wl3;

/* loaded from: classes15.dex */
public class m extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView f447074d;

    public m(com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView musicPlayerLyricView) {
        this.f447074d = musicPlayerLyricView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView musicPlayerLyricView = this.f447074d;
        if (musicPlayerLyricView.g()) {
            musicPlayerLyricView.getClass();
        }
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView musicPlayerLyricView = this.f447074d;
        if (!musicPlayerLyricView.g()) {
            return super.onFling(motionEvent, motionEvent2, f17, f18);
        }
        musicPlayerLyricView.C.fling(0, (int) musicPlayerLyricView.D, 0, (int) f18, 0, 0, (int) musicPlayerLyricView.e(((java.util.ArrayList) musicPlayerLyricView.f150831h).size() - 1), (int) musicPlayerLyricView.e(0));
        musicPlayerLyricView.H = true;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView musicPlayerLyricView = this.f447074d;
        if (!musicPlayerLyricView.g()) {
            return super.onScroll(motionEvent, motionEvent2, f17, f18);
        }
        float f19 = musicPlayerLyricView.D + (-f18);
        musicPlayerLyricView.D = f19;
        musicPlayerLyricView.D = java.lang.Math.min(f19, musicPlayerLyricView.e(0));
        musicPlayerLyricView.D = java.lang.Math.max(musicPlayerLyricView.D, musicPlayerLyricView.e(((java.util.ArrayList) musicPlayerLyricView.f150831h).size() - 1));
        musicPlayerLyricView.invalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.music.ui.view.MusicPlayerLyricView musicPlayerLyricView = this.f447074d;
        if (musicPlayerLyricView.g() && musicPlayerLyricView.F) {
            int y17 = musicPlayerLyricView.N - ((int) motionEvent.getY());
            float f17 = Float.MAX_VALUE;
            int i17 = 0;
            for (int i18 = 0; i18 < ((java.util.ArrayList) musicPlayerLyricView.f150831h).size(); i18++) {
                float f18 = y17;
                if (java.lang.Math.abs((musicPlayerLyricView.D + f18) - musicPlayerLyricView.e(i18)) < f17) {
                    f17 = java.lang.Math.abs((musicPlayerLyricView.D + f18) - musicPlayerLyricView.e(i18));
                    i17 = i18;
                }
            }
            long j17 = ((wl3.p) ((java.util.ArrayList) musicPlayerLyricView.f150831h).get(i17)).f447077d;
            musicPlayerLyricView.b();
            musicPlayerLyricView.getClass();
        }
        return super.onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/music/ui/view/MusicPlayerLyricView$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
