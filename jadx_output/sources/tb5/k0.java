package tb5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final tb5.k0 f417063d;

    /* renamed from: e, reason: collision with root package name */
    public static final tb5.k0 f417064e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ tb5.k0[] f417065f;

    static {
        tb5.k0 k0Var = new tb5.k0("STOPPED", 0);
        f417063d = k0Var;
        tb5.k0 k0Var2 = new tb5.k0("COLLECTING", 1);
        f417064e = k0Var2;
        tb5.k0[] k0VarArr = {k0Var, k0Var2};
        f417065f = k0VarArr;
        rz5.b.a(k0VarArr);
    }

    public k0(java.lang.String str, int i17) {
    }

    public static tb5.k0 valueOf(java.lang.String str) {
        return (tb5.k0) java.lang.Enum.valueOf(tb5.k0.class, str);
    }

    public static tb5.k0[] values() {
        return (tb5.k0[]) f417065f.clone();
    }
}
