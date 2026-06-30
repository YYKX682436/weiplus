package rm5;

/* loaded from: classes10.dex */
public final class i {
    public i(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.util.List trackList) {
        kotlin.jvm.internal.o.g(trackList, "trackList");
        if (trackList.isEmpty()) {
            return;
        }
        java.util.Iterator it = trackList.iterator();
        rm5.j jVar = null;
        long j17 = 0;
        long j18 = 0;
        while (it.hasNext()) {
            rm5.j jVar2 = (rm5.j) it.next();
            long j19 = ((float) (jVar2.f397505g - jVar2.f397504f)) / jVar2.f397506h;
            long min = java.lang.Math.min(jVar2.f397515q.a() ? jVar2.f397515q.f397531c : 0L, java.lang.Math.min(j17, j19));
            if (jVar != null) {
                jVar.f397517s = j18 - (min / 2);
            }
            jVar2.f397516r = j18 - (min / 2);
            jVar2.c(j18 - min);
            jVar2.b(jVar2.f397502d + j19);
            j18 = jVar2.f397503e;
            jVar = jVar2;
            j17 = j19;
        }
        rm5.j jVar3 = (rm5.j) kz5.n0.i0(trackList);
        jVar3.f397517s = jVar3.f397503e;
    }
}
