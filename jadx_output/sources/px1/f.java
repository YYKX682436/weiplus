package px1;

/* loaded from: classes12.dex */
public class f extends android.text.method.ArrowKeyMovementMethod {

    /* renamed from: a, reason: collision with root package name */
    public static px1.f f358823a;

    @Override // android.text.method.ArrowKeyMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            int totalPaddingLeft = x17 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y17 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            android.text.Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            px1.t[] tVarArr = (px1.t[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal + 1, px1.t.class);
            if (scrollX < nx1.q.b() && tVarArr.length != 0 && action == 0) {
                px1.t tVar = tVarArr[0];
                tVar.b(textView, spannable, motionEvent, tVar);
            }
        }
        return false;
    }
}
