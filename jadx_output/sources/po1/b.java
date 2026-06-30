package po1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final po1.b f357289d;

    /* renamed from: e, reason: collision with root package name */
    public static final po1.b f357290e;

    /* renamed from: f, reason: collision with root package name */
    public static final po1.b f357291f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ po1.b[] f357292g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f357293h;

    static {
        po1.b bVar = new po1.b(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BOTH_PATTERN, 0);
        f357289d = bVar;
        po1.b bVar2 = new po1.b("SPECIFIC", 1);
        f357290e = bVar2;
        po1.b bVar3 = new po1.b("ALL_BUT_FOLD", 2);
        f357291f = bVar3;
        po1.b[] bVarArr = {bVar, bVar2, bVar3};
        f357292g = bVarArr;
        f357293h = rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static po1.b valueOf(java.lang.String str) {
        return (po1.b) java.lang.Enum.valueOf(po1.b.class, str);
    }

    public static po1.b[] values() {
        return (po1.b[]) f357292g.clone();
    }
}
