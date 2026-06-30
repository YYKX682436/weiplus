package ry4;

/* loaded from: classes.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f401658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.NestedScrollEditText f401659e;

    public l(ry4.c0 c0Var, com.tencent.mm.ui.base.NestedScrollEditText nestedScrollEditText) {
        this.f401658d = c0Var;
        this.f401659e = nestedScrollEditText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.app.AppCompatActivity activity = this.f401658d.getActivity();
        if (activity == null) {
            return;
        }
        java.lang.Object systemService = activity.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandEditUIC", "[autoFocus] showSoftInput=%s", java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(this.f401659e, 0)));
    }
}
