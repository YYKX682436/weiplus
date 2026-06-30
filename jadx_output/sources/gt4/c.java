package gt4;

/* loaded from: classes.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f275402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f275403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f275404f;

    public c(boolean z17, android.widget.EditText editText, android.content.Context context) {
        this.f275402d = z17;
        this.f275403e = editText;
        this.f275404f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.EditText editText;
        if (this.f275402d && (editText = this.f275403e) != null && fp.h.c(28)) {
            editText.requestFocus();
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f275404f.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(editText, 0);
            }
        }
    }
}
