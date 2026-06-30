package mh3;

/* loaded from: classes4.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a(java.util.List reqTypes) {
        kotlin.jvm.internal.o.g(reqTypes, "reqTypes");
        r45.hf4 hf4Var = new r45.hf4();
        hf4Var.f376119d.addAll(reqTypes);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = hf4Var;
        r45.if4 if4Var = new r45.if4();
        if4Var.setBaseResponse(new r45.ie());
        if4Var.getBaseResponse().f376960e = new r45.du5();
        lVar.f70665b = if4Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmecinit";
        lVar.f70667d = 24760;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.if4 resp = (r45.if4) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiMMEcInit", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList<r45.gf4> item_list = resp.f376994d;
            kotlin.jvm.internal.o.f(item_list, "item_list");
            for (r45.gf4 gf4Var : item_list) {
                int i19 = gf4Var.f375194d;
                if (i19 == 1) {
                    if (gf4Var.f375196f == 0 && gf4Var.f375195e != null) {
                        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_MMEC_NEW_CARD_ENTRANCE_STRING;
                        com.tencent.mm.protobuf.g gVar = gf4Var.f375195e;
                        kotlin.jvm.internal.o.d(gVar);
                        c17.x(u3Var, com.tencent.mm.sdk.platformtools.t8.l(gVar.g()));
                    }
                } else if (i19 == 3) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hy: got MMECINIT_REQ_TYPE_GET_PRESENT_ENTRANCE_INFO errcode is ");
                    sb6.append(gf4Var.f375196f);
                    sb6.append(" and respBuffer is null?? ");
                    sb6.append(gf4Var.f375195e == null);
                    com.tencent.mars.xlog.Log.i("CgiMMEcInit", sb6.toString());
                    if (gf4Var.f375196f == 0 && gf4Var.f375195e != null) {
                        c00.m3 m3Var = (c00.m3) i95.n0.c(c00.m3.class);
                        bw5.t8 t8Var = new bw5.t8();
                        com.tencent.mm.protobuf.g gVar2 = gf4Var.f375195e;
                        kotlin.jvm.internal.o.d(gVar2);
                        bw5.t8 parseFrom = t8Var.parseFrom(gVar2.g());
                        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.EcsPresentEntrance");
                        ((j00.d2) m3Var).getClass();
                        n00.g gVar3 = n00.g.f333821a;
                        gVar3.getClass();
                        n00.g.f333823c.c(gVar3, n00.g.f333822b[0], parseFrom);
                    }
                }
            }
        }
    }
}
