package xg2;

/* loaded from: classes.dex */
public abstract class g {
    public static final az2.j a(r45.my3 my3Var, java.lang.String cgiUri, int i17, com.tencent.mm.protobuf.f response) {
        kotlin.jvm.internal.o.g(my3Var, "<this>");
        kotlin.jvm.internal.o.g(cgiUri, "cgiUri");
        kotlin.jvm.internal.o.g(response, "response");
        return new xg2.c(my3Var, response, cgiUri, i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.tencent.mm.modelbase.i r12, oz5.l r13, kotlin.coroutines.Continuation r14) {
        /*
            boolean r0 = r14 instanceof xg2.d
            if (r0 == 0) goto L13
            r0 = r14
            xg2.d r0 = (xg2.d) r0
            int r1 = r0.f454386g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f454386g = r1
            goto L18
        L13:
            xg2.d r0 = new xg2.d
            r0.<init>(r14)
        L18:
            r5 = r0
            java.lang.Object r14 = r5.f454385f
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f454386g
            java.lang.String r8 = "cgi: "
            java.lang.String r9 = "FinderCgiCommon"
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L3e
            if (r1 != r10) goto L36
            java.lang.Object r12 = r5.f454384e
            r13 = r12
            oz5.l r13 = (oz5.l) r13
            java.lang.Object r12 = r5.f454383d
            com.tencent.mm.modelbase.i r12 = (com.tencent.mm.modelbase.i) r12
            kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.util.concurrent.CancellationException -> L5a rm0.j -> L7d
            goto L54
        L36:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3e:
            kotlin.ResultKt.throwOnFailure(r14)
            r2 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f454383d = r12     // Catch: java.util.concurrent.CancellationException -> L5a rm0.j -> L7d
            r5.f454384e = r13     // Catch: java.util.concurrent.CancellationException -> L5a rm0.j -> L7d
            r5.f454386g = r10     // Catch: java.util.concurrent.CancellationException -> L5a rm0.j -> L7d
            r1 = r12
            java.lang.Object r14 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L5a rm0.j -> L7d
            if (r14 != r0) goto L54
            return r0
        L54:
            xg2.i r0 = new xg2.i     // Catch: java.util.concurrent.CancellationException -> L5a rm0.j -> L7d
            r0.<init>(r14, r13)     // Catch: java.util.concurrent.CancellationException -> L5a rm0.j -> L7d
            goto La0
        L5a:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            r0.append(r12)
            java.lang.String r12 = " catch CancellationException: "
            r0.append(r12)
            r0.append(r14)
            java.lang.String r12 = r0.toString()
            com.tencent.mars.xlog.Log.e(r9, r12)
            xg2.b r0 = new xg2.b
            xg2.a r12 = new xg2.a
            r12.<init>(r11, r14, r10, r11)
            r0.<init>(r12, r13)
            goto La0
        L7d:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            r0.append(r12)
            java.lang.String r12 = " catch CgiException: "
            r0.append(r12)
            r0.append(r14)
            java.lang.String r12 = r0.toString()
            com.tencent.mars.xlog.Log.e(r9, r12)
            xg2.b r0 = new xg2.b
            xg2.a r12 = new xg2.a
            r1 = 2
            r12.<init>(r14, r11, r1, r11)
            r0.<init>(r12, r13)
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xg2.g.b(com.tencent.mm.modelbase.i, oz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object c(com.tencent.mm.modelbase.m1 m1Var, yz5.r rVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar2 = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar2.k();
        xg2.f fVar = new xg2.f(m1Var, rVar2, rVar);
        gm0.j1.d().a(m1Var.getType(), fVar);
        rVar2.m(new xg2.e(m1Var, fVar));
        gm0.j1.d().g(m1Var);
        java.lang.Object j17 = rVar2.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public static /* synthetic */ java.lang.Object d(com.tencent.mm.modelbase.i iVar, oz5.l lVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = null;
        }
        return b(iVar, lVar, continuation);
    }

    public static final boolean e(com.tencent.mm.modelbase.f fVar) {
        return (fVar != null && fVar.f70615a == 0) && fVar.f70616b == 0;
    }
}
