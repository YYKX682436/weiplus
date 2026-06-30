package el3;

/* loaded from: classes7.dex */
public abstract class a {
    public static int a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayIdKeyReport", "getQQAudioPlayerErrIdKey, errCode:" + i17);
        switch (i17) {
            case 702:
                return 98;
            case 703:
                return 99;
            case 704:
                return 100;
            case 705:
                return 101;
            case 706:
                return 102;
            case 707:
                return 103;
            case 708:
                return 104;
            case 709:
                return 105;
            case 710:
                return 106;
            case 711:
                return 107;
            case 712:
                return 108;
            case 713:
                return 119;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.b1.CTRL_INDEX /* 714 */:
                return 120;
            case 715:
                return 109;
            case 716:
                return 110;
            default:
                return 115;
        }
    }

    public static void b(java.util.ArrayList arrayList) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mars.smc.IDKey iDKey = (com.tencent.mars.smc.IDKey) it.next();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(", key:");
            sb6.append(iDKey.GetKey());
            sb6.append(" value:");
            sb6.append(iDKey.GetValue());
        }
        int i17 = rl.b.f397143a;
    }
}
