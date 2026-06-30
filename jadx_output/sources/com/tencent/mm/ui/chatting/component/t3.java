package com.tencent.mm.ui.chatting.component;

/* loaded from: classes10.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.u3 f199960d;

    public t3(com.tencent.mm.ui.chatting.component.u3 u3Var) {
        this.f199960d = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.component.u3 u3Var = this.f199960d;
        int m17 = u3Var.f198580d.m();
        int j17 = u3Var.f198580d.j() - m17;
        int o17 = u3Var.f198580d.o() - m17;
        if (j17 < 0 || j17 > o17) {
            com.tencent.mars.xlog.Log.e("ChattingFinderLiveNotifyComponent", "tryRefresh error,index start:%d,end:%d", java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(o17));
            u3Var.f200049f = true;
            return;
        }
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = u3Var.f198580d.f460717l;
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = baseChattingUIFragment instanceof com.tencent.mm.ui.chatting.ChattingUIFragment ? (com.tencent.mm.ui.chatting.ChattingUIFragment) baseChattingUIFragment : null;
        if (chattingUIFragment == null) {
            return;
        }
        sb5.z zVar = chattingUIFragment.f198268s;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
        int count = kVar.getCount();
        if (j17 <= o17) {
            while (j17 < count) {
                com.tencent.mm.storage.f9 item = kVar.getItem(j17);
                if (item != null && item.getType() == 1075839025) {
                    java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(item.j(), "msg", null);
                    int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.live_widget.status"), 0);
                    java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
                    if (str == null) {
                        str = "";
                    }
                    boolean wi6 = ((com.tencent.mm.feature.finder.live.t6) ((s40.b1) i95.n0.c(s40.b1.class))).wi(item.getMsgId(), 4);
                    if (wi6) {
                        com.tencent.mars.xlog.Log.i("ChattingFinderLiveNotifyComponent", "can not add to refresh, tipsId = " + str + " ,status = " + D1 + "notRefresh = " + wi6);
                        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
                        vd2.j2 j2Var = vd2.j2.f435772a;
                        vd2.j2.f435773b.remove(str);
                    } else {
                        linkedList.add(item);
                    }
                }
                if (j17 == o17) {
                    break;
                } else {
                    j17++;
                }
            }
        }
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        vd2.j2.f435772a.a(linkedList);
    }
}
