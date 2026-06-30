package j35;

/* loaded from: classes14.dex */
public class d0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog f297503d;

    public d0(com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog requestFloatWindowPermissionDialog) {
        this.f297503d = requestFloatWindowPermissionDialog;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog requestFloatWindowPermissionDialog = this.f297503d;
        if (requestFloatWindowPermissionDialog.f189529f) {
            return;
        }
        j35.f0 f0Var = com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.f189525g;
        if (f0Var != null) {
            f0Var.b(requestFloatWindowPermissionDialog);
            com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog.f189525g.d();
        }
        requestFloatWindowPermissionDialog.finish();
    }
}
