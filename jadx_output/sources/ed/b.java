package ed;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final ed.b f251196d;

    /* renamed from: e, reason: collision with root package name */
    public static final ed.b f251197e;

    /* renamed from: f, reason: collision with root package name */
    public static final ed.b f251198f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ed.b[] f251199g;

    static {
        ed.b bVar = new ed.b("SUCCESS", 0);
        f251196d = bVar;
        ed.b bVar2 = new ed.b("CANCEL", 1);
        f251197e = bVar2;
        ed.b bVar3 = new ed.b("FAILURE", 2);
        f251198f = bVar3;
        ed.b[] bVarArr = {bVar, bVar2, bVar3};
        f251199g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static ed.b valueOf(java.lang.String str) {
        return (ed.b) java.lang.Enum.valueOf(ed.b.class, str);
    }

    public static ed.b[] values() {
        return (ed.b[]) f251199g.clone();
    }
}
