package pu;

/* loaded from: classes12.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.c f358372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pu.t0 f358373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(qi3.c cVar, pu.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358372e = cVar;
        this.f358373f = t0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pu.r0(this.f358372e, this.f358373f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f358371d
            r2 = 1
            r3 = 0
            qi3.c r4 = r6.f358372e
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.throwOnFailure(r7)
            goto L32
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.ResultKt.throwOnFailure(r7)
            r4.o()
            boolean r7 = r4 instanceof jg0.x
            if (r7 == 0) goto L26
            r7 = r4
            jg0.x r7 = (jg0.x) r7
            goto L27
        L26:
            r7 = r3
        L27:
            if (r7 == 0) goto L35
            r6.f358371d = r2
            java.lang.Object r7 = r7.N(r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            qi3.f0 r7 = (qi3.f0) r7
            goto L36
        L35:
            r7 = r3
        L36:
            r4.f1()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.id()
            r0.append(r1)
            java.lang.String r1 = " startAsync retCode:"
            r0.append(r1)
            if (r7 == 0) goto L54
            int r1 = r7.f363700a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r1)
            goto L55
        L54:
            r5 = r3
        L55:
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.VoiceMsgAsyncSendFSC"
            com.tencent.mars.xlog.Log.i(r1, r0)
            if (r7 == 0) goto L69
            int r7 = r7.f363700a
            if (r7 != 0) goto L69
            r7 = r2
            goto L6a
        L69:
            r7 = 0
        L6a:
            jz5.f0 r0 = jz5.f0.f302826a
            if (r7 != 0) goto L72
            r4.f1()
            return r0
        L72:
            pu.t0 r7 = r6.f358373f
            jz5.g r7 = r7.f358380h
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.getValue()
            com.tencent.mm.sdk.coroutines.SequenceLifecycleScope r7 = (com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) r7
            pu.q0 r1 = new pu.q0
            r1.<init>(r4, r3)
            v65.i.b(r7, r3, r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
