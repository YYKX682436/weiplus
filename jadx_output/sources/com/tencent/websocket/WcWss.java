package com.tencent.websocket;

/* loaded from: classes7.dex */
public class WcWss {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f215722a = new java.util.HashMap();

    /* loaded from: classes7.dex */
    public static class BindAndDnsReturn {
        public java.lang.String hostIpStr;
        public int resultCode;
    }

    public static int a(com.tencent.websocket.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3, java.lang.Object obj, java.lang.Object[] objArr4) {
        int connectSocket = connectSocket(str, str2, objArr, objArr2, objArr3, obj, objArr4);
        if (connectSocket > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WcWss", "connect wss pair(%s, %d)", str, java.lang.Integer.valueOf(connectSocket));
            android.util.Pair pair = new android.util.Pair(str, java.lang.Integer.valueOf(connectSocket));
            java.util.HashMap hashMap = f215722a;
            if (hashMap.containsKey(pair)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WcWss", "already exists pair(%s, %d)", str, java.lang.Integer.valueOf(connectSocket));
                return -1;
            }
            hashMap.put(pair, aVar);
        }
        return connectSocket;
    }

    public static com.tencent.websocket.WcWss.BindAndDnsReturn bindSocketToCellularAndDnsByCellular(int i17, java.lang.String str) {
        com.tencent.mars.comm.MultiNetLinkWaysUtil.BindAndDnsReturnKt bindSocketToCellularAndDnsByCellular = com.tencent.mars.comm.MultiNetLinkWaysUtil.INSTANCE.instance().bindSocketToCellularAndDnsByCellular(i17, str, com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.websocket.WcWss.BindAndDnsReturn bindAndDnsReturn = new com.tencent.websocket.WcWss.BindAndDnsReturn();
        bindAndDnsReturn.hostIpStr = bindSocketToCellularAndDnsByCellular.getHostIpStr();
        bindAndDnsReturn.resultCode = bindSocketToCellularAndDnsByCellular.getResultCode();
        return bindAndDnsReturn;
    }

    public static native void closeSocket(java.lang.String str, int i17, int i18, java.lang.String str2);

    private static native int connectSocket(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3, java.lang.Object obj, java.lang.Object[] objArr4);

    public static int doCertificateVerify(java.lang.String str, int i17, java.lang.String str2, byte[][] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcWss", "doCertificateVerify group:%s,wssId:%s,hostname:%s", str, java.lang.Integer.valueOf(i17), str2);
        android.util.Pair pair = new android.util.Pair(str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = f215722a;
        if (hashMap.containsKey(pair)) {
            return ((com.tencent.websocket.a) hashMap.get(pair)).doCertificateVerify(str2, bArr);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WcWss", "onMessage callback is null");
        return -1;
    }

    public static int getNetworkType() {
        try {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (netType == -1) {
                return -1;
            }
            if (com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                return 3;
            }
            if (com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                return 4;
            }
            if (com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                return 5;
            }
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(netType)) {
                return 1;
            }
            return com.tencent.mars.comm.NetStatusUtil.isWap(netType) ? 2 : 6;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WcWss", e17, "getStatisticsNetType_", new java.lang.Object[0]);
            return -1;
        }
    }

    public static native void init();

    public static void onClose(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcWss", "onClose group:%s,id:%s, reason:%s, code:%s", str, java.lang.Integer.valueOf(i17), str2, java.lang.Integer.valueOf(i18));
        android.util.Pair pair = new android.util.Pair(str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = f215722a;
        if (!hashMap.containsKey(pair)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WcWss", "onClose callback is null");
        } else {
            ((com.tencent.websocket.a) hashMap.get(pair)).d(str, i17, i18, str2);
            hashMap.remove(pair);
        }
    }

    public static void onHandShake(java.lang.String str, int i17, java.lang.String[] strArr, java.lang.String[] strArr2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcWss", "onHandShake group:%s, wssId:%s", str, java.lang.Integer.valueOf(i17));
        android.util.Pair pair = new android.util.Pair(str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = f215722a;
        if (hashMap.containsKey(pair)) {
            ((com.tencent.websocket.a) hashMap.get(pair)).b(str, i17, strArr, strArr2);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WcWss", "onHandShake callback is null");
        }
    }

    public static void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < iArr.length; i17++) {
            arrayList.add(new com.tencent.mars.smc.IDKey(iArr[i17], iArr2[i17], iArr3[i17]));
        }
    }

    public static void onKvStat(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcWss", "onKvStat logId:%s", java.lang.Integer.valueOf(i17));
    }

    public static void onMessage(java.lang.String str, int i17, byte[] bArr, boolean z17) {
        android.util.Pair pair = new android.util.Pair(str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = f215722a;
        if (hashMap.containsKey(pair)) {
            ((com.tencent.websocket.a) hashMap.get(pair)).a(str, i17, bArr, z17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WcWss", "onMessage callback is null");
        }
    }

    public static void onOpen(java.lang.String str, int i17, boolean z17, java.lang.String[] strArr, java.lang.String[] strArr2, int i18, java.lang.String str2, java.lang.String[] strArr3, java.lang.String[] strArr4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcWss", "onOpen group:%s,isSuc:%s, msg:%s, code:%s, wssId:%s", str, java.lang.Boolean.valueOf(z17), str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        android.util.Pair pair = new android.util.Pair(str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = f215722a;
        if (!hashMap.containsKey(pair)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WcWss", "onOpen callback is null");
            return;
        }
        ((com.tencent.websocket.a) hashMap.get(pair)).c(str, i17, z17, strArr, strArr2, i18, str2, strArr3, strArr4);
        if (z17) {
            return;
        }
        hashMap.remove(pair);
    }

    public static native int sendBuffer(java.lang.String str, int i17, byte[] bArr, boolean z17);

    public static native void setDebugIp(java.lang.String str, int i17);
}
