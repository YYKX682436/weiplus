package mx0;

/* loaded from: classes5.dex */
public final class u3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f332368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332369e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(android.content.Context context, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332368d = context;
        this.f332369e = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f332368d;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 0, false);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332369e;
        z2Var.m(shootComposingPluginLayout.getResources().getString(com.tencent.mm.R.string.f490373t6), shootComposingPluginLayout.getResources().getString(com.tencent.mm.R.string.f490007i9));
        z2Var.o(0);
        z2Var.v(shootComposingPluginLayout.getResources().getColor(com.tencent.mm.R.color.a0c));
        mx0.s3 s3Var = new mx0.s3(z2Var);
        mx0.t3 t3Var = new mx0.t3(z2Var, shootComposingPluginLayout);
        z2Var.D = s3Var;
        z2Var.E = t3Var;
        z2Var.f212063o = true;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489467eo4, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.vhf);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        z2Var.j(inflate);
        return z2Var;
    }
}
