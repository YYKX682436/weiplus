package db5;

/* loaded from: classes11.dex */
public class e5 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMProgressBar f228327d;

    public e5(com.tencent.mm.ui.base.MMProgressBar mMProgressBar) {
        this.f228327d = mMProgressBar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.ui.base.MMProgressBar mMProgressBar = this.f228327d;
        int i17 = mMProgressBar.f197520f;
        int i18 = mMProgressBar.f197519e;
        int i19 = i17 - i18;
        if (i19 <= 0) {
            return false;
        }
        int i27 = (int) (i19 * 0.6d);
        if (i27 <= 0) {
            i27 = 1;
        }
        int i28 = i18 + i27;
        mMProgressBar.f197519e = i28;
        com.tencent.mm.ui.base.MMProgressBar.a(mMProgressBar, i28);
        com.tencent.mm.sdk.platformtools.b4 b4Var = mMProgressBar.f197524m;
        int i29 = mMProgressBar.f197518d;
        long j17 = ((i29 - i19) * 40) / i29;
        b4Var.c(j17, j17);
        return false;
    }
}
