package yx0;

/* loaded from: classes5.dex */
public final class f7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467306d;

    /* renamed from: e, reason: collision with root package name */
    public int f467307e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f467308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467309g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJMusicInfo f467310h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f467311i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467312m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467313n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yx0.o f467314o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, yx0.b8 b8Var, com.tencent.maas.model.MJMusicInfo mJMusicInfo, kotlin.jvm.internal.h0 h0Var, yz5.l lVar, yz5.l lVar2, yx0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467308f = audioCacheInfo;
        this.f467309g = b8Var;
        this.f467310h = mJMusicInfo;
        this.f467311i = h0Var;
        this.f467312m = lVar;
        this.f467313n = lVar2;
        this.f467314o = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.f7(this.f467308f, this.f467309g, this.f467310h, this.f467311i, this.f467312m, this.f467313n, this.f467314o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.f7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r15 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ab  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.f7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
