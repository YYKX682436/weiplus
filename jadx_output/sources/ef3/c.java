package ef3;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.wallet_core.model.h1 {
    public c(long j17, r45.wh5 wh5Var) {
        r45.vh5 vh5Var = new r45.vh5();
        vh5Var.f388245e = (int) j17;
        vh5Var.f388246f = com.tencent.mm.protobuf.g.c("all_type");
        r45.r1 c17 = at4.g0.c();
        if (c17 != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c17.f384407d)) {
                vh5Var.f388247g = com.tencent.mm.protobuf.g.c(c17.f384407d);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c17.f384408e)) {
                vh5Var.f388248h = com.tencent.mm.protobuf.g.c(c17.f384408e);
            }
        }
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar == null || !aVar.isRoot()) {
            vh5Var.f388250m = 0;
        } else {
            vh5Var.f388250m = 1;
        }
        if (aVar != null) {
            vh5Var.f388249i = 1;
        } else {
            vh5Var.f388249i = 0;
        }
        vh5Var.f388251n = 1;
        vh5Var.f388252o = java.lang.System.currentTimeMillis();
        if (wh5Var.BaseResponse == null) {
            r45.ie ieVar = new r45.ie();
            wh5Var.BaseResponse = ieVar;
            r45.du5 du5Var = new r45.du5();
            du5Var.f372756d = "";
            du5Var.f372757e = true;
            ieVar.f376960e = du5Var;
            wh5Var.BaseResponse.f376959d = 0;
        }
        vh5Var.f388253p = wh5Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (com.tencent.mm.pluginsdk.model.app.j1.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "cn.gov.pbc.dcep")) {
            linkedList.add(1);
        }
        vh5Var.f388255r = linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiQueryWeChatWallet", "get cached location info");
        r45.u67 u67Var = new r45.u67();
        if (!com.tencent.mm.pluginsdk.model.app.j1.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "cn.gov.pbc.dcep")) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_dcep_address_logic_revert, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CgiQueryWeChatWallet", "dcep app is not install, ignore get address data");
                vh5Var.f388254q = u67Var;
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = vh5Var;
                lVar.f70665b = new r45.wh5();
                ss4.p0 p0Var = ss4.p0.f412124a;
                ss4.n0 n0Var = ss4.n0.f412105d;
                int a17 = p0Var.a(n0Var, 2672);
                java.lang.String b17 = p0Var.b(n0Var, "/cgi-bin/mmpay-bin/tenpay/querywechatwallet");
                lVar.f70667d = a17;
                lVar.f70666c = b17;
                lVar.f70668e = 0;
                lVar.f70669f = 0;
                p(lVar.a());
                com.tencent.mars.xlog.Log.i("MicroMsg.CgiQueryWeChatWallet", "balanceVersion: %s, isRoot: %s, openTouch: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(vh5Var.f388250m), java.lang.Integer.valueOf(vh5Var.f388249i));
            }
        }
        r45.h67 h67Var = new r45.h67();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiQueryWeChatWallet", "no location cache data");
        } else {
            try {
                h67Var.parseFrom(str.getBytes(com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CgiQueryWeChatWallet", "parse cacheString exp, " + e17.getLocalizedMessage());
            }
            u67Var.f387092d = h67Var.f375885f;
            u67Var.f387093e = h67Var.f375886g;
            u67Var.f387094f = h67Var.f375887h;
        }
        ((h45.q) i95.n0.c(h45.q.class)).updateLocationCacheIfNeed(h67Var.f375883d, h67Var.f375884e, h67Var.f375890n, h67Var.f375888i, 2);
        vh5Var.f388254q = u67Var;
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70664a = vh5Var;
        lVar2.f70665b = new r45.wh5();
        ss4.p0 p0Var2 = ss4.p0.f412124a;
        ss4.n0 n0Var2 = ss4.n0.f412105d;
        int a172 = p0Var2.a(n0Var2, 2672);
        java.lang.String b172 = p0Var2.b(n0Var2, "/cgi-bin/mmpay-bin/tenpay/querywechatwallet");
        lVar2.f70667d = a172;
        lVar2.f70666c = b172;
        lVar2.f70668e = 0;
        lVar2.f70669f = 0;
        p(lVar2.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiQueryWeChatWallet", "balanceVersion: %s, isRoot: %s, openTouch: %s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(vh5Var.f388250m), java.lang.Integer.valueOf(vh5Var.f388249i));
    }
}
