package ey2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ey2.p0 f257463d;

    /* renamed from: e, reason: collision with root package name */
    public static final ey2.p0 f257464e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ey2.p0[] f257465f;

    static {
        ey2.p0 p0Var = new ey2.p0("SOURCE_EXIT", 0);
        f257463d = p0Var;
        ey2.p0 p0Var2 = new ey2.p0("SOURCE_RED_DOT", 1);
        ey2.p0 p0Var3 = new ey2.p0("SOURCE_RESET", 2);
        f257464e = p0Var3;
        ey2.p0[] p0VarArr = {p0Var, p0Var2, p0Var3, new ey2.p0("SOURCE_MULTI_TAB_NEW", 3), new ey2.p0("SOURCE_RED_DOT_REVOKE", 4)};
        f257465f = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17) {
    }

    public static ey2.p0 valueOf(java.lang.String str) {
        return (ey2.p0) java.lang.Enum.valueOf(ey2.p0.class, str);
    }

    public static ey2.p0[] values() {
        return (ey2.p0[]) f257465f.clone();
    }
}
