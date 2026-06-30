package hr3;

/* loaded from: classes11.dex */
public class vh implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f284121d;

    public vh(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3) {
        this.f284121d = sayHiWithSnsPermissionUI3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f284121d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = sayHiWithSnsPermissionUI3.M1;
        if (j0Var != null) {
            j0Var.dismiss();
            sayHiWithSnsPermissionUI3.M1 = null;
        }
    }
}
