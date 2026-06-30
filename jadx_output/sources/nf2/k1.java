package nf2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class k1 {

    /* renamed from: d, reason: collision with root package name */
    public static final nf2.k1 f336767d;

    /* renamed from: e, reason: collision with root package name */
    public static final nf2.k1 f336768e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ nf2.k1[] f336769f;

    static {
        nf2.k1 k1Var = new nf2.k1("HORIZONTAL", 0);
        f336767d = k1Var;
        nf2.k1 k1Var2 = new nf2.k1("VERTICAL", 1);
        f336768e = k1Var2;
        nf2.k1[] k1VarArr = {k1Var, k1Var2};
        f336769f = k1VarArr;
        rz5.b.a(k1VarArr);
    }

    public k1(java.lang.String str, int i17) {
    }

    public static nf2.k1 valueOf(java.lang.String str) {
        return (nf2.k1) java.lang.Enum.valueOf(nf2.k1.class, str);
    }

    public static nf2.k1[] values() {
        return (nf2.k1[]) f336769f.clone();
    }
}
