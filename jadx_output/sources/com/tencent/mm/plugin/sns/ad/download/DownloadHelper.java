package com.tencent.mm.plugin.sns.ad.download;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/download/DownloadHelper;", "Lj44/a;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onUIPause", "onUIDestroy", "Landroid/content/Context;", "mContext", "Lh44/b;", "mDownloadParams", "Lya2/n1;", "mHalfScreenListener", "Lw64/k;", "mAdClickActionStateChangeListener", "Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;", "mAdClickActionInfo", "<init>", "(Landroid/content/Context;Lh44/b;Lya2/n1;Lw64/k;Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DownloadHelper implements j44.a, androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f162640d;

    /* renamed from: e, reason: collision with root package name */
    public final h44.b f162641e;

    /* renamed from: f, reason: collision with root package name */
    public final ya2.n1 f162642f;

    /* renamed from: g, reason: collision with root package name */
    public final w64.k f162643g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f162644h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f162645i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f162646m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f162647n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.y0 f162648o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f162649p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f162650q;

    /* renamed from: r, reason: collision with root package name */
    public int f162651r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f162652s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f162653t;

    /* renamed from: u, reason: collision with root package name */
    public final kotlinx.coroutines.r0 f162654u;

    public DownloadHelper(android.content.Context context, h44.b bVar, ya2.n1 n1Var, w64.k kVar, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        this.f162640d = context;
        this.f162641e = bVar;
        this.f162642f = n1Var;
        this.f162643g = kVar;
        this.f162644h = adClickActionInfo;
        this.f162645i = jz5.h.b(new a44.z(this));
        this.f162646m = jz5.h.b(new a44.a0(this));
        this.f162647n = jz5.h.b(a44.b0.f1246d);
        this.f162652s = kotlinx.coroutines.flow.r2.a(1, 0, u26.u.DROP_OLDEST);
        int i17 = kotlinx.coroutines.r0.N0;
        this.f162654u = new a44.d0(kotlinx.coroutines.q0.f310567d);
    }

    public static final /* synthetic */ kotlinx.coroutines.r0 b(com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getExceptionHandler$p", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        kotlinx.coroutines.r0 r0Var = downloadHelper.f162654u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getExceptionHandler$p", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        return r0Var;
    }

    public static final /* synthetic */ j44.j c(com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdDownloadAppHalfScreenHelper", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        j44.j h17 = downloadHelper.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdDownloadAppHalfScreenHelper", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        return h17;
    }

    public static final a44.o d(com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMDownloadCallback", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        downloadHelper.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDownloadCallback", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        a44.o oVar = (a44.o) ((jz5.n) downloadHelper.f162646m).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDownloadCallback", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMDownloadCallback", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        return oVar;
    }

    public static final /* synthetic */ h44.b e(com.tencent.mm.plugin.sns.ad.download.DownloadHelper downloadHelper) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMDownloadParams$p", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        h44.b bVar = downloadHelper.f162641e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMDownloadParams$p", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        return bVar;
    }

    public final void f() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doExternalClick", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        h44.b bVar = this.f162641e;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "doClick, mDownloadParams is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doExternalClick", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            return;
        }
        java.lang.String b17 = bVar.b();
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            com.tencent.mars.xlog.Log.e(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "doClick, appId is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doExternalClick", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            return;
        }
        k44.g d17 = bVar.d();
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "doClick, downloadInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doExternalClick", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            return;
        }
        int i17 = kotlin.jvm.internal.o.b(bVar.j(), java.lang.Boolean.TRUE) ? 1 : 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String str2 = bVar.f278922k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String h17 = bVar.h();
        java.lang.String i18 = bVar.i();
        java.lang.String a17 = bVar.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        java.lang.String str3 = bVar.f278924m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3(str2, h17, i18, "", 0, a17, str3, i17, 5, 1);
        ca4.d dVar = new ca4.d(i18, "", 0, a17, str2, h17, str3);
        j44.j h18 = h();
        h18.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHalfScreenBtnClickListener", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        h18.f297703u = this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfScreenBtnClickListener", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        j44.j h19 = h();
        h19.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        h19.f297704v = new ca4.d(dVar.f39851a, dVar.f39852b, 0, dVar.f39854d, dVar.f39856f, dVar.f39857g, dVar.f39858h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initAdConversionOnlineParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        j44.j h27 = h();
        h27.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdDownloadParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        h27.f297702t = bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdDownloadParams", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        java.lang.Integer e17 = bVar.e();
        int intValue = e17 != null ? e17.intValue() : 0;
        if (intValue == 4) {
            j3Var.f165287p = 5;
        }
        yb0.a aVar = yb0.a.f460612a;
        k44.g d18 = bVar.d();
        if (d18 == null || (str = d18.b()) == null) {
            str = "";
        }
        java.lang.String h28 = bVar.h();
        aVar.a(str, h28 != null ? h28 : "");
        kotlinx.coroutines.y0 y0Var = this.f162648o;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        kotlinx.coroutines.y0 b18 = kotlinx.coroutines.z0.b();
        this.f162648o = b18;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b18, kotlinx.coroutines.internal.b0.f310484a.plus(this.f162654u), null, new a44.w(this, j3Var, dVar, intValue, i17, b17, d17, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doExternalClick", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
    }

    public final int g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExternalClickDownloadStatus", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        int i17 = this.f162651r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExternalClickDownloadStatus", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        return i17;
    }

    public final j44.j h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAdDownloadAppHalfScreenHelper", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        j44.j jVar = (j44.j) ((jz5.n) this.f162645i).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAdDownloadAppHalfScreenHelper", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        return jVar;
    }

    public final android.content.Context i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContext", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContext", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        return this.f162640d;
    }

    public final ku5.f j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMDownloadExecutorService", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        ku5.f fVar = (ku5.f) ((jz5.n) this.f162647n).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMDownloadExecutorService", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        return fVar;
    }

    public final com.tencent.mm.ui.widget.dialog.u3 k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProgressDialog", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f162649p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProgressDialog", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        return u3Var;
    }

    public void l(boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHalfScreenBtnClick", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doHalfScreenClick", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        h44.b bVar = this.f162641e;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "doClick, mDownloadParams is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHalfScreenClick", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            java.lang.String b17 = bVar.b();
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                com.tencent.mars.xlog.Log.e(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "doClick, appId is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHalfScreenClick", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                k44.g d17 = bVar.d();
                if (d17 == null) {
                    com.tencent.mars.xlog.Log.e(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "doClick, downloadInfo is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHalfScreenClick", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
                } else {
                    int i17 = kotlin.jvm.internal.o.b(bVar.j(), java.lang.Boolean.TRUE) ? 1 : 2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
                    java.lang.String str2 = bVar.f278922k;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
                    java.lang.String h17 = bVar.h();
                    java.lang.String i18 = bVar.i();
                    java.lang.String a17 = bVar.a();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
                    java.lang.String str3 = bVar.f278924m;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPId", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdDownloadParams");
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3(str2, h17, i18, "", 0, a17, str3, i17, 5, 3);
                    java.lang.Integer e17 = bVar.e();
                    int intValue = e17 != null ? e17.intValue() : 0;
                    if (intValue == 4) {
                        j3Var.f165287p = 4;
                    }
                    yb0.a aVar = yb0.a.f460612a;
                    k44.g d18 = bVar.d();
                    if (d18 == null || (str = d18.b()) == null) {
                        str = "";
                    }
                    java.lang.String h18 = bVar.h();
                    aVar.a(str, h18 != null ? h18 : "");
                    kotlinx.coroutines.y0 y0Var = this.f162648o;
                    if (y0Var != null) {
                        kotlinx.coroutines.z0.c(y0Var, null);
                    }
                    kotlinx.coroutines.y0 b18 = kotlinx.coroutines.z0.b();
                    this.f162648o = b18;
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    kotlinx.coroutines.l.d(b18, kotlinx.coroutines.internal.b0.f310484a.plus(this.f162654u), null, new a44.y(this, j3Var, b17, i17, intValue, z17, d17, null), 2, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHalfScreenClick", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHalfScreenBtnClick", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
    }

    public final void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshActionBtnUI", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        w64.k kVar = this.f162643g;
        if (kVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshActionBtnUI", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            return;
        }
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f162644h;
        if (adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshActionBtnUI", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        } else {
            kVar.a(adClickActionInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshActionBtnUI", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onUIDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "onDestroy and unInitDownloadHandlerThread");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unInitDownloadHandlerThread", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        j().shutdown();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unInitDownloadHandlerThread", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeObserver", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        java.lang.Object obj = this.f162640d;
        if (obj instanceof androidx.lifecycle.y) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            ((androidx.lifecycle.y) obj).mo133getLifecycle().c(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeObserver", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public final void onUIPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
        h().l();
        com.tencent.mars.xlog.Log.i(com.tencent.tmassistantsdk.downloadservice.DownloadHelper.TAG, "onUIPause");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
    }

    public /* synthetic */ DownloadHelper(android.content.Context context, h44.b bVar, ya2.n1 n1Var, w64.k kVar, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, int i17, kotlin.jvm.internal.i iVar) {
        this(context, bVar, (i17 & 4) != 0 ? null : n1Var, (i17 & 8) != 0 ? null : kVar, (i17 & 16) != 0 ? null : adClickActionInfo);
    }
}
