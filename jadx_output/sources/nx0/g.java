package nx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final nx0.g f341108d;

    /* renamed from: e, reason: collision with root package name */
    public static final nx0.g f341109e;

    /* renamed from: f, reason: collision with root package name */
    public static final nx0.g f341110f;

    /* renamed from: g, reason: collision with root package name */
    public static final nx0.g f341111g;

    /* renamed from: h, reason: collision with root package name */
    public static final nx0.g f341112h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ nx0.g[] f341113i;

    static {
        nx0.g gVar = new nx0.g(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0);
        f341108d = gVar;
        nx0.g gVar2 = new nx0.g("BEAUTY", 1);
        f341109e = gVar2;
        nx0.g gVar3 = new nx0.g("MAKEUP", 2);
        f341110f = gVar3;
        nx0.g gVar4 = new nx0.g("FILTER", 3);
        f341111g = gVar4;
        nx0.g gVar5 = new nx0.g("FACE_EFFECT", 4);
        f341112h = gVar5;
        nx0.g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        f341113i = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static nx0.g valueOf(java.lang.String str) {
        return (nx0.g) java.lang.Enum.valueOf(nx0.g.class, str);
    }

    public static nx0.g[] values() {
        return (nx0.g[]) f341113i.clone();
    }
}
