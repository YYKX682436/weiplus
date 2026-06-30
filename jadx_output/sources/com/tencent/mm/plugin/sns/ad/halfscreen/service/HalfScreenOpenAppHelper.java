package com.tencent.mm.plugin.sns.ad.halfscreen.service;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenOpenAppHelper;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onUIPause", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class HalfScreenOpenAppHelper implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f162680d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f162681e = "AdOpenAppHalfScreenHelper";

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f162682f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f162683g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f162684h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f162685i;

    /* renamed from: m, reason: collision with root package name */
    public h44.c f162686m;

    /* renamed from: n, reason: collision with root package name */
    public ca4.d f162687n;

    public HalfScreenOpenAppHelper(android.content.Context context) {
        this.f162680d = context;
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addObserver", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        java.lang.Object obj = this.f162680d;
        if (obj instanceof androidx.lifecycle.y) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            ((androidx.lifecycle.y) obj).mo133getLifecycle().a(this);
            com.tencent.mars.xlog.Log.i(i(), "addObserver");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addObserver", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }

    public final ca4.d b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        ca4.d dVar = this.f162687n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return dVar;
    }

    public abstract int c();

    public final h44.c d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAdOpenAppParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        h44.c cVar = this.f162686m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAdOpenAppParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return cVar;
    }

    public final com.tencent.mm.ui.widget.MMRoundCornerImageView e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f162682f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return mMRoundCornerImageView;
    }

    public final android.view.View f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContentView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        android.view.View view = this.f162685i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContentView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return view;
    }

    public final android.content.Context g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContext", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContext", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return this.f162680d;
    }

    public final android.widget.Button h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMOpenAppBtn", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        android.widget.Button button = this.f162684h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMOpenAppBtn", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return button;
    }

    public java.lang.String i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        return this.f162681e;
    }

    public abstract void j();

    public final void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        android.view.View inflate = android.view.LayoutInflater.from(this.f162680d).inflate(c(), (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f162682f = (com.tencent.mm.ui.widget.MMRoundCornerImageView) inflate.findViewById(com.tencent.mm.R.id.f483228a15);
        this.f162683g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.a1o);
        this.f162684h = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.kim);
        this.f162685i = inflate;
        l();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initContentView", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }

    public void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initOpenAppBtnClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        android.widget.Button button = this.f162684h;
        if (button != null) {
            button.setOnClickListener(new j44.k(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initOpenAppBtnClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }

    public void m(h44.c adOpenAppParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initParamsAndReport", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        kotlin.jvm.internal.o.g(adOpenAppParams, "adOpenAppParams");
        this.f162686m = adOpenAppParams;
        i64.p0 d17 = adOpenAppParams.d();
        if (d17 != null) {
            d17.f289280j = 106;
        }
        i64.p0 d18 = adOpenAppParams.d();
        java.lang.String str = d18 != null ? d18.f289271a : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        java.lang.String str2 = adOpenAppParams.f278926a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        i64.p0 d19 = adOpenAppParams.d();
        java.lang.String str3 = d19 != null ? d19.f289272b : null;
        i64.p0 d27 = adOpenAppParams.d();
        java.lang.String str4 = d27 != null ? d27.f289273c : null;
        i64.p0 d28 = adOpenAppParams.d();
        boolean z17 = false;
        ca4.c0.f(str, str2, 0, 2, str3, str4, d28 != null ? d28.f289274d : 0, 1);
        i64.p0 d29 = adOpenAppParams.d();
        java.lang.String str5 = d29 != null ? d29.f289272b : null;
        i64.p0 d37 = adOpenAppParams.d();
        java.lang.String str6 = d37 != null ? d37.f289275e : null;
        i64.p0 d38 = adOpenAppParams.d();
        int i17 = d38 != null ? d38.f289276f : 0;
        i64.p0 d39 = adOpenAppParams.d();
        java.lang.String str7 = d39 != null ? d39.f289273c : null;
        i64.p0 d47 = adOpenAppParams.d();
        java.lang.String str8 = d47 != null ? d47.f289277g : null;
        i64.p0 d48 = adOpenAppParams.d();
        java.lang.String str9 = d48 != null ? d48.f289278h : null;
        i64.p0 d49 = adOpenAppParams.d();
        ca4.d dVar = new ca4.d(str5, str6, i17, str7, str8, str9, d49 != null ? d49.f289279i : null);
        this.f162687n = dVar;
        dVar.c(106);
        i64.p0 d57 = adOpenAppParams.d();
        if (d57 != null && d57.f289274d == 1) {
            z17 = true;
        }
        if (z17) {
            ca4.d dVar2 = this.f162687n;
            if (dVar2 != null) {
                dVar2.b(4);
            }
        } else {
            ca4.d dVar3 = this.f162687n;
            if (dVar3 != null) {
                dVar3.b(1);
            }
        }
        l44.z.k(this.f162687n);
        l44.z.j(this.f162687n);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initParamsAndReport", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }

    public void n() {
        java.lang.String str;
        java.lang.String str2;
        android.widget.Button button;
        k44.h b17;
        k44.h b18;
        android.widget.TextView textView;
        k44.h b19;
        k44.h b27;
        java.lang.String str3;
        k44.h b28;
        k44.h b29;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        h44.c cVar = this.f162686m;
        java.lang.String str4 = null;
        if (cVar == null || (b29 = cVar.b()) == null) {
            str = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            str = b29.f304086a;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            h44.c cVar2 = this.f162686m;
            if (cVar2 == null || (b28 = cVar2.b()) == null) {
                str3 = null;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppIcon", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
                str3 = b28.f304086a;
            }
            a84.z.c(str3, this.f162682f);
        }
        h44.c cVar3 = this.f162686m;
        if (!com.tencent.mm.sdk.platformtools.t8.K0((cVar3 == null || (b27 = cVar3.b()) == null) ? null : b27.a()) && (textView = this.f162683g) != null) {
            h44.c cVar4 = this.f162686m;
            textView.setText((cVar4 == null || (b19 = cVar4.b()) == null) ? null : b19.a());
        }
        h44.c cVar5 = this.f162686m;
        if (cVar5 == null || (b18 = cVar5.b()) == null) {
            str2 = null;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
            str2 = b18.f304088c;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (button = this.f162684h) != null) {
            h44.c cVar6 = this.f162686m;
            if (cVar6 != null && (b17 = cVar6.b()) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBtnTitle", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppHalfScreenInfo");
                str4 = b17.f304088c;
            }
            button.setText(str4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }

    public final void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeObserver", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        java.lang.Object obj = this.f162680d;
        if (obj instanceof androidx.lifecycle.y) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            ((androidx.lifecycle.y) obj).mo133getLifecycle().c(this);
            com.tencent.mars.xlog.Log.i(i(), "removeObserver");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeObserver", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public final void onUIPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
        j();
        com.tencent.mars.xlog.Log.i(i(), "onUIPause");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenOpenAppHelper");
    }
}
