package z83;

/* loaded from: classes14.dex */
public final class g implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI f470739a;

    public g(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI) {
        this.f470739a = kidsWatchRegGetInfoUI;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        kotlin.jvm.internal.o.g(compoundButton, "<anonymous parameter 0>");
        int i17 = com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI.f143139t;
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI kidsWatchRegGetInfoUI = this.f470739a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(kidsWatchRegGetInfoUI.T6().f444002n.getText().toString()) && !com.tencent.mm.sdk.platformtools.t8.K0(kidsWatchRegGetInfoUI.T6().f444001m.getText().toString()) && z17) {
            kidsWatchRegGetInfoUI.T6().f444003o.setEnabled(z17);
        }
        if (z17) {
            return;
        }
        kidsWatchRegGetInfoUI.T6().f444003o.setEnabled(z17);
    }
}
