package i64;

/* loaded from: classes4.dex */
public abstract class q0 {
    public static java.lang.String a(long j17, java.lang.Object... objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        if (objArr == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(com.tencent.mm.plugin.sns.model.l4.Gj().c(objArr));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        b(j17, com.tencent.mm.plugin.sns.model.l4.Vi().y0(j17), sb6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        return sb7;
    }

    public static void b(long j17, com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo, java.lang.StringBuilder sb6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        if (adSnsInfo != null) {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = adSnsInfo.getTimeLine();
            if (timeLine != null) {
                java.lang.String str = timeLine.statExtStr;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
                if (sb6 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
                } else {
                    r45.ud6 h17 = com.tencent.mm.modelstat.k0.h(str);
                    sb6.append(",");
                    sb6.append(h17 == null ? -1 : h17.f387270g);
                    sb6.append(",");
                    sb6.append(com.tencent.mm.modelstat.k0.g(h17));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.modelstat.SnsStatExtUtil");
                }
            } else {
                sb6.append(",,");
            }
        } else {
            sb6.append(",,");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
    }

    public static void c(java.lang.String str, m21.x xVar) {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str);
        if (b17 != null && (timeLine = b17.getTimeLine()) != null) {
            com.tencent.mm.modelstat.k0.a(timeLine.statExtStr, xVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendSourceAndSnsStat", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
    }

    public static java.lang.String d(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        if (timeLineObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            return null;
        }
        java.lang.String str = timeLineObject.statExtStr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        java.lang.String str2 = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        } else {
            byte[] decode = android.util.Base64.decode(str, 0);
            r45.td6 td6Var = new r45.td6();
            try {
                td6Var.parseFrom(decode);
                str2 = com.tencent.mm.modelstat.k0.g(td6Var.f386329d);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("SnsAdExtUtil", "", e17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExt", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        return str2;
    }
}
