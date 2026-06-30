package on2;

/* loaded from: classes.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f346859d;

    public c3(android.view.View view) {
        this.f346859d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context;
        android.widget.EditText editText = (android.widget.EditText) this.f346859d.findViewById(com.tencent.mm.R.id.f483739bx0);
        if (editText != null) {
            editText.requestFocus();
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
    }
}
