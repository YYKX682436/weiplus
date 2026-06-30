package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class lf extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: t, reason: collision with root package name */
    public static final o11.g f204462t;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f204463b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f204464c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f204465d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f204466e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f204467f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f204468g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f204469h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f204470i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f204471j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f204472k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.ImageView f204473l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f204474m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f204475n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f204476o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f204477p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f204478q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f204479r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f204480s;

    static {
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 240);
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 192);
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.raw.app_brand_app_default_icon_for_tail;
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 20);
        int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 20);
        fVar.f342086j = b17;
        fVar.f342087k = b18;
        fVar.f342096t = true;
        fVar.f342077a = true;
        f204462t = fVar.a();
    }

    public com.tencent.mm.ui.chatting.viewitems.lf a(android.view.View view, boolean z17) {
        super.create(view);
        this.f204463b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bjq);
        this.f204464c = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.bkq);
        this.f204465d = (android.widget.ImageView) this.convertView.findViewById(com.tencent.mm.R.id.f483695br0);
        this.f204466e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bix);
        this.f204467f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bjk);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f204468g = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.a1l);
        this.f204469h = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.inu);
        this.f204470i = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.bjy);
        this.clickArea = view.findViewById(com.tencent.mm.R.id.bkg);
        if (!z17) {
            this.uploadingPB = (android.widget.ProgressBar) this.convertView.findViewById(com.tencent.mm.R.id.ott);
        }
        this.f204476o = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.bif);
        this.f204477p = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.big);
        this.f204478q = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.dhg);
        this.f204479r = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.biq);
        this.f204471j = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bih);
        this.f204472k = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.biw);
        this.f204473l = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bis);
        this.f204474m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.biu);
        this.f204475n = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bit);
        this.f204480s = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.biv);
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f204470i;
    }
}
