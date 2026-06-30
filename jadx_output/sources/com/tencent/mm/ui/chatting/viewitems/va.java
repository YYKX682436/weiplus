package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class va extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f205843b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f205844c;

    public com.tencent.mm.ui.chatting.viewitems.va a(android.view.View view, boolean z17) {
        super.create(view);
        this.f205843b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.inr);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f205844c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ins);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        return this;
    }
}
