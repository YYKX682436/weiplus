package zw1;

/* loaded from: classes5.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.t4 f476793d;

    public s4(zw1.t4 t4Var) {
        this.f476793d = t4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        zw1.t4 t4Var = this.f476793d;
        t4Var.f476806c.hideVKB();
        ((android.view.inputmethod.InputMethodManager) t4Var.f476806c.getSystemService("input_method")).hideSoftInputFromWindow(t4Var.f476806c.F.getWindowToken(), 0);
    }
}
