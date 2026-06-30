package gt4;

/* loaded from: classes3.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f275453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f275454e;

    public j(android.content.Context context, android.widget.EditText editText) {
        this.f275453d = context;
        this.f275454e = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((android.view.inputmethod.InputMethodManager) this.f275453d.getSystemService("input_method")).showSoftInput(this.f275454e, 2);
    }
}
