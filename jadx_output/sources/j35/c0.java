package j35;

/* loaded from: classes14.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog f297502d;

    public c0(com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog requestFloatWindowPermissionDialog) {
        this.f297502d = requestFloatWindowPermissionDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog requestFloatWindowPermissionDialog = this.f297502d;
        requestFloatWindowPermissionDialog.f189529f = true;
        qp1.l0 l0Var = com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.f189526h;
        if (l0Var != null) {
            l0Var.c();
            com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.f189526h = null;
        }
        j35.f0 f0Var = com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.f189525g;
        if (f0Var != null) {
            f0Var.b(requestFloatWindowPermissionDialog);
            com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.f189525g.d();
        }
        requestFloatWindowPermissionDialog.finish();
    }
}
