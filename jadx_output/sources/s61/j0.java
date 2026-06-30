package s61;

/* loaded from: classes8.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.InviteFriendUI f403361d;

    public j0(com.tencent.mm.plugin.account.friend.ui.InviteFriendUI inviteFriendUI) {
        this.f403361d = inviteFriendUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.autogen.events.QMessageOperationEvent qMessageOperationEvent = new com.tencent.mm.autogen.events.QMessageOperationEvent();
        am.ap apVar = qMessageOperationEvent.f54633g;
        apVar.getClass();
        com.tencent.mm.plugin.account.friend.ui.InviteFriendUI inviteFriendUI = this.f403361d;
        java.lang.String str = inviteFriendUI.f73152e;
        apVar.getClass();
        java.lang.String str2 = inviteFriendUI.f73153f;
        apVar.getClass();
        qMessageOperationEvent.e();
        qMessageOperationEvent.f54634h.getClass();
        inviteFriendUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/InviteFriendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
