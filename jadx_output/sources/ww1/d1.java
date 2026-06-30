package ww1;

/* loaded from: classes15.dex */
public class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ww1.k1 f450170a;

    public d1(ww1.l1 l1Var, ww1.k1 k1Var) {
        this.f450170a = k1Var;
    }

    public void a() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(1143L, 41L, 1L, false);
        boolean z17 = tw1.f.Di().f422451d;
        ww1.k1 k1Var = this.f450170a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "play isForground");
            if (k1Var.f450225d) {
                g0Var.d(14404, 1, k1Var.f450224c, "", "", java.lang.Integer.valueOf(k1Var.f450223b), "", "", "", com.tencent.mm.plugin.collect.model.voice.m.d().e());
                return;
            } else {
                g0Var.d(14404, 1, k1Var.f450224c, "", "", java.lang.Integer.valueOf(k1Var.f450223b));
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "play isBackground");
        if (k1Var.f450225d) {
            g0Var.d(14404, 2, k1Var.f450224c, "", "", java.lang.Integer.valueOf(k1Var.f450223b), "", "", "", com.tencent.mm.plugin.collect.model.voice.m.d().e());
        } else {
            g0Var.d(14404, 2, k1Var.f450224c, "", "", java.lang.Integer.valueOf(k1Var.f450223b));
        }
    }
}
