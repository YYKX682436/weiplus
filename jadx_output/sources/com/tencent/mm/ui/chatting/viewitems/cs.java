package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class cs extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f203749b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f203750c;

    public com.tencent.mm.ui.chatting.viewitems.cs a(android.view.View view, boolean z17) {
        super.create(view);
        this.f203749b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483637bj2);
        this.f203750c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bjs);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return null;
    }
}
