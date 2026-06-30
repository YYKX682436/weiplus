package com.tencent.mm.ui.conversation;

/* loaded from: classes5.dex */
public final class o9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f207947d;

    public o9(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f207947d = openImKefuServiceConversationFmUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f207947d;
        if (itemId == 1) {
            java.lang.String str = openImKefuServiceConversationFmUI.f207403h;
            openImKefuServiceConversationFmUI.getClass();
            if (str == null || str.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenImKefuServiceConversationUI", "closeConversation talker invalid");
                return;
            }
            com.tencent.mm.ui.report.k0.b(3, str, openImKefuServiceConversationFmUI.f207404i);
            android.app.Activity context = openImKefuServiceConversationFmUI.getContext();
            android.app.Activity context2 = openImKefuServiceConversationFmUI.getContext();
            java.lang.String string = context2 != null ? context2.getString(com.tencent.mm.R.string.heo) : null;
            android.app.Activity context3 = openImKefuServiceConversationFmUI.getContext();
            java.lang.String string2 = context3 != null ? context3.getString(com.tencent.mm.R.string.hem) : null;
            android.app.Activity context4 = openImKefuServiceConversationFmUI.getContext();
            db5.e1.B(context, string, "", string2, context4 != null ? context4.getString(com.tencent.mm.R.string.f490347sg) : null, new com.tencent.mm.ui.conversation.c9(str, openImKefuServiceConversationFmUI), null, com.tencent.mm.R.color.f478622ch);
            return;
        }
        if (itemId != 2) {
            return;
        }
        java.lang.String str2 = openImKefuServiceConversationFmUI.f207403h;
        openImKefuServiceConversationFmUI.getClass();
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenImKefuServiceConversationUI", "deleteConversationAndMsg talker invalid");
            return;
        }
        com.tencent.mm.ui.report.k0.b(1, str2, openImKefuServiceConversationFmUI.f207404i);
        android.app.Activity context5 = openImKefuServiceConversationFmUI.getContext();
        android.app.Activity context6 = openImKefuServiceConversationFmUI.getContext();
        java.lang.String string3 = context6 != null ? context6.getString(com.tencent.mm.R.string.fc_) : null;
        android.app.Activity context7 = openImKefuServiceConversationFmUI.getContext();
        java.lang.String string4 = context7 != null ? context7.getString(com.tencent.mm.R.string.f490367t0) : null;
        android.app.Activity context8 = openImKefuServiceConversationFmUI.getContext();
        db5.e1.B(context5, string3, "", string4, context8 != null ? context8.getString(com.tencent.mm.R.string.f490347sg) : null, new com.tencent.mm.ui.conversation.e9(str2, openImKefuServiceConversationFmUI), null, com.tencent.mm.R.color.f478622ch);
    }
}
