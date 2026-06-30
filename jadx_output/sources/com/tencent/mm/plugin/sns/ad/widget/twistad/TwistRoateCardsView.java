package com.tencent.mm.plugin.sns.ad.widget.twistad;

/* loaded from: classes4.dex */
public class TwistRoateCardsView extends android.widget.FrameLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.HashMap f163951y = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f163952d;

    /* renamed from: e, reason: collision with root package name */
    public int f163953e;

    /* renamed from: f, reason: collision with root package name */
    public int f163954f;

    /* renamed from: g, reason: collision with root package name */
    public int f163955g;

    /* renamed from: h, reason: collision with root package name */
    public int f163956h;

    /* renamed from: i, reason: collision with root package name */
    public int f163957i;

    /* renamed from: m, reason: collision with root package name */
    public int f163958m;

    /* renamed from: n, reason: collision with root package name */
    public int f163959n;

    /* renamed from: o, reason: collision with root package name */
    public float f163960o;

    /* renamed from: p, reason: collision with root package name */
    public float f163961p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f163962q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f163963r;

    /* renamed from: s, reason: collision with root package name */
    public int f163964s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f163965t;

    /* renamed from: u, reason: collision with root package name */
    public int f163966u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.ViewOutlineProvider f163967v;

    /* renamed from: w, reason: collision with root package name */
    public int f163968w;

    /* renamed from: x, reason: collision with root package name */
    public e94.f0 f163969x;

    public TwistRoateCardsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163953e = 0;
        this.f163954f = 0;
        this.f163960o = 0.0f;
        this.f163961p = 1.0f;
        this.f163963r = false;
        this.f163967v = new e94.y(this);
        this.f163968w = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f163952d = context;
        this.f163958m = i65.a.b(context, 14);
        this.f163959n = i65.a.b(this.f163952d, 8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    public static /* synthetic */ e94.f0 a(com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView twistRoateCardsView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        e94.f0 f0Var = twistRoateCardsView.f163969x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        return f0Var;
    }

    public void b(int i17, int i18, boolean z17, java.lang.String str, int i19) {
        java.util.HashMap hashMap;
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.tencent.mars.xlog.Log.i("TwistRoateCardsView", "initData, defBgColor=" + i19 + ", imgUrl=" + str + ", isClockwise=" + z17);
        this.f163965t = str;
        this.f163966u = i19;
        if (i17 <= 0 || i18 <= 0) {
            com.tencent.mars.xlog.Log.e("TwistRoateCardsView", "initData, size is 0, w=" + i17 + ", h=" + i18);
            this.f163956h = i65.a.b(this.f163952d, com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP);
            this.f163957i = i65.a.b(this.f163952d, 375);
        } else {
            this.f163956h = (int) (i17 * 0.75f);
            this.f163957i = (int) (i18 * 0.75f);
        }
        this.f163955g = i65.a.b(this.f163952d, 200) + (this.f163957i / 2);
        this.f163963r = z17;
        if (z17) {
            this.f163964s = 3;
        } else {
            this.f163964s = 9;
        }
        removeAllViews();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        for (int i27 = 0; i27 < 12; i27++) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            android.widget.ImageView imageView = new android.widget.ImageView(this.f163952d);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.f163956h, this.f163957i);
            int i28 = this.f163958m;
            layoutParams.setMargins(i28, i28, i28, i28);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setClipToOutline(true);
            imageView.setOutlineProvider(this.f163967v);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            imageView.setBackgroundColor(this.f163966u);
            java.lang.String str2 = this.f163965t;
            int i29 = this.f163956h;
            int i37 = this.f163957i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            } else {
                try {
                    hashMap = f163951y;
                    bitmap = (android.graphics.Bitmap) hashMap.get(str2);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("TwistRoateCardsView", "setCardBackgroundImg, exp=" + th6.toString());
                }
                if (bitmap != null) {
                    com.tencent.mars.xlog.Log.i("TwistRoateCardsView", "setCardBackgroundImg, hit memCache");
                    imageView.setImageBitmap(bitmap);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                } else {
                    java.lang.String l17 = za4.t0.l("adId", str2);
                    if (com.tencent.mm.vfs.w6.j(l17) && (L = com.tencent.mm.sdk.platformtools.x.L(l17, i29, i37)) != null && !L.isRecycled()) {
                        com.tencent.mars.xlog.Log.i("TwistRoateCardsView", "setCardBackgroundImg, hit diskCache");
                        imageView.setImageBitmap(L);
                        hashMap.put(str2, L);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                    }
                    com.tencent.mars.xlog.Log.i("TwistRoateCardsView", "setCardBackgroundImg, download img");
                    a84.z.c(str2, imageView);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBackgroundImg", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
                }
            }
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f163952d);
            frameLayout.addView(imageView);
            frameLayout.setBackgroundResource(com.tencent.mm.R.drawable.brp);
            int i38 = this.f163956h;
            int i39 = this.f163958m * 2;
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i38 + i39, this.f163957i + i39));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            addView(frameLayout);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f163968w = 0;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(1500L);
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(this.f163963r ? -180.0f : 180.0f, 0.0f);
        ofFloat2.setDuration(1500L);
        ofFloat2.addUpdateListener(new e94.z(this));
        ofFloat2.addListener(new e94.a0(this));
        android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.3f, 1.0f);
        ofFloat3.setDuration(1500L);
        ofFloat3.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofFloat3.addUpdateListener(new e94.b0(this));
        ofFloat2.start();
        ofFloat3.start();
        ofFloat.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        canvas.save();
        canvas.rotate(this.f163960o, this.f163953e, this.f163954f);
        float f17 = this.f163961p;
        canvas.scale(f17, f17, this.f163953e, this.f163954f);
        super.dispatchDraw(canvas);
        canvas.restore();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int cos;
        int sin;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        if (getWidth() > 0 && getHeight() > 0) {
            this.f163953e = getWidth() / 2;
            this.f163954f = getHeight() + i65.a.b(this.f163952d, 40);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            if (getChildCount() != 12) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            } else {
                for (int i28 = 0; i28 < 12; i28++) {
                    android.view.View childAt = getChildAt(i28);
                    if (this.f163963r) {
                        double d17 = i28 * 0.5235987755982988d;
                        cos = (int) (this.f163955g * java.lang.Math.cos(d17));
                        sin = (int) (this.f163955g * java.lang.Math.sin(d17));
                        childAt.setRotation(90 - ((i28 * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / 12));
                    } else {
                        double d18 = (-i28) * 0.5235987755982988d;
                        cos = (int) (this.f163955g * java.lang.Math.cos(d18));
                        sin = (int) (this.f163955g * java.lang.Math.sin(d18));
                        childAt.setRotation(((i28 * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) / 12) + 90);
                    }
                    int i29 = this.f163953e + cos;
                    int i37 = this.f163954f - sin;
                    int i38 = this.f163956h;
                    int i39 = this.f163958m * 2;
                    int i47 = (i38 + i39) / 2;
                    int i48 = (this.f163957i + i39) / 2;
                    childAt.layout(i29 - i47, i37 - i48, i29 + i47, i37 + i48);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    public void setAnimCardView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f163962q = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }

    public void setOnCardAnimListener(e94.f0 f0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        this.f163969x = f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
    }
}
