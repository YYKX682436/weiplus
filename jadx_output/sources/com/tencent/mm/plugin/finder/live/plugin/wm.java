package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f114960d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f114961e;

    /* renamed from: f, reason: collision with root package name */
    public int f114962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.bn f114963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114964h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(com.tencent.mm.plugin.finder.live.plugin.bn bnVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114963g = bnVar;
        this.f114964h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.wm(this.f114963g, this.f114964h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.wm) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f114962f;
        com.tencent.mm.plugin.finder.live.plugin.bn bnVar = this.f114963g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.bn.t1(bnVar);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "playGiftAnimation launch timer by " + (bnVar.f112052p.c() / 1000));
            bnVar.f112052p.setVisibility(0);
            this.f114960d = bnVar;
            java.lang.String str = this.f114964h;
            this.f114961e = str;
            this.f114962f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            bnVar.f112052p.a(new com.tencent.mm.plugin.finder.live.plugin.vm(new kotlin.jvm.internal.c0(), bnVar, rVar));
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "start random gift animation, playOnce!");
            rj.j c17 = nn2.d.f338671a.c();
            if (str == null) {
                str = "";
            }
            rj.j.a(c17, str, bnVar.f112052p, null, 4, null);
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        bnVar.f112052p.setVisibility(8);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "start random gift animation, playOnce end!");
        return jz5.f0.f302826a;
    }
}
