package ru;

/* loaded from: classes12.dex */
public final class r extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru.u f399622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.k0 f399623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ru.u uVar, qi3.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f399622d = uVar;
        this.f399623e = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new ru.r(this.f399622d, this.f399623e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((ru.r) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        int i17;
        jz5.f0 f0Var2;
        ru.u uVar;
        java.lang.String str;
        java.lang.String string;
        jz5.f0 f0Var3;
        java.lang.String str2;
        int i18;
        int i19;
        int i27;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ru.u uVar2 = this.f399622d;
        gu.k kVar = uVar2.f399654o;
        oi3.g gVar = kVar.f275619v;
        jz5.f0 f0Var4 = jz5.f0.f302826a;
        qi3.k0 k0Var = this.f399623e;
        if (gVar == null) {
            k0Var.f363739a = -520009;
            return f0Var4;
        }
        qi3.f0 f0Var5 = kVar.f412191m;
        if (f0Var5 != null && (i27 = f0Var5.f363700a) != 0) {
            uVar2.w(gVar, i27);
            return f0Var4;
        }
        qi3.i0 i0Var = kVar.f412192n;
        if (i0Var != null && (i19 = i0Var.f363725a) != 0) {
            uVar2.w(gVar, i19);
            return f0Var4;
        }
        qi3.d0 d0Var = kVar.f412193o;
        if (d0Var != null && (i18 = d0Var.f363683a) != 0) {
            uVar2.w(gVar, i18);
            return f0Var4;
        }
        if (d0Var == null) {
            k0Var.f363739a = -520006;
            return f0Var4;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        int i28 = gVar.f345617d;
        int i29 = i28 + 3;
        int i37 = i28 + 0;
        com.tencent.mm.storage.f9 k17 = e0Var.k(gVar.getString(i29), gVar.getLong(i37));
        if (k17 != null) {
            if (d0Var.f363685c == 0 && d0Var.f363686d == 0) {
                r45.ny3 ny3Var = d0Var.f363689g;
                boolean z17 = ny3Var instanceof r45.qy5;
                gu.k kVar2 = uVar2.f399654o;
                if (z17) {
                    java.lang.String str3 = k17.G;
                    if (str3 == null) {
                        str3 = "";
                    }
                    p15.e eVar = new p15.e();
                    eVar.fromXml(str3);
                    r45.qy5 qy5Var = (r45.qy5) ny3Var;
                    if (qy5Var.getString(10) != null) {
                        f0Var = f0Var4;
                        p15.e eVar2 = new p15.e();
                        java.lang.String string2 = qy5Var.getString(10);
                        if (string2 == null) {
                            string2 = "";
                        }
                        eVar2.fromXml(string2);
                        p15.s q17 = eVar.q();
                        if (q17 != null) {
                            p15.s q18 = eVar2.q();
                            if (q18 != null) {
                                i17 = i29;
                                str2 = q18.getUuid();
                            } else {
                                i17 = i29;
                                str2 = null;
                            }
                            q17.R(str2);
                            f0Var3 = f0Var;
                        } else {
                            i17 = i29;
                            f0Var3 = null;
                        }
                        if (f0Var3 == null) {
                            p15.s sVar = new p15.s();
                            p15.s q19 = eVar2.q();
                            sVar.R(q19 != null ? q19.getUuid() : null);
                            eVar.C(sVar);
                        }
                    } else {
                        f0Var = f0Var4;
                        i17 = i29;
                    }
                    i95.m c17 = i95.n0.c(ct.r2.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    if (te5.h.f418649a.c() && (string = qy5Var.getString(13)) != null) {
                        if (!(!r26.n0.N(string))) {
                            string = null;
                        }
                        if (string != null) {
                            r15.b bVar = new r15.b();
                            java.lang.String string3 = qy5Var.getString(13);
                            bVar.fromXml(string3 == null ? "" : string3);
                            str = " SvrId: ";
                            uVar = uVar2;
                            bVar.p(((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).hj(bVar.l()));
                            kVar2.f275615r.r(bVar);
                            java.lang.String xml = eVar.toXml();
                            k17.u3(xml);
                            k17.r1(2);
                            k17.o1(qy5Var.getLong(8));
                            k17.d1(kVar2.f275615r.toXml());
                            k0Var.f363740b.put("send_msg_svr_id", new java.lang.Long(qy5Var.getLong(8)));
                            ot0.t y07 = ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(k17.Q0(), k17.getMsgId());
                            y07.field_msgSvrId = qy5Var.getLong(8);
                            ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(y07, new java.lang.String[0]);
                            boolean g17 = com.tencent.mm.vfs.w6.g(((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).hj().o() + '/' + gVar.getLong(i37), true);
                            ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).cj(k17, true);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendRecordTask", uVar.id() + " updateMsg MsgId:" + k17.getMsgId() + str + k17.I0() + " msgSourceBefore:" + str3 + " msgSourceAfter:" + xml + " deleteCacheRet:" + g17);
                        }
                    }
                    str = " SvrId: ";
                    uVar = uVar2;
                    java.lang.String xml2 = eVar.toXml();
                    k17.u3(xml2);
                    k17.r1(2);
                    k17.o1(qy5Var.getLong(8));
                    k17.d1(kVar2.f275615r.toXml());
                    k0Var.f363740b.put("send_msg_svr_id", new java.lang.Long(qy5Var.getLong(8)));
                    ot0.t y072 = ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(k17.Q0(), k17.getMsgId());
                    y072.field_msgSvrId = qy5Var.getLong(8);
                    ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(y072, new java.lang.String[0]);
                    boolean g172 = com.tencent.mm.vfs.w6.g(((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).hj().o() + '/' + gVar.getLong(i37), true);
                    ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).cj(k17, true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendRecordTask", uVar.id() + " updateMsg MsgId:" + k17.getMsgId() + str + k17.I0() + " msgSourceBefore:" + str3 + " msgSourceAfter:" + xml2 + " deleteCacheRet:" + g172);
                } else {
                    uVar = uVar2;
                    f0Var = f0Var4;
                    i17 = i29;
                    if (ny3Var instanceof r45.rr) {
                        k17.r1(2);
                        r45.rr rrVar = (r45.rr) ny3Var;
                        k17.o1(rrVar.f385130d);
                        k17.d1(kVar2.f275615r.toXml());
                        k0Var.f363740b.put("send_msg_svr_id", new java.lang.Long(rrVar.f385130d));
                        ot0.t y08 = ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(k17.Q0(), k17.getMsgId());
                        y08.field_msgSvrId = rrVar.f385130d;
                        ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(y08, new java.lang.String[0]);
                        boolean g18 = com.tencent.mm.vfs.w6.g(((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).hj().o() + '/' + gVar.getLong(i37), true);
                        ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).cj(k17, true);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendRecordTask", uVar.id() + " sendBypCgi updateMsg MsgId:" + k17.getMsgId() + " SvrId: " + k17.I0() + " deleteCacheRet:" + g18);
                    } else {
                        uVar2 = uVar;
                        uVar2.w(gVar, d0Var.f363683a);
                        k17.r1(5);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendRecordTask", uVar2.id() + " updateMsg Fail resp not exist MsgId:" + k17.getMsgId() + " SvrId: " + k17.I0());
                    }
                }
                uVar2 = uVar;
            } else {
                f0Var = f0Var4;
                i17 = i29;
                com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(k17.getMsgId(), k17.Q0());
                int i38 = d0Var.f363685c;
                int i39 = d0Var.f363686d;
                java.lang.String str4 = d0Var.f363687e;
                java.lang.String str5 = str4 == null ? "" : str4;
                ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
                java.util.HashMap T6 = hm.f.f282148i.a().T6();
                java.lang.String msgIdTalker2 = msgIdTalker.toString();
                java.lang.Object obj2 = T6.get(msgIdTalker2);
                if (obj2 == null) {
                    obj2 = new pi3.a();
                    T6.put(msgIdTalker2, obj2);
                }
                pi3.a aVar2 = (pi3.a) obj2;
                aVar2.o(i38);
                aVar2.l(i39);
                aVar2.n(str5);
                k17.r1(5);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendRecordTask", uVar2.id() + " updateMsg error MsgId:" + k17.getMsgId() + " resp:" + d0Var);
            }
            int lb6 = ((com.tencent.mm.plugin.messenger.foundation.h2) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.h2.class)).cj().lb(k17.getMsgId(), k17, true);
            if (lb6 < 0) {
                k0Var.f363740b.put("update_msg_ret", new java.lang.Integer(lb6));
            }
            ((bt3.u1) ((mc0.i) i95.n0.c(mc0.i.class))).Ai(k17.getMsgId());
            ((com.tencent.mm.insane_statistic.a) ((v90.u) i95.n0.c(v90.u.class))).wi(k17);
            f0Var2 = f0Var;
        } else {
            f0Var = f0Var4;
            i17 = i29;
            f0Var2 = null;
        }
        if (f0Var2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.SendRecordTask", uVar2.id() + " updateMsg Fail msgInfo not exist msgId:" + gVar.getLong(i37) + " msgTalker:" + gVar.getString(i17));
            k0Var.f363739a = -520002;
        }
        return f0Var;
    }
}
