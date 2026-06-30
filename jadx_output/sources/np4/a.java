package np4;

/* loaded from: classes10.dex */
public abstract class a {
    public static final com.tencent.mm.plugin.vlog.model.h1 a(rm5.v videoComposition) {
        kotlin.jvm.internal.o.g(videoComposition, "videoComposition");
        java.lang.System.currentTimeMillis();
        java.util.ArrayList<rm5.j> arrayList = videoComposition.f397584l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (rm5.j jVar : arrayList) {
            com.tencent.mm.plugin.vlog.model.i1 i1Var = new com.tencent.mm.plugin.vlog.model.i1(jVar.f397499a, jVar.f397500b, 0);
            i1Var.e(jVar.f397502d);
            i1Var.a(jVar.f397503e);
            i1Var.d(jVar.f397504f);
            i1Var.c(jVar.f397505g);
            i1Var.b(jVar.f397506h);
            rm5.j jVar2 = i1Var.f175627l;
            jVar2.f397512n.set(jVar.f397512n);
            jVar2.f397513o.set(jVar.f397513o);
            java.lang.System.currentTimeMillis();
            arrayList2.add(i1Var);
        }
        com.tencent.mm.plugin.vlog.model.h1 h1Var = new com.tencent.mm.plugin.vlog.model.h1(arrayList2);
        java.util.ArrayList arrayList3 = h1Var.f175597c;
        if (!arrayList3.isEmpty()) {
            java.lang.System.currentTimeMillis();
            java.util.Iterator it = arrayList3.iterator();
            long j17 = 0;
            com.tencent.mm.plugin.vlog.model.i1 i1Var2 = null;
            long j18 = 0;
            while (it.hasNext()) {
                com.tencent.mm.plugin.vlog.model.i1 i1Var3 = (com.tencent.mm.plugin.vlog.model.i1) it.next();
                rm5.j jVar3 = i1Var3.f175627l;
                long j19 = ((float) (jVar3.f397505g - jVar3.f397504f)) / jVar3.f397506h;
                boolean a17 = jVar3.f397515q.a();
                rm5.j jVar4 = i1Var3.f175627l;
                long min = java.lang.Math.min(a17 ? jVar4.f397515q.f397531c : 0L, java.lang.Math.min(j17, j19));
                rm5.j jVar5 = i1Var2 != null ? i1Var2.f175627l : null;
                if (jVar5 != null) {
                    jVar5.f397517s = j18 - (min / 2);
                }
                jVar4.f397516r = j18 - (min / 2);
                i1Var3.e(j18 - min);
                i1Var3.a(jVar4.f397502d + j19);
                j18 = jVar4.f397503e;
                j17 = j19;
                i1Var2 = i1Var3;
            }
            rm5.j jVar6 = ((com.tencent.mm.plugin.vlog.model.i1) kz5.n0.i0(arrayList3)).f175627l;
            jVar6.f397517s = jVar6.f397503e;
            java.lang.System.currentTimeMillis();
        }
        java.lang.System.currentTimeMillis();
        java.lang.System.currentTimeMillis();
        return h1Var;
    }
}
