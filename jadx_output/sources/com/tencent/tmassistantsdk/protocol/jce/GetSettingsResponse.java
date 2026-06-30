package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class GetSettingsResponse extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "GetSettingsResponse";
    static java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.SettingsCfg> cache_settings;
    public int ret;
    public java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.SettingsCfg> settings;

    public GetSettingsResponse() {
        this.ret = 0;
        this.settings = null;
    }

    public java.lang.String className() {
        return "jce.GetSettingsResponse";
    }

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public void display(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.display(this.ret, "ret");
        jceDisplayer.display((java.util.Collection) this.settings, "settings");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.displaySimple(this.ret, true);
        jceDisplayer.displaySimple((java.util.Collection) this.settings, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.tmassistantsdk.protocol.jce.GetSettingsResponse getSettingsResponse = (com.tencent.tmassistantsdk.protocol.jce.GetSettingsResponse) obj;
        return com.qq.taf.jce.JceUtil.equals(this.ret, getSettingsResponse.ret) && com.qq.taf.jce.JceUtil.equals(this.settings, getSettingsResponse.settings);
    }

    public java.lang.String fullClassName() {
        return TAG;
    }

    public int getRet() {
        return this.ret;
    }

    public java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.SettingsCfg> getSettings() {
        return this.settings;
    }

    public int hashCode() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(com.qq.taf.jce.JceInputStream jceInputStream) {
        this.ret = jceInputStream.read(this.ret, 0, true);
        if (cache_settings == null) {
            cache_settings = new java.util.ArrayList<>();
            cache_settings.add(new com.tencent.tmassistantsdk.protocol.jce.SettingsCfg());
        }
        this.settings = (java.util.ArrayList) jceInputStream.read((com.qq.taf.jce.JceInputStream) cache_settings, 1, false);
    }

    public void setRet(int i17) {
        this.ret = i17;
    }

    public void setSettings(java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.SettingsCfg> arrayList) {
        this.settings = arrayList;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.ret, 0);
        java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.SettingsCfg> arrayList = this.settings;
        if (arrayList != null) {
            jceOutputStream.write((java.util.Collection) arrayList, 1);
        }
    }

    public GetSettingsResponse(int i17, java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.SettingsCfg> arrayList) {
        this.ret = i17;
        this.settings = arrayList;
    }
}
