package jn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final jn2.u0 f300711d;

    /* renamed from: e, reason: collision with root package name */
    public static final jn2.u0 f300712e;

    /* renamed from: f, reason: collision with root package name */
    public static final jn2.u0 f300713f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ jn2.u0[] f300714g;

    static {
        jn2.u0 u0Var = new jn2.u0("NORMAL", 0);
        f300711d = u0Var;
        jn2.u0 u0Var2 = new jn2.u0("LOADING", 1);
        f300712e = u0Var2;
        jn2.u0 u0Var3 = new jn2.u0("ADDED", 2);
        f300713f = u0Var3;
        jn2.u0[] u0VarArr = {u0Var, u0Var2, u0Var3};
        f300714g = u0VarArr;
        rz5.b.a(u0VarArr);
    }

    public u0(java.lang.String str, int i17) {
    }

    public static jn2.u0 valueOf(java.lang.String str) {
        return (jn2.u0) java.lang.Enum.valueOf(jn2.u0.class, str);
    }

    public static jn2.u0[] values() {
        return (jn2.u0[]) f300714g.clone();
    }
}
