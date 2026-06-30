package x36;

/* loaded from: classes16.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final x36.g a() {
        x36.g gVar = x36.g.f451675j;
        kotlin.jvm.internal.o.d(gVar);
        x36.g gVar2 = gVar.f451678f;
        if (gVar2 == null) {
            long nanoTime = java.lang.System.nanoTime();
            x36.g.class.wait(x36.g.f451673h);
            x36.g gVar3 = x36.g.f451675j;
            kotlin.jvm.internal.o.d(gVar3);
            if (gVar3.f451678f != null || java.lang.System.nanoTime() - nanoTime < x36.g.f451674i) {
                return null;
            }
            return x36.g.f451675j;
        }
        long nanoTime2 = gVar2.f451679g - java.lang.System.nanoTime();
        if (nanoTime2 > 0) {
            long j17 = nanoTime2 / 1000000;
            x36.g.class.wait(j17, (int) (nanoTime2 - (1000000 * j17)));
            return null;
        }
        x36.g gVar4 = x36.g.f451675j;
        kotlin.jvm.internal.o.d(gVar4);
        gVar4.f451678f = gVar2.f451678f;
        gVar2.f451678f = null;
        return gVar2;
    }
}
