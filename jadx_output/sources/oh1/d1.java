package oh1;

/* loaded from: classes9.dex */
public enum d1 implements vg3.q4 {
    INSTANCE;

    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        r45.j4 j4Var;
        if (str == null || !str.equals("weapp_pushmsg")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAppBrandNotifyMsgHandler", "subType is err, return");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaAppBrandNotifyMsgHandler", "consumeNewXml subType:%s", str);
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.weapp_pushmsg.title");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAppBrandNotifyMsgHandler", "title is null, return");
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) map.get(".sysmsg.weapp_pushmsg.wxa_nickname"))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAppBrandNotifyMsgHandler", "nickname is null, return");
            return null;
        }
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.weapp_pushmsg.busi_msgid");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAppBrandNotifyMsgHandler", "msgId is null, return");
            return null;
        }
        if (p0Var == null || (j4Var = p0Var.f70726a) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaAppBrandNotifyMsgHandler", "addMsgInfo or addMsgInfo.addMsg is null! should not happen");
            return null;
        }
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.weapp_pushmsg.weappinfo.appid");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaAppBrandNotifyMsgHandler", "appId is null");
        }
        java.lang.String str5 = (java.lang.String) map.get(".sysmsg.weapp_pushmsg.weappinfo.pagepath");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaAppBrandNotifyMsgHandler", "pagePath is null");
        }
        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
        java.lang.String g18 = x51.j1.g(j4Var.f377558e);
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g18, j4Var.f377568r);
        boolean z17 = o27.getMsgId() > 0;
        o27.o1(j4Var.f377568r);
        o27.e1(c01.w9.m(g18, j4Var.f377565o));
        o27.setType(872415281);
        o27.d1(g17);
        o27.j1(0);
        o27.r1(3);
        o27.u1("appbrand_notify_message");
        o27.u3(j4Var.f377566p);
        if (c01.w9.v("appbrand_notify_message") == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaAppBrandNotifyMsgHandler", "empty appbrand notify message, insert tips message");
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.setType(872415281);
            f9Var.u1("appbrand_notify_message");
            f9Var.d1("");
            f9Var.e1(o27.getCreateTime() - 1);
            f9Var.j1(2);
            f9Var.r1(4);
            c01.w9.x(f9Var);
        }
        c01.w9.n(o27, p0Var);
        if (z17) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(j4Var.f377568r, o27);
        } else {
            c01.w9.x(o27);
        }
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("appbrand_notify_message");
        if (p17 != null) {
            p17.c2(134217728);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, "appbrand_notify_message", true, true);
        }
        com.tencent.mm.plugin.appbrand.service.i5 i5Var = (com.tencent.mm.plugin.appbrand.service.i5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.i5.class);
        java.lang.String str6 = i5Var != null ? ((com.tencent.mm.plugin.appbrand.app.d0) i5Var).f75047d : null;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        if (str2 == null) {
            str2 = "";
        }
        g0Var.d(19724, 3, 0, 0, 0, 0, null, 0, 0, 0, str4, str5, null, str3, 0, null, str2.replaceAll("[_a-zA-Z0-9]", "*"), 0, null, null, str6);
        return null;
    }
}
