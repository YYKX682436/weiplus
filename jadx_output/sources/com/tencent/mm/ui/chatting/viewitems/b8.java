package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class b8 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f203464b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f203465c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f203466d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f203467e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f203468f;

    public com.tencent.mm.ui.chatting.viewitems.b8 a(android.view.View view, boolean z17) {
        super.create(view);
        this.f203464b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.e_f);
        this.f203465c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.fux);
        this.f203466d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ei8);
        this.f203467e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ei9);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        if (!(!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el())) {
            this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
            this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        }
        if (z17) {
            this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
            this.f203468f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqz);
        }
        return this;
    }
}
