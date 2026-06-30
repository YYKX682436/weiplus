package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class lc extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f204451b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.RelativeLayout f204452c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.view.ServiceNotifyHeaderView f204453d;

    public lc(com.tencent.mm.ui.chatting.viewitems.mc mcVar) {
    }

    public com.tencent.mm.ui.chatting.viewitems.lc a(android.view.View view) {
        super.create(view);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.clickArea = view.findViewById(com.tencent.mm.R.id.bkg);
        this.f204451b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.khj);
        this.f204452c = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.khi);
        this.f204453d = (com.tencent.mm.ui.chatting.view.ServiceNotifyHeaderView) view.findViewById(com.tencent.mm.R.id.vna);
        return this;
    }
}
