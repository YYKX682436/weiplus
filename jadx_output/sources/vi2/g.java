package vi2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final vi2.g f437546d;

    /* renamed from: e, reason: collision with root package name */
    public static final vi2.g f437547e;

    /* renamed from: f, reason: collision with root package name */
    public static final vi2.g f437548f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vi2.g[] f437549g;

    static {
        vi2.g gVar = new vi2.g(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f437546d = gVar;
        vi2.g gVar2 = new vi2.g("LOADING", 1);
        f437547e = gVar2;
        vi2.g gVar3 = new vi2.g("INVITED", 2);
        f437548f = gVar3;
        vi2.g[] gVarArr = {gVar, gVar2, gVar3};
        f437549g = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static vi2.g valueOf(java.lang.String str) {
        return (vi2.g) java.lang.Enum.valueOf(vi2.g.class, str);
    }

    public static vi2.g[] values() {
        return (vi2.g[]) f437549g.clone();
    }
}
