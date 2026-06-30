package wd4;

/* loaded from: classes4.dex */
public abstract class x0 {
    public static final java.lang.String a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        com.tencent.mm.plugin.sns.storage.SnsInfo d17 = d(str);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, snsInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return null;
        }
        r45.jj4 d18 = com.tencent.mm.plugin.sns.model.s5.d(d17, str);
        if (d18 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, mediaObj is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return null;
        }
        java.lang.String c17 = c(e(d17), d18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return c17;
    }

    public static final java.lang.String b(java.lang.String str, r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        if (jj4Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, mediaObj is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo d17 = d(str);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, snsInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return null;
        }
        java.lang.String c17 = c(e(d17), jj4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return c17;
    }

    public static final java.lang.String c(boolean z17, r45.jj4 media) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        kotlin.jvm.internal.o.g(media, "media");
        if (z17) {
            java.lang.String str = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), media.f377855d) + ca4.z0.J(media);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return str;
        }
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), media.f377855d);
        kotlin.jvm.internal.o.f(d17, "getMediaFilePath(...)");
        java.lang.String R = ca4.z0.R(media);
        kotlin.jvm.internal.o.f(R, "getSnsSightName(...)");
        java.lang.String concat = d17.concat(R);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return concat;
    }

    public static final com.tencent.mm.plugin.sns.storage.SnsInfo d(java.lang.String str) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        try {
            snsInfo = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        } catch (java.lang.Exception unused) {
            snsInfo = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return snsInfo;
    }

    public static final boolean e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPhotoType", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        if (snsInfo.getTimeLine().ContentObj == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.MaterialPathUtils", "isPhotoType, contentObj is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPhotoType", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return false;
        }
        boolean isPhoto = snsInfo.isPhoto();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPhotoType", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return isPhoto;
    }
}
