package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes2.dex */
public final class v0 implements android.view.GestureDetector.OnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f173382d;

    public v0(yz5.a aVar) {
        this.f173382d = aVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
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
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$onBindViewHolder$gestureDetector$2", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$onBindViewHolder$gestureDetector$2", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
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

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$onBindViewHolder$gestureDetector$2", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        this.f173382d.invoke();
        yj0.a.i(false, this, "com/tencent/mm/plugin/textstatus/convert/topic/TopicSquareItemConvert$onBindViewHolder$gestureDetector$2", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
