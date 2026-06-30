package k91;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b1 {

    /* renamed from: d, reason: collision with root package name */
    public static final k91.b1 f305540d;

    /* renamed from: e, reason: collision with root package name */
    public static final k91.b1 f305541e;

    /* renamed from: f, reason: collision with root package name */
    public static final k91.b1 f305542f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ k91.b1[] f305543g;

    static {
        k91.b1 b1Var = new k91.b1("NORMAL", 0);
        f305540d = b1Var;
        k91.b1 b1Var2 = new k91.b1("FORCE_LIGHT", 1);
        f305541e = b1Var2;
        k91.b1 b1Var3 = new k91.b1(org.chromium.support_lib_boundary.util.Features.FORCE_DARK, 2);
        f305542f = b1Var3;
        k91.b1[] b1VarArr = {b1Var, b1Var2, b1Var3};
        f305543g = b1VarArr;
        rz5.b.a(b1VarArr);
    }

    public b1(java.lang.String str, int i17) {
    }

    public static k91.b1 valueOf(java.lang.String str) {
        return (k91.b1) java.lang.Enum.valueOf(k91.b1.class, str);
    }

    public static k91.b1[] values() {
        return (k91.b1[]) f305543g.clone();
    }
}
