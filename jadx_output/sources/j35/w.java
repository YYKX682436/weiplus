package j35;

/* loaded from: classes5.dex */
public class w implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.permission.PermissionActivity f297524d;

    public w(com.tencent.mm.pluginsdk.permission.PermissionActivity permissionActivity) {
        this.f297524d = permissionActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.permission.PermissionActivity permissionActivity = this.f297524d;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "START_SETTINGS_REQUEST click ok");
            permissionActivity.startActivityForResult(permissionActivity.f189519m, 1);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", java.lang.Integer.valueOf(permissionActivity.f189518i), e17.getMessage());
        }
    }
}
