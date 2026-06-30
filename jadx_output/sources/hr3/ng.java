package hr3;

/* loaded from: classes11.dex */
public class ng implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI f283842d;

    public ng(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI) {
        this.f283842d = sayHiWithSnsPermissionUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = this.f283842d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = sayHiWithSnsPermissionUI.J1;
        if (j0Var != null) {
            j0Var.dismiss();
            sayHiWithSnsPermissionUI.J1 = null;
        }
        new com.tencent.mm.sdk.platformtools.b4(new hr3.mg(this), false).c(500L, 500L);
    }
}
