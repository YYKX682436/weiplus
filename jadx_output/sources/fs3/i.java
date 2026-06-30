package fs3;

/* loaded from: classes15.dex */
public class i implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation f266306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI f266307b;

    public i(com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI, android.view.animation.Animation animation) {
        this.f266307b = facingCreateChatRoomAllInOneUI;
        this.f266306a = animation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI = this.f266307b;
        facingCreateChatRoomAllInOneUI.f154759n.b();
        facingCreateChatRoomAllInOneUI.f154759n.startAnimation(this.f266306a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
