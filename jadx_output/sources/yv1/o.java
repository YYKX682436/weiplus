package yv1;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f466122d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f466123e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f466124f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f466125g;

    /* renamed from: h, reason: collision with root package name */
    public int f466126h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f466127i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kotlin.jvm.internal.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466127i = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yv1.o(this.f466127i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yv1.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006f -> B:5:0x0076). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r12.f466126h
            r2 = 1
            if (r1 == 0) goto L2a
            if (r1 != r2) goto L22
            java.lang.Object r1 = r12.f466125g
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r3 = r12.f466124f
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r12.f466123e
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r5 = r12.f466122d
            oo1.e r5 = (oo1.e) r5
            kotlin.ResultKt.throwOnFailure(r13)
            r6 = r5
            r5 = r3
            r3 = r1
            r1 = r0
            r0 = r12
            goto L76
        L22:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2a:
            kotlin.ResultKt.throwOnFailure(r13)
            oo1.e r13 = new oo1.e
            r4 = 0
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 1
            r3 = r13
            r3.<init>(r4, r6, r8)
            oo1.g r1 = oo1.g.f347143a
            java.util.List r1 = r1.c()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.size()
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
            r5 = r13
            r13 = r12
            r11 = r3
            r3 = r1
            r1 = r11
        L52:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L90
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r13.f466122d = r5
            r13.f466123e = r1
            r13.f466124f = r3
            r13.f466125g = r1
            r13.f466126h = r2
            java.lang.Object r4 = r5.a(r4, r13)
            if (r4 != r0) goto L6f
            return r0
        L6f:
            r6 = r5
            r5 = r3
            r3 = r1
            r1 = r0
            r0 = r13
            r13 = r4
            r4 = r3
        L76:
            oo1.h r13 = (oo1.h) r13
            r7 = r13
            oo1.b r7 = (oo1.b) r7
            long r7 = r7.f347124c
            oo1.b r13 = (oo1.b) r13
            long r9 = r13.f347125d
            long r7 = r7 + r9
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r7)
            r3.add(r13)
            r13 = r0
            r0 = r1
            r1 = r4
            r3 = r5
            r5 = r6
            goto L52
        L90:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            long r0 = kz5.n0.J0(r1)
            kotlin.jvm.internal.g0 r13 = r13.f466127i
            r13.f310121d = r0
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: yv1.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
