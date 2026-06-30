package k71;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f304681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f304682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f304683f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.ui.widget.dialog.k0 k0Var, int i17) {
        super(1);
        this.f304681d = appCompatActivity;
        this.f304682e = k0Var;
        this.f304683f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.Button it = (android.widget.Button) obj;
        kotlin.jvm.internal.o.g(it, "it");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f304681d;
        if (appCompatActivity instanceof com.tencent.mm.plugin.account.ui.MobileInputUI) {
            com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = (com.tencent.mm.plugin.account.ui.MobileInputUI) appCompatActivity;
            mobileInputUI.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_actionsheet", "view_exp", mobileInputUI.S, 34575);
        } else if (appCompatActivity instanceof com.tencent.mm.plugin.account.ui.LoginUI) {
            com.tencent.mm.plugin.account.ui.LoginUI loginUI = (com.tencent.mm.plugin.account.ui.LoginUI) appCompatActivity;
            loginUI.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_actionsheet", "view_exp", loginUI.A, 34575);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f304682e;
        k0Var.v();
        db5.g4 g4Var = k0Var.L;
        k71.m mVar = k71.m.f304693f;
        android.view.MenuItem findItem = g4Var.findItem(5005);
        int i17 = this.f304683f;
        if (findItem != null) {
            v61.d.h("register_account", i17);
        }
        if (g4Var.findItem(com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT) != null) {
            v61.d.h("security_center_login", i17);
        }
        if (g4Var.findItem(7012) != null) {
            v61.d.h("frozen_account_login", i17);
        }
        return jz5.f0.f302826a;
    }
}
