package s61;

/* loaded from: classes15.dex */
public class f implements com.tencent.mm.sdk.platformtools.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI f403343a;

    public f(com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI) {
        this.f403343a = findMContactAddUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean a() {
        com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI = this.f403343a;
        try {
            findMContactAddUI.f73130v = o25.b.e(findMContactAddUI);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FindMContactAddUI", e17, "", new java.lang.Object[0]);
        }
        r61.n0 n0Var = findMContactAddUI.f73117f;
        n0Var.f392912g = findMContactAddUI.f73130v;
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        gm0.j1.b().c();
        m61.k.Ai().getClass();
        n0Var.g(null);
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean b() {
        com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI = this.f403343a;
        android.app.ProgressDialog progressDialog = findMContactAddUI.f73118g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            findMContactAddUI.f73118g = null;
        }
        findMContactAddUI.f73117f.notifyDataSetChanged();
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|listMFriendData";
    }
}
