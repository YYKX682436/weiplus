package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wk extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hl f120198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f120199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f120200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f120201g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f120202h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f120203i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f120204m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(com.tencent.mm.plugin.finder.live.widget.hl hlVar, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.h0 h0Var, java.util.LinkedList linkedList, kotlin.jvm.internal.h0 h0Var2, kotlinx.coroutines.y0 y0Var, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120198d = hlVar;
        this.f120199e = g0Var;
        this.f120200f = h0Var;
        this.f120201g = linkedList;
        this.f120202h = h0Var2;
        this.f120203i = y0Var;
        this.f120204m = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.wk(this.f120198d, this.f120199e, this.f120200f, this.f120201g, this.f120202h, this.f120203i, this.f120204m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.wk wkVar = (com.tencent.mm.plugin.finder.live.widget.wk) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wkVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.widget.hl hlVar = this.f120198d;
        int visibility = hlVar.f118573a.getVisibility();
        com.tencent.mm.view.MMPAGView mMPAGView = hlVar.f118573a;
        if (visibility != 0) {
            mMPAGView.setVisibility(0);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayPagWidget", "playFundingTaskAnim start");
        long c17 = c01.id.c();
        kotlin.jvm.internal.g0 g0Var = this.f120199e;
        g0Var.f310121d = c17;
        mMPAGView.g();
        xk2.c cVar = (xk2.c) this.f120200f.f310123d;
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveBgmPlayer", com.tencent.tav.core.AssetExtension.SCENE_PLAY);
            ((kk4.f0) cVar.f455018a).start();
        }
        java.util.LinkedList linkedList = this.f120201g;
        if (!(linkedList == null || linkedList.isEmpty())) {
            this.f120202h.f310123d = kotlinx.coroutines.l.d(this.f120203i, null, kotlinx.coroutines.a1.UNDISPATCHED, new com.tencent.mm.plugin.finder.live.widget.sk(this.f120201g, g0Var.f310121d, this.f120204m, null), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
