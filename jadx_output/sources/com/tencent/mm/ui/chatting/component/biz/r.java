package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f198813d;

    public r(com.tencent.mm.ui.chatting.component.biz.s sVar, java.util.List list) {
        this.f198813d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17 = 0;
        int i17 = 0;
        while (true) {
            java.util.List list = this.f198813d;
            if (i17 >= list.size()) {
                com.tencent.mm.autogen.mmdata.rpt.ServiceAcctMuteOpStruct serviceAcctMuteOpStruct = new com.tencent.mm.autogen.mmdata.rpt.ServiceAcctMuteOpStruct();
                serviceAcctMuteOpStruct.f60235d = 1L;
                serviceAcctMuteOpStruct.f60236e = c01.id.a();
                serviceAcctMuteOpStruct.f60237f = j17;
                serviceAcctMuteOpStruct.k();
                return;
            }
            com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) list.get(i17);
            if (l4Var != null && !c01.e2.d(l4Var.h1()) && !c01.e2.Q(l4Var.h1())) {
                j17 += l4Var.d1();
            }
            i17++;
        }
    }
}
