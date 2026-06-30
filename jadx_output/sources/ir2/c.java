package ir2;

/* loaded from: classes2.dex */
public abstract class c implements ir2.a0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f294118d;

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object g(ir2.c r13, kotlin.coroutines.Continuation r14) {
        /*
            java.lang.String r0 = "load end "
            java.lang.String r1 = "load begin "
            boolean r2 = r14 instanceof ir2.b
            if (r2 == 0) goto L17
            r2 = r14
            ir2.b r2 = (ir2.b) r2
            int r3 = r2.f294109h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f294109h = r3
            goto L1c
        L17:
            ir2.b r2 = new ir2.b
            r2.<init>(r13, r14)
        L1c:
            r7 = r2
            java.lang.Object r14 = r7.f294107f
            pz5.a r2 = pz5.a.f359186d
            int r3 = r7.f294109h
            r4 = 1
            java.lang.String r10 = "Finder.CgiLoaderSource"
            if (r3 == 0) goto L3e
            if (r3 != r4) goto L36
            long r1 = r7.f294106e
            java.lang.Object r13 = r7.f294105d
            ir2.c r13 = (ir2.c) r13
            kotlin.ResultKt.throwOnFailure(r14)     // Catch: rm0.j -> L34
            goto L6d
        L34:
            r14 = move-exception
            goto L90
        L36:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3e:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: rm0.j -> L34
            r14.<init>(r1)     // Catch: rm0.j -> L34
            r14.append(r13)     // Catch: rm0.j -> L34
            java.lang.String r14 = r14.toString()     // Catch: rm0.j -> L34
            com.tencent.mars.xlog.Log.i(r10, r14)     // Catch: rm0.j -> L34
            long r11 = c01.id.a()     // Catch: rm0.j -> L34
            az2.j r3 = r13.h()     // Catch: rm0.j -> L34
            r5 = 0
            r14 = 0
            r8 = 3
            r9 = 0
            r7.f294105d = r13     // Catch: rm0.j -> L34
            r7.f294106e = r11     // Catch: rm0.j -> L34
            r7.f294109h = r4     // Catch: rm0.j -> L34
            r4 = r5
            r6 = r14
            java.lang.Object r14 = rm0.h.a(r3, r4, r6, r7, r8, r9)     // Catch: rm0.j -> L34
            if (r14 != r2) goto L6c
            return r2
        L6c:
            r1 = r11
        L6d:
            com.tencent.mm.protobuf.f r14 = (com.tencent.mm.protobuf.f) r14     // Catch: rm0.j -> L34
            long r3 = c01.id.a()     // Catch: rm0.j -> L34
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: rm0.j -> L34
            r5.<init>(r0)     // Catch: rm0.j -> L34
            r5.append(r13)     // Catch: rm0.j -> L34
            java.lang.String r0 = ": "
            r5.append(r0)     // Catch: rm0.j -> L34
            long r3 = r3 - r1
            r5.append(r3)     // Catch: rm0.j -> L34
            java.lang.String r0 = r5.toString()     // Catch: rm0.j -> L34
            com.tencent.mars.xlog.Log.i(r10, r0)     // Catch: rm0.j -> L34
            ir2.a r13 = r13.f(r14)     // Catch: rm0.j -> L34
            goto Lc3
        L90:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "errType="
            r0.<init>(r1)
            int r1 = r14.f397424e
            r0.append(r1)
            java.lang.String r2 = " errCode="
            r0.append(r2)
            int r2 = r14.f397425f
            r0.append(r2)
            java.lang.String r3 = " fail:"
            r0.append(r3)
            java.lang.String r3 = r14.getLocalizedMessage()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r10, r0)
            java.lang.String r14 = r14.f397426g
            if (r14 != 0) goto Lbf
            java.lang.String r14 = ""
        Lbf:
            ir2.a r13 = r13.e(r1, r2, r14)
        Lc3:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ir2.c.g(ir2.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ir2.a0
    public java.lang.Object d(kotlin.coroutines.Continuation continuation) {
        return g(this, continuation);
    }

    public ir2.a e(int i17, int i18, java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        ir2.a aVar = new ir2.a(null, false, null, false, 15, null);
        aVar.f294085g = i18;
        aVar.f294084f = i17;
        aVar.f294086h = errorMsg;
        return aVar;
    }

    public abstract ir2.a f(com.tencent.mm.protobuf.f fVar);

    public abstract az2.j h();
}
