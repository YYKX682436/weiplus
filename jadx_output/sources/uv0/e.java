package uv0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final uv0.d f431324e;

    /* renamed from: f, reason: collision with root package name */
    public static final uv0.e f431325f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ uv0.e[] f431326g;

    /* renamed from: d, reason: collision with root package name */
    public final int f431327d;

    static {
        uv0.e eVar = new uv0.e("FILTER", 0, 1);
        f431325f = eVar;
        uv0.e[] eVarArr = {eVar, new uv0.e("DIVIDER", 1, 0)};
        f431326g = eVarArr;
        rz5.b.a(eVarArr);
        f431324e = new uv0.d(null);
    }

    public e(java.lang.String str, int i17, int i18) {
        this.f431327d = i18;
    }

    public static uv0.e valueOf(java.lang.String str) {
        return (uv0.e) java.lang.Enum.valueOf(uv0.e.class, str);
    }

    public static uv0.e[] values() {
        return (uv0.e[]) f431326g.clone();
    }
}
