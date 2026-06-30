package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes4.dex */
public class p1 implements android.view.View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.widget.TextView textView = (android.widget.TextView) view;
        java.lang.CharSequence text = textView.getText();
        if (!(text instanceof android.text.SpannedString) || (action != 1 && action != 0)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int totalPaddingLeft = x17 - textView.getTotalPaddingLeft();
        int totalPaddingTop = y17 - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        android.text.Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f17 = scrollX;
        if (f17 > layout.getLineWidth(lineForVertical)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f17);
        android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) ((android.text.SpannedString) text).getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
        if (clickableSpanArr.length == 0) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (action == 0) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        clickableSpanArr[0].onClick(textView);
        yj0.a.i(true, this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
