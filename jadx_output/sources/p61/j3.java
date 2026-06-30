package p61;

/* loaded from: classes5.dex */
public class j3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindQQUI f352296d;

    public j3(com.tencent.mm.plugin.account.bind.ui.BindQQUI bindQQUI) {
        this.f352296d = bindQQUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.account.bind.ui.BindQQUI bindQQUI = this.f352296d;
        intent.putExtra("kintent_hint", bindQQUI.getString(com.tencent.mm.R.string.j0c));
        intent.putExtra("from_unbind", true);
        j45.l.n(bindQQUI, "account", "com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI", intent, 1);
    }
}
