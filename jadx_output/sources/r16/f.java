package r16;

/* loaded from: classes16.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final r16.f f368656a = new r16.f();

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e8, code lost:
    
        if (r7.m(r6, r5, null, true).c() == r0) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(o06.m r5, o06.m r6, boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r16.f.a(o06.m, o06.m, boolean, boolean):boolean");
    }

    public final boolean b(o06.e2 a17, o06.e2 b17, boolean z17, yz5.p equivalentCallables) {
        kotlin.jvm.internal.o.g(a17, "a");
        kotlin.jvm.internal.o.g(b17, "b");
        kotlin.jvm.internal.o.g(equivalentCallables, "equivalentCallables");
        if (kotlin.jvm.internal.o.b(a17, b17)) {
            return true;
        }
        return !kotlin.jvm.internal.o.b(a17.e(), b17.e()) && c(a17, b17, equivalentCallables, z17) && a17.getIndex() == b17.getIndex();
    }

    public final boolean c(o06.m mVar, o06.m mVar2, yz5.p pVar, boolean z17) {
        o06.m e17 = mVar.e();
        o06.m e18 = mVar2.e();
        return ((e17 instanceof o06.d) || (e18 instanceof o06.d)) ? ((java.lang.Boolean) pVar.invoke(e17, e18)).booleanValue() : a(e17, e18, z17, true);
    }

    public final o06.x1 d(o06.b bVar) {
        while (bVar instanceof o06.d) {
            o06.d dVar = (o06.d) bVar;
            if (dVar.j() != o06.c.FAKE_OVERRIDE) {
                break;
            }
            java.util.Collection i17 = dVar.i();
            kotlin.jvm.internal.o.f(i17, "getOverriddenDescriptors(...)");
            bVar = (o06.d) kz5.n0.A0(i17);
            if (bVar == null) {
                return null;
            }
        }
        return bVar.getSource();
    }
}
