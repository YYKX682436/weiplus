package lb3;

/* loaded from: classes9.dex */
public abstract class g implements gm5.a {
    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        lb3.j jVar;
        nb3.h hVar = (nb3.h) this;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        nb3.i iVar = hVar.f336052b;
        iVar.f336057e = false;
        if (iVar.f336053a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaLuckyMoneyLogicDetail", "CgiQueryWxaHB got its response. but ui is destroyed.");
        } else {
            int i17 = fVar.f70615a;
            if (i17 == 0 && fVar.f70616b == 0) {
                r45.yh5 yh5Var = (r45.yh5) fVar.f70618d;
                int i18 = yh5Var.f391106x;
                if (i18 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxaLuckyMoneyLogicDetail", "CgiQueryWxaHB error wxahb_status = [%d] errorwording = [%s]", java.lang.Integer.valueOf(i18), ((r45.yh5) fVar.f70618d).f391107y);
                    nb3.i.a(iVar, ((r45.yh5) fVar.f70618d).f391107y, new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error query red packet fail errStatus = " + ((r45.yh5) fVar.f70618d).f391106x + ",errMsg" + ((r45.yh5) fVar.f70618d).f391107y + "}}"));
                } else {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(yh5Var.f391102t);
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((r45.yh5) fVar.f70618d).f391095m.size());
                    java.util.List list = iVar.f336058f;
                    java.util.LinkedList linkedList = (java.util.LinkedList) list;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyLogicDetail", "CgiQueryWxaHB succeed. hasmore = [%b] rcvd_user_list.size() = [%d], currentlist.size = [%d]", valueOf, valueOf2, java.lang.Integer.valueOf(linkedList.size()));
                    r45.yh5 yh5Var2 = (r45.yh5) fVar.f70618d;
                    iVar.f336056d = yh5Var2.f391102t;
                    linkedList.addAll(yh5Var2.f391095m);
                    ((com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI) iVar.f336053a).V6();
                    if (hVar.f336051a == 0) {
                        nb3.b bVar = iVar.f336053a;
                        r45.yh5 yh5Var3 = (r45.yh5) fVar.f70618d;
                        com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI wxaLuckyMoneyDetailUI = (com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI) bVar;
                        if (yh5Var3 == null) {
                            jVar = null;
                        } else {
                            wxaLuckyMoneyDetailUI.getClass();
                            jVar = new lb3.j();
                            jVar.f317763a = yh5Var3.f391097o;
                            jVar.f317764b = yh5Var3.f391099q;
                            jVar.f317765c = yh5Var3.f391098p;
                            jVar.f317766d = yh5Var3.f391089d;
                            jVar.f317770h = yh5Var3.f391103u;
                            jVar.f317771i = yh5Var3.f391101s;
                            jVar.f317768f = yh5Var3.f391094i;
                            jVar.f317767e = yh5Var3.f391105w;
                            jVar.f317769g = yh5Var3.f391096n;
                        }
                        wxaLuckyMoneyDetailUI.U6(jVar);
                        int i19 = yh5Var3.f391102t;
                        java.util.LinkedList linkedList2 = yh5Var3.f391095m;
                        wxaLuckyMoneyDetailUI.W6(i19, linkedList2, linkedList2);
                    } else {
                        ((com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI) iVar.f336053a).W6(iVar.f336056d, ((r45.yh5) fVar.f70618d).f391095m, list);
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaLuckyMoneyLogicDetail", "CgiQueryWxaHB failed [%d, %d, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
                nb3.i.a(iVar, fVar.f70617c, new android.content.Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{service error query errType = " + fVar.f70615a + ",errCode" + fVar.f70616b + "}}"));
            }
        }
        return null;
    }
}
