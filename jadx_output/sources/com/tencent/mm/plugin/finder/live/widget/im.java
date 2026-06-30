package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class im extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f118687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f118688e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im(com.tencent.mm.plugin.finder.live.widget.wm wmVar, zi2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118687d = wmVar;
        this.f118688e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.im(this.f118687d, this.f118688e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.im imVar = (com.tencent.mm.plugin.finder.live.widget.im) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        imVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.widget.wm wmVar = this.f118687d;
        wmVar.f120209g.setClickable(false);
        zi2.w wVar = this.f118688e;
        dk2.xf W0 = wVar.W0();
        if (W0 != null) {
            ((dk2.r4) W0).T(java.lang.System.currentTimeMillis(), new com.tencent.mm.plugin.finder.live.widget.hm(wVar, wmVar));
        }
        return jz5.f0.f302826a;
    }
}
