package oj2;

/* loaded from: classes.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f345781d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f345782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f345783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oj2.s f345784g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ km2.q f345785h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kotlin.jvm.internal.f0 f0Var, oj2.s sVar, km2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f345783f = f0Var;
        this.f345784g = sVar;
        this.f345785h = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        oj2.q qVar = new oj2.q(this.f345783f, this.f345784g, this.f345785h, continuation);
        qVar.f345782e = obj;
        return qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oj2.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0041 -> B:12:0x0044). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f345781d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.throwOnFailure(r9)
            goto L97
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            java.lang.Object r1 = r8.f345782e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r8
            goto L44
        L22:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f345782e
            kotlinx.coroutines.y0 r9 = (kotlinx.coroutines.y0) r9
            r1 = r9
            r9 = r8
        L2b:
            kotlin.jvm.internal.f0 r4 = r9.f345783f
            int r4 = r4.f310116d
            if (r4 <= 0) goto L66
            boolean r4 = kotlinx.coroutines.z0.h(r1)
            if (r4 == 0) goto L66
            r9.f345782e = r1
            r9.f345781d = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r4 = kotlinx.coroutines.k1.b(r4, r9)
            if (r4 != r0) goto L44
            return r0
        L44:
            kotlin.jvm.internal.f0 r4 = r9.f345783f
            int r5 = r4.f310116d
            int r5 = r5 + (-1)
            r4.f310116d = r5
            oj2.s r5 = r9.f345784g
            java.lang.String r5 = r5.a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "countdown: "
            r6.<init>(r7)
            int r4 = r4.f310116d
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.tencent.mars.xlog.Log.i(r5, r4)
            goto L2b
        L66:
            km2.q r1 = r9.f345785h
            r1.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "hadCountDownLocationShow: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r1.H
            com.tencent.mars.xlog.Log.i(r5, r4)
            r1.I = r3
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r1 = kotlinx.coroutines.internal.b0.f310484a
            oj2.p r3 = new oj2.p
            oj2.s r4 = r9.f345784g
            r5 = 0
            r3.<init>(r4, r5)
            r9.f345782e = r5
            r9.f345781d = r2
            java.lang.Object r9 = kotlinx.coroutines.l.g(r1, r3, r9)
            if (r9 != r0) goto L97
            return r0
        L97:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oj2.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
