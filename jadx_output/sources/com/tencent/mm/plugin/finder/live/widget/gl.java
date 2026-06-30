package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class gl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f118458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f118459e;

    /* renamed from: f, reason: collision with root package name */
    public int f118460f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hl f118461g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f118462h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118463i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl(com.tencent.mm.plugin.finder.live.widget.hl hlVar, boolean z17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118461g = hlVar;
        this.f118462h = z17;
        this.f118463i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.gl(this.f118461g, this.f118462h, this.f118463i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.gl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118460f;
        com.tencent.mm.plugin.finder.live.widget.hl hlVar = this.f118461g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            hlVar.f118574b.u1();
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            com.tencent.mm.view.MMPAGView mMPAGView = hlVar.f118573a;
            boolean z17 = this.f118462h;
            mMPAGView.o(z17);
            com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayPagWidget", "playGiftAnimation launch timer by " + (mMPAGView.c() / 1000));
            this.f118458d = hlVar;
            java.lang.String str = this.f118463i;
            this.f118459e = str;
            this.f118460f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            mMPAGView.a(new com.tencent.mm.plugin.finder.live.widget.fl(new kotlin.jvm.internal.c0(), hlVar, rVar));
            com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayPagWidget", "start random gift animation, playOnce! useRfx:" + z17);
            rj.j c17 = nn2.d.f338671a.c();
            if (str == null) {
                str = "";
            }
            rj.j.a(c17, str, hlVar.f118573a, null, 4, null);
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        hlVar.f118573a.setVisibility(8);
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayPagWidget", "start random gift animation, playOnce end!");
        return jz5.f0.f302826a;
    }
}
