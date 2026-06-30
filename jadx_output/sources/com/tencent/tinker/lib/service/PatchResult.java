package com.tencent.tinker.lib.service;

/* loaded from: classes13.dex */
public class PatchResult implements java.io.Serializable {
    public static final int PATCH_TYPE_BSDIFF = 0;
    public static final int PATCH_TYPE_CUSTOM = 1;
    public static final int PATCH_TYPE_UNKNOWN = -1;
    public long dexCostTime;
    public long dexoptTriggerTime;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Throwable f215545e;
    public boolean isOatGenerated;
    public boolean isSuccess;
    public java.lang.String patchVersion;
    public java.lang.String rawPatchFilePath;
    public long resCostTime;
    public long soCostTime;
    public long totalCostTime;
    public int type = -1;
    public boolean useEmergencyMode;

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("\nPatchResult: \n");
        stringBuffer.append("isSuccess:" + this.isSuccess + "\n");
        stringBuffer.append("rawPatchFilePath:" + this.rawPatchFilePath + "\n");
        stringBuffer.append("useEmergencyMode:" + this.useEmergencyMode + "\n");
        stringBuffer.append("costTime:" + this.totalCostTime + "\n");
        stringBuffer.append("dexoptTriggerTime:" + this.dexoptTriggerTime + "\n");
        stringBuffer.append("isOatGenerated:" + this.isOatGenerated + "\n");
        if (this.patchVersion != null) {
            stringBuffer.append("patchVersion:" + this.patchVersion + "\n");
        }
        if (this.f215545e != null) {
            stringBuffer.append("Throwable:" + this.f215545e.getMessage() + "\n");
        }
        return stringBuffer.toString();
    }
}
