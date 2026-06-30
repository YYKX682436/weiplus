package hk0;

/* loaded from: classes10.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f281831a;

    /* renamed from: b, reason: collision with root package name */
    public hk0.u0 f281832b;

    /* renamed from: c, reason: collision with root package name */
    public int f281833c;

    public final boolean a(int i17) {
        int i18 = (i17 + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        return i18 == 0 || i18 == 90 || i18 == 180 || i18 == 270;
    }

    public final int b() {
        java.lang.Integer num;
        if (this.f281832b == null) {
            return -1;
        }
        int i17 = (this.f281833c + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp >> " + this.f281833c);
        if (a(this.f281833c)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp is in rotation");
            return -1;
        }
        if (java.lang.Math.abs(i17 + 0) <= 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp >> fix to 0");
            num = 0;
        } else if (java.lang.Math.abs(i17 - 90) <= 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp >> fix to 90");
            num = 90;
        } else if (java.lang.Math.abs(i17 + org.chromium.net.NetError.ERR_TLS13_DOWNGRADE_DETECTED) <= 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp >> fix to 180");
            num = 180;
        } else if (java.lang.Math.abs(i17 - 270) <= 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp >> fix to 270");
            num = 270;
        } else if (java.lang.Math.abs(i17 + org.chromium.net.NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY) <= 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditRotateHelper", "getFixRotationInActionUp >> fix to 360 is 0");
            num = 0;
        } else {
            num = null;
        }
        if (num == null) {
            return -1;
        }
        num.intValue();
        return num.intValue();
    }
}
