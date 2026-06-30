package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class x5 extends com.tencent.mm.ui.chatting.y5 {
    @Override // com.tencent.mm.ui.chatting.y5
    public void a(android.content.Intent intent, com.tencent.mm.ui.chatting.viewitems.er erVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(erVar.f203928x)) {
            return;
        }
        intent.putExtra("Contact_BIZ_KF_WORKER_ID", erVar.f203928x);
    }
}
