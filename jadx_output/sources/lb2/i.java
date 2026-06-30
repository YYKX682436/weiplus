package lb2;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f317737d;

    public i(android.widget.EditText editText) {
        this.f317737d = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.EditText editText = this.f317737d;
        editText.requestFocus();
        editText.selectAll();
    }
}
