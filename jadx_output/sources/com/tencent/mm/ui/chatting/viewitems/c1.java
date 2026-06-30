package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class c1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f203520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.i1 f203521e;

    public c1(com.tencent.mm.ui.chatting.viewitems.i1 i1Var, java.util.LinkedList linkedList) {
        this.f203521e = i1Var;
        this.f203520d = linkedList;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.chatting.viewitems.i1 i1Var = this.f203521e;
        i1Var.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.viewitems.b1(i1Var));
        if (i17 != 0 || i18 != 0) {
            db5.t7.makeText(i1Var.f204150t.g(), com.tencent.mm.R.string.hd9, 0).show();
            return 0;
        }
        if (((r45.i36) oVar.f70711b.f70700a) != null) {
            int i19 = 0;
            while (true) {
                java.util.LinkedList linkedList = this.f203520d;
                if (i19 >= linkedList.size()) {
                    break;
                }
                r45.le7 le7Var = (r45.le7) linkedList.get(i19);
                if (le7Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemAppBrandNotifyMsg", "scene end, item is null");
                } else {
                    com.tencent.mm.autogen.events.UpdateAppBrandNotifyMessageEvent updateAppBrandNotifyMessageEvent = new com.tencent.mm.autogen.events.UpdateAppBrandNotifyMessageEvent();
                    java.lang.String str2 = le7Var.f379398d;
                    am.rz rzVar = updateAppBrandNotifyMessageEvent.f54912g;
                    rzVar.f7853a = str2;
                    rzVar.f7854b = le7Var.f379399e == 0;
                    updateAppBrandNotifyMessageEvent.e();
                }
                i19++;
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppBrandNotifyMsg", "setReceiveOff failed, response is null!");
        }
        return 0;
    }
}
