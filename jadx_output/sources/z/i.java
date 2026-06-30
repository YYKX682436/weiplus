package z;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f468689d;

    /* renamed from: e, reason: collision with root package name */
    public int f468690e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f468691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u26.w f468692g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z.e f468693h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f468694i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f468695m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(u26.w wVar, z.e eVar, n0.e5 e5Var, n0.e5 e5Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468692g = wVar;
        this.f468693h = eVar;
        this.f468694i = e5Var;
        this.f468695m = e5Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        z.i iVar = new z.i(this.f468692g, this.f468693h, this.f468694i, this.f468695m, continuation);
        iVar.f468691f = obj;
        return iVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003f -> B:5:0x0044). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f468690e
            r3 = 1
            if (r2 == 0) goto L22
            if (r2 != r3) goto L1a
            java.lang.Object r2 = r0.f468689d
            u26.y r2 = (u26.y) r2
            java.lang.Object r4 = r0.f468691f
            kotlinx.coroutines.y0 r4 = (kotlinx.coroutines.y0) r4
            kotlin.ResultKt.throwOnFailure(r18)
            r6 = r18
            r5 = r0
            goto L44
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r2 = r0.f468691f
            kotlinx.coroutines.y0 r2 = (kotlinx.coroutines.y0) r2
            u26.w r4 = r0.f468692g
            u26.y r4 = r4.iterator()
            r5 = r0
        L30:
            r5.f468691f = r2
            r5.f468689d = r4
            r5.f468690e = r3
            u26.a r4 = (u26.a) r4
            java.lang.Object r6 = r4.a(r5)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            r16 = r4
            r4 = r2
            r2 = r16
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L7f
            u26.a r2 = (u26.a) r2
            java.lang.Object r6 = r2.b()
            u26.w r7 = r5.f468692g
            java.lang.Object r7 = r7.h()
            java.lang.Object r7 = u26.c0.b(r7)
            if (r7 != 0) goto L60
            r9 = r6
            goto L61
        L60:
            r9 = r7
        L61:
            r6 = 0
            r14 = 0
            z.h r15 = new z.h
            z.e r10 = r5.f468693h
            n0.e5 r11 = r5.f468694i
            n0.e5 r12 = r5.f468695m
            r13 = 0
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r11 = 3
            r12 = 0
            r7 = r4
            r8 = r6
            r9 = r14
            r10 = r15
            kotlinx.coroutines.l.d(r7, r8, r9, r10, r11, r12)
            r16 = r4
            r4 = r2
            r2 = r16
            goto L30
        L7f:
            jz5.f0 r1 = jz5.f0.f302826a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
