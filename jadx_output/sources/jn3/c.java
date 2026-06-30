package jn3;

/* loaded from: classes8.dex */
public final class c implements zy2.da {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jn3.g f300778a;

    public c(jn3.g gVar) {
        this.f300778a = gVar;
    }

    @Override // zy2.da
    public boolean a(r45.vs2 ctrInfo) {
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        int i17 = ctrInfo.f388487e;
        jn3.g gVar = this.f300778a;
        if (i17 >= 100001 && i17 < 199999) {
            java.util.LinkedList<r45.f03> show_infos = ctrInfo.f388489g;
            kotlin.jvm.internal.o.f(show_infos, "show_infos");
            for (r45.f03 f03Var : show_infos) {
                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
                jbVar.t0(ctrInfo);
                j75.f Ai = gVar.f300267d.Ai();
                if (Ai != null) {
                    kotlin.jvm.internal.o.d(f03Var);
                    Ai.B3(new sa0.h(jbVar, f03Var));
                }
            }
            return false;
        }
        if (i17 < 300000 || i17 >= 399999) {
            return false;
        }
        java.util.LinkedList<r45.f03> show_infos2 = ctrInfo.f388489g;
        kotlin.jvm.internal.o.f(show_infos2, "show_infos");
        for (r45.f03 f03Var2 : show_infos2) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = new com.tencent.mm.plugin.finder.extension.reddot.jb();
            jbVar2.t0(ctrInfo);
            j75.f Ai2 = gVar.f300267d.Ai();
            if (Ai2 != null) {
                kotlin.jvm.internal.o.d(f03Var2);
                Ai2.B3(new sa0.h(jbVar2, f03Var2));
            }
        }
        return false;
    }
}
