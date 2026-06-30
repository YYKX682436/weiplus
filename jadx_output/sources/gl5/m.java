package gl5;

/* loaded from: classes15.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f273042d;

    public m(gl5.e0 e0Var) {
        this.f273042d = e0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        gl5.e0 e0Var = this.f273042d;
        if (e0Var.f272943a0) {
            e0Var.F();
        }
        android.view.ActionMode actionMode = e0Var.f272945c;
        if (actionMode != null) {
            actionMode.hide(0L);
            com.tencent.mars.xlog.Log.i("cmEdit.Editor", "mTextActionMode.hide(0)");
        }
    }
}
