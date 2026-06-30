package n8;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f335458a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f335459b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f335460c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f335461d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f335462e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.tencent.mapsdk.internal.km.f50100e, 384, com.tencent.wcdb.FileUtils.S_IRWXU, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f335463f = {69, 87, 104, 121, 139, 174, 208, 243, 278, yc1.p.CTRL_INDEX, 417, 487, com.tencent.mm.plugin.appbrand.jsapi.lab.d.CTRL_INDEX, 696, 835, 975, 1114, com.tencent.mm.plugin.appbrand.ad.jsapi.e.CTRL_INDEX, 1393};

    public static int a(int i17, int i18) {
        int i19 = i18 / 2;
        if (i17 < 0 || i17 >= 3 || i18 < 0 || i19 >= 19) {
            return -1;
        }
        int i27 = f335459b[i17];
        if (i27 == 44100) {
            return (f335463f[i19] + (i18 % 2)) * 2;
        }
        int i28 = f335462e[i19];
        return i27 == 32000 ? i28 * 6 : i28 * 4;
    }
}
