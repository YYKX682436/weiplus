package yo1;

/* loaded from: classes5.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f464129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f464130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI f464131f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f464132g;

    public k(android.net.Uri uri, po1.d dVar, com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI permissionRequestUI, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f464129d = uri;
        this.f464130e = dVar;
        this.f464131f = permissionRequestUI;
        this.f464132g = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI permissionRequestUI = this.f464131f;
        po1.d dVar = this.f464130e;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        try {
            boolean f17 = to1.g.f420911a.f(this.f464129d, dVar);
            c0Var.f310112d = f17;
            if (f17) {
                oo1.o.f347151a.a(dVar.f357295a);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(permissionRequestUI.f92783d, th6, "", new java.lang.Object[0]);
        }
        pm0.v.X(new yo1.j(this.f464132g, permissionRequestUI, c0Var, dVar));
    }
}
