package us2;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430531d;

    /* renamed from: e, reason: collision with root package name */
    public int f430532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f430534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f430535h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f430536i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f430537m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, int i17, int i18, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430533f = str;
        this.f430534g = i17;
        this.f430535h = i18;
        this.f430536i = z17;
        this.f430537m = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new us2.r(this.f430533f, this.f430534g, this.f430535h, this.f430536i, this.f430537m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((us2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f430532e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.throwOnFailure(r12)
            goto Lae
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            java.lang.Object r1 = r11.f430531d
            vt3.n r1 = (vt3.n) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L43
        L21:
            kotlin.ResultKt.throwOnFailure(r12)
            vt3.n r1 = new vt3.n
            java.lang.String r5 = r11.f430533f
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 8
            r10 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            us2.u r12 = us2.u.f430548a
            int r4 = r11.f430534g
            int r5 = r11.f430535h
            r11.f430531d = r1
            r11.f430532e = r3
            java.lang.Object r12 = r12.g(r4, r5, r1, r11)
            if (r12 != r0) goto L43
            return r0
        L43:
            jz5.l r12 = (jz5.l) r12
            java.lang.Object r12 = r12.f302833d
            vt3.r r12 = (vt3.r) r12
            boolean r3 = r11.f430536i
            if (r3 == 0) goto Lae
            java.util.Map r3 = us2.u.f430555h
            int r4 = r11.f430534g
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r5)
            java.util.Map r3 = (java.util.Map) r3
            r4 = 0
            if (r3 == 0) goto L77
            us2.d r5 = new us2.d
            long r6 = r12.f440039a
            r5.<init>(r6, r1)
            java.lang.Object r12 = r3.get(r5)
            us2.a r12 = (us2.a) r12
            if (r12 == 0) goto L77
            us2.b r12 = r12.f430468b
            if (r12 == 0) goto L77
            java.util.List r12 = r12.f430471c
            goto L78
        L77:
            r12 = r4
        L78:
            if (r12 == 0) goto Lab
            java.lang.String r1 = r11.f430533f
            java.util.Iterator r12 = r12.iterator()
        L80:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L96
            java.lang.Object r3 = r12.next()
            r5 = r3
            vt3.p r5 = (vt3.p) r5
            java.lang.String r5 = r5.f440020b
            boolean r5 = kotlin.jvm.internal.o.b(r5, r1)
            if (r5 == 0) goto L80
            goto L97
        L96:
            r3 = r4
        L97:
            vt3.p r3 = (vt3.p) r3
            if (r3 != 0) goto L9c
            goto Lab
        L9c:
            us2.u r12 = us2.u.f430548a
            boolean r1 = r11.f430537m
            r11.f430531d = r4
            r11.f430532e = r2
            java.lang.Object r12 = r12.e(r3, r1, r11)
            if (r12 != r0) goto Lae
            return r0
        Lab:
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        Lae:
            java.lang.Object r12 = us2.u.f430550c
            java.lang.String r0 = r11.f430533f
            monitor-enter(r12)
            java.util.Map r1 = us2.u.f430551d     // Catch: java.lang.Throwable -> Lbc
            r1.remove(r0)     // Catch: java.lang.Throwable -> Lbc
            monitor-exit(r12)
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        Lbc:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: us2.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
