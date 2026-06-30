package jf5;

/* loaded from: classes11.dex */
public final class m extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout f299480d;

    public m(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout) {
        this.f299480d = nativeSelectableLayout;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout nativeSelectableLayout = this.f299480d;
        if (!nativeSelectableLayout.getPartialSelectionEnabled()) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
            return;
        }
        if (nativeSelectableLayout.f204673t != null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
            return;
        }
        if (!nativeSelectableLayout.f204660d.d()) {
            com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout.b(nativeSelectableLayout, e17.getX(), e17.getY());
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
            return;
        }
        jf5.f0 i17 = nativeSelectableLayout.i(e17.getX(), e17.getY());
        if (i17 == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
            return;
        }
        jz5.l h17 = nativeSelectableLayout.h(e17.getX(), e17.getY());
        if (h17 == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
            return;
        }
        int intValue = ((java.lang.Number) h17.f302834e).intValue();
        e06.k c17 = nativeSelectableLayout.f204660d.c(i17);
        boolean z17 = false;
        if (c17 != null && c17.m(intValue)) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout.b(nativeSelectableLayout, e17.getX(), e17.getY());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/NativeSelectableLayout$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
