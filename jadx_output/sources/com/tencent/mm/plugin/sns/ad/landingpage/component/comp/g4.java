package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class g4 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {
    public android.widget.FrameLayout A;
    public android.widget.LinearLayout B;
    public android.widget.TextView C;
    public int D;
    public android.graphics.Bitmap E;
    public final android.view.ViewOutlineProvider F;
    public final java.util.Map G;
    public boolean H;
    public final android.os.Handler I;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f162830s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f162831t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f162832u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f162833v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f162834w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f162835x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f162836y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f162837z;

    public g4(android.content.Context context, f54.g0 g0Var, android.view.ViewGroup viewGroup) {
        super(context, g0Var, viewGroup);
        this.D = 1;
        this.F = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.c4(this);
        this.G = new java.util.HashMap();
        this.H = true;
        this.I = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f4(this);
        com.tencent.mars.xlog.Log.i("AdLandingSocialCardComponent", "hash=" + hashCode() + ", info=" + g0Var.toString());
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        if (!super.D(jSONObject)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return false;
        }
        try {
            jSONObject.put("uiType", this.D);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return true;
        } catch (java.lang.Exception unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        android.view.ViewGroup.LayoutParams layoutParams = this.f165056n.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int) O().f2821h, (int) O().f2819f, (int) O().f2822i, (int) O().f2820g);
            this.f165056n.setLayoutParams(marginLayoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        super.M();
        this.I.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    public final f54.g0 O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        f54.g0 g0Var = (f54.g0) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        return g0Var;
    }

    public final void P(java.lang.String str, android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadAvatarByUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        com.tencent.mars.xlog.Log.i("AdLandingSocialCardComponent", "loadAvatarByUserName start, userName=" + str);
        imageView.setImageBitmap(this.E);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadAvatarByUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return;
        }
        imageView.setTag(str);
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e4(this, str, imageView));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadAvatarByUserName", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    public void R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDyncContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        com.tencent.mars.xlog.Log.i("AdLandingSocialCardComponent", "updateDyncContent");
        f54.g0 O = O();
        if (O == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDyncContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return;
        }
        this.f162830s.setText(O.F);
        this.f162831t.setText(O.G);
        this.f162832u.setText(O.H);
        this.f162833v.setText(O.I);
        this.f162837z.setText(O.f259721J);
        this.D = 1;
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b4(this, O));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDyncContent", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        this.f162830s = (android.widget.TextView) this.f165056n.findViewById(com.tencent.mm.R.id.ocz);
        this.f162831t = (android.widget.TextView) this.f165056n.findViewById(com.tencent.mm.R.id.ocv);
        this.f162832u = (android.widget.TextView) this.f165056n.findViewById(com.tencent.mm.R.id.od9);
        this.f162833v = (android.widget.TextView) this.f165056n.findViewById(com.tencent.mm.R.id.f484050cu2);
        this.f162834w = (android.widget.ImageView) this.f165056n.findViewById(com.tencent.mm.R.id.agc);
        this.f162835x = (android.widget.ImageView) this.f165056n.findViewById(com.tencent.mm.R.id.a_e);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f165056n.findViewById(com.tencent.mm.R.id.mkt);
        this.f162836y = imageView;
        imageView.setOutlineProvider(this.F);
        this.f162836y.setClipToOutline(true);
        this.f162837z = (android.widget.TextView) this.f165056n.findViewById(com.tencent.mm.R.id.a9y);
        this.A = (android.widget.FrameLayout) this.f165056n.findViewById(com.tencent.mm.R.id.f487155nq0);
        this.B = (android.widget.LinearLayout) this.f165056n.findViewById(com.tencent.mm.R.id.gea);
        this.C = (android.widget.TextView) this.f165056n.findViewById(com.tencent.mm.R.id.au6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDefaultAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        try {
            this.E = com.tencent.mm.sdk.platformtools.x.s0(com.tencent.mm.sdk.platformtools.j.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null)), false, r3.getWidth());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingSocialCardComponent", "initDefaultAvatar exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDefaultAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        if (this.f165056n == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return;
        }
        f54.g0 O = O();
        if (O == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            return;
        }
        a84.z.h(O.avatarBackgroundImg, this.f162835x);
        java.lang.String selfUserName = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getSelfUserName();
        com.tencent.mars.xlog.Log.i("AdLandingSocialCardComponent", "fillItem, selfUserName=" + selfUserName);
        P(selfUserName, this.f162836y);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        return com.tencent.mm.R.layout.cpy;
    }
}
