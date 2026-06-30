package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class v6 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f205836b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f205837c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f205838d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f205839e;

    public final com.tencent.mm.ui.chatting.viewitems.v6 a(android.view.View view, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        super.create(view);
        this.f205836b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484981tw0);
        this.f205837c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484443tc4);
        this.f205838d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.tco);
        this.f205839e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tf_);
        if (!(!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el())) {
            this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
            this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        }
        if (z17) {
            this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
        }
        return this;
    }
}
