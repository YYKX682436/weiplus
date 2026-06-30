package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes16.dex */
public final class ip0 extends qz5.l implements yz5.p {
    public int L;
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip0(com.tencent.mm.plugin.finder.live.plugin.ty tyVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.M = tyVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.ip0(this.M, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.ip0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.util.LinkedList list3;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.L;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                o0.k kVar = new o0.k();
                com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.M;
                kVar.set(1, db2.t4.f228171a.a(11572));
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                kVar.set(2, xy2.c.e(context));
                int i18 = 3;
                kVar.set(3, com.tencent.mm.protobuf.g.b(((mm2.e1) tyVar.P0(mm2.e1.class)).f328985o));
                kVar.set(4, java.lang.Long.valueOf(((mm2.e1) tyVar.P0(mm2.e1.class)).f328983m));
                kVar.set(5, java.lang.Long.valueOf(((mm2.e1) tyVar.P0(mm2.e1.class)).f328988r.getLong(0)));
                if (!((mm2.c1) tyVar.P0(mm2.c1.class)).T) {
                    if (((mm2.c1) tyVar.P0(mm2.c1.class)).N7()) {
                        i18 = 1;
                    } else {
                        i18 = ((mm2.n0) tyVar.P0(mm2.n0.class)).f329273r ? 16 : 2;
                    }
                }
                kVar.set(6, java.lang.Integer.valueOf(i18));
                com.tencent.mm.modelbase.i a17 = kVar.a();
                this.L = 1;
                obj = rm0.h.b(a17, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
            if (fVar.b()) {
                com.tencent.mm.plugin.finder.live.plugin.ty tyVar2 = this.M;
                tyVar2.L.d(tyVar2.R0());
                com.tencent.mm.plugin.finder.live.plugin.ty tyVar3 = this.M;
                com.tencent.mm.plugin.finder.live.view.FinderLiveHonorView finderLiveHonorView = tyVar3.L;
                o0.l lVar = (o0.l) fVar.f70618d;
                r45.xn1 xn1Var = null;
                r45.xn1 xn1Var2 = (lVar == null || (list3 = lVar.getList(1)) == null) ? null : (r45.xn1) kz5.n0.a0(list3, 0);
                o0.l lVar2 = (o0.l) fVar.f70618d;
                r45.xn1 xn1Var3 = (lVar2 == null || (list2 = lVar2.getList(1)) == null) ? null : (r45.xn1) kz5.n0.a0(list2, 1);
                o0.l lVar3 = (o0.l) fVar.f70618d;
                if (lVar3 != null && (list = lVar3.getList(1)) != null) {
                    xn1Var = (r45.xn1) kz5.n0.a0(list, 2);
                }
                finderLiveHonorView.c(tyVar3, xn1Var2, xn1Var3, xn1Var);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.M.f114488q, e17.toString());
        }
        return jz5.f0.f302826a;
    }
}
