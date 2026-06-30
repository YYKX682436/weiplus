package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class o8 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f205164b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f205165c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f205166d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f205167e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f205168f;

    public com.tencent.mm.ui.chatting.viewitems.o8 a(android.view.View view, boolean z17) {
        super.create(view);
        this.f205164b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483675bo3);
        this.f205165c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483677bo5);
        this.f205166d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483676bo4);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f205168f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bnm);
        if (!(!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el())) {
            this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
            this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        }
        if (z17) {
            this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
            this.f205167e = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqz);
        }
        return this;
    }
}
