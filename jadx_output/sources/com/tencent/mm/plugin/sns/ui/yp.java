package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class yp implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI f171640d;

    public yp(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        this.f171640d = snsSightPlayerUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.Y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI = this.f171640d;
        boolean z17 = snsSightPlayerUI.f167372h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.V6(snsSightPlayerUI).post(new com.tencent.mm.plugin.sns.ui.xp(this));
        }
        com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.e7(snsSightPlayerUI).setLoop(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        snsSightPlayerUI.f167368d.f289121i.f297910b++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        snsSightPlayerUI.i7(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsSightPlayerUI", "on play video error, what %d extra %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI = this.f171640d;
        com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.e7(snsSightPlayerUI).stop();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        boolean z17 = snsSightPlayerUI.f167386y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        snsSightPlayerUI.f167386y = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.plugin.sight.base.e.b());
        sb6.append("[SnsSightPlayerUI] on play video error, what ");
        sb6.append(i17);
        sb6.append(" extra ");
        sb6.append(i18);
        sb6.append(", path=");
        java.lang.String c76 = com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.c7(snsSightPlayerUI);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (c76 == null) {
            c76 = "";
        }
        sb6.append(c76);
        z65.c.b(android.util.Base64.encodeToString(sb6.toString().getBytes(), 2), "FullScreenPlaySight");
        java.lang.String c77 = com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.c7(snsSightPlayerUI);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.wp(this, m11.b1.Di().b3(c77, i65.a.g(snsSightPlayerUI.getContext()), snsSightPlayerUI.getContext(), -1), c77));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
        fp.k.b();
        int i17 = com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.Y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        this.f171640d.i7(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$4");
        return 0;
    }
}
