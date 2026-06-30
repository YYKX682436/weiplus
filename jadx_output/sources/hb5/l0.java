package hb5;

/* loaded from: classes11.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatSelectConversationUI f280220d;

    public l0(com.tencent.mm.ui.bizchat.BizChatSelectConversationUI bizChatSelectConversationUI) {
        this.f280220d = bizChatSelectConversationUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/bizchat/BizChatSelectConversationUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.bizchat.BizChatSelectConversationUI.H;
        com.tencent.mm.ui.bizchat.BizChatSelectConversationUI bizChatSelectConversationUI = this.f280220d;
        bizChatSelectConversationUI.getClass();
        s01.a0 y07 = r01.q3.Vi().y0(r01.q3.Vi().z0(bizChatSelectConversationUI.C));
        bizChatSelectConversationUI.F = y07;
        if (y07 == null || com.tencent.mm.sdk.platformtools.t8.K0(y07.field_addMemberUrl)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            s01.a0 a0Var = bizChatSelectConversationUI.F;
            objArr[0] = a0Var != null ? a0Var.field_addMemberUrl : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatSelectConversationUI", "field_addMemberUrl:%s", objArr);
            dp.a.makeText(bizChatSelectConversationUI, bizChatSelectConversationUI.getString(com.tencent.mm.R.string.f490757ao1), 0).show();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", bizChatSelectConversationUI.F.field_addMemberUrl);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatSelectConversationUI", "KRawUrl :%s", bizChatSelectConversationUI.F.field_addMemberUrl);
            intent.putExtra("useJs", true);
            j45.l.n(bizChatSelectConversationUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/ui/bizchat/BizChatSelectConversationUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
