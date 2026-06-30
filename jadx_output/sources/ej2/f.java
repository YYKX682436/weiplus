package ej2;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej2.j f253294d;

    public f(ej2.j jVar) {
        this.f253294d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.EditText editText = this.f253294d.f253302e;
        if (editText != null) {
            editText.requestFocus();
        }
    }
}
