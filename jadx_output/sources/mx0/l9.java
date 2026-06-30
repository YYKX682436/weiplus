package mx0;

/* loaded from: classes5.dex */
public final class l9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332136e = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.l9(this.f332136e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.l9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r13.f332135d
            r2 = 0
            r3 = 2
            jz5.f0 r4 = jz5.f0.f302826a
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout r5 = r13.f332136e
            r6 = 1
            if (r1 == 0) goto L21
            if (r1 == r6) goto L1d
            if (r1 != r3) goto L15
            kotlin.ResultKt.throwOnFailure(r14)
            goto L71
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            kotlin.ResultKt.throwOnFailure(r14)
            goto L3c
        L21:
            kotlin.ResultKt.throwOnFailure(r14)
            bs0.j r7 = r5.f69552q
            if (r7 == 0) goto L3f
            yt3.x3 r14 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.X(r5)
            int r10 = r14.f465719f
            r11 = 0
            r13.f332135d = r6
            r8 = 0
            r9 = 1920(0x780, float:2.69E-42)
            r12 = r13
            java.lang.Object r14 = r7.y(r8, r9, r10, r11, r12)
            if (r14 != r0) goto L3c
            return r0
        L3c:
            jz5.l r14 = (jz5.l) r14
            goto L40
        L3f:
            r14 = r2
        L40:
            if (r14 != 0) goto L43
            return r4
        L43:
            java.lang.Object r1 = r14.f302833d
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L71
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r5.f69542J
            kotlin.jvm.internal.o.d(r1)
            java.lang.String r1 = r1.D
            java.lang.Object r14 = r14.f302834e     // Catch: java.io.IOException -> L6a
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14     // Catch: java.io.IOException -> L6a
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.io.IOException -> L6a
            r8 = 100
            com.tencent.mm.sdk.platformtools.x.D0(r14, r8, r7, r1, r6)     // Catch: java.io.IOException -> L6a
            kz5.p0 r14 = kz5.p0.f313996d
            r13.f332135d = r3
            java.lang.Object r14 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.h0(r5, r1, r2, r14, r13)
            if (r14 != r0) goto L71
            return r0
        L6a:
            java.lang.String r14 = "MicroMsg.ShootComposingPluginLayout"
            java.lang.String r0 = "save picture error"
            com.tencent.mars.xlog.Log.e(r14, r0)
        L71:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.l9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
