package p61;

/* loaded from: classes5.dex */
public class h0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI f352278d;

    public h0(com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI) {
        this.f352278d = bindMContactIntroUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI = this.f352278d;
        com.tencent.mm.ui.MMWizardActivity.X6(bindMContactIntroUI, new android.content.Intent(bindMContactIntroUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI.class));
    }
}
