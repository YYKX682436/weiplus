package yf0;

/* loaded from: classes5.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f461503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f461504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.z f461505f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf0.k0 f461506g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f461507h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f461508i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f461509m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f461510n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(kotlinx.coroutines.z zVar, kotlinx.coroutines.z zVar2, yf0.k0 k0Var, zf0.v0 v0Var, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461504e = zVar;
        this.f461505f = zVar2;
        this.f461506g = k0Var;
        this.f461507h = v0Var;
        this.f461508i = f0Var;
        this.f461509m = f0Var2;
        this.f461510n = msgIdTalker;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf0.b0(this.f461504e, this.f461505f, this.f461506g, this.f461507h, this.f461508i, this.f461509m, this.f461510n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf0.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f461503d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.throwOnFailure(r10)
            goto L5d
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L40
        L1f:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L33
        L23:
            kotlin.ResultKt.throwOnFailure(r10)
            r9.f461503d = r4
            kotlinx.coroutines.z r10 = r9.f461504e
            kotlinx.coroutines.a0 r10 = (kotlinx.coroutines.a0) r10
            java.lang.Object r10 = r10.k(r9)
            if (r10 != r0) goto L33
            return r0
        L33:
            r9.f461503d = r3
            kotlinx.coroutines.z r10 = r9.f461505f
            kotlinx.coroutines.a0 r10 = (kotlinx.coroutines.a0) r10
            java.lang.Object r10 = r10.k(r9)
            if (r10 != r0) goto L40
            return r0
        L40:
            yf0.k0 r3 = r9.f461506g
            zf0.v0 r4 = r9.f461507h
            kotlin.jvm.internal.f0 r10 = r9.f461508i
            int r5 = r10.f310116d
            kotlin.jvm.internal.f0 r10 = r9.f461509m
            int r6 = r10.f310116d
            yf0.a0 r7 = new yf0.a0
            com.tencent.mm.plugin.msg.MsgIdTalker r10 = r9.f461510n
            r7.<init>(r10, r4)
            r9.f461503d = r2
            r8 = r9
            java.lang.Object r10 = yf0.k0.T6(r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L5d
            return r0
        L5d:
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yf0.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
