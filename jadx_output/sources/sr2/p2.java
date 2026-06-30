package sr2;

/* loaded from: classes10.dex */
public final /* synthetic */ class p2 extends kotlin.jvm.internal.m implements yz5.a {
    public p2(java.lang.Object obj) {
        super(0, obj, sr2.y2.class, "onClickDelete", "onClickDelete()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sr2.y2 y2Var = (sr2.y2) this.receiver;
        y2Var.f411816w = true;
        y2Var.getIntent().putExtra("saveLocation", false);
        ya2.p1 p1Var = y2Var.f411800d;
        if (p1Var == null) {
            kotlin.jvm.internal.o.o("locationWidget");
            throw null;
        }
        yv2.b bVar = (yv2.b) p1Var;
        bVar.f466202h = null;
        bVar.d(false);
        java.lang.String string = y2Var.getActivity().getResources().getString(com.tencent.mm.R.string.f492045o11);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        androidx.appcompat.app.AppCompatActivity activity = y2Var.getActivity();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
        e4Var.f211776c = string;
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
        androidx.appcompat.app.AppCompatActivity activity2 = y2Var.getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = (com.tencent.mm.plugin.finder.post.PostMainUIC) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class);
        postMainUIC.v7();
        postMainUIC.Z6();
        return jz5.f0.f302826a;
    }
}
