package yo1;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f464117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f464118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI f464119f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f464120g;

    public f(android.net.Uri uri, po1.d dVar, com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI permissionRegainUI, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f464117d = uri;
        this.f464118e = dVar;
        this.f464119f = permissionRegainUI;
        this.f464120g = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        to1.g gVar = to1.g.f420911a;
        com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI permissionRegainUI = this.f464119f;
        po1.d dVar = permissionRegainUI.f92782e;
        if (dVar == null) {
            kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME);
            throw null;
        }
        fo1.n g17 = gVar.g(this.f464117d, this.f464118e, dVar.f357299e);
        com.tencent.mars.xlog.Log.i(permissionRegainUI.f92781d, "[saveOldPath] error code of save is " + g17);
        nf.e.f(new yo1.e(this.f464120g, g17, permissionRegainUI));
    }
}
