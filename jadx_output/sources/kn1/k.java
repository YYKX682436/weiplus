package kn1;

/* loaded from: classes12.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f309630a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile java.util.List f309631b;

    public static java.lang.String A() {
        int i17;
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("wifi");
        if (wifiManager.getWifiState() == 3) {
            try {
                java.lang.String e17 = com.tencent.mm.sdk.platformtools.v0.f193027a.e(false);
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "getWifiName ssid=%s", e17);
                return (e17.length() >= 2 && e17.startsWith("\"") && e17.endsWith("\"")) ? e17.substring(1, e17.length() - 1) : e17;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e18, "getConnectionInfo error", new java.lang.Object[0]);
                return "";
            }
        }
        int i18 = 13;
        try {
            i18 = ((java.lang.Integer) wifiManager.getClass().getField("WIFI_AP_STATE_ENABLED").get(wifiManager)).intValue();
            i17 = ((java.lang.Integer) wifiManager.getClass().getMethod("getWifiApState", new java.lang.Class[0]).invoke(wifiManager, new java.lang.Object[0])).intValue();
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e19, "getWifiApState error", new java.lang.Object[0]);
            i17 = 0;
        }
        if (i17 == i18) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "getWifiName apmode");
                android.net.wifi.WifiConfiguration wifiConfiguration = (android.net.wifi.WifiConfiguration) wifiManager.getClass().getMethod("getWifiApConfiguration", new java.lang.Class[0]).invoke(wifiManager, new java.lang.Object[0]);
                if (wifiConfiguration != null) {
                    return wifiConfiguration.SSID;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "getWifiName cifiCfg is null");
                return null;
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e27, "getWifiApState error", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public static boolean B(java.lang.String str) {
        int i17;
        java.lang.String[] split = str.split("\\.");
        int c17 = kk.u.c(new byte[]{(byte) (com.tencent.mm.sdk.platformtools.t8.P(split[0], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[1], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[2], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[3], 0) & 255)});
        int c18 = kk.u.c(new byte[]{-1, -1, -1, 0});
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("wifi");
        if (wifiManager.getWifiState() == 3) {
            int g17 = com.tencent.mm.sdk.platformtools.v0.f193027a.g(false);
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "oldIpStr:%s, localIp:%s", str, (g17 & 255) + "." + ((g17 >> 8) & 255) + "." + ((g17 >> 16) & 255) + "." + ((g17 >> 24) & 255));
            return (c18 & c17) == (c18 & g17);
        }
        int i18 = 13;
        try {
            i18 = ((java.lang.Integer) wifiManager.getClass().getField("WIFI_AP_STATE_ENABLED").get(wifiManager)).intValue();
            i17 = ((java.lang.Integer) wifiManager.getClass().getMethod("getWifiApState", new java.lang.Class[0]).invoke(wifiManager, new java.lang.Object[0])).intValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupUtil", "getWifiApState %s", e17);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e17, "", new java.lang.Object[0]);
            i17 = 0;
        }
        if (i17 != i18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "apState:%d", java.lang.Integer.valueOf(i17));
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "matchip in apmode");
        try {
            java.util.Iterator it = java.util.Collections.list(java.net.NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                for (java.net.InetAddress inetAddress : java.util.Collections.list(((java.net.NetworkInterface) it.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress()) {
                        java.lang.String upperCase = inetAddress.getHostAddress().toUpperCase();
                        boolean isIPv4Address = org.apache.http.conn.util.InetAddressUtils.isIPv4Address(upperCase);
                        com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "check ip:%s, isIPv4:%b", upperCase, java.lang.Boolean.valueOf(isIPv4Address));
                        if (isIPv4Address && (c18 & c17) == (u(upperCase) & c18)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static com.tencent.mm.protobuf.f C(com.tencent.mm.protobuf.f fVar, byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                fVar.parseFrom(bArr);
                return fVar;
            } catch (java.lang.Exception e17) {
                java.lang.String message = e17.getMessage();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupUtil", "ERROR: parseProBuf [%s] [%s]", message, com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        return null;
    }

    public static void D(wn1.a aVar) {
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupUtil", "BackupAnalyseInfo not support");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "backupSendFinishRequest deviceName:%s, sessionCount:%d, msgCount:%d, mediaCount:%d, cost:%d", aVar.f447381d, java.lang.Integer.valueOf(aVar.f447383f), java.lang.Long.valueOf(aVar.f447385h), java.lang.Integer.valueOf(aVar.f447386i), java.lang.Long.valueOf(aVar.f447382e));
        }
    }

    public static boolean E(java.lang.String str) {
        try {
            return B(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupUtil", "tryMatchIp, error : " + th6.getMessage());
            return false;
        }
    }

    public static boolean F(r45.ed edVar, int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "writeItem, bakitem.BufferType = " + edVar.f373293u + ", mediaType = " + i17 + ", desPath = " + str);
        if (edVar.f373293u == i17) {
            byte[] bArr = edVar.f373291s.f371841f.f192156a;
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "desPath = " + str + ", byte.len = " + bArr.length);
            if (bArr.length <= 0) {
                return false;
            }
            com.tencent.mm.vfs.w6.S(str, bArr, 0, bArr.length);
            return true;
        }
        java.lang.String w17 = w(edVar, i17, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "desPath = " + str + ", mediaId = " + w17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(w17)) {
            return false;
        }
        com.tencent.mm.vfs.w6.w(n(w17) + w17, str);
        return true;
    }

    public static boolean G(r45.ed edVar, int i17, java.lang.String str) {
        if (edVar.f373293u == i17) {
            byte[] bArr = edVar.f373291s.f371841f.f192156a;
            if (bArr.length <= 0) {
                return false;
            }
            com.tencent.mm.vfs.w6.S(str, bArr, 0, bArr.length);
            return true;
        }
        java.lang.String w17 = w(edVar, i17, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(w17)) {
            return false;
        }
        com.tencent.mm.vfs.w6.c(n(w17) + w17, str);
        return true;
    }

    public static void H(java.lang.String str, wn1.v vVar) {
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            try {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                    com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
                    if (m18.a()) {
                        m18.f213266a.r(m18.f213267b);
                    }
                }
                java.lang.String str3 = str + vVar.f447491d;
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str3);
                if (!r6Var.m()) {
                    r6Var.k();
                }
                randomAccessFile = com.tencent.mm.vfs.w6.B(com.tencent.mm.vfs.w6.i(str3, true), true);
                randomAccessFile.setLength(vVar.f447493f);
                randomAccessFile.seek(vVar.f447494g);
                randomAccessFile.write(vVar.f447497m.f192156a);
            } catch (java.lang.Throwable th6) {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (java.lang.Exception unused) {
                    }
                }
                throw th6;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e17, "writeMediaToFile fail with exception", new java.lang.Object[0]);
            if (randomAccessFile == null) {
                return;
            }
        }
        try {
            randomAccessFile.close();
        } catch (java.lang.Exception unused2) {
        }
    }

    public static long a(java.lang.String str, int i17) {
        long j17 = i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return j17;
        }
        try {
            return java.lang.Long.valueOf(str).longValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e17, "", new java.lang.Object[0]);
            return j17;
        }
    }

    public static int b(java.lang.String str, java.lang.String str2, byte[] bArr) {
        try {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str3 = a17.f213279f;
            if (str3 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
                if (m18.a()) {
                    m18.f213266a.r(m18.f213267b);
                }
            }
            java.lang.String str4 = str + "/" + str2;
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str4);
            if (!r6Var.m()) {
                r6Var.k();
            }
            return com.tencent.mm.vfs.w6.a(str4, bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e17, "", new java.lang.Object[0]);
            return -1;
        }
    }

    public static void c(java.lang.String str, wn1.v vVar) {
        java.lang.Object valueOf;
        com.tencent.mm.protobuf.g gVar;
        int i17;
        if (android.text.TextUtils.isEmpty(str) || vVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupUtil", "appendFile dir:%s req:%s ", str, vVar);
            return;
        }
        int i18 = 3;
        if (!android.text.TextUtils.isEmpty(vVar.f447491d) && (gVar = vVar.f447497m) != null) {
            byte[] bArr = gVar.f192156a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if ((bArr == null ? -1 : bArr.length) > 0) {
                while (true) {
                    int i19 = i18 - 1;
                    if (i18 <= 0) {
                        return;
                    }
                    long e17 = e(str + vVar.f447491d);
                    try {
                        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                        java.lang.String str2 = a17.f213279f;
                        if (str2 != null) {
                            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                            if (!str2.equals(l17)) {
                                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                            }
                        }
                        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
                        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                            if (m18.a()) {
                                m18.f213266a.r(m18.f213267b);
                            }
                        }
                        java.lang.String str3 = str + "/" + vVar.f447491d;
                        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str3);
                        if (!r6Var.m()) {
                            r6Var.k();
                        }
                        i17 = com.tencent.mm.vfs.w6.a(str3, vVar.f447497m.f192156a);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e18, "", new java.lang.Object[0]);
                        i17 = -1;
                    }
                    long e19 = e(str + vVar.f447491d);
                    if (i17 == 0 && e19 >= vVar.f447497m.f192156a.length) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(e17), java.lang.Long.valueOf(e19), java.lang.Integer.valueOf(vVar.f447497m.f192156a.length));
                    i18 = i19;
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = vVar.f447491d;
        com.tencent.mm.protobuf.g gVar2 = vVar.f447497m;
        objArr[1] = gVar2;
        if (gVar2 == null) {
            valueOf = "null";
        } else {
            byte[] bArr2 = gVar2.f192156a;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            valueOf = java.lang.Integer.valueOf(bArr2 != null ? bArr2.length : -1);
        }
        objArr[2] = valueOf;
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupUtil", "appendFile dataid:%s data:%s  %s", objArr);
    }

    public static boolean d(long j17, com.tencent.mm.pointers.PLong pLong, com.tencent.mm.pointers.PLong pLong2, java.lang.String str) {
        android.os.StatFs statFs = new android.os.StatFs(lp0.b.D());
        pLong.value = statFs.getBlockSize() * statFs.getAvailableBlocks();
        com.tencent.mm.vfs.r6 j18 = com.tencent.mm.vfs.r6.j(fp.m.a());
        android.os.StatFs statFs2 = new android.os.StatFs(j18.u());
        long blockCount = statFs2.getBlockCount();
        long availableBlocks = statFs2.getAvailableBlocks();
        pLong2.value = statFs2.getBlockSize() * statFs2.getAvailableBlocks();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "checkDataFull, SDAvailSize:%d, DataAvailSize%d, dbSize:%d", java.lang.Long.valueOf(pLong.value), java.lang.Long.valueOf(pLong2.value), java.lang.Long.valueOf(j17));
        if (blockCount <= 0 || blockCount - availableBlocks < 0) {
            return false;
        }
        if (pLong.value == pLong2.value || str.startsWith(j18.u())) {
            pLong.value = 0L;
        }
        return j17 <= pLong2.value;
    }

    public static long e(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            return -1L;
        }
        if (!r6Var.h()) {
            return -2L;
        }
        if (r6Var.i()) {
            return r6Var.C();
        }
        return -3L;
    }

    public static boolean f(java.lang.String str) {
        if (str == null) {
            return false;
        }
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        return com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null) != null;
    }

    public static boolean g(java.lang.String str) {
        if (str == null) {
            return false;
        }
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        return d17 != null && d17.containsKey(".msg.emoji");
    }

    public static void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "BackupDelete clear MsgListDataId.");
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMsgListDataIdStorage", "deleteAllData, result:%b", java.lang.Boolean.valueOf(c01.d9.b().h().f195188d.A("BackupRecoverMsgListDataId", "delete from BackupRecoverMsgListDataId")));
        if (f309630a) {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\nclear MsgListDataId\ndeleteTime:");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis())));
            sb6.append("\n");
            b(lp0.b.D(), "backupTestInfo.txt", sb6.toString().getBytes());
        }
    }

    public static void i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "BackupDelete clear tempMoveTime.");
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupTempMoveTimeStorage", "deleteAllData, result:%b", java.lang.Boolean.valueOf(c01.d9.b().i().f195230d.A("BackupTempMoveTime", "delete from BackupTempMoveTime")));
    }

    public static boolean j(r45.ed edVar, int i17) {
        if (edVar.f373293u == i17 && edVar.f373291s != null) {
            return true;
        }
        java.util.Iterator it = edVar.f373290r.iterator();
        while (it.hasNext()) {
            if (((r45.eu5) it.next()).f373733d == i17) {
                return true;
            }
        }
        return false;
    }

    public static void k(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "BackupDelete Dir:%s", str);
        com.tencent.mm.vfs.w6.f(str);
        if (f309630a) {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\ndeleteTime:");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(simpleDateFormat.format(new java.util.Date(java.lang.System.currentTimeMillis())));
            sb6.append("\ndeletePath:");
            sb6.append(str);
            sb6.append("\n");
            b(lp0.b.D(), "backupTestInfo.txt", sb6.toString().getBytes());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "BackupDelete Finish. Dir:%s", str);
    }

    public static java.lang.String l(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = "";
        if (str == null) {
            return "";
        }
        java.lang.String g17 = kk.k.g(str.getBytes());
        if (g17.length() >= 1) {
            str2 = g17.charAt(0) + "/";
        } else {
            str2 = "";
        }
        if (g17.length() >= 2) {
            str3 = g17.charAt(1) + "/";
        }
        return str2 + str3;
    }

    public static java.lang.String m(java.lang.String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        return o() + "backupItem/" + l(str);
    }

    public static java.lang.String n(java.lang.String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        return o() + "backupMeida/" + l(str);
    }

    public static java.lang.String o() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("backupRecover/");
        return sb6.toString();
    }

    public static java.lang.String p() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("backupRecoverCopy/");
        return sb6.toString();
    }

    public static java.util.LinkedList q(java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        if (linkedList == null || linkedList2 == null || linkedList.isEmpty() || linkedList.size() * 2 != linkedList2.size()) {
            return null;
        }
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = linkedList2.iterator();
        java.util.Iterator it6 = linkedList.iterator();
        long j17 = 0;
        long j18 = 0;
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            if (it.hasNext()) {
                j17 = ((java.lang.Long) it.next()).longValue();
                if (it.hasNext()) {
                    j18 = ((java.lang.Long) it.next()).longValue();
                }
            }
            int size = hashMap.size();
            if (hashMap.get(str) != null) {
                size = ((java.lang.Integer) hashMap.get(str)).intValue();
            } else {
                hashMap.put(str, java.lang.Integer.valueOf(size));
            }
            linkedList3.add(new kn1.h(size, str, j17, j18));
        }
        return linkedList3;
    }

    public static wn1.p r(long j17) {
        wn1.p pVar = new wn1.p();
        java.lang.String g17 = wo.w0.g(false);
        if (android.text.TextUtils.isEmpty(g17)) {
            g17 = wo.w0.k();
        }
        pVar.f447446d = g17;
        pVar.f447447e = android.os.Build.MANUFACTURER;
        pVar.f447448f = wo.w0.m();
        pVar.f447449g = "Android";
        pVar.f447450h = android.os.Build.VERSION.RELEASE;
        int i17 = o45.wf.f343029g;
        pVar.f447451i = i17;
        pVar.f447452m = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "getBackupStartGeneralInfo WechatVersion[%s], freespace[%d], deviceId[%s]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), pVar.f447446d);
        return pVar;
    }

    public static java.util.List s() {
        java.util.LinkedList linkedList;
        if (f309631b != null) {
            return f309631b;
        }
        synchronized (kn1.k.class) {
            linkedList = new java.util.LinkedList();
            for (java.lang.String str : c01.e2.f37132p) {
                linkedList.add(str);
            }
            linkedList.add("weixin");
            linkedList.add("weibo");
            linkedList.add("qqmail");
            linkedList.add("fmessage");
            linkedList.add("tmessage");
            linkedList.add("qmessage");
            linkedList.add("qqsync");
            linkedList.add("floatbottle");
            linkedList.add("lbsapp");
            linkedList.add("shakeapp");
            linkedList.add("medianote");
            linkedList.add("qqfriend");
            linkedList.add("readerapp");
            linkedList.add("newsapp");
            linkedList.add("blogapp");
            linkedList.add("facebookapp");
            linkedList.add("masssendapp");
            linkedList.add("meishiapp");
            linkedList.add("feedsapp");
            linkedList.add("voipapp");
            linkedList.add("officialaccounts");
            linkedList.add("helper_entry");
            linkedList.add("pc_share");
            linkedList.add("cardpackage");
            linkedList.add("voicevoipapp");
            linkedList.add("voiceinputapp");
            linkedList.add("linkedinplugin");
            linkedList.add("appbrandcustomerservicemsg");
            linkedList.add("service_officialaccounts");
            linkedList.add("BrandEcsTemplateMsg@fakeuser");
            f309631b = linkedList;
        }
        return linkedList;
    }

    public static java.util.LinkedList t(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(((kn1.i) it.next()).f309625d);
            }
        }
        return linkedList2;
    }

    public static int u(java.lang.String str) {
        java.lang.String[] split = str.split("\\.");
        return kk.u.c(new byte[]{(byte) (com.tencent.mm.sdk.platformtools.t8.P(split[0], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[1], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[2], 0) & 255), (byte) (com.tencent.mm.sdk.platformtools.t8.P(split[3], 0) & 255)});
    }

    public static java.lang.String v(float f17) {
        return f17 == 0.0f ? "0" : f17 < 1024.0f ? "< 1 KB" : f17 < 1048576.0f ? java.lang.String.format("%dKB", java.lang.Integer.valueOf(java.lang.Math.round(f17 / 1024.0f))) : f17 < 1.0737418E9f ? java.lang.String.format("%.1fMB", java.lang.Float.valueOf((f17 / 1024.0f) / 1024.0f)) : java.lang.String.format("%.1fGB", java.lang.Float.valueOf(((f17 / 1024.0f) / 1024.0f) / 1024.0f));
    }

    public static java.lang.String w(r45.ed edVar, int i17, java.lang.String str) {
        java.util.LinkedList linkedList;
        r45.cu5 cu5Var;
        if (edVar.f373293u == i17 && (cu5Var = edVar.f373291s) != null) {
            return kk.k.g(cu5Var.f371841f.f192156a);
        }
        java.util.LinkedList linkedList2 = edVar.f373290r;
        if (linkedList2 != null && (linkedList = edVar.f373289q) != null) {
            java.util.Iterator it = linkedList2.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                if (((r45.eu5) it.next()).f373733d == i17) {
                    java.lang.String str2 = ((r45.du5) linkedList.get(i18)).f372756d;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str2.endsWith(str)) {
                        if (com.tencent.mm.vfs.w6.j(n(str2) + str2)) {
                            return str2;
                        }
                        return null;
                    }
                }
                i18++;
            }
        }
        return null;
    }

    public static int x(r45.ed edVar, int i17) {
        java.util.LinkedList linkedList;
        if (edVar.f373293u == i17) {
            r45.cu5 cu5Var = edVar.f373291s;
            if (cu5Var == null) {
                return 0;
            }
            return cu5Var.f371841f.f192156a.length;
        }
        java.util.LinkedList linkedList2 = edVar.f373290r;
        if (linkedList2 != null && (linkedList = edVar.f373289q) != null) {
            java.util.Iterator it = linkedList2.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                if (((r45.eu5) it.next()).f373733d == i17) {
                    java.lang.String str = ((r45.du5) linkedList.get(i18)).f372756d;
                    return (int) com.tencent.mm.vfs.w6.k(n(str) + str);
                }
                i18++;
            }
        }
        return 0;
    }

    public static byte[] y(r45.ed edVar, int i17) {
        java.util.LinkedList linkedList;
        r45.cu5 cu5Var;
        if (edVar.f373293u == i17 && (cu5Var = edVar.f373291s) != null) {
            return cu5Var.f371841f.f192156a;
        }
        java.util.LinkedList linkedList2 = edVar.f373290r;
        if (linkedList2 != null && (linkedList = edVar.f373289q) != null) {
            java.util.Iterator it = linkedList2.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                if (((r45.eu5) it.next()).f373733d == i17) {
                    java.lang.String str = ((r45.du5) linkedList.get(i18)).f372756d;
                    java.lang.String str2 = n(str) + str;
                    int k17 = (int) com.tencent.mm.vfs.w6.k(str2);
                    if (k17 != 0 && k17 <= 1048576) {
                        return com.tencent.mm.vfs.w6.N(str2, 0, -1);
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupUtil", "thumb not exist or  too big!");
                    return null;
                }
                i18++;
            }
        }
        return null;
    }

    public static java.lang.String z(android.content.Context context) {
        int i17;
        java.lang.String str = "wifi";
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) context.getSystemService("wifi");
        if (wifiManager.getWifiState() == 3) {
            try {
                java.lang.String e17 = com.tencent.mm.sdk.platformtools.v0.f193027a.e(false);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                    str = e17;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "getWifiName: result：%s ssid:%s", str, e17);
                return (str.length() >= 2 && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e18, "getConnectionInfo error", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e18, "", new java.lang.Object[0]);
                return "";
            }
        }
        int i18 = 13;
        try {
            i18 = ((java.lang.Integer) wifiManager.getClass().getField("WIFI_AP_STATE_ENABLED").get(wifiManager)).intValue();
            i17 = ((java.lang.Integer) wifiManager.getClass().getMethod("getWifiApState", new java.lang.Class[0]).invoke(wifiManager, new java.lang.Object[0])).intValue();
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e19, "getWifiApState error", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e19, "", new java.lang.Object[0]);
            i17 = 0;
        }
        if (i17 != i18) {
            return "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "getWifiName apmode");
        try {
            return ((android.net.wifi.WifiConfiguration) wifiManager.getClass().getMethod("getWifiApConfiguration", new java.lang.Class[0]).invoke(wifiManager, new java.lang.Object[0])).SSID;
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e27, "getWifiApConfiguration error", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupUtil", e27, "", new java.lang.Object[0]);
            return "wifiap";
        }
    }
}
