package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class b3 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310140e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f310141f;

    /* renamed from: g, reason: collision with root package name */
    public int f310142g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310143h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.c3 f310144i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(kotlinx.coroutines.c3 c3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310144i = c3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.b3 b3Var = new kotlinx.coroutines.b3(this.f310144i, continuation);
        b3Var.f310143h = obj;
        return b3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kotlinx.coroutines.b3) create((q26.p) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0063 -> B:6:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0077 -> B:6:0x007a). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f310142g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r7.f310141f
            kotlinx.coroutines.internal.t r1 = (kotlinx.coroutines.internal.t) r1
            java.lang.Object r3 = r7.f310140e
            kotlinx.coroutines.internal.m r3 = (kotlinx.coroutines.internal.m) r3
            java.lang.Object r4 = r7.f310143h
            q26.p r4 = (q26.p) r4
            kotlin.ResultKt.throwOnFailure(r8)
            r8 = r7
            goto L7a
        L1d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L25:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7f
        L29:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.f310143h
            q26.p r8 = (q26.p) r8
            kotlinx.coroutines.c3 r1 = r7.f310144i
            java.lang.Object r1 = r1.P()
            boolean r4 = r1 instanceof kotlinx.coroutines.x
            if (r4 == 0) goto L44
            kotlinx.coroutines.x r1 = (kotlinx.coroutines.x) r1
            kotlinx.coroutines.y r1 = r1.f310694h
            r7.f310142g = r3
            r8.b(r1, r7)
            return r0
        L44:
            boolean r3 = r1 instanceof kotlinx.coroutines.k2
            if (r3 == 0) goto L7f
            kotlinx.coroutines.k2 r1 = (kotlinx.coroutines.k2) r1
            kotlinx.coroutines.h3 r1 = r1.f()
            if (r1 == 0) goto L7f
            java.lang.Object r3 = r1.l()
            kotlinx.coroutines.internal.t r3 = (kotlinx.coroutines.internal.t) r3
            r4 = r8
            r8 = r7
            r6 = r3
            r3 = r1
            r1 = r6
        L5b:
            boolean r5 = kotlin.jvm.internal.o.b(r1, r3)
            if (r5 != 0) goto L7f
            boolean r5 = r1 instanceof kotlinx.coroutines.x
            if (r5 == 0) goto L7a
            r5 = r1
            kotlinx.coroutines.x r5 = (kotlinx.coroutines.x) r5
            kotlinx.coroutines.y r5 = r5.f310694h
            r8.f310143h = r4
            r8.f310140e = r3
            r8.f310141f = r1
            r8.f310142g = r2
            r4.b(r5, r8)
            pz5.a r5 = pz5.a.f359186d
            if (r5 != r0) goto L7a
            return r0
        L7a:
            kotlinx.coroutines.internal.t r1 = r1.m()
            goto L5b
        L7f:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
