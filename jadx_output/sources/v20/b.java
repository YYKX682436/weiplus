package v20;

/* loaded from: classes.dex */
public final class b implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f432749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f432750e;

    public b(r45.br2 br2Var, v65.n nVar) {
        this.f432749d = br2Var;
        this.f432750e = nVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        v65.n nVar = this.f432750e;
        r45.br2 br2Var = this.f432749d;
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "share finderObject " + br2Var.getString(7) + " cancel");
            nVar.a(new jz5.l(java.lang.Boolean.FALSE, ""));
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", "share finderObject " + br2Var.getString(7) + " to " + stringArrayListExtra);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String str = (java.lang.String) kz5.n0.Z(stringArrayListExtra);
        nVar.a(new jz5.l(bool, str != null ? str : ""));
    }
}
