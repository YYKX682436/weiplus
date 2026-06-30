package w06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class d implements w06.a {

    /* renamed from: d, reason: collision with root package name */
    public static final w06.d f441946d;

    /* renamed from: e, reason: collision with root package name */
    public static final w06.d f441947e;

    /* renamed from: f, reason: collision with root package name */
    public static final w06.d f441948f;

    /* renamed from: g, reason: collision with root package name */
    public static final w06.d f441949g;

    /* renamed from: h, reason: collision with root package name */
    public static final w06.d f441950h;

    /* renamed from: i, reason: collision with root package name */
    public static final w06.d f441951i;

    /* renamed from: m, reason: collision with root package name */
    public static final w06.d f441952m;

    /* renamed from: n, reason: collision with root package name */
    public static final w06.d f441953n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ w06.d[] f441954o;

    static {
        w06.d dVar = new w06.d("FROM_IDE", 0);
        w06.d dVar2 = new w06.d("FROM_BACKEND", 1);
        w06.d dVar3 = new w06.d("FROM_TEST", 2);
        w06.d dVar4 = new w06.d("FROM_BUILTINS", 3);
        f441946d = dVar4;
        w06.d dVar5 = new w06.d("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        w06.d dVar6 = new w06.d("WHEN_CHECK_OVERRIDES", 5);
        w06.d dVar7 = new w06.d("FOR_SCRIPT", 6);
        w06.d dVar8 = new w06.d("FROM_REFLECTION", 7);
        f441947e = dVar8;
        w06.d dVar9 = new w06.d("WHEN_RESOLVE_DECLARATION", 8);
        w06.d dVar10 = new w06.d("WHEN_GET_DECLARATION_SCOPE", 9);
        w06.d dVar11 = new w06.d("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        w06.d dVar12 = new w06.d("FOR_ALREADY_TRACKED", 11);
        f441948f = dVar12;
        w06.d dVar13 = new w06.d("WHEN_GET_ALL_DESCRIPTORS", 12);
        f441949g = dVar13;
        w06.d dVar14 = new w06.d("WHEN_TYPING", 13);
        w06.d dVar15 = new w06.d("WHEN_GET_SUPER_MEMBERS", 14);
        f441950h = dVar15;
        w06.d dVar16 = new w06.d("FOR_NON_TRACKED_SCOPE", 15);
        f441951i = dVar16;
        w06.d dVar17 = new w06.d("FROM_SYNTHETIC_SCOPE", 16);
        w06.d dVar18 = new w06.d("FROM_DESERIALIZATION", 17);
        f441952m = dVar18;
        w06.d dVar19 = new w06.d("FROM_JAVA_LOADER", 18);
        f441953n = dVar19;
        w06.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19, new w06.d("WHEN_GET_LOCAL_VARIABLE", 19), new w06.d("WHEN_FIND_BY_FQNAME", 20), new w06.d("WHEN_GET_COMPANION_OBJECT", 21), new w06.d("FOR_DEFAULT_IMPORTS", 22)};
        f441954o = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static w06.d valueOf(java.lang.String str) {
        return (w06.d) java.lang.Enum.valueOf(w06.d.class, str);
    }

    public static w06.d[] values() {
        return (w06.d[]) f441954o.clone();
    }
}
