package e33;

/* loaded from: classes10.dex */
public class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f247275d;

    /* renamed from: e, reason: collision with root package name */
    public final t23.h2 f247276e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f247277f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f247278g;

    public h6(java.lang.ref.WeakReference weakReference, t23.h2 h2Var) {
        this.f247275d = weakReference;
        this.f247276e = h2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        t23.h2 h2Var;
        android.widget.EditText editText;
        android.app.ProgressDialog progressDialog;
        java.lang.ref.WeakReference weakReference = this.f247275d;
        if (weakReference == null || (h2Var = this.f247276e) == null) {
            return;
        }
        e33.y5 y5Var = (e33.y5) weakReference.get();
        if (y5Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryUI", "show category.");
            y5Var.f247556e = h2Var;
            y5Var.notifyDataSetChanged();
        }
        java.lang.ref.WeakReference weakReference2 = this.f247277f;
        if (weakReference2 != null && (progressDialog = (android.app.ProgressDialog) weakReference2.get()) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryUI", "tipDialog dismiss.");
            progressDialog.dismiss();
        }
        java.lang.ref.WeakReference weakReference3 = this.f247278g;
        if (weakReference3 == null || (editText = (android.widget.EditText) weakReference3.get()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryUI", "show keyboard.");
        editText.requestFocus();
        ((android.view.inputmethod.InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
    }
}
