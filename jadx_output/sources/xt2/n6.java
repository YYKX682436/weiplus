package xt2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n6 {

    /* renamed from: d, reason: collision with root package name */
    public static final xt2.n6 f456912d;

    /* renamed from: e, reason: collision with root package name */
    public static final xt2.n6 f456913e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ xt2.n6[] f456914f;

    static {
        xt2.n6 n6Var = new xt2.n6("NORMAL", 0);
        f456912d = n6Var;
        xt2.n6 n6Var2 = new xt2.n6("LARGE", 1);
        f456913e = n6Var2;
        xt2.n6[] n6VarArr = {n6Var, n6Var2};
        f456914f = n6VarArr;
        rz5.b.a(n6VarArr);
    }

    public n6(java.lang.String str, int i17) {
    }

    public static xt2.n6 valueOf(java.lang.String str) {
        return (xt2.n6) java.lang.Enum.valueOf(xt2.n6.class, str);
    }

    public static xt2.n6[] values() {
        return (xt2.n6[]) f456914f.clone();
    }
}
