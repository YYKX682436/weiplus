package un;

/* loaded from: classes.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.k0 f429252d;

    public f0(un.k0 k0Var) {
        this.f429252d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        un.k0 k0Var = this.f429252d;
        un.k0.V6(k0Var).b().getInputText();
        k0Var.P6();
        android.widget.EditText inputText = un.k0.V6(k0Var).b().getInputText();
        if (inputText != null) {
            inputText.requestFocus();
            inputText.postDelayed(new un.e0(k0Var), 128L);
        }
    }
}
