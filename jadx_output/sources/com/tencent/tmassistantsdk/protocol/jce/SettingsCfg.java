package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes13.dex */
public final class SettingsCfg extends com.qq.taf.jce.JceStruct implements java.lang.Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "SettingsCfg";
    static byte[] cache_cfg;
    public byte[] cfg;
    public long revision;
    public byte type;

    public SettingsCfg() {
        this.type = (byte) 0;
        this.cfg = null;
        this.revision = 0L;
    }

    public java.lang.String className() {
        return "jce.SettingsCfg";
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
        jceDisplayer.display(this.type, "type");
        jceDisplayer.display(this.cfg, "cfg");
        jceDisplayer.display(this.revision, "revision");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.JceDisplayer jceDisplayer = new com.qq.taf.jce.JceDisplayer(sb6, i17);
        jceDisplayer.displaySimple(this.type, true);
        jceDisplayer.displaySimple(this.cfg, true);
        jceDisplayer.displaySimple(this.revision, false);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.tmassistantsdk.protocol.jce.SettingsCfg settingsCfg = (com.tencent.tmassistantsdk.protocol.jce.SettingsCfg) obj;
        return com.qq.taf.jce.JceUtil.equals(this.type, settingsCfg.type) && com.qq.taf.jce.JceUtil.equals(this.cfg, settingsCfg.cfg) && com.qq.taf.jce.JceUtil.equals(this.revision, settingsCfg.revision);
    }

    public java.lang.String fullClassName() {
        return TAG;
    }

    public byte[] getCfg() {
        return this.cfg;
    }

    public long getRevision() {
        return this.revision;
    }

    public byte getType() {
        return this.type;
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
        this.type = jceInputStream.read(this.type, 0, true);
        if (cache_cfg == null) {
            cache_cfg = r0;
            byte[] bArr = {0};
        }
        this.cfg = jceInputStream.read(cache_cfg, 1, true);
        this.revision = jceInputStream.read(this.revision, 2, false);
    }

    public void setCfg(byte[] bArr) {
        this.cfg = bArr;
    }

    public void setRevision(long j17) {
        this.revision = j17;
    }

    public void setType(byte b17) {
        this.type = b17;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(com.qq.taf.jce.JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.type, 0);
        jceOutputStream.write(this.cfg, 1);
        jceOutputStream.write(this.revision, 2);
    }

    public SettingsCfg(byte b17, byte[] bArr, long j17) {
        this.type = b17;
        this.cfg = bArr;
        this.revision = j17;
    }
}
