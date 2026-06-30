package l13;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final l13.b f314986d;

    /* renamed from: e, reason: collision with root package name */
    public static final l13.b f314987e;

    /* renamed from: f, reason: collision with root package name */
    public static final l13.b f314988f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l13.b[] f314989g;

    static {
        l13.b bVar = new l13.b("UP", 0);
        f314986d = bVar;
        l13.b bVar2 = new l13.b("DOWN", 1);
        f314987e = bVar2;
        l13.b bVar3 = new l13.b("NONE", 2);
        f314988f = bVar3;
        l13.b[] bVarArr = {bVar, bVar2, bVar3};
        f314989g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static l13.b valueOf(java.lang.String str) {
        return (l13.b) java.lang.Enum.valueOf(l13.b.class, str);
    }

    public static l13.b[] values() {
        return (l13.b[]) f314989g.clone();
    }
}
