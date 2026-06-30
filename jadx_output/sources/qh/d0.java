package qh;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f363331d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qh.f0 f363332e;

    public d0(qh.f0 f0Var, qh.b0 b0Var) {
        this.f363332e = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        qh.f0 f0Var = this.f363332e;
        if (f0Var.f363344p) {
            android.os.Message obtain = android.os.Message.obtain(f0Var.f363336e);
            obtain.what = this.f363331d;
            obtain.arg1 = 3;
            f0Var.f363336e.sendMessageAtFrontOfQueue(obtain);
            this.f363331d = this.f363331d == 2 ? 1 : 2;
            f0Var.f363336e.postDelayed(this, f0Var.f363347s);
        }
    }
}
