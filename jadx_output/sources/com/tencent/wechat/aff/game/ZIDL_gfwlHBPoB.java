package com.tencent.wechat.aff.game;

/* loaded from: classes8.dex */
class ZIDL_gfwlHBPoB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.game.e f216911a;

    public void ZIDL_A(int i17, int i18, byte[][] bArr, boolean z17) {
        r45.vs2 vs2Var;
        com.tencent.mm.protobuf.g gVar;
        com.tencent.wechat.aff.game.e eVar = this.f216911a;
        java.util.ArrayList mmpbListUnSerializeFromBasic = com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(bw5.id.f28535g, bArr);
        com.tencent.mm.plugin.game.model.e2 e2Var = (com.tencent.mm.plugin.game.model.e2) eVar;
        e2Var.getClass();
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(mmpbListUnSerializeFromBasic.size()), java.lang.Boolean.valueOf(z17)};
        java.lang.String str = e2Var.f140302a;
        com.tencent.mars.xlog.Log.i(str, "handleCmd businessType:%d syncScene:%d cmdList.size:%d handleFinderSync:%b", objArr);
        if (mmpbListUnSerializeFromBasic.isEmpty()) {
            com.tencent.mars.xlog.Log.i(str, "handleCmd cmdList is empty");
            ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().c(com.tencent.mm.plugin.game.model.n1.GAME_REDDOT_EXIT_UNKNOWN);
            return;
        }
        java.util.Iterator it = mmpbListUnSerializeFromBasic.iterator();
        while (it.hasNext()) {
            bw5.id idVar = (bw5.id) it.next();
            if (idVar != null) {
                int i19 = idVar.f28536d;
                com.tencent.mars.xlog.Log.i(str, "handleCmd cmdId:%d", java.lang.Integer.valueOf(i19));
                boolean[] zArr = idVar.f28538f;
                if (i19 == 60000) {
                    com.tencent.mars.xlog.Log.i(str, "processTabTips cmdId:%d syncScene:%d", java.lang.Integer.valueOf(idVar.f28536d), java.lang.Integer.valueOf(i18));
                    try {
                        byte[] g17 = (zArr[2] ? idVar.f28537e : com.tencent.mm.protobuf.g.f192155b).g();
                        if (g17.length == 0) {
                            com.tencent.mars.xlog.Log.w(str, "processTabTips CmdBuf is empty");
                        } else {
                            r45.dz2 dz2Var = new r45.dz2();
                            dz2Var.parseFrom(g17);
                            if (dz2Var.getList(0) != null && !dz2Var.getList(0).isEmpty()) {
                                java.util.Iterator it6 = dz2Var.getList(0).iterator();
                                while (it6.hasNext()) {
                                    r45.gz2 gz2Var = (r45.gz2) it6.next();
                                    if (gz2Var != null && ((r45.vs2) gz2Var.getCustom(0)) != null && (gVar = (vs2Var = (r45.vs2) gz2Var.getCustom(0)).f388488f) != null && gVar.f192156a.length > 0) {
                                        r45.xs2 xs2Var = new r45.xs2();
                                        xs2Var.parseFrom(vs2Var.f388488f.g());
                                        if (xs2Var.getByteString(7) != null && xs2Var.getByteString(7).f192156a.length > 0) {
                                            r45.ez2 ez2Var = new r45.ez2();
                                            ez2Var.parseFrom(xs2Var.getByteString(7).g());
                                            if (ez2Var.getByteString(4) != null && ez2Var.getByteString(4).f192156a.length > 0) {
                                                java.lang.String str2 = new java.lang.String(ez2Var.getByteString(4).g(), com.tencent.mapsdk.internal.rv.f51270c);
                                                com.tencent.mars.xlog.Log.i(str, "processTabTips gameDataJson length:%d", java.lang.Integer.valueOf(str2.length()));
                                                e2Var.b(str2);
                                            }
                                        }
                                    }
                                }
                            }
                            com.tencent.mars.xlog.Log.w(str, "processTabTips tab_tips_info is empty");
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "processTabTips failed", new java.lang.Object[0]);
                    }
                } else if (i19 == 60001) {
                    com.tencent.mars.xlog.Log.i(str, "processRevokeTabTips cmdId:%d", java.lang.Integer.valueOf(idVar.f28536d));
                    try {
                        byte[] g18 = (zArr[2] ? idVar.f28537e : com.tencent.mm.protobuf.g.f192155b).g();
                        if (g18.length == 0) {
                            com.tencent.mars.xlog.Log.w(str, "processRevokeTabTips CmdBuf is empty");
                        } else {
                            bw5.kv kvVar = new bw5.kv();
                            kvVar.parseFrom(g18);
                            com.tencent.mars.xlog.Log.i(str, "processRevokeTabTips revoke tabTips successfully");
                            java.util.Iterator it7 = kvVar.f29553d.iterator();
                            while (it7.hasNext()) {
                                bw5.lv lvVar = (bw5.lv) it7.next();
                                java.lang.String str3 = lvVar.f29993f[1] ? lvVar.f29991d : "";
                                com.tencent.mars.xlog.Log.i(str, "revoke msg_id:%s", str3);
                                ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().h(str3, true);
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(str, e18, "processRevokeTabTips failed", new java.lang.Object[0]);
                    }
                } else {
                    com.tencent.mars.xlog.Log.w(str, "handleCmd unknown cmdId:%d", java.lang.Integer.valueOf(i19));
                }
            }
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.f216911a = (com.tencent.wechat.aff.game.e) obj;
    }
}
