package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsAdCardVideoEndView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.qa f170784d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f170785e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f170786f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f170787g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f170788h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f170789i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f170790m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f170791n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f170792o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f170793p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f170794q;

    /* renamed from: r, reason: collision with root package name */
    public int f170795r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f170796s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f170797t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f170798u;

    /* renamed from: v, reason: collision with root package name */
    public long f170799v;

    public SnsAdCardVideoEndView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f170796s = "";
        this.f170797t = null;
        this.f170798u = false;
        this.f170799v = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cty, this);
        this.f170785e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485861jc5);
        this.f170786f = findViewById(com.tencent.mm.R.id.or9);
        this.f170787g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ora);
        this.f170788h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.or8);
        this.f170789i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.or_);
        this.f170790m = findViewById(com.tencent.mm.R.id.hax);
        this.f170791n = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.haw);
        this.f170792o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hav);
        this.f170793p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hay);
        this.f170794q = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.cl6);
        this.f170785e.setBackgroundColor(android.graphics.Color.parseColor("#7f000000"));
        ca4.m0.y0(this.f170787g, com.tencent.mm.R.dimen.a_p);
        ca4.m0.y0(this.f170788h, com.tencent.mm.R.dimen.a_m);
        ca4.m0.y0(this.f170789i, com.tencent.mm.R.dimen.a_o);
        ca4.m0.y0(this.f170792o, com.tencent.mm.R.dimen.a_n);
        ca4.m0.y0(this.f170793p, com.tencent.mm.R.dimen.a_o);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public static void e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportVideoEndViewClick", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("SnsAdCardVideoEndView", "reportVideoEndViewClick snsInfo==null, scene=" + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideoEndViewClick", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("clickCount", 1);
            jSONObject2.put("type", 4);
            java.lang.String uxinfo = snsInfo.getUxinfo();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (uxinfo == null) {
                uxinfo = "";
            }
            jSONObject.put("extInfo", jSONObject2);
            jSONObject.put("uxinfo", uxinfo);
            jSONObject.put("snsid", snsInfo.field_snsId);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
            java.lang.String jSONObject3 = jSONObject.toString();
            ca4.m0.a("17539", jSONObject3);
            com.tencent.mars.xlog.Log.i("SnsAdCardVideoEndView", "reportVideoEndViewClick 17539, content=" + jSONObject3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsAdCardVideoEndView", "reportVideoEndViewClick exp:" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideoEndViewClick", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public boolean a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        java.lang.String snsId = snsInfo.getSnsId();
        if (!android.text.TextUtils.isEmpty(this.f170796s) && this.f170796s.equals(snsId)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return false;
        }
        com.tencent.mars.xlog.Log.i("SnsAdCardVideoEndView", "checkSnsId changed, old=" + this.f170796s + ", new=" + snsId);
        this.f170799v = 0L;
        c(false);
        this.f170796s = snsId;
        this.f170797t = snsInfo;
        this.f170798u = false;
        setBackgroundDrawable(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        return true;
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReportExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        if (this.f170797t != null && this.f170784d != null && this.f170799v > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f170799v;
            float f17 = (float) (currentTimeMillis - j17);
            int i17 = this.f170784d.f170336d;
            if (f17 > i17) {
                f17 = i17;
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f170797t;
            float f18 = f17 / 1000.0f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportVideoEndViewExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            if (snsInfo == null) {
                com.tencent.mars.xlog.Log.e("SnsAdCardVideoEndView", "reportVideoEndViewExpouse snsInfo==null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideoEndViewExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            } else {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("exposureDuration", f18);
                    jSONObject2.put("startTimestamp", j17);
                    jSONObject2.put("type", 5);
                    java.lang.String uxinfo = snsInfo.getUxinfo();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (uxinfo == null) {
                        uxinfo = "";
                    }
                    jSONObject.put("extInfo", jSONObject2);
                    jSONObject.put("uxinfo", uxinfo);
                    jSONObject.put("snsid", snsInfo.field_snsId);
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f170795r);
                    java.lang.String jSONObject3 = jSONObject.toString();
                    ca4.m0.a("17539", jSONObject3);
                    com.tencent.mars.xlog.Log.i("SnsAdCardVideoEndView", "reportVideoEndViewExpouse 17539, content=" + jSONObject3);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("SnsAdCardVideoEndView", "reportVideoEndViewExpouse exp:" + e17.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideoEndViewExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            }
            this.f170799v = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReportExpouse", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public void c(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        com.tencent.mars.xlog.Log.i("SnsAdCardVideoEndView", "hide, anim=" + z17);
        if (getVisibility() == 0) {
            b();
        }
        if (!z17) {
            setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(250L);
        alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.sns.ui.widget.i0(this));
        startAnimation(alphaAnimation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        com.tencent.mm.plugin.sns.ui.qa qaVar = this.f170784d;
        if (qaVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        if (android.text.TextUtils.isEmpty(qaVar.f170333a)) {
            this.f170792o.setText(this.f170784d.f170334b);
            this.f170793p.setText(this.f170784d.f170335c);
            if (!android.text.TextUtils.isEmpty(this.f170784d.titleImgUrl)) {
                a84.m.a(this.f170784d.titleImgUrl, this.f170791n);
            }
            android.view.View view = this.f170786f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f170790m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f170787g.setText(this.f170784d.f170333a);
            this.f170788h.setText(this.f170784d.f170334b);
            this.f170789i.setText(this.f170784d.f170335c);
            android.view.View view3 = this.f170786f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f170790m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/widget/SnsAdCardVideoEndView", "refreshUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (android.text.TextUtils.isEmpty(this.f170784d.coverImgUrl)) {
            this.f170794q.setVisibility(8);
        } else {
            this.f170794q.setVisibility(0);
            a84.m.a(this.f170784d.coverImgUrl, this.f170794q);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public void f(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        com.tencent.mars.xlog.Log.i("SnsAdCardVideoEndView", "show, anim=" + z17);
        this.f170799v = java.lang.System.currentTimeMillis();
        if (!z17) {
            setVisibility(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setStartOffset(100L);
        alphaAnimation.setDuration(300L);
        setVisibility(0);
        startAnimation(alphaAnimation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("SnsAdCardVideoEndView", "onAttachedToWindow");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        super.onDetachedFromWindow();
        if (getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("SnsAdCardVideoEndView", "onDetachedFromWindow");
            b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }

    public void setBlurBkg(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBlurBkg", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        try {
        } catch (java.lang.Throwable th6) {
            th = th6;
            str = "setBlurBkg";
        }
        if (this.f170798u) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBlurBkg", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.graphics.Bitmap bitmap = view instanceof com.tencent.mm.ui.base.MMTextureView ? ((com.tencent.mm.ui.base.MMTextureView) view).getBitmap() : view instanceof com.tencent.mm.plugin.thumbplayer.view.MMTextureView ? ((com.tencent.mm.plugin.thumbplayer.view.MMTextureView) view).getBitmap() : com.tencent.mm.sdk.platformtools.x.b0(view);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        int width = bitmap.getWidth() / 5;
        int height = bitmap.getHeight() / 5;
        android.graphics.Bitmap X = com.tencent.mm.sdk.platformtools.x.X(android.graphics.Bitmap.createScaledBitmap(bitmap, width, height, false), 20);
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(X));
        this.f170798u = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setBlurBkg, totalCost=");
        str = "setBlurBkg";
        try {
            sb6.append(currentTimeMillis3 - currentTimeMillis);
            sb6.append(", captureCost=");
            sb6.append(currentTimeMillis2 - currentTimeMillis);
            sb6.append(", blurCost=");
            sb6.append(currentTimeMillis3 - currentTimeMillis2);
            sb6.append(", w=");
            sb6.append(width);
            sb6.append(", h=");
            sb6.append(height);
            com.tencent.mars.xlog.Log.i("SnsAdCardVideoEndView", sb6.toString());
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.tencent.mars.xlog.Log.e("SnsAdCardVideoEndView", "setBlurBkg, exp=" + th.toString());
            this.f170798u = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
    }
}
