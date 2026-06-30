package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class FaceFlashProcessLayout extends android.widget.RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f137040q = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.flash.FaceFlashUI f137041d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f137042e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f137043f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f137044g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f137045h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f137046i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f137047m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.animation.Animation f137048n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.animation.Animation f137049o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.animation.Animation f137050p;

    public FaceFlashProcessLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "showSuccessAnimation");
        findViewById(com.tencent.mm.R.id.lqx).setPadding(0, com.tencent.mm.ui.bl.a(getContext()), 0, 0);
        this.f137042e.setText(i65.a.r(getContext(), com.tencent.mm.R.string.f491174c82));
        this.f137045h.setImageResource(com.tencent.mm.R.drawable.f481433t8);
        this.f137044g.setImageDrawable(i65.a.i(getContext(), com.tencent.mm.R.raw.icons_filled_done3));
        this.f137044g.startAnimation(this.f137049o);
        this.f137045h.startAnimation(this.f137048n);
        this.f137046i.setVisibility(4);
        this.f137043f.setVisibility(4);
        this.f137047m.setVisibility(4);
    }

    public FaceFlashProcessLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f137041d = (com.tencent.mm.plugin.flash.FaceFlashUI) getContext();
        this.f137048n = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477770az);
        this.f137049o = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477772b1);
        this.f137050p = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477771b0);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aa_, (android.view.ViewGroup) this, true);
        this.f137042e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dnt);
        this.f137043f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dnq);
        this.f137044g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.dnr);
        this.f137046i = (android.widget.Button) findViewById(com.tencent.mm.R.id.dnm);
        this.f137047m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dnl);
        this.f137045h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dnp);
    }
}
