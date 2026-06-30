package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145858d;

    public g(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145858d = envelopeAppBarLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "tryStartShowEnvelopStory");
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145858d;
        if (envelopeAppBarLayout.K1 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopeAppBarLayout", "do not have story, dont show ");
            return;
        }
        boolean z17 = true;
        if (!envelopeAppBarLayout.f145788w.h1(envelopeAppBarLayout.A1)) {
            if (((in5.s0) envelopeAppBarLayout.f145788w.p0(envelopeAppBarLayout.A1)) != null) {
                envelopeAppBarLayout.f145788w.i1(1);
                return;
            }
            return;
        }
        envelopeAppBarLayout.getClass();
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_LuckyMoneyEnvelopePreviewVideo_Int, 0);
        if (g17 != 1 && (g17 == 2 || ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_STORY_DISABLE_AUTO_PLAY_INT_SYNC, 0)).intValue() != 0)) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "tryStartPreviewVideo");
            envelopeAppBarLayout.postDelayed(new com.tencent.mm.plugin.luckymoney.story.h(envelopeAppBarLayout), 10L);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "disable auto play");
        }
        envelopeAppBarLayout.f145788w.i1(2);
    }
}
