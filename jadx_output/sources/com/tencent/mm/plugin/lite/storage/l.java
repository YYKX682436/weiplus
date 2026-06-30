package com.tencent.mm.plugin.lite.storage;

/* loaded from: classes13.dex */
public class l extends com.tencent.mm.plugin.lite.storage.d {
    public static final l75.e0 L = com.tencent.mm.plugin.lite.storage.d.initAutoDBInfo(com.tencent.mm.plugin.lite.storage.l.class);

    @Override // com.tencent.mm.plugin.lite.storage.d, l75.f0
    public l75.e0 getDBInfo() {
        return null;
    }

    public com.tencent.liteapp.storage.WxaLiteAppInfo t0() {
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = new com.tencent.liteapp.storage.WxaLiteAppInfo();
        wxaLiteAppInfo.appId = this.field_appId;
        wxaLiteAppInfo.path = this.field_pkgPath;
        wxaLiteAppInfo.signatureKey = this.field_signatureKey;
        wxaLiteAppInfo.updateTime = this.field_updateTime;
        wxaLiteAppInfo.patchId = this.field_patchId;
        wxaLiteAppInfo.url = this.field_url;
        wxaLiteAppInfo.f46019md5 = this.field_md5;
        wxaLiteAppInfo.lastUseTime = this.field_lastUseTime;
        wxaLiteAppInfo.groupId = this.field_groupId;
        wxaLiteAppInfo.type = this.field_pkgType;
        wxaLiteAppInfo.iLinkVersion = this.field_iLinkVersion;
        wxaLiteAppInfo.version = this.field_version;
        java.lang.String str = this.field_openOption;
        if (str != null && !str.isEmpty()) {
            try {
                wxaLiteAppInfo.openOption = new cl0.g(this.field_openOption);
            } catch (cl0.f e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppInfo", "json parse error: ", e17.toString());
            }
        }
        return wxaLiteAppInfo;
    }
}
