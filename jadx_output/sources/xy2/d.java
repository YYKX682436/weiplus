package xy2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final xy2.d f458157d;

    /* renamed from: e, reason: collision with root package name */
    public static final xy2.d f458158e;

    /* renamed from: f, reason: collision with root package name */
    public static final xy2.d f458159f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ xy2.d[] f458160g;

    static {
        xy2.d dVar = new xy2.d("NewLife", 0);
        f458157d = dVar;
        xy2.d dVar2 = new xy2.d("Finder", 1);
        f458158e = dVar2;
        xy2.d dVar3 = new xy2.d("Live", 2);
        f458159f = dVar3;
        xy2.d[] dVarArr = {dVar, dVar2, dVar3};
        f458160g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static xy2.d valueOf(java.lang.String str) {
        return (xy2.d) java.lang.Enum.valueOf(xy2.d.class, str);
    }

    public static xy2.d[] values() {
        return (xy2.d[]) f458160g.clone();
    }
}
