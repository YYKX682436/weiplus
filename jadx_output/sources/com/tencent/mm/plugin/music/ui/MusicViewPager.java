package com.tencent.mm.plugin.music.ui;

/* loaded from: classes5.dex */
public class MusicViewPager extends com.tencent.mm.ui.base.CustomViewPager {

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f150723d;

    public MusicViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150723d = new android.view.GestureDetector(getContext(), new com.tencent.mm.plugin.music.ui.p0(this, null));
        setScroller(new com.tencent.mm.plugin.music.ui.o0(this, getContext()));
    }

    @Override // com.tencent.mm.ui.base.CustomViewPager, com.tencent.mm.ui.mogic.WxViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (!super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        android.view.GestureDetector gestureDetector = this.f150723d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/music/ui/MusicViewPager", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/music/ui/MusicViewPager", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
