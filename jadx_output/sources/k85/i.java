package k85;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f305407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.app.Activity activity) {
        super(0);
        this.f305407d = activity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity = this.f305407d;
        android.content.Intent intent = activity.getIntent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessRequestPermissionDialog$2$realShow$1$1$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/sensitive/ui/PermissionSwitchCheckUtil$showBusinessRequestPermissionDialog$2$realShow$1$1$2$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
