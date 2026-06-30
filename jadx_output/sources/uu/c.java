package uu;

/* loaded from: classes9.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f431197d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f431198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uu.d f431199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ym3.c f431200g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f431201h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uu.d dVar, ym3.c cVar, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f431199f = dVar;
        this.f431200g = cVar;
        this.f431201h = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        uu.c cVar = new uu.c(this.f431199f, this.f431200g, this.f431201h, continuation);
        cVar.f431198e = obj;
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((uu.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f431197d
            jz5.f0 r3 = jz5.f0.f302826a
            kotlinx.coroutines.flow.i2 r4 = r0.f431201h
            ym3.c r5 = r0.f431200g
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L29
            if (r2 == r8) goto L21
            if (r2 != r7) goto L19
            kotlin.ResultKt.throwOnFailure(r17)
            goto L9d
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            java.lang.Object r2 = r0.f431198e
            kotlinx.coroutines.y0 r2 = (kotlinx.coroutines.y0) r2
            kotlin.ResultKt.throwOnFailure(r17)
            goto L86
        L29:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r2 = r0.f431198e
            kotlinx.coroutines.y0 r2 = (kotlinx.coroutines.y0) r2
            uu.d r9 = r0.f431199f
            s15.w r10 = r9.f431202d
            if (r10 == 0) goto L88
            java.util.LinkedList r11 = r10.j()
            int r11 = r11.size()
            uu.b r12 = new uu.b
            r12.<init>(r10, r9, r2)
            java.lang.String r9 = "request"
            kotlin.jvm.internal.o.g(r5, r9)
            ym3.d r9 = new ym3.d
            r9.<init>(r5)
            r10 = 0
            int r13 = r5.f463144b
            if (r11 <= r13) goto L79
            r14 = r10
        L54:
            java.util.ArrayList r15 = r9.f463149c
            int r7 = r5.f463145c
            if (r14 >= r7) goto L6f
            int r7 = r13 + r14
            int r6 = r13 + r14
            if (r6 >= r11) goto L6b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            java.lang.Object r6 = r12.invoke(r6)
            r15.add(r6)
        L6b:
            int r14 = r14 + 1
            r7 = 2
            goto L54
        L6f:
            int r6 = r15.size()
            if (r6 < r7) goto L76
            r10 = r8
        L76:
            r9.f463148b = r10
            goto L7b
        L79:
            r9.f463148b = r10
        L7b:
            r0.f431198e = r2
            r0.f431197d = r8
            java.lang.Object r2 = r4.emit(r9, r0)
            if (r2 != r1) goto L86
            return r1
        L86:
            r2 = r3
            goto L89
        L88:
            r2 = 0
        L89:
            if (r2 != 0) goto L9d
            ym3.d r2 = new ym3.d
            r2.<init>(r5)
            r5 = 0
            r0.f431198e = r5
            r5 = 2
            r0.f431197d = r5
            java.lang.Object r2 = r4.emit(r2, r0)
            if (r2 != r1) goto L9d
            return r1
        L9d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: uu.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
