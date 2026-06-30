package vu0;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.s f440138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ru0.d f440139e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f440140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yu0.t f440141g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(vu0.s sVar, ru0.d dVar, java.util.List list, yu0.t tVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440138d = sVar;
        this.f440139e = dVar;
        this.f440140f = list;
        this.f440141g = tVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vu0.p(this.f440138d, this.f440139e, this.f440140f, this.f440141g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vu0.p pVar = (vu0.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.maas.base.MJID mjid = this.f440139e.f399660a;
        yu0.t tVar = this.f440141g;
        com.tencent.maas.model.time.MJTime mJTime = tVar.f465840f;
        vu0.s sVar = this.f440138d;
        sVar.getClass();
        java.lang.String str = tVar.f465836b;
        ru0.d dVar = new ru0.d(mjid, str);
        yu0.m mVar = (yu0.m) ((jz5.n) sVar.f440153e).getValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (mVar != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = sVar.f440154f;
            java.util.List<com.tencent.maas.moviecomposing.segments.CaptionItem> list = this.f440140f;
            concurrentHashMap.put(dVar, java.lang.Integer.valueOf(list.size()));
            sVar.f440155g.put(dVar, new java.util.ArrayList());
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.maas.moviecomposing.segments.CaptionItem captionItem : list) {
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.o.f(uuid, "toString(...)");
                java.lang.String uuid2 = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.o.f(uuid2, "toString(...)");
                vu0.m mVar2 = new vu0.m(mjid, captionItem, mJTime);
                java.lang.String text = captionItem.getText();
                kotlin.jvm.internal.o.f(text, "getText(...)");
                com.tencent.maas.base.MJID mjid2 = mjid;
                kotlinx.coroutines.l.d(mVar.f465818i, mVar.f465816g, null, new yu0.g(new yu0.d(uuid, kz5.b0.c(new yu0.c(uuid, uuid2, new yu0.p(r26.i0.t(text, "\n", "", true), str, tVar.f465837c, mVar2)))), mVar, null), 2, null);
                arrayList.add(f0Var);
                mjid = mjid2;
            }
        }
        return f0Var;
    }
}
