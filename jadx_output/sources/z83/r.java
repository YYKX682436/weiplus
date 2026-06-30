package z83;

/* loaded from: classes5.dex */
public final class r implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI f470751d;

    public r(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI) {
        this.f470751d = kidsWatchRegMobileVerifyUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        kotlin.jvm.internal.o.g(s17, "s");
        int i17 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI.f143153s;
        this.f470751d.T6().f444008d.setEnabled(!com.tencent.mm.sdk.platformtools.t8.K0(s17.toString()));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(s17, "s");
    }
}
