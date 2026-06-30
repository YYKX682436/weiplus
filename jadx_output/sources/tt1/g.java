package tt1;

/* loaded from: classes15.dex */
public class g implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.base.CardBaseUI f421820d;

    public g(com.tencent.mm.plugin.card.base.CardBaseUI cardBaseUI) {
        this.f421820d = cardBaseUI;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.card.base.CardBaseUI cardBaseUI = this.f421820d;
        if (!z17) {
            cardBaseUI.f7();
            return true;
        }
        if (f18 != -85.0f && f17 != -1000.0f) {
            cardBaseUI.f94642r = f18;
            cardBaseUI.f94643s = f17;
            wt1.g0 ij6 = xt1.t0.ij();
            float f19 = cardBaseUI.f94642r;
            float f27 = cardBaseUI.f94643s;
            ij6.f449280d = f19;
            ij6.f449281e = f27;
            ij6.f449282f = java.lang.System.currentTimeMillis() / 1000;
            cardBaseUI.g7();
        }
        if (cardBaseUI.f94644t) {
            return false;
        }
        cardBaseUI.f94644t = true;
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_PLAYINFO_SUCC, f17, f18, (int) d18);
        return false;
    }
}
