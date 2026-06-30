package so2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class g5 {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.g5 f410362d;

    /* renamed from: e, reason: collision with root package name */
    public static final so2.g5 f410363e;

    /* renamed from: f, reason: collision with root package name */
    public static final so2.g5 f410364f;

    /* renamed from: g, reason: collision with root package name */
    public static final so2.g5 f410365g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ so2.g5[] f410366h;

    static {
        so2.g5 g5Var = new so2.g5("NoSystemPoiPermission", 0);
        f410362d = g5Var;
        so2.g5 g5Var2 = new so2.g5("NoBusinessPoiPermission", 1);
        f410363e = g5Var2;
        so2.g5 g5Var3 = new so2.g5("TeenModeForbidden", 2);
        f410364f = g5Var3;
        so2.g5 g5Var4 = new so2.g5("ConfigForbidden", 3);
        f410365g = g5Var4;
        so2.g5[] g5VarArr = {g5Var, g5Var2, g5Var3, g5Var4};
        f410366h = g5VarArr;
        rz5.b.a(g5VarArr);
    }

    public g5(java.lang.String str, int i17) {
    }

    public static so2.g5 valueOf(java.lang.String str) {
        return (so2.g5) java.lang.Enum.valueOf(so2.g5.class, str);
    }

    public static so2.g5[] values() {
        return (so2.g5[]) f410366h.clone();
    }
}
