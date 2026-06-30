package fp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final fp.m0 f265209d;

    /* renamed from: e, reason: collision with root package name */
    public static final fp.m0 f265210e;

    /* renamed from: f, reason: collision with root package name */
    public static final fp.m0 f265211f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ fp.m0[] f265212g;

    static {
        fp.m0 m0Var = new fp.m0("STATUS_OK", 0);
        f265209d = m0Var;
        fp.m0 m0Var2 = new fp.m0("STATUS_LOW", 1);
        f265210e = m0Var2;
        fp.m0 m0Var3 = new fp.m0("STATUS_LOWER", 2);
        fp.m0 m0Var4 = new fp.m0("STATUS_LOWEST", 3);
        f265211f = m0Var4;
        fp.m0[] m0VarArr = {m0Var, m0Var2, m0Var3, m0Var4};
        f265212g = m0VarArr;
        rz5.b.a(m0VarArr);
    }

    public m0(java.lang.String str, int i17) {
    }

    public static fp.m0 valueOf(java.lang.String str) {
        return (fp.m0) java.lang.Enum.valueOf(fp.m0.class, str);
    }

    public static fp.m0[] values() {
        return (fp.m0[]) f265212g.clone();
    }
}
