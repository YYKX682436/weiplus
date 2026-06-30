package com.tencent.mm.plugin.lite.storage;

/* loaded from: classes13.dex */
public class h extends com.tencent.mm.plugin.lite.storage.b {
    public static final l75.e0 H = com.tencent.mm.plugin.lite.storage.b.initAutoDBInfo(com.tencent.mm.plugin.lite.storage.h.class);

    @Override // com.tencent.mm.plugin.lite.storage.b, l75.f0
    public l75.e0 getDBInfo() {
        return null;
    }

    public com.tencent.liteapp.storage.WxaLiteAppBaselibInfo t0() {
        com.tencent.liteapp.storage.WxaLiteAppBaselibInfo wxaLiteAppBaselibInfo = new com.tencent.liteapp.storage.WxaLiteAppBaselibInfo();
        wxaLiteAppBaselibInfo.majorVersion = this.field_majorVersion;
        wxaLiteAppBaselibInfo.path = this.field_pkgPath;
        wxaLiteAppBaselibInfo.signatureKey = this.field_signatureKey;
        wxaLiteAppBaselibInfo.updateTime = this.field_updateTime;
        wxaLiteAppBaselibInfo.patchId = this.field_patchId;
        wxaLiteAppBaselibInfo.url = this.field_url;
        wxaLiteAppBaselibInfo.f46017md5 = this.field_md5;
        wxaLiteAppBaselibInfo.lastUseTime = this.field_lastUseTime;
        wxaLiteAppBaselibInfo.type = this.field_pkgType;
        wxaLiteAppBaselibInfo.iLinkVersion = this.field_iLinkVersion;
        wxaLiteAppBaselibInfo.version = this.field_version;
        return wxaLiteAppBaselibInfo;
    }
}
