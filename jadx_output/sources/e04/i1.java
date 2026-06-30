package e04;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class i1 {

    /* renamed from: e, reason: collision with root package name */
    public static final e04.i1 f245957e;

    /* renamed from: f, reason: collision with root package name */
    public static final e04.i1 f245958f;

    /* renamed from: g, reason: collision with root package name */
    public static final e04.i1 f245959g;

    /* renamed from: h, reason: collision with root package name */
    public static final e04.i1 f245960h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e04.i1[] f245961i;

    /* renamed from: d, reason: collision with root package name */
    public final int f245962d;

    static {
        e04.i1 i1Var = new e04.i1(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 1);
        f245957e = i1Var;
        e04.i1 i1Var2 = new e04.i1("DECODE_SUCCESS", 1, 2);
        f245958f = i1Var2;
        e04.i1 i1Var3 = new e04.i1("JUMP_GALLERY", 2, 3);
        f245959g = i1Var3;
        e04.i1 i1Var4 = new e04.i1("JUMP_MY_QRCODE", 3, 4);
        f245960h = i1Var4;
        e04.i1[] i1VarArr = {i1Var, i1Var2, i1Var3, i1Var4};
        f245961i = i1VarArr;
        rz5.b.a(i1VarArr);
    }

    public i1(java.lang.String str, int i17, int i18) {
        this.f245962d = i18;
    }

    public static e04.i1 valueOf(java.lang.String str) {
        return (e04.i1) java.lang.Enum.valueOf(e04.i1.class, str);
    }

    public static e04.i1[] values() {
        return (e04.i1[]) f245961i.clone();
    }
}
