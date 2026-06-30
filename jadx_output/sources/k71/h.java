package k71;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f304685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k71.m f304686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f304687f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity appCompatActivity, k71.m mVar, int i17) {
        super(1);
        this.f304685d = appCompatActivity;
        this.f304686e = mVar;
        this.f304687f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.Button it = (android.widget.Button) obj;
        kotlin.jvm.internal.o.g(it, "it");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f304685d;
        if (appCompatActivity instanceof com.tencent.mm.plugin.account.ui.MobileInputUI) {
            com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = (com.tencent.mm.plugin.account.ui.MobileInputUI) appCompatActivity;
            mobileInputUI.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_actionsheet", "view_exp", mobileInputUI.S, 34575);
        } else if (appCompatActivity instanceof com.tencent.mm.plugin.account.ui.LoginUI) {
            com.tencent.mm.plugin.account.ui.LoginUI loginUI = (com.tencent.mm.plugin.account.ui.LoginUI) appCompatActivity;
            loginUI.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_actionsheet", "view_exp", loginUI.A, 34575);
        }
        k71.l.a(k71.l.f304692a, appCompatActivity, this.f304686e.f304699d, this.f304687f);
        return jz5.f0.f302826a;
    }
}
