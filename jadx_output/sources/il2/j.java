package il2;

/* loaded from: classes3.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f292064d;

    /* renamed from: e, reason: collision with root package name */
    public int f292065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ il2.r f292066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ il2.a f292067g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(il2.r rVar, il2.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292066f = rVar;
        this.f292067g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new il2.j(this.f292066f, this.f292067g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((il2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f292065e
            il2.a r2 = r7.f292067g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r7.f292064d
            xg2.h r0 = (xg2.h) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L8d
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L23:
            java.lang.Object r1 = r7.f292064d
            xg2.h r1 = (xg2.h) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L71
        L2b:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L52
        L2f:
            kotlin.ResultKt.throwOnFailure(r8)
            r45.ln1 r8 = new r45.ln1
            r8.<init>()
            int r1 = r2.f292033a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.set(r4, r1)
            java.lang.String r1 = r2.f292034b
            r8.set(r3, r1)
            com.tencent.mm.modelbase.i r8 = r8.d()
            r7.f292065e = r5
            java.lang.Object r8 = xg2.g.d(r8, r6, r7, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            r1 = r8
            xg2.h r1 = (xg2.h) r1
            boolean r8 = r1 instanceof xg2.i
            if (r8 == 0) goto L71
            oz5.l r8 = r1.f454392a
            if (r8 != 0) goto L61
            oz5.l r8 = r7.getContext()
        L61:
            il2.i r5 = new il2.i
            r5.<init>(r1, r6, r2)
            r7.f292064d = r1
            r7.f292065e = r4
            java.lang.Object r8 = kotlinx.coroutines.l.g(r8, r5, r7)
            if (r8 != r0) goto L71
            return r0
        L71:
            boolean r8 = r1 instanceof xg2.b
            if (r8 == 0) goto L8d
            oz5.l r8 = r1.f454392a
            if (r8 != 0) goto L7d
            oz5.l r8 = r7.getContext()
        L7d:
            il2.h r4 = new il2.h
            r4.<init>(r1, r6, r2)
            r7.f292064d = r1
            r7.f292065e = r3
            java.lang.Object r8 = kotlinx.coroutines.l.g(r8, r4, r7)
            if (r8 != r0) goto L8d
            return r0
        L8d:
            il2.r r8 = r7.f292066f
            r0 = 0
            r8.f292085s = r0
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: il2.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
