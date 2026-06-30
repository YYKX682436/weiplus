package vc5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final vc5.j f435324d;

    /* renamed from: e, reason: collision with root package name */
    public static final vc5.j f435325e;

    /* renamed from: f, reason: collision with root package name */
    public static final vc5.j f435326f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vc5.j[] f435327g;

    static {
        vc5.j jVar = new vc5.j(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BOTH_PATTERN, 0);
        f435324d = jVar;
        vc5.j jVar2 = new vc5.j("BY_IMAGE", 1);
        f435325e = jVar2;
        vc5.j jVar3 = new vc5.j("BY_TEXT", 2);
        f435326f = jVar3;
        vc5.j[] jVarArr = {jVar, jVar2, jVar3};
        f435327g = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17) {
    }

    public static vc5.j valueOf(java.lang.String str) {
        return (vc5.j) java.lang.Enum.valueOf(vc5.j.class, str);
    }

    public static vc5.j[] values() {
        return (vc5.j[]) f435327g.clone();
    }
}
