package wo;

/* loaded from: classes12.dex */
public class e0 extends wo.r0 {
    @Override // wo.r0
    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(wo.w0.c());
        java.util.Random random = new java.util.Random();
        random.setSeed(java.lang.System.currentTimeMillis());
        sb6.append(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        for (int i17 = 0; i17 < 15; i17++) {
            sb6.append((char) (random.nextInt(25) + 65));
        }
        java.lang.String a17 = wo.w0.f447844f.a();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (a17 == null) {
            a17 = "";
        }
        sb6.append(a17);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfo", "[+] new deviceid, dev:%s", sb7);
        return androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS + kk.k.g(sb7.getBytes()).substring(0, 15);
    }
}
