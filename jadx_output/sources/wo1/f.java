package wo1;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f447925d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f447926e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f447927f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f447928g;

    /* renamed from: h, reason: collision with root package name */
    public int f447929h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f447930i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f447930i = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wo1.f(this.f447930i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wo1.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:5:0x0067). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f447929h
            r3 = 1
            if (r2 == 0) goto L2b
            if (r2 != r3) goto L23
            java.lang.Object r2 = r0.f447928g
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f447927f
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.f447926e
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Object r6 = r0.f447925d
            oo1.e r6 = (oo1.e) r6
            kotlin.ResultKt.throwOnFailure(r20)
            r8 = r20
            r10 = r2
            r2 = r0
            goto L67
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2b:
            kotlin.ResultKt.throwOnFailure(r20)
            oo1.e r2 = new oo1.e
            r5 = 0
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1
            r4 = r2
            r4.<init>(r5, r7, r9)
            oo1.g r4 = oo1.g.f347143a
            java.util.List r4 = r4.c()
            java.util.Iterator r4 = r4.iterator()
            java.util.List r5 = r0.f447930i
            r6 = r2
            r2 = r0
        L49:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L98
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            r2.f447925d = r6
            r2.f447926e = r5
            r2.f447927f = r4
            r2.f447928g = r7
            r2.f447929h = r3
            java.lang.Object r8 = r6.a(r7, r2)
            if (r8 != r1) goto L66
            return r1
        L66:
            r10 = r7
        L67:
            oo1.h r8 = (oo1.h) r8
            r7 = r8
            oo1.b r7 = (oo1.b) r7
            long r11 = r7.f347124c
            oo1.b r8 = (oo1.b) r8
            long r13 = r8.f347125d
            long r13 = r13 + r11
            r11 = 0
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 <= 0) goto L8e
            long r7 = r8.f347126e
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 > 0) goto L80
            goto L8e
        L80:
            wo1.n r18 = new wo1.n
            r15 = 0
            r16 = 8
            r17 = 0
            r9 = r18
            r11 = r7
            r9.<init>(r10, r11, r13, r15, r16, r17)
            goto L90
        L8e:
            r18 = 0
        L90:
            r7 = r18
            if (r7 == 0) goto L49
            r5.add(r7)
            goto L49
        L98:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wo1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
