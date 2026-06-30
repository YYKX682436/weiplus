package rc5;

/* loaded from: classes11.dex */
public final class y extends com.tencent.mm.ui.chatting.db {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.chatting.db
    public void b7() {
        getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
    }

    @Override // com.tencent.mm.ui.chatting.db
    public void c7() {
        getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
    }

    @Override // com.tencent.mm.ui.chatting.db
    public boolean g7(com.tencent.mm.ui.chatting.component.pe headerComponent, yb5.d chattingContext) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        java.lang.String x17 = chattingContext.x();
        if (com.tencent.mm.storage.z3.R4(x17)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", x17);
            intent.putExtra("RoomInfo_Id", x17);
            intent.putExtra("Is_Chatroom", true);
            intent.putExtra("fromChatting", true);
            bh5.c cVar = new bh5.c();
            cVar.d(intent);
            cVar.b(com.tencent.mm.ui.halfscreen.custom.RightInHalfScreen.class);
            cVar.f20922a.f20924a = chattingContext.g();
            cVar.e(true);
            cVar.c(false);
            cVar.a(com.tencent.mm.feature.forward.ui.PreviewProfileUI.class.getName());
            cVar.g();
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.db
    public boolean h7(com.tencent.mm.ui.chatting.component.pe headerComponent, com.tencent.mm.ui.bc optionListener, yb5.d chattingContext) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(optionListener, "optionListener");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        if (com.tencent.mm.storage.z3.R4(chattingContext.x())) {
            headerComponent.K0(0, com.tencent.mm.R.string.b59, com.tencent.mm.R.raw.actionbar_icon_dark_more, optionListener);
        }
        return true;
    }
}
