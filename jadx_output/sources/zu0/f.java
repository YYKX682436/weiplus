package zu0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.maas_api.MJMediaItem f475672e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.maas_api.MJMediaItem mJMediaItem, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f475672e = mJMediaItem;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zu0.f fVar = new zu0.f(this.f475672e, continuation);
        fVar.f475671d = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zu0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.maas_api.MJMediaItem mJMediaItem = this.f475672e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            boolean z17 = true;
            if (mJMediaItem.f68641g <= 0 || mJMediaItem.f68642h <= 0) {
                if (zu0.g.a(mJMediaItem)) {
                    zu0.g.d(mJMediaItem);
                } else {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_album_get_video_info, 0) == 1) {
                        zu0.g.d(mJMediaItem);
                    } else {
                        zu0.g.c(mJMediaItem);
                    }
                }
            }
            int i17 = mJMediaItem.f68641g;
            int i18 = mJMediaItem.f68642h;
            int i19 = mJMediaItem.f68643i;
            qg.c cVar = qg.c.Video;
            if (i19 != 90 && i19 != 270) {
                z17 = false;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(zu0.g.b(mJMediaItem, i17, i18, cVar, z17));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MovieComp.MCMediaFile", "toMCMediaFile: video " + m524exceptionOrNullimpl, m524exceptionOrNullimpl);
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            return null;
        }
        return m521constructorimpl;
    }
}
