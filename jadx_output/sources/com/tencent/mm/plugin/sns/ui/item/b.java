package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes.dex */
public class b implements android.view.View.OnTouchListener {
    public b(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            view.setTag(com.tencent.mm.R.id.ohu, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$1");
        return false;
    }
}
