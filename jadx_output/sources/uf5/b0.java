package uf5;

/* loaded from: classes8.dex */
public class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI f427201d;

    public b0(com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI commonSelectChatRoomUI) {
        this.f427201d = commonSelectChatRoomUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/CommonSelectChatRoomUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.storage.z3)) {
            com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI.w7(this.f427201d, (com.tencent.mm.storage.z3) view.getTag());
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/CommonSelectChatRoomUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
