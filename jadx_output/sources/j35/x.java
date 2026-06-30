package j35;

/* loaded from: classes5.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.permission.PermissionActivity f297525d;

    public x(com.tencent.mm.pluginsdk.permission.PermissionActivity permissionActivity) {
        this.f297525d = permissionActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.permission.PermissionActivity permissionActivity = this.f297525d;
        permissionActivity.finish();
        j35.g0 g0Var = (j35.g0) j35.u.f297522b.remove(permissionActivity.f189515f);
        if (g0Var != null) {
            g0Var.a(permissionActivity.f189516g, 0, null);
        }
    }
}
