package gl5;

/* loaded from: classes15.dex */
public class l implements android.view.ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f273034a;

    public l(gl5.e0 e0Var) {
        this.f273034a = e0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        gl5.e0 e0Var = this.f273034a;
        if (e0Var.f272948f != null) {
            e0Var.U.post(e0Var.f272949g);
        }
    }
}
