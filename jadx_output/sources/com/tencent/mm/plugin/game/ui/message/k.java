package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.l f141577d;

    public k(com.tencent.mm.plugin.game.ui.message.l lVar) {
        this.f141577d = lVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        m53.t1 t1Var;
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMsgCenterUI", "bottomSheet itemId:%d", java.lang.Integer.valueOf(menuItem.getItemId()));
        com.tencent.mm.plugin.game.ui.message.l lVar = this.f141577d;
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(lVar.f141579d.getContext());
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.A = false;
        i0Var.e(com.tencent.mm.R.string.f490347sg);
        aVar.F = new com.tencent.mm.plugin.game.ui.message.f(this);
        java.util.HashMap hashMap = new java.util.HashMap();
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.game.ui.message.GameMsgCenterUI gameMsgCenterUI = lVar.f141579d;
        if (itemId == 0) {
            i0Var.d(com.tencent.mm.R.string.flc);
            i0Var.f(com.tencent.mm.R.string.f490353sl);
            aVar.E = new com.tencent.mm.plugin.game.ui.message.h(this, hashMap);
            aVar.G = new com.tencent.mm.plugin.game.ui.message.g(this, hashMap);
            i0Var.a().show();
            hashMap.put("tab", "1");
            hashMap.put("actionstatus", "2");
            com.tencent.mm.game.report.l.c(gameMsgCenterUI.getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z.CTRL_INDEX, 1, 2, gameMsgCenterUI.f141480d, com.tencent.mm.game.report.l.b(hashMap));
            return;
        }
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            i0Var.d(com.tencent.mm.R.string.fle);
            i0Var.f(com.tencent.mm.R.string.f490353sl);
            aVar.E = new com.tencent.mm.plugin.game.ui.message.j(this, hashMap);
            aVar.G = new com.tencent.mm.plugin.game.ui.message.i(this, hashMap);
            i0Var.a().show();
            hashMap.put("tab", "2");
            hashMap.put("actionstatus", "2");
            com.tencent.mm.game.report.l.c(gameMsgCenterUI.getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z.CTRL_INDEX, 1, 2, gameMsgCenterUI.f141480d, com.tencent.mm.game.report.l.b(hashMap));
            return;
        }
        if (com.tencent.mm.plugin.game.commlib.i.e() != null) {
            t1Var = com.tencent.mm.plugin.game.commlib.i.f139381a.GeneralJumpInfo;
        } else {
            com.tencent.mm.plugin.game.commlib.i.s();
            t1Var = null;
        }
        if (t1Var != null) {
            java.util.LinkedList linkedList = t1Var.f324069d;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    m53.o3 o3Var = (m53.o3) it.next();
                    if (o3Var.f323938d == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(o3Var.f323940f)) {
                        str = o3Var.f323940f;
                        break;
                    }
                }
            }
        }
        str = "https://game.weixin.qq.com/cgi-bin/h5/static/gamecenter/subscription_list.html?wechat_pkgid=gamecenter_subscription_list&ssid=5";
        r53.f.u(gameMsgCenterUI.getContext(), str);
        hashMap.put("tab", "2");
        hashMap.put("actionstatus", "1");
        com.tencent.mm.game.report.l.c(gameMsgCenterUI.getContext(), 13, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z.CTRL_INDEX, 1, 2, gameMsgCenterUI.f141480d, com.tencent.mm.game.report.l.b(hashMap));
    }
}
