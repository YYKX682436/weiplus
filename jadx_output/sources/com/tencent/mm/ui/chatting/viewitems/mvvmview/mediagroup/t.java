package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.m implements yz5.a {
    public t(java.lang.Object obj) {
        super(0, obj, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView.class, "createConsumedMsgInfoList", "createConsumedMsgInfoList()Ljava/util/List;", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView) this.receiver;
        if (chattingMediaGroupMvvmView.f204707J.isEmpty()) {
            return kz5.p0.f313996d;
        }
        return q26.h0.y(q26.h0.p(new q26.f0(kz5.n0.J(chattingMediaGroupMvvmView.f204707J)), new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.r(chattingMediaGroupMvvmView.n())));
    }
}
