package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes4.dex */
public final class x implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f191296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f191297e;

    public x(android.text.Spannable spannable, android.widget.TextView textView) {
        this.f191296d = spannable;
        this.f191297e = textView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.text.style.ClickableSpan[] clickableSpanArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/MMLinkSpanLogic$Companion$setSpanTouch$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) view;
        android.widget.TextView textView2 = this.f191297e;
        boolean z17 = false;
        android.text.Spannable spannable = this.f191296d;
        if ((action == 1 || action == 3) && (clickableSpanArr = (android.text.style.ClickableSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.ClickableSpan.class)) != null) {
            for (android.text.style.ClickableSpan clickableSpan : clickableSpanArr) {
                if (clickableSpan instanceof com.tencent.mm.pluginsdk.ui.span.z0) {
                    ((com.tencent.mm.pluginsdk.ui.span.z0) clickableSpan).setIsPressed(false);
                    textView2.invalidate();
                }
            }
        }
        if (action == 0 || action == 1) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            int paddingLeft = x17 - textView.getPaddingLeft();
            int paddingTop = y17 - textView.getPaddingTop();
            int scrollX = paddingLeft + textView.getScrollX();
            int scrollY = paddingTop + textView.getScrollY();
            android.text.Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            android.text.style.ClickableSpan[] clickableSpanArr2 = (android.text.style.ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
            if (clickableSpanArr2.length != 0) {
                android.text.style.ClickableSpan clickableSpan2 = clickableSpanArr2[0];
                if (action == 0) {
                    if (clickableSpan2 instanceof com.tencent.mm.pluginsdk.ui.span.z0) {
                        ((com.tencent.mm.pluginsdk.ui.span.z0) clickableSpan2).setIsPressed(true);
                        textView2.invalidate();
                    }
                    android.text.Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan2), spannable.getSpanEnd(clickableSpan2));
                } else if (action == 1) {
                    clickableSpan2.onClick(textView);
                }
                z17 = true;
            } else {
                android.text.Selection.removeSelection(spannable);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMSg.MMLinkSpanTextView", "touch " + motionEvent.getX() + ", " + motionEvent.getY() + ", ret:" + z17);
        yj0.a.i(z17, this, "com/tencent/mm/pluginsdk/ui/span/MMLinkSpanLogic$Companion$setSpanTouch$touchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
