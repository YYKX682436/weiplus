package db2;

/* loaded from: classes.dex */
public final class h1 {
    public h1(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String keyword, r45.gd1 gd1Var, com.tencent.mm.protobuf.g gVar, r45.gd1 gd1Var2, com.tencent.mm.protobuf.g gVar2, boolean z17, int i17, yz5.p onBuildEnd) {
        kotlin.jvm.internal.o.g(keyword, "keyword");
        kotlin.jvm.internal.o.g(onBuildEnd, "onBuildEnd");
        onBuildEnd.invoke(gd1Var != null ? b(1, keyword, gd1Var, gVar, 0) : null, gd1Var2 != null ? b(z17 ? 3 : 2, keyword, gd1Var2, gVar2, i17) : null);
    }

    public final r45.cd1 b(int i17, java.lang.String str, r45.gd1 gd1Var, com.tencent.mm.protobuf.g gVar, int i18) {
        r45.cd1 cd1Var = new r45.cd1();
        cd1Var.set(0, java.lang.Integer.valueOf(i17));
        cd1Var.set(1, str);
        cd1Var.set(2, gd1Var);
        cd1Var.set(3, gVar);
        cd1Var.set(4, java.lang.Integer.valueOf(i18));
        return cd1Var;
    }

    public final void c(androidx.appcompat.app.AppCompatActivity activity, r45.cd1 cd1Var, r45.cd1 cd1Var2, yz5.p pVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        pq5.g l17 = new db2.i1(xy2.c.e(activity), cd1Var, cd1Var2, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class))).V6()).l();
        l17.I(activity);
        pm0.v.T(l17, new db2.g1(pVar));
    }
}
