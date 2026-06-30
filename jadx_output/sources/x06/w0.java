package x06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class w0 {

    /* renamed from: e, reason: collision with root package name */
    public static final x06.w0 f451330e;

    /* renamed from: f, reason: collision with root package name */
    public static final x06.w0 f451331f;

    /* renamed from: g, reason: collision with root package name */
    public static final x06.w0 f451332g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ x06.w0[] f451333h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f451334d;

    static {
        x06.w0 w0Var = new x06.w0("IGNORE", 0, "ignore");
        f451330e = w0Var;
        x06.w0 w0Var2 = new x06.w0("WARN", 1, "warn");
        f451331f = w0Var2;
        x06.w0 w0Var3 = new x06.w0("STRICT", 2, "strict");
        f451332g = w0Var3;
        x06.w0[] w0VarArr = {w0Var, w0Var2, w0Var3};
        f451333h = w0VarArr;
        rz5.b.a(w0VarArr);
    }

    public w0(java.lang.String str, int i17, java.lang.String str2) {
        this.f451334d = str2;
    }

    public static x06.w0 valueOf(java.lang.String str) {
        return (x06.w0) java.lang.Enum.valueOf(x06.w0.class, str);
    }

    public static x06.w0[] values() {
        return (x06.w0[]) f451333h.clone();
    }
}
