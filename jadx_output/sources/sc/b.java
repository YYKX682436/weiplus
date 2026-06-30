package sc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final sc.b f405605d;

    /* renamed from: e, reason: collision with root package name */
    public static final sc.b f405606e;

    /* renamed from: f, reason: collision with root package name */
    public static final sc.b f405607f;

    /* renamed from: g, reason: collision with root package name */
    public static final sc.b f405608g;

    /* renamed from: h, reason: collision with root package name */
    public static final sc.b f405609h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ sc.b[] f405610i;

    static {
        sc.b bVar = new sc.b("SKIP_SYSTEM", 0);
        f405605d = bVar;
        sc.b bVar2 = new sc.b("SKIP_CIRCULAR", 1);
        f405606e = bVar2;
        sc.b bVar3 = new sc.b("LEVEL_1", 2);
        f405607f = bVar3;
        sc.b bVar4 = new sc.b("LEVEL_1_DOUBLE", 3);
        f405608g = bVar4;
        sc.b bVar5 = new sc.b("LEVEL_2", 4);
        f405609h = bVar5;
        sc.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f405610i = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static sc.b valueOf(java.lang.String str) {
        return (sc.b) java.lang.Enum.valueOf(sc.b.class, str);
    }

    public static sc.b[] values() {
        return (sc.b[]) f405610i.clone();
    }
}
