package gx5;

/* loaded from: classes8.dex */
public final class b implements f04.j {

    /* renamed from: a, reason: collision with root package name */
    public static int f277455a = 11;

    static {
        new gx5.a(null);
    }

    public b() {
        boolean z17 = false;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_image_word_detect_rate_limit, 0);
        if (10 <= Ni && Ni < 16) {
            z17 = true;
        }
        if (z17) {
            f277455a = Ni;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WordDetectImageCompressStrategy", "initWordDetectImageCompressStrategy ratioLimit: %s, config: %s", java.lang.Integer.valueOf(f277455a), java.lang.Integer.valueOf(Ni));
    }

    @Override // f04.j
    public int a(java.lang.Object obj, int i17, int i18) {
        float f17;
        f04.g request = (f04.g) obj;
        kotlin.jvm.internal.o.g(request, "request");
        int i19 = i17 < i18 ? i17 : i18;
        int i27 = i17 > i18 ? i17 : i18;
        if (i27 <= i19 * 3) {
            float f18 = i19;
            float f19 = 384;
            f17 = ((i17 * 1.0f) / f18) * f19 * ((i18 * 1.0f) / f18) * f19;
        } else {
            float f27 = i27;
            float f28 = dc1.e.CTRL_INDEX;
            f17 = ((i17 * 1.0f) / f27) * f28 * ((i18 * 1.0f) / f27) * f28;
        }
        if ((i17 * i18) / f17 > 1.0f) {
            return (int) java.lang.Math.ceil((float) java.lang.Math.sqrt(r5));
        }
        return 1;
    }

    @Override // f04.j
    public android.graphics.Bitmap b(java.lang.Object obj, android.graphics.Bitmap bitmap) {
        f04.g request = (f04.g) obj;
        kotlin.jvm.internal.o.g(request, "request");
        return bitmap;
    }

    @Override // f04.j
    public boolean c(int i17, int i18) {
        boolean z17;
        float f17 = (i18 * 1.0f) / i17;
        float f18 = f277455a;
        if (f17 > f18 || f17 < 1.0f / f18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WordDetectImageCompressStrategy", "isOverRatioLimit ratio invalid " + f17);
            z17 = true;
        } else {
            z17 = false;
        }
        return !z17;
    }

    @Override // f04.j
    public java.lang.String name() {
        return "MicroMsg.WordDetectImageCompressStrategy";
    }
}
