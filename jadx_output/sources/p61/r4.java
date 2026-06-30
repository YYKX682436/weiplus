package p61;

/* loaded from: classes11.dex */
public class r4 implements y61.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.MobileFriendUI f352365a;

    public r4(com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI) {
        this.f352365a = mobileFriendUI;
    }

    @Override // y61.f
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileFriendUI", "syncAddrBookAndUpload onSyncEnd suc:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            java.lang.System.currentTimeMillis();
            gm0.j1.d().g(new r61.t1(r61.q0.g(), r61.q0.e()));
        } else {
            com.tencent.mm.plugin.account.bind.ui.MobileFriendUI mobileFriendUI = this.f352365a;
            android.app.ProgressDialog progressDialog = mobileFriendUI.f73086g;
            if (progressDialog != null) {
                progressDialog.dismiss();
                mobileFriendUI.f73086g = null;
            }
        }
    }
}
