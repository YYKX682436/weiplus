package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes16.dex */
public final class hp0 extends qz5.l implements yz5.p {
    public int L;
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(com.tencent.mm.plugin.finder.live.plugin.iv ivVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.M = ivVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.hp0(this.M, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.hp0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.L;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                o0.k kVar = new o0.k();
                com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.M;
                kVar.set(1, db2.t4.f228171a.a(11572));
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                int i18 = 2;
                kVar.set(2, xy2.c.e(context));
                kVar.set(3, com.tencent.mm.protobuf.g.b(((mm2.e1) ivVar.P0(mm2.e1.class)).f328985o));
                kVar.set(4, java.lang.Long.valueOf(((mm2.e1) ivVar.P0(mm2.e1.class)).f328983m));
                kVar.set(5, java.lang.Long.valueOf(((mm2.e1) ivVar.P0(mm2.e1.class)).f328988r.getLong(0)));
                if (((mm2.c1) ivVar.P0(mm2.c1.class)).T) {
                    i18 = 3;
                } else if (((mm2.c1) ivVar.P0(mm2.c1.class)).N7()) {
                    i18 = 1;
                } else {
                    if (((mm2.n0) ivVar.P0(mm2.n0.class)).f329273r) {
                        i18 = 16;
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
                bm2.n5 n5Var = this.M.W;
                o0.l lVar = (o0.l) fVar.f70618d;
                n5Var.R = lVar != null ? lVar.getList(1) : null;
                n5Var.B();
                n5Var.notifyDataSetChanged();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.M.f113016r, e17.toString());
        }
        return jz5.f0.f302826a;
    }
}
