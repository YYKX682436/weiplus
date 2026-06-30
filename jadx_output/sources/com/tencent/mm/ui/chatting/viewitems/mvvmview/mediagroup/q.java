package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes14.dex */
public final class q implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView f204844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.l f204845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f204846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.l f204847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f204848h;

    public q(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.l lVar, boolean z17, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView2, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.l lVar2, boolean z18) {
        this.f204844d = chattingMediaGroupMvvmView;
        this.f204845e = lVar;
        this.f204846f = z17;
        this.f204847g = lVar2;
        this.f204848h = z18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView = this.f204844d;
        if (chattingMediaGroupMvvmView.f204713n == this.f204847g) {
            chattingMediaGroupMvvmView.A(this.f204848h);
        } else {
            chattingMediaGroupMvvmView.getClass();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView = this.f204844d;
        if (chattingMediaGroupMvvmView.f204713n == this.f204845e) {
            chattingMediaGroupMvvmView.A(this.f204846f);
        } else {
            chattingMediaGroupMvvmView.getClass();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
