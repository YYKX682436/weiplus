package qq;

/* loaded from: classes8.dex */
public final class a implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f365856a;

    public a(android.content.Context context) {
        this.f365856a = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            r45.vs2 vs2Var = new r45.vs2();
            vs2Var.f388490h = "mock_" + java.lang.System.currentTimeMillis();
            vs2Var.f388503x = "tipsUuid_Card.Entrance.Right_11_" + java.lang.System.nanoTime();
            vs2Var.f388491i = 1800;
            java.util.LinkedList linkedList = vs2Var.f388489g;
            r45.f03 f03Var = new r45.f03();
            f03Var.f373891h = 1;
            f03Var.f373892i = "Card.Entrance.Right";
            f03Var.f373887d = 999;
            r45.ya0 ya0Var = new r45.ya0();
            f03Var.B = ya0Var;
            f03Var.f373894n = 1;
            try {
                boolean has = new org.json.JSONObject(str).has("nodes");
                qq.b bVar = qq.b.f365857a;
                if (has) {
                    kotlin.jvm.internal.o.d(str);
                    ya0Var.f390918d = qq.b.b(bVar, str);
                } else {
                    kotlin.jvm.internal.o.d(str);
                    ya0Var.f390918d = qq.b.a(bVar, str);
                }
            } catch (java.lang.Exception e17) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f365856a);
                e4Var.f211776c = e17.getMessage();
                e4Var.c();
            }
            linkedList.add(f03Var);
            vs2Var.f388487e = 700006;
            vs2Var.f388505z = 11;
            zy2.fa.D(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), vs2Var, "RedDotMock", null, false, null, 28, null);
        }
    }
}
