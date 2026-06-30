package z83;

/* loaded from: classes14.dex */
public final class e implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI f470737d;

    public e(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
        this.f470737d = kidsWatchRegGetInfoUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        kotlin.jvm.internal.o.g(s17, "s");
        int i17 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI.f143139t;
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f470737d;
        kidsWatchRegGetInfoUI.T6().f444003o.setEnabled((com.tencent.mm.sdk.platformtools.t8.K0(s17.toString()) || com.tencent.mm.sdk.platformtools.t8.J0(kidsWatchRegGetInfoUI.T6().f444002n.getText()) || !kidsWatchRegGetInfoUI.T6().f443999k.isChecked()) ? false : true);
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
