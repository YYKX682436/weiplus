package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class h6 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f204080i = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView f204081b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ProgressBar f204082c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f204083d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f204084e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f204085f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f204086g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f204087h;

    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view, boolean z17) {
        super.create(view);
        this.timeTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483696br1);
        this.f204081b = (com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView) view.findViewById(com.tencent.mm.R.id.bkm);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.f204082c = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.bku);
        this.f204083d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqy);
        this.f204084e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bqq);
        if (!z17) {
            this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
            this.stateIV = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqx);
        }
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f204085f = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f483679sr2);
        this.f204086g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483681sr4);
        this.f204087h = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f483680sr3);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.sru);
        if (z17) {
            q31.n T6 = ((io.a0) ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi()).T6(null);
            linearLayout.addView(((io.t) T6).a(view.getContext()));
            setQuoteView(T6);
        }
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f204081b;
    }
}
