package r16;

/* loaded from: classes16.dex */
public abstract class b extends r16.d0 {
    public static final void a(o06.g gVar, java.util.LinkedHashSet linkedHashSet, y16.s sVar, boolean z17) {
        boolean z18;
        for (o06.m mVar : y16.v.a(sVar, y16.i.f458955o, null, 2, null)) {
            if (mVar instanceof o06.g) {
                o06.g gVar2 = (o06.g) mVar;
                if (gVar2.l0()) {
                    n16.g name = gVar2.getName();
                    kotlin.jvm.internal.o.f(name, "getName(...)");
                    o06.j e17 = sVar.e(name, w06.d.f441949g);
                    gVar2 = e17 instanceof o06.g ? (o06.g) e17 : e17 instanceof o06.d2 ? ((d26.p0) ((o06.d2) e17)).s0() : null;
                }
                if (gVar2 == null) {
                    continue;
                } else {
                    if (gVar == null) {
                        r16.i.a(27);
                        throw null;
                    }
                    int i17 = r16.i.f368658a;
                    java.util.Iterator it = gVar2.g().a().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (r16.i.q((f26.o0) it.next(), gVar.a())) {
                                z18 = true;
                                break;
                            }
                        } else {
                            z18 = false;
                            break;
                        }
                    }
                    if (z18) {
                        linkedHashSet.add(gVar2);
                    }
                    if (z17) {
                        y16.s z19 = gVar2.z();
                        kotlin.jvm.internal.o.f(z19, "getUnsubstitutedInnerClassesScope(...)");
                        a(gVar, linkedHashSet, z19, z17);
                    }
                }
            }
        }
    }
}
