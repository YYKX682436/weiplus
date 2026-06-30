package yf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final yf.a f461305e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yf.b[] f461306f;

    /* renamed from: d, reason: collision with root package name */
    public final int f461307d;

    static {
        yf.b[] bVarArr = {new yf.b("NORMAL", 0, 0), new yf.b("DARKEN", 1, 1), new yf.b("MULTIPLY", 2, 2), new yf.b("COLORBURN", 3, 3), new yf.b("LINEARBURN", 4, 4), new yf.b("DARKERCOLOR", 5, 5), new yf.b("LIGHTEN", 6, 6), new yf.b("SCREEN", 7, 7), new yf.b("COLODDODGE", 8, 8), new yf.b("LINEARDODGE", 9, 9), new yf.b("LIGHTCOLOR", 10, 10), new yf.b("OVERLAY", 11, 11), new yf.b("SOFTLIGHT", 12, 12), new yf.b("HARDLIGHT", 13, 13), new yf.b("VIVIDLIGHT", 14, 14), new yf.b("LINEARLIGHT", 15, 15), new yf.b("PINLIGHT", 16, 16), new yf.b("HARDMIX", 17, 17), new yf.b("DIFFERENCE", 18, 18), new yf.b("EXCLUSION", 19, 19), new yf.b("SUBTRACT", 20, 20), new yf.b("DIVIDE", 21, 21), new yf.b("HUE", 22, 22), new yf.b("SATURATION", 23, 23), new yf.b("LUMINOSITY", 24, 24)};
        f461306f = bVarArr;
        rz5.b.a(bVarArr);
        f461305e = new yf.a(null);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f461307d = i18;
    }

    public static final yf.b a(int i17) {
        f461305e.getClass();
        for (yf.b bVar : values()) {
            if (i17 == bVar.f461307d) {
                return bVar;
            }
        }
        return null;
    }

    public static yf.b valueOf(java.lang.String str) {
        return (yf.b) java.lang.Enum.valueOf(yf.b.class, str);
    }

    public static yf.b[] values() {
        return (yf.b[]) f461306f.clone();
    }
}
