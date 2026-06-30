package pu;

/* loaded from: classes12.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.c f358319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(qi3.c cVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358319e = cVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pu.j0(this.f358319e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f358318d
            r2 = 0
            r3 = 1
            qi3.c r4 = r5.f358319e
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            kotlin.ResultKt.throwOnFailure(r6)
            goto L32
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.throwOnFailure(r6)
            r4.o()
            boolean r6 = r4 instanceof jg0.x
            if (r6 == 0) goto L26
            r6 = r4
            jg0.x r6 = (jg0.x) r6
            goto L27
        L26:
            r6 = r2
        L27:
            if (r6 == 0) goto L35
            r5.f358318d = r3
            java.lang.Object r6 = r6.M(r5)
            if (r6 != r0) goto L32
            return r0
        L32:
            qi3.f0 r6 = (qi3.f0) r6
            goto L36
        L35:
            r6 = r2
        L36:
            r4.f1()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.id()
            r0.append(r1)
            java.lang.String r1 = " initAsync retCode:"
            r0.append(r1)
            if (r6 == 0) goto L53
            int r1 = r6.f363700a
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
        L53:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.VoiceMsgAsyncSendFSC"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r0 = 0
            if (r6 == 0) goto L67
            int r6 = r6.f363700a
            if (r6 != 0) goto L67
            goto L68
        L67:
            r3 = r0
        L68:
            jz5.f0 r6 = jz5.f0.f302826a
            if (r3 != 0) goto L6f
            r4.f1()
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
