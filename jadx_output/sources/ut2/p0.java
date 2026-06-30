package ut2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ut2.p0 f431046d;

    /* renamed from: e, reason: collision with root package name */
    public static final ut2.p0 f431047e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ut2.p0[] f431048f;

    static {
        ut2.p0 p0Var = new ut2.p0("Coupon", 0);
        f431046d = p0Var;
        ut2.p0 p0Var2 = new ut2.p0("Goods", 1);
        f431047e = p0Var2;
        ut2.p0[] p0VarArr = {p0Var, p0Var2, new ut2.p0("Detail", 2)};
        f431048f = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17) {
    }

    public static ut2.p0 valueOf(java.lang.String str) {
        return (ut2.p0) java.lang.Enum.valueOf(ut2.p0.class, str);
    }

    public static ut2.p0[] values() {
        return (ut2.p0[]) f431048f.clone();
    }
}
