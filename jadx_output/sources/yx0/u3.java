package yx0;

/* loaded from: classes5.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f467682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(yx0.b8 b8Var, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467681d = b8Var;
        this.f467682e = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.u3(this.f467681d, this.f467682e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.u3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r7)
            yx0.b8 r7 = r6.f467681d
            yx0.v r7 = r7.f467192s
            int r7 = r7.ordinal()
            java.lang.String r0 = "notifyHorizontalFOV >> but state is "
            java.lang.String r1 = "MicroMsg.ShootComposingCorePlugin"
            r2 = 1
            r3 = 0
            if (r7 == r2) goto L2f
            r4 = 2
            if (r7 == r4) goto L2f
            switch(r7) {
                case 6: goto L2f;
                case 7: goto L2f;
                case 8: goto L2f;
                case 9: goto L2f;
                case 10: goto L2f;
                case 11: goto L2f;
                default: goto L1b;
            }
        L1b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            yx0.b8 r4 = r6.f467681d
            yx0.v r4 = r4.f467192s
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r1, r7)
            goto L3c
        L2f:
            yx0.s3 r7 = new yx0.s3
            yx0.b8 r4 = r6.f467681d
            r7.<init>(r4, r3)
            java.lang.Object r7 = kotlinx.coroutines.l.f(r3, r7, r2, r3)
            jz5.f0 r7 = (jz5.f0) r7
        L3c:
            yx0.b8 r7 = r6.f467681d
            yx0.v r7 = r7.f467192s
            yx0.v r4 = yx0.v.f467695f
            jz5.f0 r5 = jz5.f0.f302826a
            if (r7 != r4) goto L53
            yx0.t3 r7 = new yx0.t3
            yx0.b8 r0 = r6.f467681d
            float r1 = r6.f467682e
            r7.<init>(r0, r1, r3)
            kotlinx.coroutines.l.f(r3, r7, r2, r3)
            return r5
        L53:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            yx0.b8 r0 = r6.f467681d
            yx0.v r0 = r0.f467192s
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r1, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.u3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
