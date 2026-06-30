package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w3 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.w3 f328182e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.w3 f328183f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.w3 f328184g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.w3[] f328185h;

    /* renamed from: d, reason: collision with root package name */
    public final int f328186d;

    static {
        ml2.w3 w3Var = new ml2.w3("LIVE_NO_SHOP_PERMIT", 0, 1);
        f328182e = w3Var;
        ml2.w3 w3Var2 = new ml2.w3("LIVE_SHOP_PERMIT_NO_SMALL_STORE", 1, 2);
        f328183f = w3Var2;
        ml2.w3 w3Var3 = new ml2.w3("LIVE_SHOP_PERMIT_SMALL_STORE", 2, 3);
        f328184g = w3Var3;
        ml2.w3[] w3VarArr = {w3Var, w3Var2, w3Var3};
        f328185h = w3VarArr;
        rz5.b.a(w3VarArr);
    }

    public w3(java.lang.String str, int i17, int i18) {
        this.f328186d = i18;
    }

    public static ml2.w3 valueOf(java.lang.String str) {
        return (ml2.w3) java.lang.Enum.valueOf(ml2.w3.class, str);
    }

    public static ml2.w3[] values() {
        return (ml2.w3[]) f328185h.clone();
    }
}
