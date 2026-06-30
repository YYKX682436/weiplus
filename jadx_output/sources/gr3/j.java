package gr3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final gr3.j f274880e;

    /* renamed from: f, reason: collision with root package name */
    public static final gr3.j f274881f;

    /* renamed from: g, reason: collision with root package name */
    public static final gr3.j f274882g;

    /* renamed from: h, reason: collision with root package name */
    public static final gr3.j f274883h;

    /* renamed from: i, reason: collision with root package name */
    public static final gr3.j f274884i;

    /* renamed from: m, reason: collision with root package name */
    public static final gr3.j f274885m;

    /* renamed from: n, reason: collision with root package name */
    public static final gr3.j f274886n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ gr3.j[] f274887o;

    /* renamed from: d, reason: collision with root package name */
    public final int f274888d;

    static {
        gr3.j jVar = new gr3.j(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0);
        f274880e = jVar;
        gr3.j jVar2 = new gr3.j("LEVEL1_CHAT_AND_MOMENTS", 1, 1);
        f274881f = jVar2;
        gr3.j jVar3 = new gr3.j("LEVEL1_ONLY_CHAT", 2, 2);
        f274882g = jVar3;
        gr3.j jVar4 = new gr3.j("LEVEL2_OPEN_NOT_SEE_ME", 3, 3);
        f274883h = jVar4;
        gr3.j jVar5 = new gr3.j("LEVEL2_OPEN_NOT_SEE_TA", 4, 4);
        f274884i = jVar5;
        gr3.j jVar6 = new gr3.j("LEVEL2_CLOSE_NOT_SEE_ME", 5, 5);
        f274885m = jVar6;
        gr3.j jVar7 = new gr3.j("LEVEL2_CLOSE_NOT_SEE_TA", 6, 6);
        f274886n = jVar7;
        gr3.j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7};
        f274887o = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17, int i18) {
        this.f274888d = i18;
    }

    public static gr3.j valueOf(java.lang.String str) {
        return (gr3.j) java.lang.Enum.valueOf(gr3.j.class, str);
    }

    public static gr3.j[] values() {
        return (gr3.j[]) f274887o.clone();
    }
}
