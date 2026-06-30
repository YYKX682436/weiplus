package oh1;

/* loaded from: classes7.dex */
public enum o2 implements vg3.q4 {
    INSTANCE;

    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (str == null || !str.equals("UpdateWxaUserSwitchNotify")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaNotifySwitchMsgHandler", "subType not match, return");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaNotifySwitchMsgHandler", "consumeNewXml subType:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(x51.j1.g(p0Var.f70726a.f377561h))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaNotifySwitchMsgHandler", "msg content is null");
            return null;
        }
        java.util.Iterator it = map.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            final oh1.c1 c1Var = oh1.c1.INSTANCE;
            if (!hasNext) {
                r45.et3 et3Var = new r45.et3();
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70667d = 2709;
                lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/getuserswitch";
                lVar.f70664a = et3Var;
                lVar.f70665b = new r45.ft3();
                com.tencent.mm.modelbase.o a17 = lVar.a();
                ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new com.tencent.mm.ipcinvoker.wx_extension.v() { // from class: oh1.c1$$a
                    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
                    public final void a(int i17, int i18, java.lang.String str2, com.tencent.mm.modelbase.o oVar) {
                        com.tencent.mm.protobuf.f fVar;
                        oh1.c1.this.getClass();
                        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f70711b.f70700a) != null && (fVar instanceof r45.ft3)) {
                            com.tencent.mm.plugin.appbrand.app.q0.f75227a.a().putInt(".sysmsg.UpdateWxaUserSwitchNotify.DiscoveryEntranceUseFake", ((r45.ft3) fVar).f374593d);
                        }
                    }
                });
                return null;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            if (str2.startsWith(".sysmsg.UpdateWxaUserSwitchNotify.")) {
                com.tencent.mm.plugin.appbrand.app.q0.f75227a.a().putInt(str2, com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str2), 0));
            }
        }
    }
}
