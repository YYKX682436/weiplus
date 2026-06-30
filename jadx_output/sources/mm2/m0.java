package mm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final mm2.m0 f329230d;

    /* renamed from: e, reason: collision with root package name */
    public static final mm2.m0 f329231e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ mm2.m0[] f329232f;

    static {
        mm2.m0 m0Var = new mm2.m0("NONE", 0);
        f329230d = m0Var;
        mm2.m0 m0Var2 = new mm2.m0("KICKED_OUT", 1);
        f329231e = m0Var2;
        mm2.m0[] m0VarArr = {m0Var, m0Var2};
        f329232f = m0VarArr;
        rz5.b.a(m0VarArr);
    }

    public m0(java.lang.String str, int i17) {
    }

    public static mm2.m0 valueOf(java.lang.String str) {
        return (mm2.m0) java.lang.Enum.valueOf(mm2.m0.class, str);
    }

    public static mm2.m0[] values() {
        return (mm2.m0[]) f329232f.clone();
    }
}
