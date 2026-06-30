package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class va extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ az2.f f120055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f120056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f120057f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(az2.f fVar, long j17, com.tencent.mm.plugin.finder.live.widget.nb nbVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120055d = fVar;
        this.f120056e = j17;
        this.f120057f = nbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.va(this.f120055d, this.f120056e, this.f120057f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.va vaVar = (com.tencent.mm.plugin.finder.live.widget.va) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vaVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f120055d.b();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", "doEndCoLive success: invitationId=" + this.f120056e);
        com.tencent.mm.plugin.finder.live.widget.nb nbVar = this.f120057f;
        mm2.n0 n0Var = nbVar.H;
        if (n0Var != null) {
            n0Var.N6();
        }
        yz5.a aVar2 = nbVar.V;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        com.tencent.mm.plugin.finder.live.widget.e0.t(nbVar, false, 1, null);
        return jz5.f0.f302826a;
    }
}
