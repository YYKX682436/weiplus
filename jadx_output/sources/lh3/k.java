package lh3;

@j95.b
/* loaded from: classes15.dex */
public class k extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f318680d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public static long f318681e = 0;

    public static synchronized java.util.List wi(android.content.Context context) {
        int i17;
        synchronized (lh3.k.class) {
            java.util.List list = f318680d;
            if (((java.util.LinkedList) list).size() > 0 && java.lang.System.currentTimeMillis() - f318681e < 60000) {
                return list;
            }
            f318681e = java.lang.System.currentTimeMillis();
            ((java.util.LinkedList) list).clear();
            try {
                java.util.List<android.telephony.CellInfo> list2 = (java.util.List) yj0.a.j((android.telephony.TelephonyManager) context.getSystemService("phone"), "com/tencent/mm/plugin/misc/impl/NetworkOptReport", "getExtraCellInfoList", "(Landroid/content/Context;)Ljava/util/List;", "android/telephony/TelephonyManager", "getAllCellInfo", "()Ljava/util/List;");
                if (list2 != null) {
                    for (android.telephony.CellInfo cellInfo : list2) {
                        lh3.j jVar = new lh3.j();
                        if (cellInfo instanceof android.telephony.CellInfoGsm) {
                            android.telephony.CellSignalStrengthGsm cellSignalStrength = ((android.telephony.CellInfoGsm) cellInfo).getCellSignalStrength();
                            android.telephony.CellIdentityGsm cellIdentity = ((android.telephony.CellInfoGsm) cellInfo).getCellIdentity();
                            i17 = cellIdentity.getMnc();
                            jVar.f318675c = "" + cellIdentity.getCid();
                            jVar.f318673a = "" + cellIdentity.getMcc();
                            jVar.f318674b = "" + cellIdentity.getMnc();
                            jVar.f318676d = "" + cellIdentity.getLac();
                            jVar.f318678f = cellSignalStrength.getDbm();
                            jVar.f318679g = cellInfo.isRegistered();
                            jVar.f318677e = com.tencent.mars.comm.NetStatusUtil.CELL_GSM;
                        } else if (cellInfo instanceof android.telephony.CellInfoCdma) {
                            android.telephony.CellSignalStrengthCdma cellSignalStrength2 = ((android.telephony.CellInfoCdma) cellInfo).getCellSignalStrength();
                            android.telephony.CellIdentityCdma cellIdentity2 = ((android.telephony.CellInfoCdma) cellInfo).getCellIdentity();
                            i17 = cellIdentity2.getSystemId();
                            jVar.f318675c = "" + cellIdentity2.getBasestationId();
                            jVar.f318674b = "" + cellIdentity2.getSystemId();
                            jVar.f318676d = "" + cellIdentity2.getNetworkId();
                            jVar.f318678f = cellSignalStrength2.getDbm();
                            jVar.f318679g = cellInfo.isRegistered();
                            jVar.f318677e = com.tencent.mars.comm.NetStatusUtil.CELL_CDMA;
                        } else if (cellInfo instanceof android.telephony.CellInfoLte) {
                            android.telephony.CellSignalStrengthLte cellSignalStrength3 = ((android.telephony.CellInfoLte) cellInfo).getCellSignalStrength();
                            android.telephony.CellIdentityLte cellIdentity3 = ((android.telephony.CellInfoLte) cellInfo).getCellIdentity();
                            i17 = cellIdentity3.getMnc();
                            jVar.f318675c = "" + cellIdentity3.getCi();
                            jVar.f318673a = "" + cellIdentity3.getMcc();
                            jVar.f318674b = "" + cellIdentity3.getMnc();
                            jVar.f318676d = "" + cellIdentity3.getTac();
                            jVar.f318678f = cellSignalStrength3.getDbm();
                            jVar.f318679g = cellInfo.isRegistered();
                            jVar.f318677e = "lte";
                        } else if (cellInfo instanceof android.telephony.CellInfoWcdma) {
                            android.telephony.CellSignalStrengthWcdma cellSignalStrength4 = ((android.telephony.CellInfoWcdma) cellInfo).getCellSignalStrength();
                            android.telephony.CellIdentityWcdma cellIdentity4 = ((android.telephony.CellInfoWcdma) cellInfo).getCellIdentity();
                            i17 = cellIdentity4.getMnc();
                            jVar.f318675c = "" + cellIdentity4.getCid();
                            jVar.f318673a = "" + cellIdentity4.getMcc();
                            jVar.f318674b = "" + cellIdentity4.getMnc();
                            jVar.f318676d = "" + cellIdentity4.getLac();
                            jVar.f318678f = cellSignalStrength4.getDbm();
                            jVar.f318679g = cellInfo.isRegistered();
                            jVar.f318677e = "wcdma";
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetworkOptReport", "Unknown type of cell signal!\n ClassName: " + cellInfo.getClass().getSimpleName() + "\n ToString: " + cellInfo.toString());
                            i17 = 0;
                        }
                        if (jVar.f318674b.length() == 1) {
                            jVar.f318674b = "0" + jVar.f318674b;
                        }
                        if (i17 != Integer.MAX_VALUE) {
                            ((java.util.LinkedList) f318680d).add(jVar);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetworkOptReport", "loadCellInfo: Unable to obtain cell signal information: ", e17);
            }
            return f318680d;
        }
    }
}
