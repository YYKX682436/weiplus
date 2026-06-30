package f04;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final f04.d f258421d = new f04.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        int i17 = 0;
        if (e0Var != null) {
            i17 = ((h62.d) e0Var).Ni(e42.d0.clicfg_scan_code_image_max_size_new, 0);
        }
        int i18 = 2332800;
        if (i17 < 518400 || i17 > 23328000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeImageCompressStrategy", "scanCodeMaxImageSizeOld: 2332800");
            i17 = 2332800;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeImageCompressStrategy", "scanCodeMaxImageSizeNew: " + i17);
        }
        if (i17 >= 518400 && i17 <= 23328000) {
            i18 = i17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeImageCompressStrategy", "scanCodeMaxImageSize: " + i18);
        return java.lang.Integer.valueOf(i18);
    }
}
