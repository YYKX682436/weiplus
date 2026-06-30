package yx0;

/* loaded from: classes5.dex */
public final class g7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.MJMusicInfo f467339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f467342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yx0.o f467344i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.tencent.maas.model.MJMusicInfo mJMusicInfo, yx0.b8 b8Var, yz5.l lVar, com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo, yz5.l lVar2, yx0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467339d = mJMusicInfo;
        this.f467340e = b8Var;
        this.f467341f = lVar;
        this.f467342g = audioCacheInfo;
        this.f467343h = lVar2;
        this.f467344i = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.g7(this.f467339d, this.f467340e, this.f467341f, this.f467342g, this.f467343h, this.f467344i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.g7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String musicID = this.f467339d.getMusicID();
        com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc = this.f467340e.T;
        boolean b17 = kotlin.jvm.internal.o.b(musicID, mJCamMusicDesc != null ? mJCamMusicDesc.getMusicID() : null);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (b17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMusic >> musicSelected.");
            yz5.l lVar = this.f467341f;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
            return f0Var;
        }
        switch (this.f467340e.f467192s.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMusic >> but state is " + this.f467340e.f467192s);
                yz5.l lVar2 = this.f467341f;
                if (lVar2 != null) {
                    lVar2.invoke(java.lang.Boolean.FALSE);
                }
                return f0Var;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                kotlinx.coroutines.l.f(null, new yx0.c7(this.f467340e, null), 1, null);
                break;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = this.f467339d.getMusicID();
        this.f467340e.q0(yx0.v.f467700n);
        yx0.b8 b8Var = this.f467340e;
        b8Var.f467194u = kotlinx.coroutines.l.d(b8Var.L, null, null, new yx0.f7(this.f467342g, b8Var, this.f467339d, h0Var, this.f467341f, this.f467343h, this.f467344i, null), 3, null);
        return f0Var;
    }
}
