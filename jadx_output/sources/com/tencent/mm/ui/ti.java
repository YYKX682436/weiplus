package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class ti implements zy2.za {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f209903a;

    public ti(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI) {
        this.f209903a = singleChatInfoUI;
    }

    public void a(java.util.List list) {
        r45.vi2 vi2Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.SingleChatInfoUI", "sessionInfos size :" + list.size());
        boolean isEmpty = list.isEmpty();
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f209903a;
        if (!isEmpty) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                vi2Var = (r45.vi2) it.next();
                if (vi2Var.getString(1).equals(singleChatInfoUI.f197077n)) {
                    break;
                }
            }
        }
        vi2Var = null;
        if (vi2Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SingleChatInfoUI", "sessionId: " + vi2Var.getString(1) + ", sessionReject: " + vi2Var.getInteger(2));
            boolean z17 = vi2Var.getInteger(2) == 1;
            boolean z18 = com.tencent.mm.ui.SingleChatInfoUI.f197069x;
            singleChatInfoUI.a7(z17);
        }
        singleChatInfoUI.f197082s = null;
    }
}
