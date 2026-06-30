package t23;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class p1 {

    /* renamed from: d, reason: collision with root package name */
    public static final t23.p1 f415247d;

    /* renamed from: e, reason: collision with root package name */
    public static final t23.p1 f415248e;

    /* renamed from: f, reason: collision with root package name */
    public static final t23.p1 f415249f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ t23.p1[] f415250g;

    static {
        t23.p1 p1Var = new t23.p1("IDLE", 0);
        f415247d = p1Var;
        t23.p1 p1Var2 = new t23.p1("UP", 1);
        f415248e = p1Var2;
        t23.p1 p1Var3 = new t23.p1("DOWN", 2);
        f415249f = p1Var3;
        t23.p1[] p1VarArr = {p1Var, p1Var2, p1Var3};
        f415250g = p1VarArr;
        rz5.b.a(p1VarArr);
    }

    public p1(java.lang.String str, int i17) {
    }

    public static t23.p1 valueOf(java.lang.String str) {
        return (t23.p1) java.lang.Enum.valueOf(t23.p1.class, str);
    }

    public static t23.p1[] values() {
        return (t23.p1[]) f415250g.clone();
    }
}
