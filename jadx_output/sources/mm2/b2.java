package mm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b2 {

    /* renamed from: d, reason: collision with root package name */
    public static final mm2.b2 f328759d;

    /* renamed from: e, reason: collision with root package name */
    public static final mm2.b2 f328760e;

    /* renamed from: f, reason: collision with root package name */
    public static final mm2.b2 f328761f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mm2.b2[] f328762g;

    static {
        mm2.b2 b2Var = new mm2.b2("Top", 0);
        f328759d = b2Var;
        mm2.b2 b2Var2 = new mm2.b2("HalfScreen", 1);
        f328760e = b2Var2;
        mm2.b2 b2Var3 = new mm2.b2("FullScreen", 2);
        f328761f = b2Var3;
        mm2.b2[] b2VarArr = {b2Var, b2Var2, b2Var3};
        f328762g = b2VarArr;
        rz5.b.a(b2VarArr);
    }

    public b2(java.lang.String str, int i17) {
    }

    public static mm2.b2 valueOf(java.lang.String str) {
        return (mm2.b2) java.lang.Enum.valueOf(mm2.b2.class, str);
    }

    public static mm2.b2[] values() {
        return (mm2.b2[]) f328762g.clone();
    }
}
