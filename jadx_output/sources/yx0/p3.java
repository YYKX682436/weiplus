package yx0;

/* loaded from: classes5.dex */
public final class p3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f467548f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(yx0.b8 b8Var, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467546d = b8Var;
        this.f467547e = str;
        this.f467548f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.p3(this.f467546d, this.f467547e, this.f467548f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.p3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
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
            yx0.b8 r7 = r6.f467546d
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
            yx0.b8 r0 = r6.f467546d
            yx0.v r0 = r0.f467192s
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r2, r7)
            goto L3a
        L2d:
            yx0.n3 r7 = new yx0.n3
            yx0.b8 r0 = r6.f467546d
            r7.<init>(r0, r4)
            java.lang.Object r7 = kotlinx.coroutines.l.f(r4, r7, r3, r4)
            jz5.f0 r7 = (jz5.f0) r7
        L3a:
            yx0.b8 r7 = r6.f467546d
            yx0.v r7 = r7.f467192s
            yx0.v r0 = yx0.v.f467695f
            jz5.f0 r5 = jz5.f0.f302826a
            if (r7 != r0) goto L53
            yx0.o3 r7 = new yx0.o3
            boolean r0 = r6.f467548f
            java.lang.String r1 = r6.f467547e
            yx0.b8 r2 = r6.f467546d
            r7.<init>(r0, r1, r2, r4)
            kotlinx.coroutines.l.f(r4, r7, r3, r4)
            return r5
        L53:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            yx0.b8 r0 = r6.f467546d
            yx0.v r0 = r0.f467192s
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.mars.xlog.Log.i(r2, r7)
            yx0.b8 r7 = r6.f467546d
            mx0.z r7 = r7.f467177d
            java.lang.String r0 = r6.f467547e
            boolean r1 = r6.f467548f
            r2 = 0
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout r7 = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) r7
            r7.H0(r0, r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.p3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
