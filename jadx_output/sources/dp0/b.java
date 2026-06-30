package dp0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final dp0.b f242106d;

    /* renamed from: e, reason: collision with root package name */
    public static final dp0.b f242107e;

    /* renamed from: f, reason: collision with root package name */
    public static final dp0.b f242108f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ dp0.b[] f242109g;

    static {
        dp0.b bVar = new dp0.b("LOW", 0);
        f242106d = bVar;
        dp0.b bVar2 = new dp0.b("NORMAL", 1);
        f242107e = bVar2;
        dp0.b bVar3 = new dp0.b("HIGH", 2);
        f242108f = bVar3;
        dp0.b[] bVarArr = {bVar, bVar2, bVar3};
        f242109g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static dp0.b valueOf(java.lang.String str) {
        return (dp0.b) java.lang.Enum.valueOf(dp0.b.class, str);
    }

    public static dp0.b[] values() {
        return (dp0.b[]) f242109g.clone();
    }
}
