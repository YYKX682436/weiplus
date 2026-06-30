package g33;

/* loaded from: classes10.dex */
public class a extends ck5.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f268174a;

    /* renamed from: b, reason: collision with root package name */
    public long f268175b = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH;

    public a(java.lang.String str) {
        this.f268174a = str;
    }

    public int a() {
        int i17;
        java.lang.String str = this.f268174a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoBoundaryCheck", "dz[check video but path is null or nil]");
        }
        boolean is2G = com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a);
        boolean a17 = d61.c.a(str);
        if (a17) {
            i17 = com.tencent.mm.plugin.sight.base.SightVideoJNI.shouldRemuxingVFS(this.f268174a, com.tencent.mm.plugin.appbrand.jsapi.appdownload.q1.CTRL_INDEX, 500, is2G ? 10485760 : (int) this.f268175b, is2G ? 60000.0d : this.f268175b, 1000000);
        } else {
            i17 = ((int) com.tencent.mm.vfs.w6.k(str)) > (is2G ? 10485760 : 26214400) ? -1 : 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoBoundaryCheck", "check should remuxing, ret %d, isMp4 %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(a17));
        switch (i17) {
            case -6:
            case -5:
            case -4:
            case -3:
            case -2:
                return 1;
            case -1:
                return 2;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 0;
            default:
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoBoundaryCheck", "unknown check type %d", java.lang.Integer.valueOf(i17));
                return 1;
        }
    }
}
