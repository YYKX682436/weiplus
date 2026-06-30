package z83;

/* loaded from: classes5.dex */
public final class o extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI f470748a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI, long j17, long j18) {
        super(j17, j18);
        this.f470748a = kidsWatchRegMobileVerifyUI;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        int i17 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI.f143153s;
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI = this.f470748a;
        kidsWatchRegMobileVerifyUI.T6().f444015k.setEnabled(true);
        kidsWatchRegMobileVerifyUI.T6().f444015k.setText(kidsWatchRegMobileVerifyUI.getString(com.tencent.mm.R.string.g8f));
        kidsWatchRegMobileVerifyUI.T6().f444015k.setTextColor(kidsWatchRegMobileVerifyUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478769gp));
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        int i17 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI.f143153s;
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI = this.f470748a;
        kidsWatchRegMobileVerifyUI.T6().f444015k.setText(kidsWatchRegMobileVerifyUI.getString(com.tencent.mm.R.string.g8e, "" + (j17 / 1000)));
    }
}
