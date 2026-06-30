package s14;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f402143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f402144b;

    public c(int i17, android.widget.TextView textView) {
        this.f402143a = i17;
        this.f402144b = textView;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initScrollView$1$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        this.f402144b.setAlpha(i18 / this.f402143a);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI$initScrollView$1$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}
