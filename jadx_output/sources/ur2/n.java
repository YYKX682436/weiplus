package ur2;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur2.o f430406d;

    public n(ur2.o oVar) {
        this.f430406d = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ur2.o oVar = this.f430406d;
        java.lang.Object systemService = oVar.f430407d.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(oVar.f430415o, 0);
        }
    }
}
