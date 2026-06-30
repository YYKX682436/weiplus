package gt4;

/* loaded from: classes13.dex */
public class m1 extends q35.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gt4.r1 f275470g;

    public m1(gt4.r1 r1Var) {
        this.f275470g = r1Var;
    }

    @Override // q35.c
    public void a() {
    }

    @Override // q35.c
    public void b(boolean z17) {
        gt4.r1 r1Var = this.f275470g;
        long j17 = r1Var.f275531y;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (r1Var.f275532z) {
            if (elapsedRealtime < 80) {
                return;
            }
        } else if (elapsedRealtime < 1200) {
            return;
        }
        r1Var.f275531y = android.os.SystemClock.elapsedRealtime();
        r1Var.f275532z = true;
        if (r1Var.A) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletScratchShakeView", "onStartShakeOrClick, already finish clear mask");
            return;
        }
        if (r1Var.b()) {
            return;
        }
        if (r1Var.f275530x) {
            r1Var.f275529w += r1Var.getHeight() / 6;
            r1Var.c();
        } else {
            r1Var.f275528v += r1Var.getHeight() / 6;
            r1Var.c();
        }
        r1Var.f275530x = !r1Var.f275530x;
        if (!r1Var.f275525s) {
            com.tencent.mm.sdk.platformtools.u3.i(new gt4.n1(r1Var), 50L);
            r1Var.f275525s = true;
        }
        r1Var.b();
    }
}
