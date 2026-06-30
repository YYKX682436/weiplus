package k85;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f305405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f305406f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yz5.l lVar, d85.g0 g0Var, d85.f0 f0Var) {
        super(0);
        this.f305404d = lVar;
        this.f305405e = g0Var;
        this.f305406f = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context;
        java.lang.ref.WeakReference i17 = com.tencent.mm.app.w.INSTANCE.i();
        if (i17 == null || (context = (android.app.Activity) i17.get()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Intent intent = new android.content.Intent();
        yz5.l lVar = com.tencent.mm.sensitive.ui.PermissionDialogUI.f193192d;
        intent.putExtra("KEY_PERMISSION", this.f305405e.f227192d);
        intent.putExtra("KEY_BUSINESS", this.f305406f.f227176d);
        if (((context instanceof android.app.Activity) ^ true ? context : null) != null) {
            intent.addFlags(268435456);
        }
        intent.setClass(context, com.tencent.mm.sensitive.ui.PermissionDialogUI.class);
        com.tencent.mm.sensitive.ui.PermissionDialogUI.f193192d = this.f305404d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessRequestPermissionDialog$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessRequestPermissionDialog$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
