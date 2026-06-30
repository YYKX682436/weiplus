package p61;

/* loaded from: classes3.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI f352306d;

    public l(com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI bindGoogleContactUI) {
        this.f352306d = bindGoogleContactUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        gm0.j1.u().c().w(208905, java.lang.Boolean.TRUE);
        this.f352306d.finish();
    }
}
