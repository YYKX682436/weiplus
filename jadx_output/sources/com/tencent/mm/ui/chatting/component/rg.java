package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class rg implements android.view.GestureDetector.OnDoubleTapListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.LoadableTextView f199855d;

    public rg(com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView) {
        this.f199855d = loadableTextView;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/LoadableTextView$gestureDetector$2$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.i(false, this, "com/tencent/mm/ui/chatting/component/LoadableTextView$gestureDetector$2$1", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = this.f199855d;
        yz5.p pVar = loadableTextView.f198557i;
        if (pVar != null) {
            return ((java.lang.Boolean) pVar.invoke(loadableTextView, e17)).booleanValue();
        }
        return false;
    }
}
