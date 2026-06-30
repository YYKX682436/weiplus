package yx0;

/* loaded from: classes5.dex */
public final class y7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f467794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(yx0.b8 b8Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467793d = b8Var;
        this.f467794e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.y7(this.f467793d, this.f467794e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.y7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
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
            yx0.b8 r7 = r6.f467793d
            yx0.v r7 = r7.f467192s
            int r7 = r7.ordinal()
            r0 = 2
            java.lang.String r1 = "toggleSubtitle >> but state is "
            java.lang.String r2 = "MicroMsg.ShootComposingCorePlugin"
            r3 = 1
            r4 = 0
            if (r7 == r0) goto L2d
            switch(r7) {
                case 6: goto L2d;
                case 7: goto L2d;
                case 8: goto L2d;
                case 9: goto L2d;
                case 10: goto L2d;
                case 11: goto L2d;
                default: goto L19;
            }
        L19:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            yx0.b8 r0 = r6.f467793d
            yx0.v r0 = r0.f467192s
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r2, r7)
            goto L3a
        L2d:
            yx0.w7 r7 = new yx0.w7
            yx0.b8 r0 = r6.f467793d
            r7.<init>(r0, r4)
            java.lang.Object r7 = kotlinx.coroutines.l.f(r4, r7, r3, r4)
            jz5.f0 r7 = (jz5.f0) r7
        L3a:
            yx0.b8 r7 = r6.f467793d
            yx0.v r7 = r7.f467192s
            yx0.v r0 = yx0.v.f467695f
            jz5.f0 r5 = jz5.f0.f302826a
            if (r7 != r0) goto L51
            yx0.x7 r7 = new yx0.x7
            yx0.b8 r0 = r6.f467793d
            boolean r1 = r6.f467794e
            r7.<init>(r0, r1, r4)
            kotlinx.coroutines.l.f(r4, r7, r3, r4)
            return r5
        L51:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            yx0.b8 r0 = r6.f467793d
            yx0.v r0 = r0.f467192s
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r2, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.y7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
