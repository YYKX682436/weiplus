package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class e7 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f203845b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f203846c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f203847d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f203848e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f203849f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f203850g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f203851h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f203852i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f203853j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView f203854k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f203855l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f203856m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f203857n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f203858o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f203859p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.FrameLayout f203860q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f203861r;

    public int a(android.content.Context context) {
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
        int min = java.lang.Math.min(a17.f197135a, a17.f197136b);
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Ri();
        int i17 = (min * 3) / 8;
        com.tencent.mars.xlog.Log.i("ChattingItemAppMsgFinderFeed", "real widthPixels:" + min + " , width:" + i17);
        return i17;
    }

    public com.tencent.mm.ui.chatting.viewitems.e7 b(android.view.View view, boolean z17) {
        super.create(view);
        this.f203861r = view.findViewById(com.tencent.mm.R.id.bkg);
        boolean z18 = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Ri() == 1;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f203861r.getLayoutParams();
        layoutParams.width = a(view.getContext());
        this.f203861r.setLayoutParams(layoutParams);
        this.f203845b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bnf);
        this.f203846c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bnp);
        this.f203847d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483673bo1);
        this.f203848e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bni);
        this.f203849f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483672bo0);
        this.f203850g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bo8);
        this.f203851h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bnk);
        this.f203852i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bno);
        this.f203854k = (com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView) view.findViewById(com.tencent.mm.R.id.bnn);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f203855l = view.findViewById(com.tencent.mm.R.id.bjy);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bne);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.f203856m = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.cum);
        this.f203857n = view.findViewById(com.tencent.mm.R.id.msr);
        this.f203858o = view.findViewById(com.tencent.mm.R.id.fsk);
        this.f203859p = view.findViewById(com.tencent.mm.R.id.bnq);
        this.f203860q = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.ptg);
        if (!(true ^ ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el())) {
            this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
            this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        }
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
        this.uploadingPB = progressBar;
        if (z17) {
            this.f203853j = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqz);
            android.widget.ImageView imageView2 = this.f203847d;
            if (imageView2 instanceof com.tencent.mm.view.NinePatchCropImageView) {
                ((com.tencent.mm.view.NinePatchCropImageView) imageView2).setNinePatchId(com.tencent.mm.R.drawable.c0j);
            }
        } else {
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            android.widget.ImageView imageView3 = this.f203847d;
            if (imageView3 instanceof com.tencent.mm.view.NinePatchCropImageView) {
                ((com.tencent.mm.view.NinePatchCropImageView) imageView3).setNinePatchId(com.tencent.mm.R.drawable.c08);
            }
        }
        com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView imageIndicatorView = this.f203854k;
        imageIndicatorView.f170655i = com.tencent.mm.R.color.BW_100_Alpha_0_3;
        imageIndicatorView.f170654h = com.tencent.mm.R.color.f478553an;
        android.widget.ImageView imageView4 = this.f203851h;
        imageView4.setImageDrawable(com.tencent.mm.ui.uk.e(imageView4.getContext(), z18 ? com.tencent.mm.R.raw.icons_filled_channel : com.tencent.mm.R.raw.icons_outlined_finder_icon, i65.a.d(this.f203851h.getContext(), com.tencent.mm.R.color.f478553an)));
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f203855l;
    }
}
