package k13;

/* loaded from: classes10.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f303224d;

    public i1(k13.l1 l1Var) {
        this.f303224d = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i95.m c17 = i95.n0.c(h13.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (h13.l0.Vi((h13.l0) c17, null, 1, null)) {
            com.tencent.mars.xlog.Log.i("ForceNotify.MsgWindow", "vibrator.vibrate");
            if (com.tencent.mm.app.w.INSTANCE.f53889n) {
                ((android.os.Vibrator) ((jz5.n) this.f303224d.f303246x).getValue()).vibrate(new long[]{1000, 1000, 1000, 1000, 1000, 1000}, -1);
            } else {
                ((android.os.Vibrator) ((jz5.n) this.f303224d.f303246x).getValue()).vibrate(new long[]{1000, 1000, 1000, 1000, 1000, 1000}, -1);
            }
        }
    }
}
