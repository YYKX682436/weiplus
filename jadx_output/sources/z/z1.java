package z;

/* loaded from: classes14.dex */
public abstract class z1 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fa A[Catch: CancellationException -> 0x004f, TryCatch #0 {CancellationException -> 0x004f, blocks: (B:15:0x0049, B:18:0x00ed, B:20:0x00fa, B:22:0x0122, B:28:0x0132), top: B:14:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(z.r r26, z.l r27, long r28, yz5.l r30, kotlin.coroutines.Continuation r31) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z.z1.a(z.r, z.l, long, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static java.lang.Object b(z.r rVar, z.d0 d0Var, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            lVar = z.w1.f468867d;
        }
        java.lang.Object a17 = a(rVar, new z.c0(d0Var, rVar.f468810d, rVar.getValue(), rVar.f468812f), z17 ? rVar.f468813g : Long.MIN_VALUE, lVar, continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }

    public static java.lang.Object c(z.r rVar, java.lang.Object obj, z.p pVar, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj2) {
        if ((i17 & 2) != 0) {
            pVar = z.q.c(0.0f, 0.0f, null, 7, null);
        }
        z.p pVar2 = pVar;
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        if ((i17 & 8) != 0) {
            lVar = z.x1.f468872d;
        }
        java.lang.Object a17 = a(rVar, new z.a2(pVar2, rVar.f468810d, rVar.getValue(), obj, rVar.f468812f), z17 ? rVar.f468813g : Long.MIN_VALUE, lVar, continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }

    public static final void d(z.o oVar, long j17, float f17, z.l lVar, z.r rVar, yz5.l lVar2) {
        long c17 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) == 0 ? lVar.c() : ((float) (j17 - oVar.f468758c)) / f17;
        oVar.f468762g = j17;
        ((n0.q4) oVar.f468760e).setValue(lVar.e(c17));
        z.w g17 = lVar.g(c17);
        kotlin.jvm.internal.o.g(g17, "<set-?>");
        oVar.f468761f = g17;
        if (lVar.b(c17)) {
            oVar.f468763h = oVar.f468762g;
            ((n0.q4) oVar.f468764i).setValue(java.lang.Boolean.FALSE);
        }
        f(oVar, rVar);
        lVar2.invoke(oVar);
    }

    public static final float e(oz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<this>");
        int i17 = z0.v.f468924r1;
        z0.v vVar = (z0.v) lVar.get(z0.u.f468923d);
        float floatValue = vVar != null ? ((java.lang.Number) ((n0.q4) ((androidx.compose.ui.platform.o3) vVar).f10676d).getValue()).floatValue() : 1.0f;
        if (floatValue >= 0.0f) {
            return floatValue;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public static final void f(z.o oVar, z.r state) {
        kotlin.jvm.internal.o.g(oVar, "<this>");
        kotlin.jvm.internal.o.g(state, "state");
        ((n0.q4) state.f468811e).setValue(oVar.b());
        z.w wVar = state.f468812f;
        z.w source = oVar.f468761f;
        kotlin.jvm.internal.o.g(wVar, "<this>");
        kotlin.jvm.internal.o.g(source, "source");
        int b17 = wVar.b();
        for (int i17 = 0; i17 < b17; i17++) {
            wVar.e(i17, source.a(i17));
        }
        state.f468814h = oVar.f468763h;
        state.f468813g = oVar.f468762g;
        state.f468815i = oVar.d();
    }
}
