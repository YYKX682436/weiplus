package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fu extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f134428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nu f134429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t80 f134430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f134431g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f134432h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ so2.o4 f134433i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f134434m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f134435n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu(com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar, com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var, int i17, java.lang.StringBuilder sb6, so2.o4 o4Var, so2.j5 j5Var, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134429e = nuVar;
        this.f134430f = t80Var;
        this.f134431g = i17;
        this.f134432h = sb6;
        this.f134433i = o4Var;
        this.f134434m = j5Var;
        this.f134435n = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.fu(this.f134429e, this.f134430f, this.f134431g, this.f134432h, this.f134433i, this.f134434m, this.f134435n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.fu) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar;
        java.lang.Object j17;
        androidx.recyclerview.widget.k3 p07;
        android.view.View view;
        pz5.a aVar2 = pz5.a.f359186d;
        int i17 = this.f134428d;
        com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar = this.f134429e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.viewmodel.component.t80 uic = this.f134430f;
            kotlin.jvm.internal.o.f(uic, "$uic");
            int i18 = this.f134431g;
            this.f134428d = 1;
            java.lang.Integer[] numArr = com.tencent.mm.plugin.finder.viewmodel.component.nu.f135352r;
            nuVar.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            androidx.recyclerview.widget.RecyclerView S6 = uic.S6();
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (S6 == null || (p07 = S6.p0(uic.P6())) == null || (view = p07.itemView) == null) ? null : (com.tencent.mm.plugin.finder.video.FinderVideoLayout) view.findViewById(com.tencent.mm.R.id.e_k);
            if (!(finderVideoLayout instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout)) {
                finderVideoLayout = null;
            }
            if (finderVideoLayout == null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", "waitBeforeFinWatchInterval but finder_banner_video_layout is null!");
                nVar.a(java.lang.Boolean.FALSE);
                aVar = aVar2;
            } else {
                long videoDurationMs = finderVideoLayout.getVideoDurationMs();
                long currentPosMs = finderVideoLayout.getCurrentPosMs();
                aVar = aVar2;
                if ((videoDurationMs - currentPosMs) / 1000 <= i18) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", "waitBeforeFinWatchInterval suc, totalPlayMs=" + videoDurationMs + " curPlayMs=" + currentPosMs + " beforeFinWatchInterval=" + i18 + '!');
                    nVar.a(java.lang.Boolean.TRUE);
                } else {
                    com.tencent.mm.plugin.finder.viewmodel.component.mu muVar = new com.tencent.mm.plugin.finder.viewmodel.component.mu(videoDurationMs, i18, nVar, finderVideoLayout);
                    finderVideoLayout.t(muVar);
                    rVar.m(new com.tencent.mm.plugin.finder.viewmodel.component.lu(nVar, finderVideoLayout, muVar));
                }
            }
            j17 = rVar.j();
            pz5.a aVar3 = aVar;
            if (j17 == aVar3) {
                return aVar3;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) j17).booleanValue();
        java.lang.StringBuilder sb6 = this.f134432h;
        if (booleanValue) {
            sb6.append("waitBeforeFinWatchInterval suc,");
            com.tencent.mm.plugin.finder.viewmodel.component.nu.Q6(nuVar, this.f134435n, sb6, this.f134433i, this.f134434m);
            com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", sb6.toString());
        } else {
            sb6.append("waitBeforeFinWatchInterval fail!");
            com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
