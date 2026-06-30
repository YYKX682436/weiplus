package kl4;

/* loaded from: classes11.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f308971d;

    public y(kl4.a0 a0Var) {
        this.f308971d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        il4.l lVar = il4.l.f292142a;
        il4.l.f292146e = null;
        kl4.a0 a0Var = this.f308971d;
        a0Var.f308869f = true;
        a0Var.f308876p = false;
        ll4.d dVar = a0Var.f308868e;
        com.tencent.mars.xlog.Log.i(a0Var.f308880t, "Ting-Trace [" + a0Var.a() + "] call playerCore[" + dVar + "] stop()");
        if (dVar != null) {
            dVar.stop();
        }
        if (dVar != null) {
            dVar.release();
        }
    }
}
