package t53;

/* loaded from: classes8.dex */
public final class y implements u53.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f415839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t53.i f415840b;

    public y(android.app.ProgressDialog progressDialog, t53.i iVar, android.content.Context context) {
        this.f415839a = progressDialog;
        this.f415840b = iVar;
    }

    @Override // u53.v
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "isBlackListAssociateWithWAGame isAssociate:%b,isOwnBlack:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        android.app.ProgressDialog progressDialog = this.f415839a;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f415839a.dismiss();
        }
        t53.i iVar = this.f415840b;
        if (iVar != null) {
            com.tencent.mm.ui.mi miVar = (com.tencent.mm.ui.mi) iVar;
            miVar.f209145a.f197080q.f291824a = java.lang.Boolean.valueOf(z18);
            miVar.f209145a.f197079p.f291824a = java.lang.Boolean.valueOf(z17);
            miVar.f209145a.runOnUiThread(new com.tencent.mm.ui.li(miVar));
        }
    }
}
