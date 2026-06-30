package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class q9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f119512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f119513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f119514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x9 f119515g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.c0 c0Var, int i17, com.tencent.mm.plugin.finder.live.widget.x9 x9Var) {
        super(2, continuation);
        this.f119512d = hVar;
        this.f119513e = c0Var;
        this.f119514f = i17;
        this.f119515g = x9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.q9(this.f119512d, continuation, this.f119513e, this.f119514f, this.f119515g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.q9 q9Var = (com.tencent.mm.plugin.finder.live.widget.q9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q9Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f119513e.f310112d = true;
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.s9(this.f119514f, this.f119515g));
        return jz5.f0.f302826a;
    }
}
