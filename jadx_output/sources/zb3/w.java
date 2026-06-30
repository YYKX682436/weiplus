package zb3;

/* loaded from: classes9.dex */
public class w implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471295d;

    public w(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI) {
        this.f471295d = snsLuckyMoneyPrepareUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        double d17;
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = this.f471295d;
        if (snsLuckyMoneyPrepareUI.f145757h.c() == 3 || snsLuckyMoneyPrepareUI.f145756g.c() == 3) {
            d17 = 0.0d;
        } else {
            int input = snsLuckyMoneyPrepareUI.f145756g.getInput();
            d17 = snsLuckyMoneyPrepareUI.f145757h.getInput();
            if (snsLuckyMoneyPrepareUI.f145772z == 0) {
                d17 *= input;
            }
        }
        if (d17 == 0.0d || d17 > snsLuckyMoneyPrepareUI.E.f145183e || snsLuckyMoneyPrepareUI.f145771y.c()) {
            snsLuckyMoneyPrepareUI.f145760n.setClickable(false);
            snsLuckyMoneyPrepareUI.f145760n.setEnabled(false);
        } else {
            snsLuckyMoneyPrepareUI.f145760n.setClickable(true);
            snsLuckyMoneyPrepareUI.f145760n.setEnabled(true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPrepareUI", "onTimeExpired & check: amount=" + d17 + ", hasErr=" + snsLuckyMoneyPrepareUI.f145771y.c());
        snsLuckyMoneyPrepareUI.H.e();
        return false;
    }
}
