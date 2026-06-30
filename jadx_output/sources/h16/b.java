package h16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final h16.a f278219e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f278220f;

    /* renamed from: g, reason: collision with root package name */
    public static final h16.b f278221g;

    /* renamed from: h, reason: collision with root package name */
    public static final h16.b f278222h;

    /* renamed from: i, reason: collision with root package name */
    public static final h16.b f278223i;

    /* renamed from: m, reason: collision with root package name */
    public static final h16.b f278224m;

    /* renamed from: n, reason: collision with root package name */
    public static final h16.b f278225n;

    /* renamed from: o, reason: collision with root package name */
    public static final h16.b f278226o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ h16.b[] f278227p;

    /* renamed from: d, reason: collision with root package name */
    public final int f278228d;

    static {
        h16.b bVar = new h16.b("UNKNOWN", 0, 0);
        f278221g = bVar;
        h16.b bVar2 = new h16.b("CLASS", 1, 1);
        f278222h = bVar2;
        h16.b bVar3 = new h16.b("FILE_FACADE", 2, 2);
        f278223i = bVar3;
        h16.b bVar4 = new h16.b("SYNTHETIC_CLASS", 3, 3);
        f278224m = bVar4;
        h16.b bVar5 = new h16.b("MULTIFILE_CLASS", 4, 4);
        f278225n = bVar5;
        h16.b bVar6 = new h16.b("MULTIFILE_CLASS_PART", 5, 5);
        f278226o = bVar6;
        h16.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        f278227p = bVarArr;
        rz5.b.a(bVarArr);
        f278219e = new h16.a(null);
        h16.b[] values = values();
        int d17 = kz5.b1.d(values.length);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (h16.b bVar7 : values) {
            linkedHashMap.put(java.lang.Integer.valueOf(bVar7.f278228d), bVar7);
        }
        f278220f = linkedHashMap;
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f278228d = i18;
    }

    public static h16.b valueOf(java.lang.String str) {
        return (h16.b) java.lang.Enum.valueOf(h16.b.class, str);
    }

    public static h16.b[] values() {
        return (h16.b[]) f278227p.clone();
    }
}
