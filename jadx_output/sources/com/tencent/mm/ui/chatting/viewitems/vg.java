package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public final class vg extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f205854b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f205855c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f205856d;

    public com.tencent.mm.ui.chatting.viewitems.vg a(android.view.View view) {
        super.create(view);
        this.f205854b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.rdy);
        this.f205855c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.rdx);
        this.historyMsgTip = view.findViewById(com.tencent.mm.R.id.bm7);
        this.f205856d = view.findViewById(com.tencent.mm.R.id.bkn);
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return null;
    }
}
