package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public final class vc extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f205846b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f205847c;

    public com.tencent.mm.ui.chatting.viewitems.vc a(android.view.View view) {
        super.create(view);
        this.f205846b = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.kpw);
        this.f205847c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.g_t);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return null;
    }
}
