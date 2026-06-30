package wo;

/* loaded from: classes12.dex */
public class o0 extends wo.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final wo.s0 f447769d;

    public o0(wo.q0 q0Var) {
        super(q0Var);
        this.f447769d = new wo.s0(256);
    }

    @Override // wo.r0
    public java.lang.String b() {
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(wo.w0.c());
        wo.s0 s0Var = this.f447769d;
        java.lang.String a17 = s0Var.a(null);
        if (a17 == null) {
            a17 = wo.w0.g(false);
            com.tencent.mars.xlog.Log.w("MicroMsg.DeviceInfo", "[!] fail to fetch devId from deprecated cache, using getIMEI instead. value: %s", a17);
            z17 = false;
        } else {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfo", "[+] devId: %s, useDeprecatedDevId: %s", a17, java.lang.Boolean.valueOf(z17));
        if (z17) {
            sb6.append(a17);
        } else if (android.text.TextUtils.isEmpty(a17)) {
            java.util.Random random = new java.util.Random();
            random.setSeed(java.lang.System.currentTimeMillis());
            sb6.append(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
            for (int i17 = 0; i17 < 15; i17++) {
                sb6.append((char) (random.nextInt(25) + 65));
            }
            if (!s0Var.f447797d.f447774c) {
                wo.x0.a(1064, 28, 1, true);
            }
        } else {
            sb6.append((androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS + a17 + "123456789ABCDEF").substring(0, 15));
        }
        java.lang.String a18 = wo.w0.f447844f.a();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (a18 == null) {
            a18 = "";
        }
        sb6.append(a18);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfo", "[+] new mmguid, dev:%s", sb7);
        return androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS + kk.k.g(sb7.getBytes()).substring(0, 15);
    }
}
