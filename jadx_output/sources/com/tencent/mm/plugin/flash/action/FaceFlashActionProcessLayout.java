package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class FaceFlashActionProcessLayout extends android.widget.RelativeLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f137088t = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.flash.action.FaceFlashActionUI f137089d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f137090e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f137091f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f137092g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f137093h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f137094i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f137095m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f137096n;

    /* renamed from: o, reason: collision with root package name */
    public float f137097o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f137098p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.animation.Animation f137099q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.animation.Animation f137100r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.animation.Animation f137101s;

    public FaceFlashActionProcessLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionProcessLayout", "showSuccessAnimation");
        if (this.f137098p) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f137096n.getLayoutParams();
            layoutParams.removeRule(3);
            int p17 = i17 - com.tencent.mm.ui.bk.p(getContext());
            float f17 = this.f137097o;
            double d17 = p17 * 0.5d;
            if (((int) f17) > d17) {
                layoutParams.topMargin = ((int) d17) - i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 100);
            } else {
                layoutParams.topMargin = ((int) f17) - i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 100);
            }
            this.f137096n.setLayoutParams(layoutParams);
        } else {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f137096n.getLayoutParams();
            layoutParams2.addRule(3, com.tencent.mm.R.id.dnt);
            layoutParams2.topMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 48);
            this.f137096n.setLayoutParams(layoutParams2);
        }
        this.f137090e.setText(i65.a.r(getContext(), com.tencent.mm.R.string.f491174c82));
        this.f137092g.setImageResource(com.tencent.mm.R.drawable.f481433t8);
        this.f137091f.setImageDrawable(i65.a.i(getContext(), com.tencent.mm.R.raw.icons_filled_done3));
        this.f137091f.startAnimation(this.f137100r);
        this.f137092g.startAnimation(this.f137099q);
        this.f137093h.setVisibility(4);
        this.f137094i.setVisibility(4);
        this.f137095m.setVisibility(4);
    }

    public void setCircleY(float f17) {
        this.f137097o = f17;
    }

    public FaceFlashActionProcessLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f137089d = (com.tencent.mm.plugin.flash.action.FaceFlashActionUI) getContext();
        this.f137099q = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477770az);
        this.f137100r = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477772b1);
        this.f137101s = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477771b0);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488750aa5, (android.view.ViewGroup) this, true);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dnt);
        this.f137090e = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f137091f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.dnr);
        this.f137093h = (android.widget.Button) findViewById(com.tencent.mm.R.id.dnm);
        this.f137095m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dnl);
        this.f137092g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dnp);
        this.f137094i = (android.widget.Button) findViewById(com.tencent.mm.R.id.dnk);
        this.f137096n = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.dns);
    }
}
