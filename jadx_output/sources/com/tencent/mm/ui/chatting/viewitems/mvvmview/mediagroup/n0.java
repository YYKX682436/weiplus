package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView f204831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView) {
        super(0);
        this.f204831d = chattingMediaGroupVideoItemMvvmView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView = this.f204831d;
        com.tencent.mars.xlog.Log.i(chattingMediaGroupVideoItemMvvmView.f204726m, "parseBitmapFromViewModel, videoThumbCustomLoader onFinish");
        em.t tVar = chattingMediaGroupVideoItemMvvmView.f204738y;
        if (tVar == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.widget.ImageView c17 = tVar.c();
        kotlin.jvm.internal.o.f(c17, "getThumbIv(...)");
        chattingMediaGroupVideoItemMvvmView.A.a(ug5.x.b(c17), true);
        return jz5.f0.f302826a;
    }
}
