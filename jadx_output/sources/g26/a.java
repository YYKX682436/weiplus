package g26;

/* loaded from: classes16.dex */
public abstract class a {
    public static f26.b2 a(boolean z17, boolean z18, g26.d dVar, g26.j jVar, g26.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        boolean z19 = z18;
        if ((i17 & 4) != 0) {
            dVar = g26.w.f268018a;
        }
        g26.d typeSystemContext = dVar;
        if ((i17 & 8) != 0) {
            jVar = g26.h.f267993a;
        }
        g26.j kotlinTypePreparator = jVar;
        if ((i17 & 16) != 0) {
            lVar = g26.k.f267994a;
        }
        g26.l kotlinTypeRefiner = lVar;
        kotlin.jvm.internal.o.g(typeSystemContext, "typeSystemContext");
        kotlin.jvm.internal.o.g(kotlinTypePreparator, "kotlinTypePreparator");
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new f26.b2(z17, z19, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }
}
