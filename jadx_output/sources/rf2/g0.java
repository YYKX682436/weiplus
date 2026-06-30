package rf2;

/* loaded from: classes10.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f394746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.pl4 f394748g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f394749h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394750i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(boolean z17, rf2.v0 v0Var, r45.pl4 pl4Var, r45.f02 f02Var, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394746e = z17;
        this.f394747f = v0Var;
        this.f394748g = pl4Var;
        this.f394749h = f02Var;
        this.f394750i = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rf2.g0(this.f394746e, this.f394747f, this.f394748g, this.f394749h, this.f394750i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f394745d
            r2 = 3
            r3 = 2
            r4 = 1
            r45.f02 r5 = r7.f394749h
            rf2.v0 r6 = r7.f394747f
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5c
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L4b
        L23:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L3a
        L27:
            kotlin.ResultKt.throwOnFailure(r8)
            boolean r8 = r7.f394746e
            if (r8 == 0) goto L2f
            goto L40
        L2f:
            r7.f394745d = r4
            r45.pl4 r8 = r7.f394748g
            java.lang.Object r8 = rf2.v0.b(r6, r8, r7)
            if (r8 != r0) goto L3a
            return r0
        L3a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r4 = r8.booleanValue()
        L40:
            if (r4 == 0) goto L5c
            r7.f394745d = r3
            java.lang.Object r8 = rf2.v0.a(r6, r5, r7)
            if (r8 != r0) goto L4b
            return r0
        L4b:
            android.view.View r8 = r7.f394750i
            r6.k(r8, r5)
            r6.j(r8, r5)
            r7.f394745d = r2
            java.lang.Object r8 = rf2.v0.e(r6, r8, r5, r7)
            if (r8 != r0) goto L5c
            return r0
        L5c:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
