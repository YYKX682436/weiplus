package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class xd implements com.tencent.mm.ui.chatting.component.ee {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.le f200227a;

    public xd(com.tencent.mm.ui.chatting.component.le leVar) {
        this.f200227a = leVar;
    }

    @Override // com.tencent.mm.ui.chatting.component.ee
    public void onClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.roomtools.GroupToolsComponet", "iRecentUseToolsCallback click");
        java.lang.Object tag = view.getTag();
        boolean z17 = tag instanceof com.tencent.mm.chatroom.storage.GroupToolItem;
        com.tencent.mm.ui.chatting.component.le leVar = this.f200227a;
        if (z17) {
            com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem = (com.tencent.mm.chatroom.storage.GroupToolItem) tag;
            if (com.tencent.mm.sdk.platformtools.t8.D0(groupToolItem.f63682d, "roomaa@app.origin")) {
                com.tencent.mm.ui.chatting.component.le.m0(leVar);
            } else if (com.tencent.mm.sdk.platformtools.t8.D0(groupToolItem.f63682d, "roomlive@app.origin")) {
                com.tencent.mm.ui.chatting.component.le.n0(leVar);
            } else {
                com.tencent.mm.ui.chatting.component.le.o0(leVar, groupToolItem, "2", false);
            }
            com.tencent.mm.ui.chatting.component.le.p0(leVar, groupToolItem, false);
        }
        com.tencent.mm.ui.chatting.view.g0 g0Var = leVar.f199425t;
        if (g0Var != null) {
            g0Var.b();
        }
    }
}
