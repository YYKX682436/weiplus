package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public class c implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.remittance.ui.b f157653d;

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/ClickMovementMethod", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (this.f157653d == null) {
            this.f157653d = new com.tencent.mm.plugin.remittance.ui.b(view);
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        textView.setMovementMethod(null);
        android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(textView.getText());
        int action = motionEvent.getAction();
        if (action == 0 || action == 1) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            int totalPaddingLeft = x17 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y17 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            android.text.Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) newSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 0) {
                    view.postDelayed(this.f157653d, android.view.ViewConfiguration.getLongPressTimeout());
                } else {
                    view.removeCallbacks(this.f157653d);
                    clickableSpanArr[0].onClick(textView);
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/remittance/ui/ClickMovementMethod", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        } else if (action == 3) {
            view.removeCallbacks(this.f157653d);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/remittance/ui/ClickMovementMethod", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
