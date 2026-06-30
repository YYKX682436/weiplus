package p53;

/* loaded from: classes8.dex */
public class u extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f352075d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f352076e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f352077f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ipcinvoker.r f352078g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 f352079h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 f352080i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f352081m;

    /* renamed from: n, reason: collision with root package name */
    public float f352082n;

    public u(android.content.Context context, com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2, java.lang.String str) {
        super(context);
        java.lang.String str2;
        this.f352082n = 1.0f;
        this.f352077f = context;
        this.f352079h = gameTabData2;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget2 = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2(context);
        this.f352080i = gameTabWidget2;
        gameTabWidget2.b(gameTabData2, str);
        m53.i3 i3Var = gameTabData2.f141155h;
        if (i3Var != null) {
            int i17 = i3Var.f323787d;
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f352082n = java.lang.Math.max(displayMetrics.widthPixels / (i17 * displayMetrics.density), this.f352082n);
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            this.f352076e = imageView;
            imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            boolean z17 = true;
            android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) (android.util.TypedValue.applyDimension(1, gameTabData2.f141155h.f323788e, getResources().getDisplayMetrics()) * this.f352082n));
            com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context);
            this.f352075d = mMPAGView;
            mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxChatSwitch()) == 1);
            this.f352075d.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            this.f352075d.setClipToOutline(true);
            float f17 = getResources().getDisplayMetrics().density * 34.0f * this.f352082n;
            this.f352075d.setTranslationY(f17);
            this.f352076e.setTranslationY(f17);
            this.f352075d.setVisibility(8);
            this.f352076e.setVisibility(8);
            p53.n nVar = new p53.n(this);
            this.f352075d.setOnClickListener(nVar);
            this.f352076e.setOnClickListener(nVar);
            addView(this.f352075d, layoutParams);
            addView(this.f352076e, layoutParams);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(gameTabData2.f141155h.f323790g)) {
                java.lang.String str3 = gameTabData2.f141155h.f323790g;
                if (str3 != null && str3.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    str2 = null;
                } else {
                    java.lang.String D = lp0.b.D();
                    kotlin.jvm.internal.o.d(D);
                    D = r26.i0.n(D, "/", false) ? D : D.concat("/");
                    char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
                    str2 = D + "gametab/res/pag/" + com.tencent.mm.sdk.platformtools.w2.b(str3.getBytes()) + ".pag";
                }
                if (o35.a.b(str2)) {
                    ((ku5.t0) ku5.t0.f312615d).B(new p53.o(this, new jz5.l(java.lang.Boolean.TRUE, str2), 0));
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("url", str3);
                bundle.putString("savePath", str2);
                p53.p pVar = new p53.p(this, str2, 0);
                this.f352078g = pVar;
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, p53.t.class, pVar);
                this.f352081m = gameTabData2.f141155h.f323790g;
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(gameTabData2.f141155h.f323789f)) {
                a(gameTabData2.f141155h.f323789f);
                this.f352081m = gameTabData2.f141155h.f323789f;
            }
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        addView(this.f352080i, layoutParams2);
    }

    public final void a(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && this.f352076e.getTag() == null) {
            this.f352076e.setTag(str);
            this.f352076e.setVisibility(0);
            this.f352076e.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            this.f352080i.setBackgroundResource(com.tencent.mm.R.color.a9e);
            n11.a.b().h(str, this.f352076e, new o11.f().a());
        }
    }

    public void b() {
        int c17 = com.tencent.mm.ui.bl.c(this.f352077f);
        float f17 = c17;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) ((android.util.TypedValue.applyDimension(1, this.f352079h.f141155h.f323788e, getResources().getDisplayMetrics()) * this.f352082n) + java.lang.Math.max(f17 - ((getResources().getDisplayMetrics().density * 34.0f) * this.f352082n), 0.0f)));
        float max = java.lang.Math.max(((getResources().getDisplayMetrics().density * 34.0f) * this.f352082n) - f17, 0.0f);
        this.f352075d.setTranslationY(max);
        this.f352076e.setTranslationY(max);
        this.f352075d.setLayoutParams(layoutParams);
        this.f352076e.setLayoutParams(layoutParams);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f352080i.getLayoutParams();
        marginLayoutParams.bottomMargin = c17;
        this.f352080i.setLayoutParams(marginLayoutParams);
        invalidate();
    }

    public com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 getGameTabWidget() {
        return this.f352080i;
    }

    public float getScale() {
        return this.f352082n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.ipcinvoker.extension.l.c(this.f352078g);
    }
}
