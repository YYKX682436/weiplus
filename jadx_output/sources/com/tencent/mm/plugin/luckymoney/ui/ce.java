package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public final class ce implements android.view.View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View v17, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$doOpenHB$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewReceiveUI", "[onTouch] has click open button");
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$doOpenHB$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
