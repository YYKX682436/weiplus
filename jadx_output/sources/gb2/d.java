package gb2;

/* loaded from: classes2.dex */
public final class d extends ay1.l {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(yz5.a r9, kotlinx.coroutines.r2 r10, androidx.lifecycle.y r11, int r12, kotlin.jvm.internal.i r13) {
        /*
            r8 = this;
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto L7
            r3 = r0
            goto L8
        L7:
            r3 = r10
        L8:
            r10 = r12 & 4
            if (r10 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r11
        Lf:
            java.lang.String r10 = "initTask"
            kotlin.jvm.internal.o.g(r9, r10)
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r8
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gb2.d.<init>(yz5.a, kotlinx.coroutines.r2, androidx.lifecycle.y, int, kotlin.jvm.internal.i):void");
    }

    @Override // ay1.l
    public by1.d a() {
        return new gb2.b((java.lang.String) c());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077 A[PHI: r1
  0x0077: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v1 java.lang.Object) binds: [B:17:0x0074, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // ay1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(boolean r18, kotlin.coroutines.Continuation r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof gb2.c
            if (r2 == 0) goto L17
            r2 = r1
            gb2.c r2 = (gb2.c) r2
            int r3 = r2.f270010h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f270010h = r3
            goto L1c
        L17:
            gb2.c r2 = new gb2.c
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f270008f
            pz5.a r3 = pz5.a.f359186d
            int r4 = r2.f270010h
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L41
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2e
            kotlin.ResultKt.throwOnFailure(r1)
            goto L77
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            boolean r4 = r2.f270007e
            java.lang.Object r6 = r2.f270006d
            gb2.d r6 = (gb2.d) r6
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r4
            goto L54
        L41:
            kotlin.ResultKt.throwOnFailure(r1)
            r2.f270006d = r0
            r1 = r18
            r2.f270007e = r1
            r2.f270010h = r6
            java.lang.Object r4 = r0.l(r2)
            if (r4 != r3) goto L53
            return r3
        L53:
            r6 = r0
        L54:
            com.tencent.mm.plugin.finder.report.v1 r7 = com.tencent.mm.plugin.finder.report.v1.f125393a
            ay1.m r4 = r6.b()
            db2.n3 r4 = (db2.n3) r4
            int r8 = r4.f228079d
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 60
            r16 = 0
            com.tencent.mm.plugin.finder.report.v1.o(r7, r8, r9, r10, r11, r12, r14, r15, r16)
            r4 = 0
            r2.f270006d = r4
            r2.f270010h = r5
            java.lang.Object r1 = ay1.l.k(r6, r1, r2)
            if (r1 != r3) goto L77
            return r3
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gb2.d.i(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
