package ss4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ss4.n0 f412105d;

    /* renamed from: e, reason: collision with root package name */
    public static final ss4.n0 f412106e;

    /* renamed from: f, reason: collision with root package name */
    public static final ss4.n0 f412107f;

    /* renamed from: g, reason: collision with root package name */
    public static final ss4.n0 f412108g;

    /* renamed from: h, reason: collision with root package name */
    public static final ss4.n0 f412109h;

    /* renamed from: i, reason: collision with root package name */
    public static final ss4.n0 f412110i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ss4.n0[] f412111m;

    static {
        ss4.n0 n0Var = new ss4.n0("QUERY_WECHAT_WALLET", 0);
        f412105d = n0Var;
        ss4.n0 n0Var2 = new ss4.n0("SET_USER_WALLET", 1);
        f412106e = n0Var2;
        ss4.n0 n0Var3 = new ss4.n0("QUERY_USER_WALLET", 2);
        f412107f = n0Var3;
        ss4.n0 n0Var4 = new ss4.n0("PAY_IBG_QUICK_GET_OVERSEA_WALLET", 3);
        f412108g = n0Var4;
        ss4.n0 n0Var5 = new ss4.n0("PAY_IBG_GET_OVERSEA_WALLET", 4);
        f412109h = n0Var5;
        ss4.n0 n0Var6 = new ss4.n0("QUERY_BOUND_BANK_CARD", 5);
        f412110i = n0Var6;
        ss4.n0[] n0VarArr = {n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6};
        f412111m = n0VarArr;
        rz5.b.a(n0VarArr);
    }

    public n0(java.lang.String str, int i17) {
    }

    public static ss4.n0 valueOf(java.lang.String str) {
        return (ss4.n0) java.lang.Enum.valueOf(ss4.n0.class, str);
    }

    public static ss4.n0[] values() {
        return (ss4.n0[]) f412111m.clone();
    }
}
