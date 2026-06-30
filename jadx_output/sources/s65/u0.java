package s65;

/* loaded from: classes11.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f403521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s65.x0 f403522e;

    public u0(s65.x0 x0Var, int i17) {
        this.f403522e = x0Var;
        this.f403521d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        s65.x0 x0Var = this.f403522e;
        ((android.app.NotificationManager) x0Var.A.getSystemService("notification")).cancel(99);
        if (this.f403521d == 2 && x0Var.f403530d == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP");
            intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
            x0Var.A.sendBroadcast(intent, com.tencent.mm.sdk.platformtools.v9.a());
        }
    }
}
