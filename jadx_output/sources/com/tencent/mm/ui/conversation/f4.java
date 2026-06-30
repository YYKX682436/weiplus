package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class f4 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f207671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI f207672e;

    public f4(com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI, android.graphics.Point point) {
        this.f207672e = enterpriseConversationFmUI;
        this.f207671d = point;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f207672e;
        com.tencent.mm.ui.conversation.p7 item = enterpriseConversationFmUI.f207350i.getItem(i17);
        dg5.v l07 = com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI.l0(enterpriseConversationFmUI, item);
        if (l07 == null) {
            return false;
        }
        return l07.a(view, this.f207671d, i17, j17, item);
    }
}
