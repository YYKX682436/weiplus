package sc2;

/* loaded from: classes.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f406034d;

    /* renamed from: e, reason: collision with root package name */
    public int f406035e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f406036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f406037g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f406037g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        sc2.l0 l0Var = new sc2.l0(this.f406037g, continuation);
        l0Var.f406036f = obj;
        return l0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.l0) create((kotlinx.coroutines.flow.k) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005f -> B:6:0x0062). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f406035e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            long r4 = r8.f406034d
            java.lang.Object r1 = r8.f406036f
            kotlinx.coroutines.flow.k r1 = (kotlinx.coroutines.flow.k) r1
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r1
            r1 = r8
            goto L62
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            long r4 = r8.f406034d
            java.lang.Object r1 = r8.f406036f
            kotlinx.coroutines.flow.k r1 = (kotlinx.coroutines.flow.k) r1
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r1
            r1 = r8
            goto L53
        L2c:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f406036f
            kotlinx.coroutines.flow.k r9 = (kotlinx.coroutines.flow.k) r9
            r1 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r1
            long r6 = r8.f406037g
            long r6 = r6 / r4
            r1 = r8
        L3a:
            r4 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L66
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r6)
            r1.f406036f = r9
            r1.f406034d = r6
            r1.f406035e = r3
            java.lang.Object r4 = r9.emit(r4, r1)
            if (r4 != r0) goto L52
            return r0
        L52:
            r4 = r6
        L53:
            r1.f406036f = r9
            r1.f406034d = r4
            r1.f406035e = r2
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = kotlinx.coroutines.k1.b(r6, r1)
            if (r6 != r0) goto L62
            return r0
        L62:
            r6 = -1
            long r6 = r6 + r4
            goto L3a
        L66:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
