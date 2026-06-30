package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class io0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f112997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mo0 f112998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.d82 f112999f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io0(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.mo0 mo0Var, r45.d82 d82Var) {
        super(2, continuation);
        this.f112997d = hVar;
        this.f112998e = mo0Var;
        this.f112999f = d82Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.io0(this.f112997d, continuation, this.f112998e, this.f112999f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.io0 io0Var = (com.tencent.mm.plugin.finder.live.plugin.io0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        io0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f112997d).f454381b;
        java.lang.String str = this.f112998e.f113547b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("req:");
        sb6.append(this.f112999f.hashCode());
        sb6.append(" failed. errType:");
        rm0.j jVar = aVar2.f454379a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f397424e) : null);
        sb6.append(", errCode:");
        rm0.j jVar2 = aVar2.f454379a;
        sb6.append(jVar2 != null ? new java.lang.Integer(jVar2.f397425f) : null);
        sb6.append(",errMsg:");
        sb6.append(jVar2 != null ? jVar2.f397426g : null);
        sb6.append(",cancel?:");
        sb6.append(aVar2.f454380b);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        return jz5.f0.f302826a;
    }
}
