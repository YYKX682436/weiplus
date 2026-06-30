package ni3;

/* loaded from: classes10.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f337642d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f337643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ni3.o1 f337644f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(ni3.o1 o1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f337644f = o1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ni3.n1 n1Var = new ni3.n1(this.f337644f, continuation);
        n1Var.f337643e = obj;
        return n1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ni3.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0063 -> B:7:0x002f). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f337642d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r8.f337643e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r1
            goto L2e
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            java.lang.Object r1 = r8.f337643e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r1
            r1 = r8
            goto L59
        L27:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f337643e
            kotlinx.coroutines.y0 r9 = (kotlinx.coroutines.y0) r9
        L2e:
            r1 = r8
        L2f:
            boolean r4 = kotlinx.coroutines.z0.h(r9)
            if (r4 == 0) goto L66
            kotlinx.coroutines.p0 r4 = kotlinx.coroutines.q1.f310570c
            java.lang.String r5 = "$this$logDisabled"
            kotlin.jvm.internal.o.h(r4, r5)
            lu5.f r5 = new lu5.f
            r6 = 0
            r5.<init>(r6)
            oz5.l r4 = r4.plus(r5)
            ni3.m1 r5 = new ni3.m1
            ni3.o1 r6 = r1.f337644f
            r7 = 0
            r5.<init>(r6, r7)
            r1.f337643e = r9
            r1.f337642d = r3
            java.lang.Object r4 = kotlinx.coroutines.l.g(r4, r5, r1)
            if (r4 != r0) goto L59
            return r0
        L59:
            r1.f337643e = r9
            r1.f337642d = r2
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r4 = kotlinx.coroutines.k1.b(r4, r1)
            if (r4 != r0) goto L2f
            return r0
        L66:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ni3.n1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
