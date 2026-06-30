package gt4;

/* loaded from: classes9.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gt4.r1 f275496d;

    public p1(gt4.r1 r1Var) {
        this.f275496d = r1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        gt4.r1 r1Var = this.f275496d;
        int width = r1Var.getWidth();
        int height = r1Var.getHeight();
        r1Var.f275513d.getPixels(r1Var.f275524r, 0, width, 0, 0, width, height);
        float f17 = width * height;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i17 = 0; i17 < f17; i17++) {
            if (r1Var.f275524r[i17] == 0) {
                f19 += 1.0f;
            }
        }
        if (f19 >= 0.0f && f17 > 0.0f) {
            f18 = f19 / f17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletScratchShakeView", "erasePercent: %s", java.lang.Float.valueOf(f18));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletScratchShakeView", "");
        if (f18 >= r1Var.B) {
            r1Var.A = true;
            if (r1Var.f275526t) {
                return;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new gt4.q1(r1Var));
            r1Var.f275526t = true;
        }
    }
}
