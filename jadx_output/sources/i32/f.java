package i32;

/* loaded from: classes13.dex */
public class f extends i32.e {
    public f(long j17, int i17, int i18, byte[] bArr) {
        super(j17, i17, i18, bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceCmdInit", "onDeviceRequest deviceId = " + j17 + " seq = " + i17 + " cmdId = " + i18);
    }

    @Override // i32.e
    public com.tencent.mm.protobuf.f d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceCmdInit", "data is null");
            return null;
        }
        o32.f fVar = new o32.f();
        try {
            fVar.parseFrom(bArr);
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceCmdInit", "------Init Request parse is ok------ ");
            this.f288123e = fVar;
            return fVar;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExDeviceCmdInit", "pase error : " + e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdInit", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public void e(int i17, java.lang.String str, byte[] bArr, byte[] bArr2, int i18, int i19) {
        int[] iArr;
        int i27;
        int i28;
        long j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExDeviceCmdInit", "------initResponse------ errorCode = %d, errMsg = %s, filter = %s, challenge = %s, initScene = %d, second = %d", java.lang.Integer.valueOf(i17), str, a42.i.a(bArr), a42.i.a(bArr2), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        o32.g gVar = new o32.g();
        o32.e eVar = new o32.e();
        this.f288121c = eVar;
        eVar.f342694d = 0;
        eVar.f342695e = "ok";
        gVar.f342714d = eVar;
        java.lang.String r17 = c01.z1.r();
        if (com.tencent.mm.sdk.platformtools.t8.K0(r17)) {
            iArr = null;
        } else {
            java.lang.String lowerCase = com.tencent.mm.sdk.platformtools.w2.a(r17).toLowerCase();
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.Util", "user md5 : [%s]", lowerCase);
            if (com.tencent.mm.sdk.platformtools.t8.K0(lowerCase)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.Util", "get hash code failed, value is null or nill");
                j17 = 0;
            } else {
                char[] charArray = lowerCase.toCharArray();
                if (charArray.length > 0) {
                    i28 = 0;
                    for (char c17 : charArray) {
                        i28 = (i28 * 31) + c17;
                    }
                } else {
                    i28 = 0;
                }
                long j18 = i28 & io.flutter.embedding.android.KeyboardMap.kValueMask;
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.Util", "get int hashcode value = %d, long hashcode = %d", java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(j18));
                j17 = j18;
            }
            iArr = new int[]{(int) ((j17 >> 32) & io.flutter.embedding.android.KeyboardMap.kValueMask), (int) (io.flutter.embedding.android.KeyboardMap.kValueMask & j17)};
        }
        gVar.f342698e = iArr[0];
        gVar.f342699f = iArr[1];
        if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr2)) {
            if (bArr2 == null || bArr2.length == 0) {
                i27 = 0;
            } else {
                java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                crc32.update(bArr2);
                i27 = (int) crc32.getValue();
            }
            gVar.f342700g = i27;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            byte b17 = bArr[0];
            if ((b17 & 4) != 0) {
                gVar.f342705o = o45.wf.f343025c;
            }
            if ((b17 & 8) != 0) {
                int i29 = o45.wf.f343023a;
                gVar.f342706p = wo.q.f447785f;
            }
            if ((b17 & 2) != 0) {
                gVar.f342704n = 2;
            }
            if ((b17 & com.tencent.wxmm.v2encoder.enumCODEC_vcodec2) != 0) {
                gVar.f342707q = (int) com.tencent.mm.sdk.platformtools.t8.i1();
            }
            if ((bArr[0] & 32) != 0) {
                java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
                int rawOffset = timeZone.getRawOffset() / 1000;
                int i37 = (timeZone.useDaylightTime() && timeZone.inDaylightTime(new java.util.Date(java.lang.System.currentTimeMillis()))) ? 1 : 0;
                int i38 = (rawOffset / 3600) + i37;
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.Util", "getTimeZone, rawSecond = %d, dt = %d, re = %d", java.lang.Integer.valueOf(rawOffset), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38));
                gVar.f342708r = i38;
            }
            if ((bArr[0] & 64) != 0) {
                java.lang.String format = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
                int i39 = 7;
                try {
                    int P = com.tencent.mm.sdk.platformtools.t8.P(java.lang.String.valueOf(java.util.Calendar.getInstance().get(7)), 0);
                    if (P != 1) {
                        i39 = P - 1;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.Util", "parse day failed : %s", e17.getMessage());
                    i39 = 0;
                }
                gVar.f342709s = format + i39;
            }
            if ((bArr[0] & 1) != 0) {
                gVar.f342703m = c01.z1.l();
            }
        }
        gVar.f342701h = i18;
        gVar.f342702i = i19;
        this.f288122d = gVar;
        this.f288120b = (short) 20003;
    }
}
