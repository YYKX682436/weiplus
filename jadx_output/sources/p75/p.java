package p75;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final p75.p f352680e;

    /* renamed from: f, reason: collision with root package name */
    public static final p75.p f352681f;

    /* renamed from: g, reason: collision with root package name */
    public static final p75.p f352682g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.p f352683h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.p f352684i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.p f352685m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ p75.p[] f352686n;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f352687d;

    static {
        p75.p pVar = new p75.p("Equal", 0, "=");
        f352680e = pVar;
        p75.p pVar2 = new p75.p("NotEqual", 1, "<>");
        f352681f = pVar2;
        p75.p pVar3 = new p75.p("LargerThan", 2, ">");
        f352682g = pVar3;
        p75.p pVar4 = new p75.p("SmallerThan", 3, "<");
        f352683h = pVar4;
        p75.p pVar5 = new p75.p("LargerEqual", 4, ">=");
        f352684i = pVar5;
        p75.p pVar6 = new p75.p("SmallerEqual", 5, "<=");
        f352685m = pVar6;
        p75.p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6};
        f352686n = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17, java.lang.String str2) {
        this.f352687d = str2;
    }

    public static p75.p valueOf(java.lang.String str) {
        return (p75.p) java.lang.Enum.valueOf(p75.p.class, str);
    }

    public static p75.p[] values() {
        return (p75.p[]) f352686n.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f352687d;
    }
}
