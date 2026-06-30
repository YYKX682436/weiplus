package hq1;

/* loaded from: classes13.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.h0 f283098d;

    public c0(hq1.h0 h0Var) {
        this.f283098d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.h0 h0Var = this.f283098d;
        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Write data timeout, mac=%s, name=%s", a42.i.f(h0Var.f283110a), lq1.a.c(h0Var.f283111b));
        hq1.f0 f0Var = h0Var.f283114e;
        if (f0Var != null) {
            f0Var.b(h0Var.f283110a, false);
        }
        h0Var.f();
    }
}
