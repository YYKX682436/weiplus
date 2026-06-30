package yo1;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f464114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fo1.n f464115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI f464116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.ui.widget.dialog.u3 u3Var, fo1.n nVar, com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI permissionRegainUI) {
        super(0);
        this.f464114d = u3Var;
        this.f464115e = nVar;
        this.f464116f = permissionRegainUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        this.f464114d.dismiss();
        fo1.n nVar = this.f464115e;
        int ordinal = nVar.ordinal();
        com.tencent.mm.plugin.backup.roambackup.ui.permission.PermissionRegainUI permissionRegainUI = this.f464116f;
        if (ordinal == 1) {
            i17 = com.tencent.mm.R.string.mym;
        } else {
            if (ordinal != 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, nVar);
                permissionRegainUI.setResult(-1, intent);
                permissionRegainUI.finish();
                return jz5.f0.f302826a;
            }
            i17 = com.tencent.mm.R.string.mzv;
        }
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(permissionRegainUI);
        e4Var.d(i17);
        e4Var.b(com.tencent.mm.R.raw.exclamation_mark_circle_regular);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
