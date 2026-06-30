package zf0;

/* loaded from: classes12.dex */
public final class o0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.k0 f472496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(zf0.v0 v0Var, qi3.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f472495d = v0Var;
        this.f472496e = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new zf0.o0(this.f472495d, this.f472496e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((zf0.o0) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        zf0.v0 v0Var = this.f472495d;
        vf0.h3 h3Var = v0Var.f472563i;
        oi3.h hVar = h3Var.f436178e;
        qi3.k0 k0Var = this.f472496e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (hVar == null) {
            k0Var.f363739a = -520009;
            return f0Var;
        }
        qi3.f0 f0Var2 = h3Var.f436181h;
        if (f0Var2 != null && (i28 = f0Var2.f363700a) != 0) {
            zf0.v0.G(v0Var, hVar, i28);
            return f0Var;
        }
        vf0.j1 j1Var = h3Var.f436182i;
        if (j1Var != null && (i27 = j1Var.f436197a) != 0) {
            zf0.v0.G(v0Var, hVar, i27);
            return f0Var;
        }
        vf0.k3 k3Var = h3Var.f436183j;
        qi3.i0 i0Var = k3Var.f436215a;
        if (i0Var != null && (i19 = i0Var.f363725a) != 0) {
            zf0.v0.G(v0Var, hVar, i19);
            return f0Var;
        }
        qi3.i0 i0Var2 = k3Var.f436216b;
        if (i0Var2 != null && (i18 = i0Var2.f363725a) != 0) {
            zf0.v0.G(v0Var, hVar, i18);
            return f0Var;
        }
        qi3.d0 d0Var = h3Var.f436184k;
        if (d0Var != null && (i17 = d0Var.f363683a) != 0) {
            zf0.v0.G(v0Var, hVar, i17);
            return f0Var;
        }
        if (d0Var == null) {
            k0Var.f363739a = -520006;
            return f0Var;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        java.lang.String string = hVar != null ? hVar.getString(hVar.f345617d + 3) : null;
        oi3.h hVar2 = v0Var.f472563i.f436178e;
        com.tencent.mm.storage.f9 k17 = e0Var.k(string, hVar2 != null ? hVar2.getLong(hVar2.f345617d + 0) : 0L);
        if (k17 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(v0Var.id());
            sb6.append(" updateMsg Fail msgInfo not exist msgId:");
            vf0.h3 h3Var2 = v0Var.f472563i;
            oi3.h hVar3 = h3Var2.f436178e;
            sb6.append(hVar3 != null ? new java.lang.Long(hVar3.getLong(hVar3.f345617d + 0)) : null);
            sb6.append(" msgTalker:");
            oi3.h hVar4 = h3Var2.f436178e;
            sb6.append(hVar4 != null ? hVar4.getString(hVar4.f345617d + 3) : null);
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsg.SendVideoTask", sb6.toString());
            k0Var.f363739a = -520002;
            return f0Var;
        }
        t21.v2 e17 = vf0.m3.e(hVar);
        if (e17 == null) {
            k0Var.f363739a = -520009;
            return f0Var;
        }
        t21.v2 f17 = vf0.m3.f(hVar);
        if (d0Var.f363685c != 0 || d0Var.f363686d != 0) {
            int i29 = qi3.y.f363762e1;
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(k17.getMsgId(), k17.Q0());
            int i37 = d0Var.f363685c;
            int i38 = d0Var.f363686d;
            java.lang.String str = d0Var.f363687e;
            ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
            java.util.HashMap T6 = hm.f.f282148i.a().T6();
            java.lang.String msgIdTalker2 = msgIdTalker.toString();
            java.lang.Object obj2 = T6.get(msgIdTalker2);
            if (obj2 == null) {
                obj2 = new pi3.a();
                T6.put(msgIdTalker2, obj2);
            }
            pi3.a aVar2 = (pi3.a) obj2;
            aVar2.o(i37);
            aVar2.l(i38);
            if (str == null) {
                str = "";
            }
            aVar2.n(str);
            k17.r1(5);
            e17.f415011i = nd1.d1.CTRL_INDEX;
            if (f17 != null) {
                f17.f415011i = nd1.d1.CTRL_INDEX;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " updateMsg error MsgId:" + k17.getMsgId() + " resp:" + d0Var);
        } else if (d0Var.f363689g != null) {
            v0Var.f472563i.f436179f.p(null);
            r45.ny3 ny3Var = d0Var.f363689g;
            boolean z17 = ny3Var instanceof r45.yu6;
            vf0.h3 h3Var3 = v0Var.f472563i;
            if (z17) {
                kotlin.jvm.internal.o.e(ny3Var, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.UploadVideoResponse");
                r45.yu6 yu6Var = (r45.yu6) ny3Var;
                c01.ia.P(k17, yu6Var.f391380m, false);
                k17.r1(2);
                k17.o1(yu6Var.f391378h);
                k17.d1(h3Var3.f436179f.toXml());
                e17.f415004c = yu6Var.f391378h;
                e17.f415025w = h3Var3.f436179f.toXml();
                e17.f415011i = 199;
                if (f17 != null) {
                    f17.f415004c = yu6Var.f391378h;
                    f17.f415025w = h3Var3.f436179f.toXml();
                    f17.f415011i = 199;
                }
                k0Var.f363740b.put("send_msg_svr_id", new java.lang.Long(yu6Var.f391378h));
                k0Var.f363740b.put("send_msg_svr_id", new java.lang.Long(yu6Var.f391378h));
            } else if (ny3Var instanceof r45.rr) {
                kotlin.jvm.internal.o.e(ny3Var, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BypSendResponse");
                r45.rr rrVar = (r45.rr) ny3Var;
                k17.r1(2);
                k17.o1(rrVar.f385130d);
                k17.d1(h3Var3.f436179f.toXml());
                e17.f415004c = rrVar.f385130d;
                e17.f415025w = h3Var3.f436179f.toXml();
                e17.f415011i = 199;
                k0Var.f363740b.put("send_msg_svr_id", new java.lang.Long(rrVar.f385130d));
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " sendBypCgi updateMsg svrId:" + rrVar.f385130d);
                k0Var.f363740b.put("send_msg_svr_id", new java.lang.Long(rrVar.f385130d));
            } else {
                k17.r1(5);
                e17.f415011i = nd1.d1.CTRL_INDEX;
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " updateMsg Fail resp not exist MsgId:" + k17.getMsgId() + " SvrId: " + k17.I0());
            }
        }
        int lb6 = ((com.tencent.mm.plugin.messenger.foundation.h2) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.h2.class)).cj().lb(k17.getMsgId(), k17, true);
        if (lb6 < 0) {
            k0Var.f363740b.put("update_msg_ret", new java.lang.Integer(lb6));
        }
        ((com.tencent.mm.insane_statistic.a) ((v90.u) i95.n0.c(v90.u.class))).wi(k17);
        e17.U = -1;
        vf0.m3.k(e17);
        if (f17 != null) {
            f17.U = -1;
            vf0.m3.k(f17);
        }
        return f0Var;
    }
}
