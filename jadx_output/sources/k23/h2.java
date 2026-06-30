package k23;

/* loaded from: classes12.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f303581d;

    public h2(k23.j2 j2Var) {
        this.f303581d = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k23.j2 j2Var = this.f303581d;
        if (j2Var.getStartBtn().getWidth() > 0 && j2Var.getStartBtn().getHeight() > 0) {
            k23.j2.h(j2Var);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSStartRecognizeBtnModeSwitch", "startActionTriggerShimmerAnimation: startBtn size is 0, skip");
            j2Var.G = false;
        }
    }
}
