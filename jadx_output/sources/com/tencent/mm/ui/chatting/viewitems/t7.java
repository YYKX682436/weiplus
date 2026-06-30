package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class t7 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f205565b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f205566c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f205567d;

    public final com.tencent.mm.ui.chatting.viewitems.t7 a(android.view.View view, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        super.create(view);
        this.f205565b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.e_f);
        this.f205566c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.fux);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        if (!(!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el())) {
            this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
            this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        }
        if (z17) {
            this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
            this.f205567d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqz);
        }
        return this;
    }
}
