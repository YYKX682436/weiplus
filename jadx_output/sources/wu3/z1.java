package wu3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class z1 {

    /* renamed from: d, reason: collision with root package name */
    public static final wu3.z1 f449835d;

    /* renamed from: e, reason: collision with root package name */
    public static final wu3.z1 f449836e;

    /* renamed from: f, reason: collision with root package name */
    public static final wu3.z1 f449837f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wu3.z1[] f449838g;

    static {
        wu3.z1 z1Var = new wu3.z1("STOP", 0);
        f449835d = z1Var;
        wu3.z1 z1Var2 = new wu3.z1("PLAYING", 1);
        f449836e = z1Var2;
        wu3.z1 z1Var3 = new wu3.z1("PAUSE", 2);
        f449837f = z1Var3;
        wu3.z1[] z1VarArr = {z1Var, z1Var2, z1Var3};
        f449838g = z1VarArr;
        rz5.b.a(z1VarArr);
    }

    public z1(java.lang.String str, int i17) {
    }

    public static wu3.z1 valueOf(java.lang.String str) {
        return (wu3.z1) java.lang.Enum.valueOf(wu3.z1.class, str);
    }

    public static wu3.z1[] values() {
        return (wu3.z1[]) f449838g.clone();
    }
}
