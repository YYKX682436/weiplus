package t81;

/* loaded from: classes7.dex */
public final class c extends dm.n9 implements qj1.d {
    public static final java.lang.String[] Y;
    public static final l75.e0 Z = dm.n9.initAutoDBInfo(t81.c.class);

    static {
        java.lang.String[] strArr = {"appId", "type", "version", "packageKey", "packageType"};
        Y = strArr;
        java.lang.String str = " PRIMARY KEY ( ";
        for (java.lang.String str2 : strArr) {
            str = str + ", " + str2;
        }
        java.lang.String str3 = str.replaceFirst(",", "") + " )";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        l75.e0 e0Var = Z;
        sb6.append(e0Var.f316956e);
        sb6.append(",");
        sb6.append(str3);
        e0Var.f316956e = sb6.toString();
    }

    @Override // dm.n9, l75.f0
    public l75.e0 getDBInfo() {
        return Z;
    }

    @Override // qj1.d
    public java.lang.String[] getKeys() {
        return Y;
    }

    public java.lang.String toString() {
        return "CmdGetCodePersistentInfo{field_appId='" + this.field_appId + "', field_version=" + this.field_version + ", field_type=" + this.field_type + ", field_retryTimes=" + this.field_retryTimes + ", field_retriedCount=" + this.field_retriedCount + ", field_retryInterval=" + this.field_retryInterval + ", field_networkType=" + this.field_networkType + ", field_pkgMd5='" + this.field_pkgMd5 + "', field_packageKey='" + this.field_packageKey + "', field_packageType=" + this.field_packageType + ", field_lastRetryTime=" + this.field_lastRetryTime + ", field_firstTimeTried=" + this.field_firstTimeTried + ", field_reportId=" + this.field_reportId + ", field_splitDownloadURLCgi=" + this.field_splitDownloadURLCgi + ", field_scene=" + this.field_scene + ", field_cmdSequence=" + this.field_cmdSequence + '}';
    }
}
