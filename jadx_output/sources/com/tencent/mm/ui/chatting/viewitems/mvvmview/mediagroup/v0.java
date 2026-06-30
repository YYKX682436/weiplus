package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class v0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f204865d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f204866e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f204867f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView f204868g;

    /* renamed from: h, reason: collision with root package name */
    public int f204869h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f204868g = chattingMediaGroupVideoItemMvvmView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f204867f = obj;
        this.f204869h |= Integer.MIN_VALUE;
        return com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.t(this.f204868g, null, null, this);
    }
}
