package zo1;

/* loaded from: classes5.dex */
public final class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI f474621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f474623f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474624g;

    public g3(com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI, java.lang.String str, android.content.Intent intent, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f474621d = selectContactUI;
        this.f474622e = str;
        this.f474623f = intent;
        this.f474624g = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI.f92846x;
        com.tencent.mm.plugin.backup.roambackup.ui.pkg.SelectContactUI selectContactUI = this.f474621d;
        java.lang.String str = this.f474622e;
        wo1.v vVar = null;
        try {
            java.lang.Object newInstance = java.lang.Class.forName(str).newInstance();
            wo1.v vVar2 = newInstance instanceof wo1.v ? (wo1.v) newInstance : null;
            if (vVar2 != null) {
                vVar2.initAdapter(selectContactUI, this.f474623f);
                vVar = vVar2;
            }
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SelectContactUI", e17, "", new java.lang.Object[0]);
        }
        pm0.v.X(new zo1.f3(vVar, selectContactUI, this.f474624g, str));
    }
}
