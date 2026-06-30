package x51;

/* loaded from: classes5.dex */
public class a1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f451969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f451970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x51.c1 f451971f;

    public a1(x51.c1 c1Var, android.app.Activity activity, java.lang.Runnable runnable) {
        this.f451971f = c1Var;
        this.f451969d = activity;
        this.f451970e = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.sdk.platformtools.o4.L().putBoolean("had_show_permission_guild", true);
        android.app.Activity activity = this.f451969d;
        x51.c1 c1Var = this.f451971f;
        c1Var.getClass();
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(activity, new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 32, "", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionCheckHelper", "check init, summerper checkPermission checkStorage[%b]", java.lang.Boolean.valueOf(Di));
        java.lang.Runnable runnable = this.f451970e;
        if (Di) {
            c1Var.b(activity, runnable);
        } else {
            jx3.f.INSTANCE.idkeyStat(462L, 18L, 1L, true);
            c1Var.f451976a = runnable;
        }
    }
}
