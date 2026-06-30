package rn2;

/* loaded from: classes.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.oz1 f397725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397726g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.n f397727h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ az2.f f397728i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.content.Context context, r45.oz1 oz1Var, java.lang.String str, v65.n nVar, az2.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397724e = context;
        this.f397725f = oz1Var;
        this.f397726g = str;
        this.f397727h = nVar;
        this.f397728i = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rn2.f0(this.f397724e, this.f397725f, this.f397726g, this.f397727h, this.f397728i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x007a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f397723d
            az2.f r2 = r11.f397728i
            v65.n r3 = r11.f397727h
            java.lang.String r4 = "FinderLiveLotteryGiftCreate"
            r45.oz1 r5 = r11.f397725f
            android.content.Context r6 = r11.f397724e
            r7 = 0
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L27
            if (r1 == r9) goto L23
            if (r1 != r8) goto L1b
            kotlin.ResultKt.throwOnFailure(r12)
            goto L6f
        L1b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L23:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L50
        L27:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Class<zy2.b6> r12 = zy2.b6.class
            i95.m r12 = i95.n0.c(r12)
            zy2.b6 r12 = (zy2.b6) r12
            com.tencent.mm.protobuf.g r1 = r5.getByteString(r8)
            if (r1 == 0) goto L3d
            byte[] r1 = r1.g()
            goto L3e
        L3d:
            r1 = r7
        L3e:
            if (r1 != 0) goto L43
            r1 = 0
            byte[] r1 = new byte[r1]
        L43:
            r11.f397723d = r9
            c61.l7 r12 = (c61.l7) r12
            java.lang.String r10 = r11.f397726g
            java.lang.Object r12 = r12.Mk(r6, r1, r10, r11)
            if (r12 != r0) goto L50
            return r0
        L50:
            jz5.l r12 = (jz5.l) r12
            java.lang.Object r1 = r12.f302833d
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L9b
            rn2.l0 r12 = rn2.l0.f397792a
            java.lang.String r1 = r5.getString(r9)
            if (r1 != 0) goto L66
            java.lang.String r1 = ""
        L66:
            r11.f397723d = r8
            java.lang.Object r12 = rn2.l0.b(r12, r1, r11)
            if (r12 != r0) goto L6f
            return r0
        L6f:
            r45.kn1 r12 = (r45.kn1) r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "pollResult bill_status:"
            r0.<init>(r1)
            if (r12 == 0) goto L83
            int r1 = r12.getInteger(r9)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r1)
        L83:
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r4, r0)
            jz5.l r0 = new jz5.l
            java.lang.String r1 = "poll finish"
            r0.<init>(r1, r12)
            r3.a(r0)
            r2.b()
            goto Lcc
        L9b:
            r0 = 2131763871(0x7f10229f, float:1.915886E38)
            java.lang.String r0 = r6.getString(r0)
            db5.t7.m(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[finderPayFullWholeProcess] errCode:"
            r0.<init>(r1)
            java.lang.Object r12 = r12.f302834e
            java.lang.String r12 = (java.lang.String) r12
            r0.append(r12)
            java.lang.String r12 = ", "
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            com.tencent.mars.xlog.Log.i(r4, r12)
            jz5.l r12 = new jz5.l
            java.lang.String r0 = "pay fail"
            r12.<init>(r0, r7)
            r3.a(r12)
            r2.b()
        Lcc:
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
