package k93;

/* loaded from: classes8.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.widget.InputClearablePreference f305889d;

    public g(com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference) {
        this.f305889d = inputClearablePreference;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.label.ui.widget.InputClearablePreference inputClearablePreference = this.f305889d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = inputClearablePreference.S;
        if (mMEditText != null) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) mMEditText.getContext().getSystemService("input_method");
            inputClearablePreference.S.requestFocus();
            inputMethodManager.showSoftInput(inputClearablePreference.S, 0);
            inputClearablePreference.S.setCursorVisible(false);
            inputClearablePreference.S.setCursorVisible(true);
        }
    }
}
