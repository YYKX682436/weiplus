package yf;

/* loaded from: classes7.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.view.MotionEvent f461340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461341e;

    public e1(yf.i0 i0Var, yf.t0 t0Var) {
        this.f461341e = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        yf.i0 i0Var = this.f461341e;
        if (!i0Var.f461372v || i0Var.f461367q == 0 || i0Var.f461368r == 0) {
            return;
        }
        i0Var.A(this.f461340d.getX(), this.f461340d.getY());
    }
}
