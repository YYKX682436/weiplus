package sf2;

/* loaded from: classes10.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f407314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z17, sf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407314e = z17;
        this.f407315f = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.v(this.f407314e, this.f407315f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0043 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f407313d
            jz5.f0 r2 = jz5.f0.f302826a
            sf2.x r3 = r5.f407315f
            r4 = 1
            if (r1 == 0) goto L19
            if (r1 != r4) goto L11
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Exception -> L28
            goto L44
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r5.f407314e     // Catch: java.lang.Exception -> L28
            if (r6 == 0) goto L44
            gn2.a r6 = r3.f407347p     // Catch: java.lang.Exception -> L28
            if (r6 == 0) goto L2a
            r6.c(r4)     // Catch: java.lang.Exception -> L28
            goto L2a
        L28:
            r6 = move-exception
            goto L55
        L2a:
            r5.f407313d = r4     // Catch: java.lang.Exception -> L28
            gn2.a r6 = r3.f407347p     // Catch: java.lang.Exception -> L28
            boolean r6 = r6 instanceof in2.s     // Catch: java.lang.Exception -> L28
            if (r6 == 0) goto L39
            java.lang.Object r6 = r3.k7(r5)     // Catch: java.lang.Exception -> L28
            if (r6 != r0) goto L40
            goto L41
        L39:
            java.lang.Object r6 = r3.i7(r5)     // Catch: java.lang.Exception -> L28
            if (r6 != r0) goto L40
            goto L41
        L40:
            r6 = r2
        L41:
            if (r6 != r0) goto L44
            return r0
        L44:
            gn2.a r6 = r3.f407347p     // Catch: java.lang.Exception -> L28
            if (r6 == 0) goto L4b
            r6.e()     // Catch: java.lang.Exception -> L28
        L4b:
            gn2.a r6 = r3.f407347p     // Catch: java.lang.Exception -> L28
            if (r6 == 0) goto L71
            r0 = 0
            r1 = 0
            gn2.a.q(r6, r0, r4, r1)     // Catch: java.lang.Exception -> L28
            goto L71
        L55:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showSingSongListPanel error: "
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r1 = "FinderLiveAnchorMusicSingSongController"
            com.tencent.mars.xlog.Log.e(r1, r0, r6)
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
