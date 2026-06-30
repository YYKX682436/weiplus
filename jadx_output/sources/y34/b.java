package y34;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f459182a;

    public b(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.toString();
        this.f459182a = byteBuffer;
        byteBuffer.position(0);
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean a(byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        if (bArr.length < 5) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            return false;
        }
        if (bArr[0] < 53) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            return false;
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (byte b17 : bArr) {
            if (b17 < 48 && b17 != 46) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
                return false;
            }
            if (b17 > 57 && b17 != 46) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
                return false;
            }
            if (i17 == 2 && b17 != 46) {
                i19++;
            }
            if (b17 == 46) {
                i17++;
            }
            if (i17 == 0) {
                i18 = (i18 * 10) + (b17 - 48);
            }
        }
        if (i17 < 3 || i18 < 50 || i19 != 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        return true;
    }

    public java.lang.String b() {
        short b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findChromeVer", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        byte[] bArr = new byte[8];
        java.nio.ByteBuffer byteBuffer = this.f459182a;
        byteBuffer.get(bArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        java.lang.String str = new java.lang.String(bArr);
        if (!str.startsWith("dex\n")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findChromeVer", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            return "";
        }
        java.lang.Integer.parseInt(str.substring(4, 7));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readDexHeader", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        byteBuffer.getInt();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        byteBuffer.get(new byte[20]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        y34.a.c(byteBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFileSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFileSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        long c17 = y34.a.c(byteBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeaderSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeaderSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        y34.a.c(byteBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLinkSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLinkSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLinkOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLinkOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMapOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMapOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        int i17 = byteBuffer.getInt();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStringIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStringIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        long c18 = y34.a.c(byteBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStringIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStringIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        byteBuffer.getInt();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTypeIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTypeIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTypeIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTypeIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        byteBuffer.getInt();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setProtoIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setProtoIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setProtoIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setProtoIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        byteBuffer.getInt();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFieldIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFieldIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFieldIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFieldIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        byteBuffer.getInt();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMethodIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMethodIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMethodIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMethodIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        byteBuffer.getInt();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClassDefsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClassDefsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClassDefsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClassDefsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        byteBuffer.getInt();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDataSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDataSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDataOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDataOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeaderSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeaderSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.a(byteBuffer, c17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readDexHeader", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStringIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStringIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStringIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStringIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        long j17 = i17;
        if (j17 > 50000) {
            j17 = 50000;
        }
        com.tencent.mars.xlog.Log.e("AdDeviceInfo.ua.DexParser", "stringIdsOff: " + c18 + ", size:" + j17);
        int i18 = 0;
        while (i18 < j17) {
            y34.a.a(byteBuffer, (i18 * 4) + c18);
            y34.a.a(byteBuffer, y34.a.c(byteBuffer));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readString", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readVarInts", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            int i19 = 0;
            int i27 = 0;
            do {
                b17 = y34.a.b(byteBuffer);
                i27 |= (b17 & 127) << (i19 * 7);
                i19++;
            } while ((b17 & 128) != 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readVarInts", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readString", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            char[] cArr = new char[i27];
            int i28 = 0;
            while (i28 < i27) {
                short b18 = y34.a.b(byteBuffer);
                long j18 = j17;
                if ((b18 & 128) == 0) {
                    cArr[i28] = (char) b18;
                } else if ((b18 & 224) == 192) {
                    cArr[i28] = (char) ((y34.a.b(byteBuffer) & 63) | ((b18 & 31) << 6));
                } else if ((b18 & 240) == 224) {
                    cArr[i28] = (char) (((y34.a.b(byteBuffer) & 63) << 6) | ((b18 & 15) << 12) | (y34.a.b(byteBuffer) & 63));
                }
                char c19 = cArr[i28];
                i28++;
                j17 = j18;
            }
            long j19 = j17;
            java.lang.String str2 = new java.lang.String(cArr);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readString", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readString", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkStr", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            boolean a17 = a(str2.getBytes());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStr", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            if (a17) {
                com.tencent.mars.xlog.Log.e("AdDeviceInfo.ua.DexParser", "check true: ".concat(str2));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findChromeVer", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
                return str2;
            }
            i18++;
            j17 = j19;
        }
        com.tencent.mars.xlog.Log.e("AdDeviceInfo.ua.DexParser", "not found chrome version");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findChromeVer", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        return "";
    }
}
