package xe2;

/* loaded from: classes3.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f453854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bk1 f453855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe2.f1 f453856f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(r45.bk1 bk1Var, xe2.f1 f1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453855e = bk1Var;
        this.f453856f = f1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xe2.e1(this.f453855e, this.f453856f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xe2.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f453854d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            kotlin.ResultKt.throwOnFailure(r8)
            goto L86
        Le:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L16:
            kotlin.ResultKt.throwOnFailure(r8)
            r45.b72 r8 = new r45.b72
            r8.<init>()
            r45.bk1 r1 = r7.f453855e
            com.tencent.mm.protobuf.g r1 = r1.getByteString(r2)
            r3 = 0
            if (r1 == 0) goto L2c
            byte[] r1 = r1.g()
            goto L2d
        L2c:
            r1 = r3
        L2d:
            if (r1 != 0) goto L31
        L2f:
            r8 = r3
            goto L42
        L31:
            r8.parseFrom(r1)     // Catch: java.lang.Exception -> L35
            goto L42
        L35:
            r8 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r4 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r4, r1, r8)
            goto L2f
        L42:
            if (r8 == 0) goto L9b
            long r3 = r8.getLong(r2)
            r1 = 0
            int r8 = r8.getInteger(r1)
            if (r8 != 0) goto L9b
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L9b
            java.util.Random r8 = new java.util.Random
            r8.<init>()
            int r1 = (int) r3
            int r8 = r8.nextInt(r1)
            xe2.f1 r1 = r7.f453856f
            java.lang.String r1 = r1.f453860c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "receive RefreshShopShelf msg, refresh after "
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r4 = " seconds"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.mars.xlog.Log.i(r1, r3)
            long r3 = (long) r8
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r7.f453854d = r2
            java.lang.Object r8 = kotlinx.coroutines.k1.b(r3, r7)
            if (r8 != r0) goto L86
            return r0
        L86:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r0 = "PARAM_FINDER_LIVE_SHOPPING_REFRESH_WHEN_OPEN"
            r8.putBoolean(r0, r2)
            dk2.ef r0 = dk2.ef.f233372a
            com.tencent.mm.plugin.finder.live.view.k0 r0 = dk2.ef.f233380e
            if (r0 == 0) goto L9b
            qo0.b r1 = qo0.b.f365359h2
            r0.statusChange(r1, r8)
        L9b:
            jz5.f0 r8 = jz5.f0.f302826a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
