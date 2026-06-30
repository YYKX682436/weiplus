package m16;

/* loaded from: classes15.dex */
public final class g extends k16.a {

    /* renamed from: g, reason: collision with root package name */
    public static final m16.g f322892g;

    /* renamed from: h, reason: collision with root package name */
    public static final m16.g f322893h;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f322894f;

    static {
        m16.g gVar = new m16.g(1, 9, 0);
        f322892g = gVar;
        int i17 = gVar.f303426c;
        int i18 = gVar.f303425b;
        f322893h = (i18 == 1 && i17 == 9) ? new m16.g(2, 0, 0) : new m16.g(i18, i17 + 1, 0);
        new m16.g(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int[] versionArray, boolean z17) {
        super(java.util.Arrays.copyOf(versionArray, versionArray.length));
        kotlin.jvm.internal.o.g(versionArray, "versionArray");
        this.f322894f = z17;
    }

    public final boolean b(m16.g metadataVersionFromLanguageVersion) {
        kotlin.jvm.internal.o.g(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        m16.g gVar = f322892g;
        int i17 = this.f303426c;
        int i18 = this.f303425b;
        if (i18 == 2 && i17 == 0 && gVar.f303425b == 1 && gVar.f303426c == 8) {
            return true;
        }
        if (!this.f322894f) {
            gVar = f322893h;
        }
        gVar.getClass();
        boolean z17 = false;
        int i19 = metadataVersionFromLanguageVersion.f303425b;
        int i27 = gVar.f303425b;
        if (i27 > i19 || (i27 >= i19 && gVar.f303426c > metadataVersionFromLanguageVersion.f303426c)) {
            metadataVersionFromLanguageVersion = gVar;
        }
        if ((i18 == 1 && i17 == 0) || i18 == 0) {
            return false;
        }
        int i28 = metadataVersionFromLanguageVersion.f303425b;
        if (i18 > i28 || (i18 >= i28 && i17 > metadataVersionFromLanguageVersion.f303426c)) {
            z17 = true;
        }
        return !z17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(int... numbers) {
        this(numbers, false);
        kotlin.jvm.internal.o.g(numbers, "numbers");
    }
}
