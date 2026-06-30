package os3;

/* loaded from: classes3.dex */
public class q implements android.view.View.OnTouchListener {
    public q(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/ComposeUI$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        if ((action == 0 || action == 1) && !view.hasFocus()) {
            view.requestFocus();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$13", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
