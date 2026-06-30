package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class ra implements xg3.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ServiceNotifyConversationUI f208051d;

    public ra(com.tencent.mm.ui.conversation.ServiceNotifyConversationUI serviceNotifyConversationUI) {
        this.f208051d = serviceNotifyConversationUI;
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        com.tencent.mm.ui.conversation.ya yaVar;
        if (m0Var == null || (arrayList = l0Var.f454412c) == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            if (f9Var != null && "notifymessage".equals(l0Var.f454410a)) {
                java.lang.String P0 = ((com.tencent.mm.storage.z9) c01.d9.b().v()).P0(f9Var);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(P0) && (yaVar = this.f208051d.f207417f) != null) {
                    yaVar.onNotifyChange(P0, null);
                }
            }
        }
    }
}
