package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class o implements za4.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f164517a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f164518b;

    /* renamed from: c, reason: collision with root package name */
    public final int f164519c;

    /* renamed from: d, reason: collision with root package name */
    public final int f164520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164521e;

    public o(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy, java.lang.String str, java.lang.String str2, boolean z17, int i17, int i18) {
        this.f164521e = adLandingPagesProxy;
        this.f164518b = str2;
        this.f164517a = str;
        this.f164519c = i17;
        this.f164520d = i18;
    }

    @Override // za4.h
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPkgRemoved", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "pkg %s removed", str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals(this.f164518b)) {
            this.f164521e.deleteDeferredDeepLinkMM(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPkgRemoved", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback");
    }

    @Override // za4.h
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPkgInstalled", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "pkg %s installed", str);
        za4.k g17 = za4.k.g();
        java.lang.String str2 = this.f164517a;
        g17.s(5, str2);
        za4.k.g().q(4001011, str2, new za4.g(this.f164519c));
        a44.m.a(this.f164520d, 106);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPkgInstalled", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$ApkInstallCallback");
    }
}
