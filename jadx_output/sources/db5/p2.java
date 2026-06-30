package db5;

/* loaded from: classes15.dex */
public class p2 implements db5.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMGridPaper f228464a;

    public p2(com.tencent.mm.ui.base.MMGridPaper mMGridPaper) {
        this.f228464a = mMGridPaper;
    }

    @Override // db5.y1
    public void a(int i17, int i18) {
        com.tencent.mm.ui.base.MMGridPaper mMGridPaper = this.f228464a;
        int i19 = mMGridPaper.f197403i;
        if ((java.lang.Math.abs(mMGridPaper.f197404m - i18) < 50 && java.lang.Math.abs(mMGridPaper.f197403i - i17) < 50) || i18 == 0 || i17 == 0) {
            return;
        }
        if (!mMGridPaper.E || mMGridPaper.f197403i <= i17 || mMGridPaper.D) {
            boolean z17 = mMGridPaper.K;
            mMGridPaper.D = false;
            if (!z17) {
                mMGridPaper.f197404m = i18;
                mMGridPaper.f197403i = i17;
            }
            mMGridPaper.f197405n = mMGridPaper.f197406o * mMGridPaper.f197411t * mMGridPaper.f197412u;
            mMGridPaper.d();
        }
    }
}
