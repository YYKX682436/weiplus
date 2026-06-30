package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class rm extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f205466b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f205467c;

    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view, boolean z17) {
        super.create(view);
        this.timeTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483696br1);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f205466b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bkl);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.f205467c = view.findViewById(com.tencent.mm.R.id.bo9);
        if (!z17) {
            this.stateIV = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqx);
            this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
        }
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f205467c;
    }
}
