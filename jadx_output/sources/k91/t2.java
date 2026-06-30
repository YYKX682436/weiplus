package k91;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class t2 {

    /* renamed from: d, reason: collision with root package name */
    public static final k91.t2 f305766d;

    /* renamed from: e, reason: collision with root package name */
    public static final k91.t2 f305767e;

    /* renamed from: f, reason: collision with root package name */
    public static final k91.t2 f305768f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ k91.t2[] f305769g;

    static {
        k91.t2 t2Var = new k91.t2("NORMAL", 0);
        f305766d = t2Var;
        k91.t2 t2Var2 = new k91.t2("SINGLE_CLOSE", 1);
        f305767e = t2Var2;
        k91.t2 t2Var3 = new k91.t2("HIDE", 2);
        f305768f = t2Var3;
        k91.t2[] t2VarArr = {t2Var, t2Var2, t2Var3};
        f305769g = t2VarArr;
        rz5.b.a(t2VarArr);
    }

    public t2(java.lang.String str, int i17) {
    }

    public static k91.t2 valueOf(java.lang.String str) {
        return (k91.t2) java.lang.Enum.valueOf(k91.t2.class, str);
    }

    public static k91.t2[] values() {
        return (k91.t2[]) f305769g.clone();
    }
}
