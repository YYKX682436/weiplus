package mh2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.k f326368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ om2.d0 f326369f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mh2.k kVar, om2.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f326368e = kVar;
        this.f326369f = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mh2.i(this.f326368e, this.f326369f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mh2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f326367d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mh2.k kVar = this.f326368e;
            om2.e0 e0Var = (om2.e0) this.f326369f;
            this.f326367d = 1;
            obj = mh2.k.a(kVar, e0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String coverUrl = (java.lang.String) obj;
        mh2.k kVar2 = this.f326368e;
        if (kVar2.f326381m instanceof om2.e0) {
            kVar2.getClass();
            if (coverUrl == null || coverUrl.length() == 0) {
                com.tencent.mars.xlog.Log.w("KTVCoverBackgroundWidget", "updateKTVCover got null song cover url");
                kVar2.g();
            } else {
                com.tencent.mm.plugin.finder.live.util.i iVar = com.tencent.mm.plugin.finder.live.util.i.f115540a;
                mh2.j jVar = new mh2.j(kVar2);
                kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
                com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.plugin.finder.live.util.i.f115541b;
                synchronized (r2Var) {
                    obj2 = r2Var.get(coverUrl);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadSongCoverBlurBg coverUrl:");
                sb6.append(coverUrl);
                sb6.append(",cache bm is null:");
                sb6.append(obj2 == null);
                sb6.append('!');
                com.tencent.mars.xlog.Log.i("BlurAvatarUtil", sb6.toString());
                jz5.l lVar = (jz5.l) obj2;
                if (lVar != null) {
                    zl2.r4.f473950a.R2(kVar2, (android.graphics.Bitmap) lVar.f302834e);
                    jVar.invoke(lVar.f302833d);
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    wo0.c b17 = g1Var.e().b(new mn2.q3(coverUrl, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.G));
                    com.tencent.mm.plugin.finder.live.util.h hVar = new com.tencent.mm.plugin.finder.live.util.h(iVar, coverUrl, kVar2, jVar);
                    b17.getClass();
                    b17.f447873d = hVar;
                    b17.f();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
