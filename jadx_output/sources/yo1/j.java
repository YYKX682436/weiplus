package yo1;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f464125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI f464126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f464127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f464128g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI permissionRequestUI, kotlin.jvm.internal.c0 c0Var, po1.d dVar) {
        super(0);
        this.f464125d = u3Var;
        this.f464126e = permissionRequestUI;
        this.f464127f = c0Var;
        this.f464128g = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f464125d.dismiss();
        com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRequestUI permissionRequestUI = this.f464126e;
        java.lang.String str = permissionRequestUI.f92783d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save new device returned, isOk=");
        kotlin.jvm.internal.c0 c0Var = this.f464127f;
        sb6.append(c0Var.f310112d);
        sb6.append('.');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (c0Var.f310112d) {
            android.content.Intent putExtra = new android.content.Intent().putExtra("deviceId", this.f464128g.f357295a);
            kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
            permissionRequestUI.setResult(-1, putExtra);
            permissionRequestUI.finish();
        } else {
            androidx.appcompat.app.AppCompatActivity context = permissionRequestUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.mxt);
            e4Var.c();
        }
        return jz5.f0.f302826a;
    }
}
