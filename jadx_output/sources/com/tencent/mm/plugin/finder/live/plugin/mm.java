package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.bn f113529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f113530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f113531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f113532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f113533h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f113534i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f113535m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm(com.tencent.mm.plugin.finder.live.plugin.bn bnVar, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.h0 h0Var, java.util.LinkedList linkedList, kotlin.jvm.internal.h0 h0Var2, kotlinx.coroutines.y0 y0Var, java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113529d = bnVar;
        this.f113530e = g0Var;
        this.f113531f = h0Var;
        this.f113532g = linkedList;
        this.f113533h = h0Var2;
        this.f113534i = y0Var;
        this.f113535m = obj;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.mm(this.f113529d, this.f113530e, this.f113531f, this.f113532g, this.f113533h, this.f113534i, this.f113535m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.mm mmVar = (com.tencent.mm.plugin.finder.live.plugin.mm) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mmVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.plugin.bn bnVar = this.f113529d;
        int visibility = bnVar.f112052p.getVisibility();
        com.tencent.mm.view.MMPAGView mMPAGView = bnVar.f112052p;
        if (visibility != 0) {
            mMPAGView.setVisibility(0);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftPlayPlugin", "playFundingTaskAnim start");
        long c17 = c01.id.c();
        kotlin.jvm.internal.g0 g0Var = this.f113530e;
        g0Var.f310121d = c17;
        mMPAGView.g();
        xk2.c cVar = (xk2.c) this.f113531f.f310123d;
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveBgmPlayer", com.tencent.tav.core.AssetExtension.SCENE_PLAY);
            ((kk4.f0) cVar.f455018a).start();
        }
        java.util.LinkedList linkedList = this.f113532g;
        if (!(linkedList == null || linkedList.isEmpty())) {
            this.f113533h.f310123d = kotlinx.coroutines.l.d(this.f113534i, null, kotlinx.coroutines.a1.UNDISPATCHED, new com.tencent.mm.plugin.finder.live.plugin.km(this.f113532g, g0Var.f310121d, this.f113535m, null), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
