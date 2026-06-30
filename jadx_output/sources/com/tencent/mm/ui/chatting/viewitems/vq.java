package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class vq extends com.tencent.mm.ui.chatting.viewitems.xq {

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f205887k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.view.ServiceNotifyHeaderView f205888l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.yq f205889m = new com.tencent.mm.ui.chatting.viewitems.yq();

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.wq f205890n = new com.tencent.mm.ui.chatting.viewitems.wq();

    @Override // com.tencent.mm.ui.chatting.viewitems.xq
    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view) {
        super.a(view);
        this.f205887k = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bqw);
        this.f205888l = (com.tencent.mm.ui.chatting.view.ServiceNotifyHeaderView) view.findViewById(com.tencent.mm.R.id.srp);
        this.f205889m.f206100a = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.bkn);
        this.f205890n.f205957a = (com.tencent.mm.ui.chatting.view.FoldableCellLayout) view.findViewById(com.tencent.mm.R.id.f483670bn5);
        this.historyMsgTip = view.findViewById(com.tencent.mm.R.id.bm7);
        return this;
    }
}
