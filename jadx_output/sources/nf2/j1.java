package nf2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class j1 {

    /* renamed from: d, reason: collision with root package name */
    public static final nf2.j1 f336760d;

    /* renamed from: e, reason: collision with root package name */
    public static final nf2.j1 f336761e;

    /* renamed from: f, reason: collision with root package name */
    public static final nf2.j1 f336762f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ nf2.j1[] f336763g;

    static {
        nf2.j1 j1Var = new nf2.j1("CENTER", 0);
        f336760d = j1Var;
        nf2.j1 j1Var2 = new nf2.j1("LEFT", 1);
        f336761e = j1Var2;
        nf2.j1 j1Var3 = new nf2.j1("RIGHT", 2);
        f336762f = j1Var3;
        nf2.j1[] j1VarArr = {j1Var, j1Var2, j1Var3};
        f336763g = j1VarArr;
        rz5.b.a(j1VarArr);
    }

    public j1(java.lang.String str, int i17) {
    }

    public static nf2.j1 valueOf(java.lang.String str) {
        return (nf2.j1) java.lang.Enum.valueOf(nf2.j1.class, str);
    }

    public static nf2.j1[] values() {
        return (nf2.j1[]) f336763g.clone();
    }
}
