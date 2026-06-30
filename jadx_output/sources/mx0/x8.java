package mx0;

/* loaded from: classes.dex */
public final class x8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.w1 f332437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332438f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, com.tencent.mm.ui.widget.dialog.w1 w1Var, java.lang.String str) {
        super(0);
        this.f332436d = shootComposingPluginLayout;
        this.f332437e = w1Var;
        this.f332438f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332436d;
        java.lang.String string = shootComposingPluginLayout.getContext().getResources().getString(com.tencent.mm.R.string.f490454vi);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.dialog.w1 w1Var = this.f332437e;
        if (w1Var == null) {
            w1Var = mx0.w8.f332424a;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(shootComposingPluginLayout.getContext());
        u1Var.g(this.f332438f);
        u1Var.n(string);
        u1Var.l(w1Var);
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
