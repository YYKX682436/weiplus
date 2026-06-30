package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class n0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q0 f207882e;

    public n0(com.tencent.mm.ui.conversation.q0 q0Var, int i17) {
        this.f207882e = q0Var;
        this.f207881d = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        java.lang.String str;
        boolean isReaded;
        com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI.ConvBoxServiceConversationFmUI convBoxServiceConversationFmUI = this.f207882e.f207991d;
        str = convBoxServiceConversationFmUI.talker;
        isReaded = convBoxServiceConversationFmUI.isReaded(str);
        if (isReaded) {
            contextMenu.add(0, 1, 0, com.tencent.mm.R.string.gqe);
        } else {
            contextMenu.add(0, 2, 0, com.tencent.mm.R.string.gqc);
        }
        int i17 = this.f207881d;
        contextMenu.add(i17, 3, 0, com.tencent.mm.R.string.gq6);
        contextMenu.add(i17, 4, 0, com.tencent.mm.R.string.bl9);
    }
}
