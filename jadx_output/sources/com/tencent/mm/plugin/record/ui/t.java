package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f155481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s15.h f155483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f155484g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, s15.h hVar, r45.gp0 gp0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f155482e = str;
        this.f155483f = hVar;
        this.f155484g = gp0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.record.ui.t(this.f155482e, this.f155483f, this.f155484g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.record.ui.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.ip0 ip0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f155481d;
        r45.gp0 gp0Var = this.f155484g;
        java.lang.String str = this.f155482e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zu.b bVar = zu.b.f475635e;
            java.lang.String str2 = gp0Var.V;
            if (str2 == null) {
                str2 = "";
            }
            s15.h hVar = this.f155483f;
            tt.h hVar2 = new tt.h(str, bVar, hVar, str2);
            pt0.e0 e0Var = pt0.f0.f358209b1;
            r45.hp0 hp0Var = gp0Var.J1;
            com.tencent.mm.storage.f9 l17 = e0Var.l((hp0Var == null || (ip0Var = hp0Var.f376353d) == null) ? null : ip0Var.f377231f, hVar.A());
            if (l17 != null) {
                hVar2.f421768e = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(l17);
                hVar2.f421769f = 4;
                hVar2.f421770g = 30;
            }
            pt.k0 k0Var = (pt.k0) i95.n0.c(pt.k0.class);
            this.f155481d = 1;
            ((ot.q) k0Var).getClass();
            obj = tt.f.f421757f.a().T6(hVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        tt.i iVar = (tt.i) obj;
        tt.g gVar = iVar.f421773a;
        if (gVar == tt.g.f421758d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.ForwardRecordMsgDataLogic", str + " download data img " + gVar + ' ' + com.tencent.mm.vfs.w6.k(gp0Var.V));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.ForwardRecordMsgDataLogic", str + " download data img " + gVar + ' ' + iVar.f421774b);
        }
        return jz5.f0.f302826a;
    }
}
