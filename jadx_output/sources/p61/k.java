package p61;

/* loaded from: classes8.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI f352300e;

    public k(com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI, java.lang.String str) {
        this.f352300e = bindGoogleContactUI;
        this.f352299d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.f72928s;
        com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI = this.f352300e;
        bindGoogleContactUI.f72932g = this.f352299d;
        bindGoogleContactUI.T6(0);
    }
}
