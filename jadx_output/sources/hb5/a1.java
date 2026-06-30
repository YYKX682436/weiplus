package hb5;

/* loaded from: classes11.dex */
public class a1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.bizchat.BizChatroomInfoUI f280149d;

    public a1(com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI) {
        this.f280149d = bizChatroomInfoUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.ui.bizchat.BizChatroomInfoUI.H;
        com.tencent.mm.ui.bizchat.BizChatroomInfoUI bizChatroomInfoUI = this.f280149d;
        bizChatroomInfoUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatroomInfoUI", "deleteChatroom");
        s01.y Ni = r01.q3.Ni();
        java.lang.String str = bizChatroomInfoUI.f197944o;
        java.lang.String str2 = bizChatroomInfoUI.f197954y.field_bizChatServId;
        Ni.getClass();
        gm0.j1.n().f273288b.g(new s01.n0(str, str2));
        bizChatroomInfoUI.F = false;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(bizChatroomInfoUI, bizChatroomInfoUI.getString(com.tencent.mm.R.string.f490573yv), bizChatroomInfoUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new hb5.b1(bizChatroomInfoUI));
        gm0.j1.e().j(new c01.h0(bizChatroomInfoUI.f197944o, bizChatroomInfoUI.f197945p, new hb5.r0(bizChatroomInfoUI, Q)));
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("Contact_User", bizChatroomInfoUI.f197944o);
        j45.l.j(bizChatroomInfoUI.getContext(), "brandservice", ".ui.BizChatConversationUI", intent, null);
        bizChatroomInfoUI.finish();
    }
}
