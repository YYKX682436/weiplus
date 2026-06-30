package pk4;

/* loaded from: classes15.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f356519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView f356520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView thumbPlayerSurfaceView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f356520e = thumbPlayerSurfaceView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk4.q0(this.f356520e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk4.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0022 -> B:5:0x0025). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f356519d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            goto L25
        Le:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L16:
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
        L1a:
            r7.f356519d = r2
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r1 = kotlinx.coroutines.k1.b(r3, r7)
            if (r1 != r0) goto L25
            return r0
        L25:
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerSurfaceView r1 = r7.f356520e
            kk4.c r3 = r1.f174576e
            if (r3 == 0) goto L3d
            kk4.f0 r3 = (kk4.f0) r3
            long r3 = r3.getCurrentPositionMs()
            r1.getProgressListener()
            pk4.p0 r5 = new pk4.p0
            r5.<init>(r3)
            r1.k(r5)
            goto L1a
        L3d:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pk4.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
