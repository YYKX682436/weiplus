package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class i8 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {
    public boolean A;
    public boolean B;
    public final com.tencent.mm.sdk.platformtools.n3 C;
    public final jb4.c0 D;
    public boolean E;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView f165261s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ProgressBar f165262t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f165263u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f165264v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f165265w;

    /* renamed from: x, reason: collision with root package name */
    public jb4.v f165266x;

    /* renamed from: y, reason: collision with root package name */
    public final android.content.Context f165267y;

    /* renamed from: z, reason: collision with root package name */
    public int f165268z;

    public i8(android.content.Context context, ab4.y yVar, android.view.ViewGroup viewGroup) {
        super(context, yVar, viewGroup);
        this.f165265w = true;
        this.A = false;
        this.B = false;
        this.C = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c8(this, android.os.Looper.getMainLooper());
        this.D = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h8(this);
        this.E = true;
        this.f165267y = context;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public boolean D(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        if (!super.D(jSONObject)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "setComponentKVReportData super failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            return false;
        }
        try {
            jSONObject.put("panCount", this.f165268z);
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "setComponentKVReportData json=" + jSONObject.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "setComponentKVReportData exp=" + e17.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        android.view.ViewGroup.LayoutParams layoutParams = this.f165056n.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int) O().f2821h, (int) O().f2819f, (int) O().f2822i, (int) O().f2820g);
            this.f165056n.setLayoutParams(marginLayoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        super.K();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "viewWillAppear, isFirstApper=" + this.E);
        if (this.E) {
            this.E = false;
        } else {
            this.f165261s.setSensorEnabled(true);
            if (!this.B) {
                P("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_half");
                this.B = true;
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.C;
            n3Var.removeMessages(1);
            n3Var.sendEmptyMessageDelayed(1, 3000L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        super.L();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "viewWillDestroy, disable sensor");
        this.f165261s.setSensorEnabled(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        super.M();
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "viewWillDisappear, disable sensor");
        this.f165261s.setSensorEnabled(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }

    public ab4.y O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        ab4.y yVar = (ab4.y) this.f165050e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        return yVar;
    }

    public void P(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyNextPageBtnStateChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        b4.d.a(this.f165267y).c(new android.content.Intent(str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyNextPageBtnStateChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        this.f165261s = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView) this.f165056n.findViewById(com.tencent.mm.R.id.ney);
        this.f165262t = (android.widget.ProgressBar) this.f165056n.findViewById(com.tencent.mm.R.id.lc6);
        this.f165263u = this.f165056n.findViewById(com.tencent.mm.R.id.o_j);
        this.f165264v = (android.widget.ImageView) this.f165056n.findViewById(com.tencent.mm.R.id.f485861jc5);
        this.f165261s.setEventListener(this.D);
        this.f165261s.i(2.0f, 30.0f, -4.0f);
        this.f165261s.setTouchSensitivity(0.35f);
        this.f165261s.setSensorEnabled(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "createView, hash=" + this.f165261s.hashCode());
        this.f165261s.setTouchEnabled(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "disable touch init");
        jb4.v vVar = new jb4.v();
        this.f165266x = vVar;
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b8 b8Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b8(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        vVar.f298852a = b8Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        int i17 = this.f165059q;
        int i18 = this.f165058p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "fillItem exp=" + e17.toString());
        }
        if (this.f165056n != null && this.f165261s != null && this.f165262t != null) {
            if (O() == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "fillItem, getInfo==null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                return;
            }
            java.lang.String str = O().sphereImageUrl;
            java.lang.String str2 = O().G;
            float f17 = O().f2830t;
            float f18 = O().f2829s;
            O().getClass();
            this.A = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "fillItem， server.w=" + f18 + ", h=" + f17 + ", screen.w=" + i18 + ", h=" + i17);
            android.view.ViewGroup.LayoutParams layoutParams = this.f165261s.getLayoutParams();
            if (f17 == 0.0f || f18 == 0.0f) {
                layoutParams.width = i18;
                layoutParams.height = i17;
                this.A = true;
            } else {
                float f19 = (i18 - ((int) O().f2821h)) - ((int) O().f2822i);
                if (f18 >= f19) {
                    f18 = f19;
                }
                float f27 = (O().f2830t * f18) / O().f2829s;
                int i19 = (int) f18;
                layoutParams.width = i19;
                int i27 = (int) f27;
                layoutParams.height = i27;
                if (i19 >= i18 && i27 >= i17) {
                    this.A = true;
                }
            }
            this.f165261s.setLayoutParams(layoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = this.f165264v.getLayoutParams();
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = layoutParams.height;
            this.f165264v.setLayoutParams(layoutParams2);
            if (str2 != null && str2.length() > 0) {
                try {
                    this.f165056n.setBackgroundColor(android.graphics.Color.parseColor(str2));
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "parseColor exp:" + e18.toString());
                }
            }
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "fillItem, imageUrl is empty");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "fillItem, loadImage isFullScreen=" + this.A);
            this.f165266x.e(str, layoutParams.width, layoutParams.height, "scene_ad_landing");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Sns.SphereImageView.AdLandingPageSphereImageComponent", "fillItem, view==null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSphereImageComponent");
        return com.tencent.mm.R.layout.cpz;
    }
}
