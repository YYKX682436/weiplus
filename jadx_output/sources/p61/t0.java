package p61;

/* loaded from: classes5.dex */
public class t0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI f352377d;

    public t0(com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI) {
        this.f352377d = bindMContactIntroUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        boolean a17 = yp5.a.f464409a.a();
        com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI = this.f352377d;
        if (a17) {
            intent.putExtra("kintent_hint", bindMContactIntroUI.getString(com.tencent.mm.R.string.j0c));
        } else {
            intent.putExtra("kintent_hint", bindMContactIntroUI.getString(com.tencent.mm.R.string.j0d));
        }
        intent.putExtra("from_unbind", true);
        j45.l.n(bindMContactIntroUI, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", intent, 1);
    }
}
