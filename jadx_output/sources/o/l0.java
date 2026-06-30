package o;

/* loaded from: classes15.dex */
public class l0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o.n0 f341744d;

    public l0(o.n0 n0Var) {
        this.f341744d = n0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        o.n0 n0Var = this.f341744d;
        if (!n0Var.isShowing() || n0Var.f341761o.D) {
            return;
        }
        android.view.View view = n0Var.f341766t;
        if (view == null || !view.isShown()) {
            n0Var.dismiss();
        } else {
            n0Var.f341761o.show();
        }
    }
}
