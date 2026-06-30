package q71;

/* loaded from: classes8.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f360334d;

    /* renamed from: e, reason: collision with root package name */
    public int f360335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zi5 f360336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f360337g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(r45.zi5 zi5Var, yz5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360336f = zi5Var;
        this.f360337g = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q71.d0(this.f360336f, this.f360337g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((q71.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f360335e
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L26
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.throwOnFailure(r8)
            goto Lcd
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.Object r1 = r7.f360334d
            com.tencent.mm.modelbase.f r1 = (com.tencent.mm.modelbase.f) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto Lb7
        L26:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L61
        L2a:
            kotlin.ResultKt.throwOnFailure(r8)
            r45.gj5 r8 = new r45.gj5
            r8.<init>()
            r45.zi5 r1 = r7.f360336f
            r8.f375306d = r1
            com.tencent.mm.modelbase.l r1 = new com.tencent.mm.modelbase.l
            r1.<init>()
            r6 = 418(0x1a2, float:5.86E-43)
            r1.f70667d = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/rcptinfoupdate"
            r1.f70666c = r6
            r1.f70664a = r8
            r45.hj5 r8 = new r45.hj5
            r8.<init>()
            r1.f70665b = r8
            com.tencent.mm.modelbase.o r8 = r1.a()
            com.tencent.mm.modelbase.i r1 = new com.tencent.mm.modelbase.i
            r1.<init>()
            r1.p(r8)
            r7.f360335e = r5
            java.lang.Object r8 = rm0.h.b(r1, r7)
            if (r8 != r0) goto L61
            return r0
        L61:
            r1 = r8
            com.tencent.mm.modelbase.f r1 = (com.tencent.mm.modelbase.f) r1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r6 = "doCgi, errType = "
            r8.<init>(r6)
            int r6 = r1.f70615a
            r8.append(r6)
            java.lang.String r6 = ", errCode = "
            r8.append(r6)
            int r6 = r1.f70616b
            r8.append(r6)
            java.lang.String r6 = ", errMsg = "
            r8.append(r6)
            java.lang.String r6 = r1.f70617c
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            java.lang.String r6 = "MicroMsg.RcptInfoUpdateCgi"
            com.tencent.mars.xlog.Log.i(r6, r8)
            int r8 = r1.f70615a
            if (r8 != 0) goto Lb7
            int r8 = r1.f70616b
            if (r8 != 0) goto Lb7
            com.tencent.mm.protobuf.f r8 = r1.f70618d
            r45.hj5 r8 = (r45.hj5) r8
            r45.yi5 r8 = r8.f376220d
            java.util.LinkedList r8 = r8.f391139e
            if (r8 == 0) goto La0
            goto La1
        La0:
            r5 = 0
        La1:
            if (r5 == 0) goto Lb7
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r5 = kotlinx.coroutines.internal.b0.f310484a
            q71.b0 r6 = new q71.b0
            r6.<init>(r8, r4)
            r7.f360334d = r1
            r7.f360335e = r3
            java.lang.Object r8 = kotlinx.coroutines.l.g(r5, r6, r7)
            if (r8 != r0) goto Lb7
            return r0
        Lb7:
            kotlinx.coroutines.p0 r8 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r8 = kotlinx.coroutines.internal.b0.f310484a
            q71.c0 r3 = new q71.c0
            yz5.q r5 = r7.f360337g
            r3.<init>(r5, r1, r4)
            r7.f360334d = r4
            r7.f360335e = r2
            java.lang.Object r8 = kotlinx.coroutines.l.g(r8, r3, r7)
            if (r8 != r0) goto Lcd
            return r0
        Lcd:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q71.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
