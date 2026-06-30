package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class p6 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f205235b;

    /* renamed from: c, reason: collision with root package name */
    public zy2.x6 f205236c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f205237d;

    public com.tencent.mm.ui.chatting.viewitems.p6 a(android.view.View view, boolean z17) {
        super.create(view);
        this.f205235b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483675bo3);
        zy2.x6 x6Var = (zy2.x6) view.findViewById(com.tencent.mm.R.id.f484350dz4);
        this.f205236c = x6Var;
        x6Var.setItemViewWidth(i65.a.b(view.getContext(), 98));
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        if (!(!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el())) {
            this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
            this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        }
        if (z17) {
            this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
            this.f205237d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqz);
        }
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return (android.view.View) this.f205236c;
    }
}
