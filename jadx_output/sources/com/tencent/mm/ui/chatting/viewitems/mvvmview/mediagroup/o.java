package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes14.dex */
public final class o implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView f204832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g f204833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f204834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g f204835g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f204836h;

    public o(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g gVar, float f17, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView2, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.g gVar2, float f18) {
        this.f204832d = chattingMediaGroupMvvmView;
        this.f204833e = gVar;
        this.f204834f = f17;
        this.f204835g = gVar2;
        this.f204836h = f18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView = this.f204832d;
        if (chattingMediaGroupMvvmView.f204715p == this.f204835g) {
            if (this.f204836h == 0.0f) {
                chattingMediaGroupMvvmView.o();
                return;
            }
        }
        chattingMediaGroupMvvmView.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView = this.f204832d;
        if (chattingMediaGroupMvvmView.f204715p == this.f204833e) {
            if (this.f204834f == 0.0f) {
                chattingMediaGroupMvvmView.o();
                return;
            }
        }
        chattingMediaGroupMvvmView.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
