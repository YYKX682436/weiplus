package rx4;

/* loaded from: classes8.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401258d;

    public r1(rx4.h2 h2Var) {
        this.f401258d = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rx4.h2 h2Var = this.f401258d;
        if (h2Var.getActivity().isDestroyed() || h2Var.getActivity().isFinishing()) {
            com.tencent.mars.xlog.Log.i(h2Var.f401165d, "hitest parallel mode, activity destroyed, skip initial request");
            return;
        }
        h2Var.c7(java.lang.System.currentTimeMillis() + "_native", true);
        h2Var.b7();
    }
}
