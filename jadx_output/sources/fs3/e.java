package fs3;

/* loaded from: classes15.dex */
public class e implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI f266302a;

    public e(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI) {
        this.f266302a = facingCreateChatRoomAllInOneUI;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = this.f266302a;
        facingCreateChatRoomAllInOneUI.I.setVisibility(8);
        facingCreateChatRoomAllInOneUI.f154759n.setVisibility(0);
        facingCreateChatRoomAllInOneUI.D.setVisibility(0);
        android.view.View view = facingCreateChatRoomAllInOneUI.E;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$14", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$14", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = facingCreateChatRoomAllInOneUI.B;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$14", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$14", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = facingCreateChatRoomAllInOneUI.f154760o;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$14", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$14", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        facingCreateChatRoomAllInOneUI.f154764r.setVisibility(8);
        facingCreateChatRoomAllInOneUI.f154759n.clearAnimation();
        facingCreateChatRoomAllInOneUI.D.clearAnimation();
        facingCreateChatRoomAllInOneUI.B.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        android.view.View view = this.f266302a.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$14", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/pwdgroup/ui/FacingCreateChatRoomAllInOneUI$14", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
