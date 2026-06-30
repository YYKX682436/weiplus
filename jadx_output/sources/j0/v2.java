package j0;

/* loaded from: classes14.dex */
public final class v2 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f296598e;

    /* renamed from: f, reason: collision with root package name */
    public int f296599f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f296600g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j0.l3 f296601h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(j0.l3 l3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296601h = l3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        j0.v2 v2Var = new j0.v2(this.f296601h, continuation);
        v2Var.f296600g = obj;
        return v2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.v2) create((p1.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
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
            int r2 = r0.f296599f
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L31
            if (r2 == r6) goto L27
            if (r2 != r3) goto L1f
            java.lang.Object r2 = r0.f296598e
            p1.s r2 = (p1.s) r2
            java.lang.Object r7 = r0.f296600g
            p1.c r7 = (p1.c) r7
            kotlin.ResultKt.throwOnFailure(r17)
            r9 = r17
            r8 = r0
            goto L5d
        L1f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L27:
            java.lang.Object r2 = r0.f296600g
            p1.c r2 = (p1.c) r2
            kotlin.ResultKt.throwOnFailure(r17)
            r7 = r17
            goto L43
        L31:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r2 = r0.f296600g
            p1.c r2 = (p1.c) r2
            r0.f296600g = r2
            r0.f296599f = r6
            java.lang.Object r7 = b0.d4.b(r2, r5, r0, r6, r4)
            if (r7 != r1) goto L43
            return r1
        L43:
            p1.s r7 = (p1.s) r7
            long r8 = r7.f350881c
            j0.l3 r10 = r0.f296601h
            r10.a(r8)
            r8 = r0
            r15 = r7
            r7 = r2
            r2 = r15
        L50:
            r8.f296600g = r7
            r8.f296598e = r2
            r8.f296599f = r3
            java.lang.Object r9 = p1.b.a(r7, r4, r8, r6, r4)
            if (r9 != r1) goto L5d
            return r1
        L5d:
            p1.l r9 = (p1.l) r9
            java.util.List r9 = r9.f350842a
            int r10 = r9.size()
            r11 = r5
        L66:
            if (r11 >= r10) goto L88
            java.lang.Object r12 = r9.get(r11)
            p1.s r12 = (p1.s) r12
            long r13 = r12.f350879a
            long r3 = r2.f350879a
            boolean r3 = p1.r.a(r13, r3)
            if (r3 == 0) goto L7e
            boolean r3 = r12.f350882d
            if (r3 == 0) goto L7e
            r3 = r6
            goto L7f
        L7e:
            r3 = r5
        L7f:
            if (r3 == 0) goto L83
            r3 = r6
            goto L89
        L83:
            int r11 = r11 + 1
            r3 = 2
            r4 = 0
            goto L66
        L88:
            r3 = r5
        L89:
            if (r3 != 0) goto L93
            j0.l3 r1 = r8.f296601h
            r1.d()
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        L93:
            r3 = 2
            r4 = 0
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.v2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
