package jf5;

/* loaded from: classes3.dex */
public final class p0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.SelectionHandleView f299496d;

    public p0(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.SelectionHandleView selectionHandleView) {
        this.f299496d = selectionHandleView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/SelectionHandleView$initPopup$window$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.SelectionHandleView selectionHandleView = this.f299496d;
        if (action == 0 && (x17 < 0 || x17 >= selectionHandleView.getWidth() || y17 < 0 || y17 >= selectionHandleView.getHeight())) {
            yz5.a onOutsideTouched = selectionHandleView.getOnOutsideTouched();
            if (onOutsideTouched != null) {
                onOutsideTouched.invoke();
            }
            yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/SelectionHandleView$initPopup$window$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (motionEvent.getAction() != 4) {
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/SelectionHandleView$initPopup$window$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        yz5.a onOutsideTouched2 = selectionHandleView.getOnOutsideTouched();
        if (onOutsideTouched2 != null) {
            onOutsideTouched2.invoke();
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/SelectionHandleView$initPopup$window$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
