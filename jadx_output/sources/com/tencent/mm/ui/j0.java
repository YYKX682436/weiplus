package com.tencent.mm.ui;

/* loaded from: classes4.dex */
public class j0 implements android.view.View.OnTouchListener {
    public j0(com.tencent.mm.ui.n0 n0Var, com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        view.setTag(com.tencent.mm.R.id.ohu, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
        yj0.a.i(false, this, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
