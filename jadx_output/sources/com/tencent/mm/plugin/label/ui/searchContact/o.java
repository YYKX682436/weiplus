package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class o extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI f143377a;

    public o(com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI) {
        this.f143377a = contactManagerUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (msg.what == 5001) {
            com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI = this.f143377a;
            int i17 = com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI.f143316z;
            synchronized (contactManagerUI) {
                com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent updateSearchIndexAtOnceEvent = new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent();
                updateSearchIndexAtOnceEvent.f54924g.f6419a = 0L;
                updateSearchIndexAtOnceEvent.e();
                new com.tencent.mm.autogen.events.UpdateFtsSearchDataEvent().e();
                if (contactManagerUI.f143328r) {
                    com.tencent.mm.sdk.platformtools.n3 n3Var = contactManagerUI.f143329s;
                    if (n3Var != null) {
                        n3Var.postDelayed(new com.tencent.mm.plugin.label.ui.searchContact.u(contactManagerUI), 500L);
                    }
                } else {
                    com.tencent.mm.sdk.platformtools.n3 n3Var2 = contactManagerUI.f143329s;
                    if (n3Var2 != null) {
                        n3Var2.postDelayed(new com.tencent.mm.plugin.label.ui.searchContact.v(contactManagerUI), 100L);
                    }
                }
            }
        }
    }
}
