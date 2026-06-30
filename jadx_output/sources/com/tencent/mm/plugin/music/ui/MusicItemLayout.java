package com.tencent.mm.plugin.music.ui;

/* loaded from: classes5.dex */
public class MusicItemLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f150701d;

    public MusicItemLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150701d = new android.view.GestureDetector(getContext(), new com.tencent.mm.plugin.music.ui.n(this, null));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.music.ui.t tVar = (com.tencent.mm.plugin.music.ui.t) getTag();
        if (!(tVar.f150788j == 2)) {
            if (!(tVar.f150785g.getX() <= motionEvent.getX() && motionEvent.getX() <= tVar.f150785g.getX() + ((float) tVar.f150785g.getMeasuredWidth()) && tVar.f150785g.getY() <= motionEvent.getY() && motionEvent.getY() <= tVar.f150785g.getY() + ((float) tVar.f150785g.getMeasuredHeight()))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f150701d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/music/ui/MusicItemLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/music/ui/MusicItemLayout", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public MusicItemLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f150701d = new android.view.GestureDetector(getContext(), new com.tencent.mm.plugin.music.ui.n(this, null));
    }
}
