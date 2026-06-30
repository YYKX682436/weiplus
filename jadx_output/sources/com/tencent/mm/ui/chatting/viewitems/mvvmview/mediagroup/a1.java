package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes3.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f204770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView f204771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(android.content.Context context, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView) {
        super(0);
        this.f204770d = context;
        this.f204771e = chattingMediaGroupVideoItemMvvmView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(df0.t.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pk4.d P5 = df0.t.P5((df0.t) c17, this.f204770d, null, 0, 6, null);
        android.view.View view = (android.view.View) P5;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView = this.f204771e;
        em.t tVar = chattingMediaGroupVideoItemMvvmView.f204738y;
        if (tVar == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        tVar.e().addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
        P5.setVideoCallback(chattingMediaGroupVideoItemMvvmView.f204739z);
        ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) P5).setProgressListener(new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.z0(chattingMediaGroupVideoItemMvvmView));
        P5.setLoop(true);
        P5.setMute(true);
        P5.setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
        return P5;
    }
}
