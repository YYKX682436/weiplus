package lc3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final lc3.b f317882d;

    /* renamed from: e, reason: collision with root package name */
    public static final lc3.b f317883e;

    /* renamed from: f, reason: collision with root package name */
    public static final lc3.b f317884f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ lc3.b[] f317885g;

    static {
        lc3.b bVar = new lc3.b(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f317882d = bVar;
        lc3.b bVar2 = new lc3.b("FORCE_USE_DEBUG", 1);
        f317883e = bVar2;
        lc3.b bVar3 = new lc3.b("FORCE_NOT_DEBUG", 2);
        f317884f = bVar3;
        lc3.b[] bVarArr = {bVar, bVar2, bVar3};
        f317885g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static lc3.b valueOf(java.lang.String str) {
        return (lc3.b) java.lang.Enum.valueOf(lc3.b.class, str);
    }

    public static lc3.b[] values() {
        return (lc3.b[]) f317885g.clone();
    }
}
