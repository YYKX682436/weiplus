package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.i f209328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.ui.mvvm.uic.conversation.recent.i iVar) {
        super(1);
        this.f209328d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        xi5.b bVar;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        if (state.G && (bVar = (xi5.b) state.a(xi5.b.class)) != null) {
            boolean a17 = com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a();
            com.tencent.mm.ui.mvvm.uic.conversation.recent.i iVar = this.f209328d;
            if (!a17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AfterForwardUIC", "EnterChattingAfterTrans config disabled, show normal toast");
                dp.a.makeText(iVar.getActivity(), iVar.getActivity().getString(com.tencent.mm.R.string.fw6), 0).show();
            }
            if (bVar.f454740g) {
                java.lang.String str2 = bVar.f454739f;
                if (str2 == null || str2.length() == 0) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.addFlags(268435456);
                    j45.l.u(iVar.getContext(), ".ui.transmit.TaskRedirectUI", intent, null);
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Chat_User", str2);
                    intent2.addFlags(67108864);
                    j45.l.u(iVar.getContext(), ".ui.chatting.ChattingUI", intent2, null);
                }
            }
        }
        xi5.a aVar = (xi5.a) state.a(xi5.a.class);
        if (aVar != null && (str = aVar.f454734b) != null && !r26.i0.n(str, "@kefu.openim", false)) {
            com.tencent.mm.ui.contact.k3.a(str);
        }
        return jz5.f0.f302826a;
    }
}
