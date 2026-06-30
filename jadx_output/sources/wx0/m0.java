package wx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final wx0.m0 f450512d;

    /* renamed from: e, reason: collision with root package name */
    public static final wx0.m0 f450513e;

    /* renamed from: f, reason: collision with root package name */
    public static final wx0.m0 f450514f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wx0.m0[] f450515g;

    static {
        wx0.m0 m0Var = new wx0.m0("FLASH_AUTO", 0);
        f450512d = m0Var;
        wx0.m0 m0Var2 = new wx0.m0("FLASH_ON", 1);
        f450513e = m0Var2;
        wx0.m0 m0Var3 = new wx0.m0("FLASH_OFF", 2);
        f450514f = m0Var3;
        wx0.m0[] m0VarArr = {m0Var, m0Var2, m0Var3};
        f450515g = m0VarArr;
        rz5.b.a(m0VarArr);
    }

    public m0(java.lang.String str, int i17) {
    }

    public static wx0.m0 valueOf(java.lang.String str) {
        return (wx0.m0) java.lang.Enum.valueOf(wx0.m0.class, str);
    }

    public static wx0.m0[] values() {
        return (wx0.m0[]) f450515g.clone();
    }
}
