package la5;

/* loaded from: classes14.dex */
public class z0 extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f317648a;

    public z0() {
        this.f317648a = false;
        this.f317648a = la5.b.f317600a.h();
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(android.view.View view, int i17) {
        java.lang.CharSequence text;
        la5.c cVar = la5.b.f317600a;
        if (cVar.g(true)) {
            boolean z17 = this.f317648a;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSecureAccessibilityAndroidRDelegate", "shouldSpeakPassWord: %s, sendAccessibilityEvent eventType:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
            if (i17 == 32768) {
                super.sendAccessibilityEvent(view, i17);
                return;
            }
            if (!z17) {
                if (view != null) {
                    if (i17 == 128 || i17 == 1) {
                        cVar.e(view);
                        return;
                    }
                    return;
                }
                return;
            }
            if (view != null) {
                if (i17 == 128 || i17 == 1) {
                    if (view instanceof android.widget.EditText) {
                        android.widget.EditText editText = (android.widget.EditText) view;
                        text = !com.tencent.mm.sdk.platformtools.t8.J0(editText.getText()) ? editText.getText() : !com.tencent.mm.sdk.platformtools.t8.J0(editText.getContentDescription()) ? editText.getContentDescription() : editText.getHint() != null ? editText.getHint() : null;
                    } else {
                        text = view instanceof android.widget.TextView ? com.tencent.mm.sdk.platformtools.t8.J0(view.getContentDescription()) ? ((android.widget.TextView) view).getText() : view.getContentDescription() : view.getContentDescription();
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.J0(text)) {
                        return;
                    }
                    cVar.i(view, text.toString());
                }
            }
        }
    }
}
