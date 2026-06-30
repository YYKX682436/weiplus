package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f114853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f114854e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        super(2, continuation);
        this.f114853d = hVar;
        this.f114854e = v3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.w1(this.f114853d, continuation, this.f114854e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.w1 w1Var = (com.tencent.mm.plugin.finder.live.plugin.w1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String string;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f114853d).f454381b;
        com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "createNotice: getLivePrepare error: " + aVar2);
        rm0.j jVar = aVar2.f454379a;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f114854e;
        if (jVar == null || (string = jVar.f397426g) == null) {
            string = v3Var.f113324f.getContext().getString(com.tencent.mm.R.string.msg_net_error);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        }
        db5.t7.g(v3Var.f113324f.getContext(), string);
        return jz5.f0.f302826a;
    }
}
