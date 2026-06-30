package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class o9 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.LiveTalkRoomTipsBar f209464a;

    public o9(com.tencent.mm.ui.LiveTalkRoomTipsBar liveTalkRoomTipsBar) {
        this.f209464a = liveTalkRoomTipsBar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.view.MMPAGView mMPAGView;
        com.tencent.mm.ui.LiveTalkRoomTipsBar liveTalkRoomTipsBar = this.f209464a;
        liveTalkRoomTipsBar.f196871e.setVisibility(8);
        if (liveTalkRoomTipsBar.f196882s) {
            return;
        }
        liveTalkRoomTipsBar.f196871e.setVisibility(8);
        liveTalkRoomTipsBar.setVisibility(8);
        liveTalkRoomTipsBar.setRootTipsBarBackground(false);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_bar_flashing, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveExptConfig", "ChatRoomBarFlashingSwitch: " + fj6);
        if (!fj6 || (mMPAGView = ((com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) liveTalkRoomTipsBar.f196884u).f131204i) == null) {
            return;
        }
        mMPAGView.n();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
