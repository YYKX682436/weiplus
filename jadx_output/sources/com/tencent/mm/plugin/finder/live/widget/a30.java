package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class a30 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f117721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(com.tencent.mm.plugin.finder.live.widget.e30 e30Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117721e = e30Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.a30(this.f117721e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.a30) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117720d;
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = this.f117721e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = e30Var.f118210J;
            if (r2Var != null) {
                this.f117720d = 1;
                if (kotlinx.coroutines.v2.d(r2Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (e30Var.F > 0) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("live_like_type", new java.lang.Integer(e30Var.F > 1 ? 1 : 0));
            lVarArr[1] = new jz5.l("live_like_count", new java.lang.Integer(e30Var.F));
            ((cy1.a) rVar).Cj("finder_live_room_like_longpress", e30Var.f118215t, kz5.c1.k(lVarArr), 25561);
        } else {
            com.tencent.mars.xlog.Log.i(e30Var.f118213r, "reportSdk like count: " + e30Var.F + ' ');
        }
        e30Var.F = 0;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = e30Var.f118212q;
        e30Var.f365323d.post(new com.tencent.mm.plugin.finder.live.widget.r20(e30Var, ((mm2.c1) lVar.P0(mm2.c1.class)).J1));
        dk2.Cif.b(dk2.Cif.f233626a, e30Var.f118211p, ((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0), dk2.hf.f233587e, false, 8, null);
        return jz5.f0.f302826a;
    }
}
