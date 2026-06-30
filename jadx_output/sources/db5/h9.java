package db5;

/* loaded from: classes8.dex */
public class h9 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.TalkRoomPopupNav f228391a;

    public h9(com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav) {
        this.f228391a = talkRoomPopupNav;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav = this.f228391a;
        talkRoomPopupNav.f197703w = null;
        talkRoomPopupNav.f197690g.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
