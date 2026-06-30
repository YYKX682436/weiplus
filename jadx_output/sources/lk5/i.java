package lk5;

/* loaded from: classes13.dex */
public final class i extends androidx.fragment.app.v0 implements androidx.lifecycle.m1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASActivity f319036h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.ui.vas.VASActivity vASActivity, android.os.Handler handler) {
        super(vASActivity instanceof android.app.Activity ? vASActivity : null, vASActivity, handler, 0);
        this.f319036h = vASActivity;
    }

    @Override // androidx.fragment.app.s0
    public android.view.View b(int i17) {
        return this.f319036h.get_activity().findViewById(i17);
    }

    @Override // androidx.fragment.app.s0
    public boolean c() {
        android.view.Window window = this.f319036h.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // androidx.fragment.app.v0
    public void d(java.lang.String prefix, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter writer, java.lang.String[] strArr) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(writer, "writer");
        this.f319036h.dump(prefix, fileDescriptor, writer, strArr);
    }

    @Override // androidx.fragment.app.v0
    public java.lang.Object e() {
        return this.f319036h;
    }

    @Override // androidx.fragment.app.v0
    public android.view.LayoutInflater f() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f319036h;
        android.view.LayoutInflater cloneInContext = vASActivity.getLayoutInflater().cloneInContext(vASActivity.get_activity());
        kotlin.jvm.internal.o.f(cloneInContext, "cloneInContext(...)");
        return cloneInContext;
    }

    @Override // androidx.fragment.app.v0
    public void g(androidx.fragment.app.Fragment fragment, java.lang.String[] permissions, int i17) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(permissions, "permissions");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(permissions);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(fragment, arrayList.toArray(), "com/tencent/mm/ui/vas/VASActivity$_hostCallback$2$1", "onRequestPermissionsFromFragment", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        fragment.requestPermissions((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(fragment, "com/tencent/mm/ui/vas/VASActivity$_hostCallback$2$1", "onRequestPermissionsFromFragment", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        return this.f319036h.getViewModel();
    }

    @Override // androidx.fragment.app.v0
    public boolean h(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        return !this.f319036h.isFinishing();
    }

    @Override // androidx.fragment.app.v0
    public boolean i(java.lang.String permission) {
        kotlin.jvm.internal.o.g(permission, "permission");
        return z2.h.b(this.f319036h, permission);
    }

    @Override // androidx.fragment.app.v0
    public void j(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f319036h.startActivityFromFragment(fragment, intent, i17, bundle);
    }

    @Override // androidx.fragment.app.v0
    public void k(androidx.fragment.app.Fragment fragment, android.content.IntentSender intentSender, int i17, android.content.Intent intent, int i18, int i19, int i27, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f319036h.startIntentSenderFromFragment(fragment, intentSender, i17, intent, i18, i19, i27, bundle);
    }

    @Override // androidx.fragment.app.v0
    public void l() {
        this.f319036h.supportInvalidateOptionsMenu();
    }
}
