package df2;

/* loaded from: classes3.dex */
public final class ti implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wi f231450d;

    public ti(df2.wi wiVar) {
        this.f231450d = wiVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        yg2.c securityDataScope;
        com.tencent.mm.plugin.finder.live.view.k0 b76 = this.f231450d.b7();
        if (b76 == null || (securityDataScope = b76.getSecurityDataScope()) == null) {
            return;
        }
        kotlinx.coroutines.z0.c(securityDataScope, null);
    }
}
