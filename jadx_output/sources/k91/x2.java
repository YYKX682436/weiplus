package k91;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class x2 {

    /* renamed from: d, reason: collision with root package name */
    public static final k91.x2 f305816d;

    /* renamed from: e, reason: collision with root package name */
    public static final k91.x2 f305817e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k91.x2[] f305818f;

    static {
        k91.x2 x2Var = new k91.x2("NORMAL", 0);
        f305816d = x2Var;
        k91.x2 x2Var2 = new k91.x2("EMBED", 1);
        f305817e = x2Var2;
        k91.x2[] x2VarArr = {x2Var, x2Var2};
        f305818f = x2VarArr;
        rz5.b.a(x2VarArr);
    }

    public x2(java.lang.String str, int i17) {
    }

    public static k91.x2 valueOf(java.lang.String str) {
        return (k91.x2) java.lang.Enum.valueOf(k91.x2.class, str);
    }

    public static k91.x2[] values() {
        return (k91.x2[]) f305818f.clone();
    }
}
