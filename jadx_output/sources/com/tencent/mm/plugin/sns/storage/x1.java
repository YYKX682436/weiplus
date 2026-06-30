package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class x1 extends dm.na implements v94.h {
    public static final l75.e0 U = dm.na.initAutoDBInfo(com.tencent.mm.plugin.sns.storage.x1.class);
    public java.lang.String S = "";
    public java.lang.String T;

    @Override // dm.na, l75.f0
    public l75.e0 getDBInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsCover");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return U;
    }

    public com.tencent.mm.protocal.protobuf.FinderObject getFinderObject() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderObject", "com.tencent.mm.plugin.sns.storage.SnsCover");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        byte[] bArr = this.field_finderObject;
        if (bArr != null) {
            try {
                finderObject.parseFrom(bArr);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsCover", e17, "FinderObject parseFrom error", new java.lang.Object[0]);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderObject", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return finderObject;
    }

    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.SnsCover");
        int i17 = this.field_type;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return i17;
    }

    public java.lang.String getUserName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.storage.SnsCover");
        java.lang.String str = this.field_userName;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return str;
    }

    public java.lang.String t0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImagePath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        int i17 = this.field_type;
        if (i17 == 1 || i17 == 6 || i17 == 0) {
            if (com.tencent.mm.vfs.w6.j(this.field_localImage)) {
                java.lang.String str = this.field_localImage;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagePath", "com.tencent.mm.plugin.sns.storage.SnsCover");
                return str;
            }
            if (!android.text.TextUtils.isEmpty(this.field_imageBgUrl)) {
                java.lang.String str2 = this.field_imageBgUrl;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagePath", "com.tencent.mm.plugin.sns.storage.SnsCover");
                return str2;
            }
        }
        java.lang.String v07 = v0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImagePath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return v07;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.SnsCover");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        byte[] bArr = this.field_finderObject;
        if (bArr != null) {
            try {
                finderObject.parseFrom(bArr);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsCover", e17, "FinderObject parseFrom error", new java.lang.Object[0]);
            }
        }
        java.lang.String str = "SnsCover{field_userName='" + this.field_userName + "', field_type=" + this.field_type + ", field_snsBgId=" + ca4.z0.t0(this.field_snsBgId) + ", field_thumbUrl='" + this.field_thumbUrl + "', field_imageBgUrl='" + this.field_imageBgUrl + "', field_videoBgUrl='" + this.field_videoBgUrl + "', field_localThumb='" + this.field_localThumb + "', field_localImage='" + this.field_localImage + "', field_localVideo='" + this.field_localVideo + "', field_finderObject=" + ca4.z0.t0(finderObject.getId()) + ", field_finderCheckTime=" + this.field_finderCheckTime + ", field_success=" + this.field_success + ", systemRowid=" + this.systemRowid + ", reportExtraInfo=" + this.S + '}';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return str;
    }

    public java.lang.Long u0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsObjId", "com.tencent.mm.plugin.sns.storage.SnsCover");
        java.lang.Long valueOf = java.lang.Long.valueOf(this.field_snsBgId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsObjId", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return valueOf;
    }

    public java.lang.String v0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        if (com.tencent.mm.vfs.w6.j(this.field_localThumb)) {
            java.lang.String str = this.field_localThumb;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
            return str;
        }
        java.lang.String str2 = this.field_thumbUrl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return str2;
    }

    public java.lang.String w0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        if (com.tencent.mm.vfs.w6.j(this.field_localVideo)) {
            java.lang.String str = this.field_localVideo;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
            return str;
        }
        java.lang.String str2 = this.field_videoBgUrl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.storage.SnsCover");
        return str2;
    }
}
