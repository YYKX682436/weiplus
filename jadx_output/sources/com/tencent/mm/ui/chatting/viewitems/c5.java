package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class c5 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMTextView f203697b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f203698c;

    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view, boolean z17) {
        super.create(view);
        this.timeTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483696br1);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f203697b = (com.tencent.mm.ui.widget.MMTextView) view.findViewById(com.tencent.mm.R.id.bkl);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.f203698c = view.findViewById(com.tencent.mm.R.id.bkj);
        if (!z17) {
            this.stateIV = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqx);
            this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
        }
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f203698c;
    }
}
