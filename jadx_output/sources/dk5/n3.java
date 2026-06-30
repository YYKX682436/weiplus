package dk5;

/* loaded from: classes9.dex */
public class n3 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234762a;

    public n3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234762a = selectConversationUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "[ImageGalleryUI] showImgGallery");
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234762a;
        android.content.Intent intent = new android.content.Intent(selectConversationUI.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
        intent.putExtra("img_gallery_msg_id", selectConversationUI.M1);
        intent.putExtra("img_gallery_msg_svr_id", selectConversationUI.S1.I0());
        intent.putExtra("img_gallery_talker", selectConversationUI.S1.Q0());
        intent.putExtra("img_gallery_chatroom_name", selectConversationUI.S1.Q0());
        intent.putExtra("img_preview_only", true);
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI2 = this.f234762a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(selectConversationUI2, arrayList.toArray(), "com/tencent/mm/ui/transmit/SelectConversationUI$31", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        selectConversationUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(selectConversationUI2, "com/tencent/mm/ui/transmit/SelectConversationUI$31", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        db5.f.j(selectConversationUI.getContext());
    }
}
