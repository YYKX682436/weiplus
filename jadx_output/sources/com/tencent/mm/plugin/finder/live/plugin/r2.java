package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f114073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114073d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.r2(this.f114073d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.r2 r2Var = (com.tencent.mm.plugin.finder.live.plugin.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "prepareNoticePanel: get live notice fail, " + ((xg2.a) ((xg2.b) this.f114073d).f454381b));
        return jz5.f0.f302826a;
    }
}
