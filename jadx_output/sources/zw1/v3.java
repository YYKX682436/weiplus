package zw1;

/* loaded from: classes15.dex */
public class v3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.x3 f476827d;

    public v3(zw1.x3 x3Var) {
        this.f476827d = x3Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        zw1.x3 x3Var = this.f476827d;
        g0Var.d(25983, 7, java.lang.Integer.valueOf(x3Var.f476844a));
        if (com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI.W6(x3Var.f476846c, x3Var.f476844a)) {
            g4Var.add(0, 1, 0, com.tencent.mm.R.string.b_1);
        } else {
            g4Var.add(0, 1, 0, com.tencent.mm.R.string.b_c);
        }
        for (int i17 = 0; i17 < x3Var.f476845b.size(); i17++) {
            r45.uk4 uk4Var = (r45.uk4) x3Var.f476845b.get(i17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(uk4Var.f387432e)) {
                g4Var.add(0, i17 + 1 + 1, 0, uk4Var.f387432e);
            }
        }
    }
}
