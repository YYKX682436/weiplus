package com.tencent.mm.ui.conversation;

/* loaded from: classes5.dex */
public final class f9 implements j41.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f207681a;

    public f9(com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f207681a = openImKefuServiceConversationFmUI;
    }

    @Override // j41.x
    public void a(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "closeOpenImKfConversation success");
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f207681a;
        android.app.Activity context = openImKefuServiceConversationFmUI.getContext();
        android.app.Activity context2 = openImKefuServiceConversationFmUI.getContext();
        db5.t7.i(context, context2 != null ? context2.getString(com.tencent.mm.R.string.hep) : null, com.tencent.mm.R.raw.icons_filled_done);
    }

    @Override // j41.x
    public void b(int i17, int i18, int i19, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenImKefuServiceConversationUI", "closeOpenImKfConversation failed errType: " + i18 + ", errCode: " + i19 + ", errMsg: " + str);
        com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f207681a;
        android.app.Activity context = openImKefuServiceConversationFmUI.getContext();
        android.app.Activity context2 = openImKefuServiceConversationFmUI.getContext();
        db5.t7.i(context, context2 != null ? context2.getString(com.tencent.mm.R.string.hen) : null, com.tencent.mm.R.raw.ic_filled_loading_fail);
    }
}
