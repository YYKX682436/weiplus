package pz0;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f359170d;

    /* renamed from: e, reason: collision with root package name */
    public int f359171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.bl6 f359172f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r45.bl6 bl6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f359172f = bl6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pz0.t(this.f359172f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pz0.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.bl6 bl6Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f359171e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.bl6 it = this.f359172f;
            kotlin.jvm.internal.o.f(it, "$it");
            this.f359170d = it;
            this.f359171e = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            java.lang.String c17 = com.tencent.mm.vfs.q7.c("maas_music_demo_resource");
            com.tencent.mm.vfs.w6.u(c17);
            java.lang.String i18 = com.tencent.mm.vfs.w6.i(c17 + '/' + it.f370860f, true);
            if (i18 == null) {
                nVar.resumeWith(kotlin.Result.m521constructorimpl(null));
                com.tencent.mars.xlog.Log.e("MicroMsg.Maas.MusicVideoResManager", "get path error");
            } else {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(i18));
                if (!r6Var.m() || r6Var.C() <= 0) {
                    ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(com.tencent.mars.cdn.CdnManager.createSNSDownload(it.f370860f, it.f370859e, 251, it.f370858d == 1 ? 20304 : 20302, i18), null, new pz0.s(it, i18, r6Var, nVar), 0);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MusicVideoResManager", it.f370860f + ' ' + it.f370858d + " already cached at " + i18 + ", fileSize: " + r6Var.C() + ", url: " + it.f370859e);
                    nVar.resumeWith(kotlin.Result.m521constructorimpl(i18));
                }
            }
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
            bl6Var = it;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bl6Var = (r45.bl6) this.f359170d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bl6Var.f370859e = (java.lang.String) obj;
        return jz5.f0.f302826a;
    }
}
