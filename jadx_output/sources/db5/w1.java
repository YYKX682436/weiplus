package db5;

/* loaded from: classes8.dex */
public class w1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMFalseProgressBar f228559a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.ui.base.MMFalseProgressBar mMFalseProgressBar, android.os.Looper looper) {
        super(looper);
        this.f228559a = mMFalseProgressBar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        java.lang.Float valueOf;
        int i17 = message.what;
        com.tencent.mm.ui.base.MMFalseProgressBar mMFalseProgressBar = this.f228559a;
        switch (i17) {
            case 1000:
                int i18 = com.tencent.mm.ui.base.MMFalseProgressBar.f197333o;
                mMFalseProgressBar.setVisibility(0);
                mMFalseProgressBar.setAlpha(1.0f);
                return;
            case 1001:
                float f17 = mMFalseProgressBar.f197335e;
                if (f17 < 600.0f) {
                    mMFalseProgressBar.f197335e = f17 + mMFalseProgressBar.f197336f;
                } else if (f17 >= 600.0f && f17 < 800.0f) {
                    mMFalseProgressBar.f197335e = f17 + mMFalseProgressBar.f197337g;
                } else if (f17 >= 800.0f && f17 < 920.0f) {
                    mMFalseProgressBar.f197335e = f17 + mMFalseProgressBar.f197338h;
                }
                com.tencent.mm.sdk.platformtools.n3 n3Var = mMFalseProgressBar.f197341n;
                if (n3Var != null) {
                    if (mMFalseProgressBar.f197335e < 920.0f) {
                        n3Var.sendEmptyMessageDelayed(1001, 10L);
                    } else {
                        n3Var.removeMessages(1001);
                    }
                }
                mMFalseProgressBar.setProgress((int) mMFalseProgressBar.f197335e);
                return;
            case 1002:
                if (mMFalseProgressBar.f197334d) {
                    float f18 = mMFalseProgressBar.f197335e;
                    if (f18 < 950.0f) {
                        float f19 = f18 + mMFalseProgressBar.f197339i;
                        mMFalseProgressBar.f197335e = f19;
                        mMFalseProgressBar.f197335e = f19 <= 950.0f ? f19 : 950.0f;
                        valueOf = java.lang.Float.valueOf(1.0f);
                    } else {
                        float f27 = f18 + 1.0f;
                        mMFalseProgressBar.f197335e = f27;
                        valueOf = java.lang.Float.valueOf(((1000.0f - f27) * 0.01f) + 0.3f);
                    }
                    com.tencent.mm.sdk.platformtools.n3 n3Var2 = mMFalseProgressBar.f197341n;
                    if (n3Var2 != null) {
                        if (mMFalseProgressBar.f197335e < 1000.0f) {
                            n3Var2.sendEmptyMessageDelayed(1002, 10L);
                        } else {
                            mMFalseProgressBar.f197335e = 1000.0f;
                            n3Var2.removeMessages(1002);
                            n3Var2.sendEmptyMessageDelayed(1003, 10L);
                        }
                    }
                    mMFalseProgressBar.setAlpha(valueOf.floatValue());
                    mMFalseProgressBar.setProgress((int) mMFalseProgressBar.f197335e);
                    return;
                }
                return;
            case 1003:
                mMFalseProgressBar.f197335e = 0.0f;
                mMFalseProgressBar.f197334d = false;
                mMFalseProgressBar.postInvalidateDelayed(200L);
                mMFalseProgressBar.setVisibility(8);
                return;
            default:
                return;
        }
    }
}
