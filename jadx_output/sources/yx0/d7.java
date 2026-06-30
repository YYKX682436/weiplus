package yx0;

/* loaded from: classes5.dex */
public final class d7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJMusicInfo f467255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f467256g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467257h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yx0.o f467258i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f467259m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(yx0.b8 b8Var, com.tencent.maas.model.MJMusicInfo mJMusicInfo, kotlin.jvm.internal.h0 h0Var, yz5.l lVar, yx0.o oVar, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467254e = b8Var;
        this.f467255f = mJMusicInfo;
        this.f467256g = h0Var;
        this.f467257h = lVar;
        this.f467258i = oVar;
        this.f467259m = audioCacheInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.d7(this.f467254e, this.f467255f, this.f467256g, this.f467257h, this.f467258i, this.f467259m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.d7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0092  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f467253d
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.ResultKt.throwOnFailure(r7)
            goto L8a
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L3b
        L1f:
            kotlin.ResultKt.throwOnFailure(r7)
            yx0.b8 r7 = r6.f467254e
            com.tencent.maas.model.MJMusicInfo r1 = r6.f467255f
            java.util.concurrent.locks.ReentrantLock r5 = yx0.b8.f467171c2
            com.tencent.maas.camstudio.MJCamMusicDesc r7 = r7.w0(r1)
            yx0.b8 r1 = r6.f467254e
            pp0.p0 r1 = r1.K
            if (r1 == 0) goto L42
            r6.f467253d = r4
            java.lang.Object r7 = r1.r(r7, r6)
            if (r7 != r0) goto L3b
            return r0
        L3b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L43
        L42:
            r7 = 0
        L43:
            if (r7 != 0) goto L71
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "switchMusic >> but setMusic is error "
            r7.<init>(r0)
            kotlin.jvm.internal.h0 r0 = r6.f467256g
            java.lang.Object r0 = r0.f310123d
            java.lang.String r0 = (java.lang.String) r0
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "MicroMsg.ShootComposingCorePlugin"
            com.tencent.mars.xlog.Log.i(r0, r7)
            yx0.b8 r7 = r6.f467254e
            yx0.v r0 = yx0.v.f467695f
            java.util.concurrent.locks.ReentrantLock r1 = yx0.b8.f467171c2
            r7.q0(r0)
            yz5.l r7 = r6.f467257h
            if (r7 == 0) goto L70
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.invoke(r0)
        L70:
            return r2
        L71:
            yx0.b8 r7 = r6.f467254e
            pp0.p0 r1 = r7.K
            if (r1 == 0) goto L7c
            com.tencent.maas.camstudio.MJCamMusicDesc r1 = r1.k()
            goto L7d
        L7c:
            r1 = 0
        L7d:
            r7.T = r1
            yx0.b8 r7 = r6.f467254e
            r6.f467253d = r3
            java.lang.Object r7 = yx0.b8.o(r7, r6)
            if (r7 != r0) goto L8a
            return r0
        L8a:
            yx0.b8 r7 = r6.f467254e
            yx0.o r0 = r6.f467258i
            yx0.o r1 = yx0.o.f467486d
            if (r0 != r1) goto L95
            yx0.r r0 = yx0.r.f467598a
            goto L9f
        L95:
            yx0.s r1 = new yx0.s
            com.tencent.maas.model.MJMusicInfo r3 = r6.f467255f
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r4 = r6.f467259m
            r1.<init>(r3, r0, r4)
            r0 = r1
        L9f:
            r7.U = r0
            yx0.b8 r7 = r6.f467254e
            yx0.v r0 = yx0.v.f467695f
            r7.q0(r0)
            yz5.l r7 = r6.f467257h
            if (r7 == 0) goto Lb1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.invoke(r0)
        Lb1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.d7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
