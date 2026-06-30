package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class o0 implements com.tencent.mm.plugin.lite.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f144145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f144148e;

    public o0(java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.String str3, java.util.Map map2) {
        this.f144144a = str;
        this.f144145b = map;
        this.f144146c = str2;
        this.f144147d = str3;
        this.f144148e = map2;
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void fail(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MMWxaLiteAppCenter", "triggerLiteAppEvent::checkLiteAppAndGetPath check fail, errCode: %d.", java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.lite.api.h
    public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
        java.lang.String str = this.f144144a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWxaLiteAppCenter", "triggerLiteAppEvent::checkLiteAppAndGetPath check success. targetAppId: %s.", str);
        java.lang.String str2 = wxaLiteAppInfo.appId;
        java.util.Map map = this.f144145b;
        map.put("appId", str2);
        map.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, wxaLiteAppInfo.path);
        map.put("signatureKey", wxaLiteAppInfo.signatureKey);
        com.tencent.mm.plugin.lite.LiteAppCenter.triggerLiteAppEvent(this.f144146c, str, this.f144147d, this.f144148e, map);
    }
}
