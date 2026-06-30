package j35;

/* loaded from: classes5.dex */
public class z implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.permission.PermissionActivity f297527d;

    public z(com.tencent.mm.pluginsdk.permission.PermissionActivity permissionActivity) {
        this.f297527d = permissionActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "onResume() goIgnoreBatteryOptimizations app_cancel");
        this.f297527d.finish();
    }
}
