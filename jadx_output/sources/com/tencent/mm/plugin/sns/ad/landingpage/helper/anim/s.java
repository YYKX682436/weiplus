package com.tencent.mm.plugin.sns.ad.landingpage.helper.anim;

/* loaded from: classes4.dex */
public class s extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 f163144a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var, android.os.Looper looper) {
        super(looper);
        this.f163144a = i0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$20");
        int i17 = message.what;
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = this.f163144a;
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.n(i0Var, new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.q(this));
        } else if (i17 == 2) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.n(i0Var, new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.r(this));
        } else if (i17 == 3) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).d0();
            i0Var.L(true, true);
        } else if (i17 == 4 && com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var) != null) {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.c(i0Var).P();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$20");
    }
}
