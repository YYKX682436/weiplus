package v5;

/* loaded from: classes14.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f433282a = 0;

    static {
        x36.n nVar = x36.o.f451696h;
        nVar.a("GIF87a");
        nVar.a("GIF89a");
        nVar.a("RIFF");
        nVar.a("WEBP");
        nVar.a("VP8X");
        nVar.a("ftyp");
        nVar.a("msf1");
        nVar.a("hevc");
        nVar.a("hevx");
    }

    public static final int a(int i17, int i18, int i19, int i27, d6.g scale) {
        kotlin.jvm.internal.o.g(scale, "scale");
        int highestOneBit = java.lang.Integer.highestOneBit(i17 / i19);
        if (highestOneBit < 1) {
            highestOneBit = 1;
        }
        int highestOneBit2 = java.lang.Integer.highestOneBit(i18 / i27);
        if (highestOneBit2 < 1) {
            highestOneBit2 = 1;
        }
        int ordinal = scale.ordinal();
        if (ordinal == 0) {
            return java.lang.Math.min(highestOneBit, highestOneBit2);
        }
        if (ordinal == 1) {
            return java.lang.Math.max(highestOneBit, highestOneBit2);
        }
        throw new jz5.j();
    }

    public static final coil.size.PixelSize b(int i17, int i18, coil.size.Size dstSize, d6.g scale) {
        kotlin.jvm.internal.o.g(dstSize, "dstSize");
        kotlin.jvm.internal.o.g(scale, "scale");
        if (dstSize instanceof coil.size.OriginalSize) {
            return new coil.size.PixelSize(i17, i18);
        }
        if (!(dstSize instanceof coil.size.PixelSize)) {
            throw new jz5.j();
        }
        coil.size.PixelSize pixelSize = (coil.size.PixelSize) dstSize;
        double d17 = d(i17, i18, pixelSize.f43912d, pixelSize.f43913e, scale);
        return new coil.size.PixelSize(a06.d.a(i17 * d17), a06.d.a(d17 * i18));
    }

    public static final double c(double d17, double d18, double d19, double d27, d6.g scale) {
        kotlin.jvm.internal.o.g(scale, "scale");
        double d28 = d19 / d17;
        double d29 = d27 / d18;
        int ordinal = scale.ordinal();
        if (ordinal == 0) {
            return java.lang.Math.max(d28, d29);
        }
        if (ordinal == 1) {
            return java.lang.Math.min(d28, d29);
        }
        throw new jz5.j();
    }

    public static final double d(int i17, int i18, int i19, int i27, d6.g scale) {
        kotlin.jvm.internal.o.g(scale, "scale");
        double d17 = i19 / i17;
        double d18 = i27 / i18;
        int ordinal = scale.ordinal();
        if (ordinal == 0) {
            return java.lang.Math.max(d17, d18);
        }
        if (ordinal == 1) {
            return java.lang.Math.min(d17, d18);
        }
        throw new jz5.j();
    }
}
