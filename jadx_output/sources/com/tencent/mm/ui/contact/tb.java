package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class tb implements com.tencent.mm.pluginsdk.ui.a2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsSelectConversationAddressUI f207200d;

    public tb(com.tencent.mm.ui.contact.SnsSelectConversationAddressUI snsSelectConversationAddressUI) {
        this.f207200d = snsSelectConversationAddressUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 != 1 || str == null) {
            return;
        }
        com.tencent.mm.ui.contact.SnsSelectConversationAddressUI snsSelectConversationAddressUI = this.f207200d;
        snsSelectConversationAddressUI.C.remove(str);
        com.tencent.mm.plugin.sns.statistics.j0.f164861a.k(str);
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = snsSelectConversationAddressUI.f206450h;
        if (multiSelectContactView != null) {
            multiSelectContactView.e(snsSelectConversationAddressUI.C);
        }
        snsSelectConversationAddressUI.x7();
    }
}
