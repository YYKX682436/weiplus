package fs3;

/* loaded from: classes15.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI f266313d;

    public o(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        this.f266313d = facingCreateChatRoomAllInOneUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = this.f266313d;
        facingCreateChatRoomAllInOneUI.f154766t = false;
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI.T6(facingCreateChatRoomAllInOneUI, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
