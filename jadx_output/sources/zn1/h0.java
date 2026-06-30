package zn1;

/* loaded from: classes11.dex */
public final class h0 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.Future f474445a;

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        java.util.concurrent.Future future = this.f474445a;
        boolean z17 = false;
        if (future != null && !future.isDone()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("UsbDeviceManager", "[onEnterForeground] Already connecting device, skip");
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        zn1.g0 g0Var = zn1.g0.f474443d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f474445a = t0Var.k(g0Var, 0L);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
    }
}
