package df2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: e, reason: collision with root package name */
    public static final df2.k0 f230531e;

    /* renamed from: f, reason: collision with root package name */
    public static final df2.k0 f230532f;

    /* renamed from: g, reason: collision with root package name */
    public static final df2.k0 f230533g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ df2.k0[] f230534h;

    /* renamed from: d, reason: collision with root package name */
    public final int f230535d;

    static {
        df2.k0 k0Var = new df2.k0("ACTION_SHEET_SHOOT", 0, 1);
        df2.k0 k0Var2 = new df2.k0("ACTION_SHEET_ALBUM", 1, 2);
        f230531e = k0Var2;
        df2.k0 k0Var3 = new df2.k0("ACTION_SHEET_AVATAR", 2, 3);
        f230532f = k0Var3;
        df2.k0 k0Var4 = new df2.k0("ACTION_SHEET_CANCEL", 3, 4);
        f230533g = k0Var4;
        df2.k0[] k0VarArr = {k0Var, k0Var2, k0Var3, k0Var4};
        f230534h = k0VarArr;
        rz5.b.a(k0VarArr);
    }

    public k0(java.lang.String str, int i17, int i18) {
        this.f230535d = i18;
    }

    public static df2.k0 valueOf(java.lang.String str) {
        return (df2.k0) java.lang.Enum.valueOf(df2.k0.class, str);
    }

    public static df2.k0[] values() {
        return (df2.k0[]) f230534h.clone();
    }
}
