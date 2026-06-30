package o06;

/* loaded from: classes15.dex */
public final class w extends o06.r {
    public static /* synthetic */ void b(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i17 == 1) {
            objArr[0] = "what";
        } else if (i17 != 2) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
        if (i17 == 1 || i17 == 2) {
            objArr[2] = "isVisible";
        } else {
            objArr[2] = "hasContainingSourceFile";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [o06.m, o06.q] */
    /* JADX WARN: Type inference failed for: r5v2, types: [o06.m] */
    /* JADX WARN: Type inference failed for: r5v3, types: [o06.m] */
    /* JADX WARN: Type inference failed for: r5v5, types: [o06.m] */
    @Override // o06.g0
    public boolean a(z16.g gVar, o06.q qVar, o06.m mVar, boolean z17) {
        if (qVar == 0) {
            b(1);
            throw null;
        }
        if (mVar == null) {
            b(2);
            throw null;
        }
        if (r16.i.u(qVar)) {
            if (mVar == null) {
                b(0);
                throw null;
            }
            if (r16.i.f(mVar) != o06.z1.f342013a) {
                return o06.f0.d(qVar, mVar);
            }
        }
        if (qVar instanceof o06.l) {
            o06.k e17 = ((o06.l) qVar).e();
            if (z17 && r16.i.r(e17) && r16.i.u(e17) && (mVar instanceof o06.l) && r16.i.u(mVar.e()) && o06.f0.d(qVar, mVar)) {
                return true;
            }
        }
        while (qVar != 0) {
            qVar = qVar.e();
            if (((qVar instanceof o06.g) && !r16.i.m(qVar)) || (qVar instanceof o06.d1)) {
                break;
            }
        }
        if (qVar == 0) {
            return false;
        }
        while (mVar != null) {
            if (qVar == mVar) {
                return true;
            }
            if (mVar instanceof o06.d1) {
                return (qVar instanceof o06.d1) && ((r06.z0) qVar).f368566h.equals(((r06.z0) ((o06.d1) mVar)).f368566h) && r16.i.d(mVar).equals(r16.i.d(qVar));
            }
            mVar = mVar.e();
        }
        return false;
    }
}
