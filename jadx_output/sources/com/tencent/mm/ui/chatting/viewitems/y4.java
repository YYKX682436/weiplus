package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class y4 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.RelativeLayout f206026b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f206027c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f206028d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f206029e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f206030f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f206031g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f206032h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f206033i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f206034j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f206035k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.FrameLayout f206036l;

    /* renamed from: m, reason: collision with root package name */
    public int f206037m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f206038n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f206039o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f206040p = 0;

    public void a(int i17, com.tencent.mm.ui.chatting.viewitems.a0 a0Var) {
        if (this.f206037m == i17) {
            return;
        }
        this.f206037m = i17;
        if (i17 == 1) {
            this.f206031g.setVisibility(0);
            this.f206027c.setVisibility(8);
            this.f206030f.setVisibility(8);
            this.f206029e.setClickable(true);
            android.widget.ImageView imageView = this.f206029e;
            this.clickArea = imageView;
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = this.f206039o;
            this.f206029e.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f206036l.getLayoutParams();
            layoutParams2.topMargin = this.f206040p;
            this.f206036l.setLayoutParams(layoutParams2);
            return;
        }
        if (i17 == 2) {
            this.f206031g.setVisibility(8);
            this.f206030f.setVisibility(0);
            this.f206029e.setClickable(false);
            this.clickArea = this.f206030f;
            android.view.ViewGroup.LayoutParams layoutParams3 = this.f206029e.getLayoutParams();
            layoutParams3.height = this.f206038n;
            this.f206029e.setLayoutParams(layoutParams3);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) this.f206036l.getLayoutParams();
            layoutParams4.topMargin = 0;
            this.f206036l.setLayoutParams(layoutParams4);
        }
    }

    public com.tencent.mm.ui.chatting.viewitems.y4 b(android.view.View view, boolean z17) {
        super.create(view);
        this.timeTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483696br1);
        this.checkBox = (android.widget.CheckBox) this.convertView.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = this.convertView.findViewById(com.tencent.mm.R.id.bpa);
        this.userTV = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.brc);
        this.f206030f = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.a3t);
        this.f206026b = (android.widget.RelativeLayout) this.convertView.findViewById(com.tencent.mm.R.id.a3s);
        this.f206027c = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.a3p);
        this.f206028d = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.a3q);
        this.f206029e = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.a3r);
        this.f206031g = (android.widget.RelativeLayout) this.convertView.findViewById(com.tencent.mm.R.id.f483253r22);
        this.f206032h = (android.widget.LinearLayout) this.convertView.findViewById(com.tencent.mm.R.id.f483257r26);
        this.f206033i = (com.tencent.mm.ui.widget.imageview.WeImageView) this.convertView.findViewById(com.tencent.mm.R.id.r27);
        this.f206034j = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483256r25);
        this.f206035k = (android.widget.TextView) this.convertView.findViewById(com.tencent.mm.R.id.f483254r23);
        this.f206036l = (android.widget.FrameLayout) this.convertView.findViewById(com.tencent.mm.R.id.f483252r21);
        this.f206039o = view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480239ak1);
        this.f206038n = view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480240ak2);
        this.f206040p = view.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480238ak0);
        return this;
    }

    public void c(int i17) {
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f206035k.getLayoutParams();
        layoutParams.bottomMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i17);
        this.f206035k.setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f206026b;
    }
}
