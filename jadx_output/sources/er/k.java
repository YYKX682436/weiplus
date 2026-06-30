package er;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final er.k f255940d;

    /* renamed from: e, reason: collision with root package name */
    public static final er.k f255941e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ er.k[] f255942f;

    static {
        er.k kVar = new er.k(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f255940d = kVar;
        er.k kVar2 = new er.k("HIGH", 1);
        f255941e = kVar2;
        er.k[] kVarArr = {kVar, kVar2};
        f255942f = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    public static er.k valueOf(java.lang.String str) {
        return (er.k) java.lang.Enum.valueOf(er.k.class, str);
    }

    public static er.k[] values() {
        return (er.k[]) f255942f.clone();
    }
}
