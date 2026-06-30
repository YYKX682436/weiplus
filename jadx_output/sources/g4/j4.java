package g4;

/* loaded from: classes5.dex */
public final class j4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268391d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f268392e;

    /* renamed from: f, reason: collision with root package name */
    public int f268393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g4.k4 f268394g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f268395h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(g4.k4 k4Var, kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268394g = k4Var;
        this.f268395h = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.j4 j4Var = new g4.j4(this.f268394g, this.f268395h, completion);
        j4Var.f268391d = obj;
        return j4Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.j4) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Type inference failed for: r1v8, types: [u26.y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x008a -> B:6:0x0058). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f268393f
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r12.f268392e
            u26.y r1 = (u26.y) r1
            java.lang.Object r5 = r12.f268391d
            kotlinx.coroutines.r2 r5 = (kotlinx.coroutines.r2) r5
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r12
            r11 = r5
            r5 = r1
            r1 = r11
            goto L58
        L1d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L25:
            java.lang.Object r1 = r12.f268392e
            u26.y r1 = (u26.y) r1
            java.lang.Object r5 = r12.f268391d
            kotlinx.coroutines.r2 r5 = (kotlinx.coroutines.r2) r5
            kotlin.ResultKt.throwOnFailure(r13)
            r6 = r5
            r5 = r1
            r1 = r0
            r0 = r12
            goto L6c
        L35:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.f268391d
            r5 = r13
            kotlinx.coroutines.y0 r5 = (kotlinx.coroutines.y0) r5
            r13 = 0
            r1 = 6
            u26.w r13 = u26.z.a(r13, r4, r4, r1, r4)
            r6 = 0
            r7 = 0
            g4.i4 r8 = new g4.i4
            r8.<init>(r12, r13, r4)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.r2 r1 = kotlinx.coroutines.l.d(r5, r6, r7, r8, r9, r10)
            u26.k r13 = (u26.k) r13
            u26.a r5 = new u26.a
            r5.<init>(r13)
            r13 = r12
        L58:
            r13.f268391d = r1
            r13.f268392e = r5
            r13.f268393f = r3
            u26.a r5 = (u26.a) r5
            java.lang.Object r6 = r5.a(r13)
            if (r6 != r0) goto L67
            return r0
        L67:
            r11 = r0
            r0 = r13
            r13 = r6
            r6 = r1
            r1 = r11
        L6c:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L8f
            r13 = r5
            u26.a r13 = (u26.a) r13
            java.lang.Object r5 = r13.b()
            r0.f268391d = r6
            r0.f268392e = r13
            r0.f268393f = r2
            kotlinx.coroutines.flow.k r7 = r0.f268395h
            java.lang.Object r5 = r7.emit(r5, r0)
            if (r5 != r1) goto L8a
            return r1
        L8a:
            r5 = r13
            r13 = r0
            r0 = r1
            r1 = r6
            goto L58
        L8f:
            kotlinx.coroutines.p2.a(r6, r4, r3, r4)
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.j4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
