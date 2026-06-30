package g72;

/* loaded from: classes14.dex */
public class o extends android.text.method.LinkMovementMethod {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.zd5 f269240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI f269241b;

    public o(com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI, r45.zd5 zd5Var) {
        this.f269241b = faceDetectConfirmUI;
        this.f269240a = zd5Var;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView textView, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            int x17 = (int) ((motionEvent.getX() - textView.getTotalPaddingLeft()) + textView.getScrollX());
            int y17 = (int) ((motionEvent.getY() - textView.getTotalPaddingTop()) + textView.getScrollY());
            android.text.Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y17), x17);
            if (((android.text.style.ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class)).length > 0) {
                r45.zd5 zd5Var = this.f269240a;
                if (com.tencent.mm.sdk.platformtools.t8.K0(zd5Var.f391938e)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectConfirmUI", "promptInfo url is null");
                } else {
                    com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.T6(this.f269241b, zd5Var.f391938e);
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
