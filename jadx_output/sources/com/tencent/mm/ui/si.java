package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class si implements bi4.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f209860a;

    public si(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI) {
        this.f209860a = singleChatInfoUI;
    }

    @Override // bi4.v0
    public void a(boolean z17, java.util.List list) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        objArr[1] = list != null ? java.lang.Integer.valueOf(list.size()) : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.SingleChatInfoUI", "tsessionInfos result:%s size:%s", objArr);
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f209860a;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pj4.j jVar = (pj4.j) it.next();
                if (jVar != null && jVar.f355125d == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SingleChatInfoUI", "rspInfo" + jVar.f355125d + ",block:" + jVar.f355138t);
                    boolean z18 = jVar.f355138t;
                    boolean z19 = com.tencent.mm.ui.SingleChatInfoUI.f197069x;
                    singleChatInfoUI.a7(z18);
                    break;
                }
            }
        }
        singleChatInfoUI.f197084u = null;
    }
}
