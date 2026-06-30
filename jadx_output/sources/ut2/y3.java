package ut2;

/* loaded from: classes4.dex */
public final class y3 extends android.text.method.LinkMovementMethod {
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView widget, android.text.Spannable buffer, android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(widget, "widget");
        kotlin.jvm.internal.o.g(buffer, "buffer");
        kotlin.jvm.internal.o.g(event, "event");
        int action = event.getAction();
        if (action != 0 && action != 1) {
            return false;
        }
        int offsetForHorizontal = widget.getLayout().getOffsetForHorizontal(widget.getLayout().getLineForVertical((((int) event.getY()) - widget.getTotalPaddingTop()) + widget.getScrollY()), (((int) event.getX()) - widget.getTotalPaddingLeft()) + widget.getScrollX());
        android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) buffer.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
        kotlin.jvm.internal.o.d(clickableSpanArr);
        if (!(clickableSpanArr.length == 0)) {
            return super.onTouchEvent(widget, buffer, event);
        }
        android.text.Selection.removeSelection(buffer);
        return false;
    }
}
