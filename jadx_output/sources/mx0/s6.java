package mx0;

/* loaded from: classes5.dex */
public final class s6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332315e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, boolean z17) {
        super(0);
        this.f332314d = shootComposingPluginLayout;
        this.f332315e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mx0.l favoritePlugin;
        com.tencent.mm.ui.widget.dialog.f4 f4Var;
        favoritePlugin = this.f332314d.getFavoritePlugin();
        favoritePlugin.f332112o = !favoritePlugin.f332112o;
        favoritePlugin.f();
        com.tencent.mm.ui.widget.dialog.f4 f4Var2 = favoritePlugin.f332114q;
        if ((f4Var2 != null && f4Var2.isShowing()) && (f4Var = favoritePlugin.f332114q) != null) {
            f4Var.hide();
        }
        int i17 = this.f332315e ? com.tencent.mm.R.string.n1y : com.tencent.mm.R.string.n29;
        android.view.View view = favoritePlugin.f331814d;
        android.content.Context context = view.getContext();
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = j65.q.a(view.getContext()).getText(i17);
        favoritePlugin.f332114q = e4Var.c();
        return jz5.f0.f302826a;
    }
}
