package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f122504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f122506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f122507g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(yz5.l lVar, com.tencent.mm.plugin.finder.playlist.s1 s1Var, java.util.List list, java.lang.Long l17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f122504d = lVar;
        this.f122505e = s1Var;
        this.f122506f = list;
        this.f122507g = l17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.playlist.z0(this.f122504d, this.f122505e, this.f122506f, this.f122507g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.playlist.z0 z0Var = (com.tencent.mm.plugin.finder.playlist.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List list = this.f122506f;
        yz5.l lVar = this.f122504d;
        com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122505e;
        if (lVar == null) {
            s1Var.f122422b.f122296a.addAll(list);
            com.tencent.mm.plugin.finder.playlist.l0 l0Var = s1Var.f122425e;
            if (l0Var == null) {
                kotlin.jvm.internal.o.o("viewCallBack");
                throw null;
            }
            l0Var.v();
            if (s1Var.f122422b.f122296a.isEmpty()) {
                com.tencent.mm.plugin.finder.playlist.l0 l0Var2 = s1Var.f122425e;
                if (l0Var2 == null) {
                    kotlin.jvm.internal.o.o("viewCallBack");
                    throw null;
                }
                l0Var2.A();
            } else {
                s1Var.r(true);
            }
        } else {
            s1Var.f122422b.f122296a.clear();
            com.tencent.mm.plugin.finder.playlist.e2 e2Var = s1Var.f122422b;
            e2Var.f122296a.addAll(list);
            s1Var.r(false);
            if (e2Var.f122296a.isEmpty()) {
                com.tencent.mm.plugin.finder.playlist.l0 l0Var3 = s1Var.f122425e;
                if (l0Var3 == null) {
                    kotlin.jvm.internal.o.o("viewCallBack");
                    throw null;
                }
                l0Var3.B(new com.tencent.mm.plugin.finder.playlist.y0(s1Var, this.f122507g, lVar));
                lVar.invoke(java.lang.Boolean.FALSE);
            } else {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        }
        return jz5.f0.f302826a;
    }
}
