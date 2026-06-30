package k85;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sensitive.ui.PermissionDialogUI f305369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.sensitive.ui.PermissionDialogUI permissionDialogUI) {
        super(1);
        this.f305369d = permissionDialogUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f305369d.finish();
        yz5.l lVar = com.tencent.mm.sensitive.ui.PermissionDialogUI.f193192d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(booleanValue));
        }
        com.tencent.mm.sensitive.ui.PermissionDialogUI.f193192d = null;
        return jz5.f0.f302826a;
    }
}
