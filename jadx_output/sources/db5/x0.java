package db5;

/* loaded from: classes8.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f228567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.y0 f228568e;

    public x0(db5.y0 y0Var, int i17) {
        this.f228568e = y0Var;
        this.f228567d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.y0 y0Var = this.f228568e;
        ((android.app.Dialog) y0Var.f228576d.getTag()).dismiss();
        db5.z0 z0Var = y0Var.f228577e;
        if (z0Var != null) {
            z0Var.a(this.f228567d);
        }
    }
}
