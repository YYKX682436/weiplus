package si0;

/* loaded from: classes13.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f408147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.v f408148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(si0.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408148e = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new si0.p(this.f408148e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f408147d
            r2 = 2
            r3 = 1
            si0.v r4 = r5.f408148e
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L30
        L1e:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.r2 r6 = r4.f408199v
            if (r6 == 0) goto L30
            r5.f408147d = r3
            kotlinx.coroutines.c3 r6 = (kotlinx.coroutines.c3) r6
            java.lang.Object r6 = r6.C(r5)
            if (r6 != r0) goto L30
            return r0
        L30:
            kotlinx.coroutines.r2 r6 = r4.f408200w
            if (r6 == 0) goto L3d
            r5.f408147d = r2
            java.lang.Object r6 = kotlinx.coroutines.v2.d(r6, r5)
            if (r6 != r0) goto L3d
            return r0
        L3d:
            android.animation.ValueAnimator r6 = r4.f408192o
            android.animation.ValueAnimator$AnimatorUpdateListener r0 = r4.A
            r6.removeUpdateListener(r0)
            android.animation.Animator$AnimatorListener r6 = r4.B
            android.animation.ValueAnimator r0 = r4.f408192o
            r0.removeListener(r6)
            r6 = 0
            r4.f408184g = r6
            com.tencent.mm.rfx.RfxPagSurface r0 = r4.f408185h
            if (r0 == 0) goto L55
            r0.freeCache()
        L55:
            com.tencent.mm.rfx.RfxPagSurface r0 = r4.f408185h
            if (r0 == 0) goto L5c
            r0.release()
        L5c:
            r4.f408185h = r6
            com.tencent.mm.rfx.RfxPagPlayer r0 = r4.f408183f
            if (r0 != 0) goto L63
            goto L66
        L63:
            r0.setSurface(r6)
        L66:
            com.tencent.mm.rfx.RfxPagPlayer r0 = r4.f408183f
            if (r0 == 0) goto L6d
            r0.release()
        L6d:
            si0.b r0 = r4.C
            if (r0 == 0) goto L76
            android.media.MediaPlayer r0 = r0.f408037a
            r0.stop()
        L76:
            si0.b r0 = r4.C
            if (r0 == 0) goto L7f
            android.media.MediaPlayer r0 = r0.f408037a
            r0.release()
        L7f:
            r4.C = r6
            jz5.f0 r6 = jz5.f0.f302826a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
