package in2;

/* loaded from: classes10.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f292928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f292929e;

    public x(android.widget.EditText editText, in2.f0 f0Var) {
        this.f292928d = editText;
        this.f292929e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f292928d.clearFocus();
        in2.f0 f0Var = this.f292929e;
        int i17 = f0Var.f292832q;
        f0Var.notifyItemChanged(i17, java.lang.Integer.valueOf(i17));
    }
}
