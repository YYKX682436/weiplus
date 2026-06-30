package sp2;

/* loaded from: classes2.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f410971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(sp2.d3 d3Var) {
        super(0);
        this.f410971d = d3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sp2.d3 d3Var = this.f410971d;
        d3Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_router_to_profile", false);
        intent.putExtra("key_create_scene", 3);
        intent.putExtra("KEY_ENTRANCE_ID", d3Var.f411011e);
        intent.putExtra("KEY_ENTRANCE_TYPE", d3Var.f411012f);
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).getClass();
        com.tencent.mm.ui.MMActivity context = d3Var.f411007a;
        kotlin.jvm.internal.o.g(context, "context");
        intent.addFlags(67108864);
        intent.setClass(context, com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.class);
        com.tencent.mm.ui.vc startActivityForResult = context.startActivityForResult(intent);
        if (startActivityForResult != null) {
            ((com.tencent.mm.ui.bd) startActivityForResult).f197877a = new sp2.c3(d3Var);
        }
        return jz5.f0.f302826a;
    }
}
