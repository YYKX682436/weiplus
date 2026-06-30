package xc5;

/* loaded from: classes3.dex */
public final class l1 extends lf3.n implements ag3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public void V6(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        com.tencent.mm.storage.f9 b17 = iVar != null ? iVar.b() : null;
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryLocateToChatComponent", "locateToChat: msgInfo is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", b17.Q0());
        intent.putExtra("finish_direct", true);
        intent.putExtra("from_global_search", true);
        intent.putExtra("msg_local_id", b17.getMsgId());
        j45.l.u(getActivity(), ".ui.chatting.ChattingUI", intent, null);
    }
}
