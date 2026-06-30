package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes15.dex */
public class s2 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f144057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f144058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f144059c;

    public s2(com.tencent.mm.plugin.lite.logic.u2 u2Var, java.lang.String[] strArr, int i17, double d17) {
        this.f144057a = strArr;
        this.f144058b = i17;
        this.f144059c = d17;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent liteAppPackageUpdateEvent = new com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent();
        am.ti tiVar = liteAppPackageUpdateEvent.f54470g;
        tiVar.f8013a = false;
        tiVar.f8014b = str;
        liteAppPackageUpdateEvent.e();
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", wxaLiteAppInfo.appId);
        java.lang.String[] strArr = this.f144057a;
        java.lang.String str = strArr[0];
        if (str != null) {
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str);
        }
        java.lang.String str2 = strArr[1];
        if (str2 != null) {
            bundle.putString("query", str2);
        }
        int i18 = this.f144058b;
        if (1 == i18) {
            bundle.putBoolean("isHalfScreen", true);
            double d17 = this.f144059c;
            if (d17 != 0.0d) {
                bundle.putDouble("heightPercent", d17);
            }
        }
        if (2 != i18) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.tencent.mm.sdk.platformtools.x2.f193071a, bundle, true, false, null);
        }
        com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent liteAppPackageUpdateEvent = new com.tencent.mm.autogen.events.LiteAppPackageUpdateEvent();
        am.ti tiVar = liteAppPackageUpdateEvent.f54470g;
        tiVar.f8013a = true;
        tiVar.f8014b = wxaLiteAppInfo.appId;
        tiVar.f8015c = wxaLiteAppInfo.path;
        tiVar.f8016d = wxaLiteAppInfo.version;
        liteAppPackageUpdateEvent.e();
    }
}
