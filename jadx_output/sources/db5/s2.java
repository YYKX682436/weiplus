package db5;

/* loaded from: classes15.dex */
public class s2 implements db5.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMGridPaper f228503a;

    public s2(com.tencent.mm.ui.base.MMGridPaper mMGridPaper) {
        this.f228503a = mMGridPaper;
    }

    @Override // db5.z1
    public void a(int i17, int i18, boolean z17) {
        com.tencent.mm.ui.base.MMGridPaper mMGridPaper = this.f228503a;
        int i19 = mMGridPaper.f197408q;
        int i27 = mMGridPaper.f197409r;
        int i28 = mMGridPaper.f197410s;
        int i29 = mMGridPaper.f197408q;
        if (i18 > i29 || i29 <= 0) {
            int i37 = mMGridPaper.f197409r;
            if (i18 >= i37 && i37 < mMGridPaper.f197410s - 1) {
                mMGridPaper.f197402h.post(new db5.r2(this, i18));
            }
        } else {
            mMGridPaper.f197402h.post(new db5.q2(this, i18));
        }
        mMGridPaper.f197406o = i18;
        mMGridPaper.f197399e.setSelectedDot(i18);
    }
}
