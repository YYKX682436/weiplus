package ty;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class t0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ty.t0 f422763e;

    /* renamed from: f, reason: collision with root package name */
    public static final ty.t0 f422764f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ty.t0[] f422765g;

    /* renamed from: d, reason: collision with root package name */
    public final long f422766d;

    static {
        ty.t0 t0Var = new ty.t0("SELF_MESSAGE", 0, 1L);
        f422763e = t0Var;
        ty.t0 t0Var2 = new ty.t0("OTHERS_MESSAGE", 1, 2L);
        f422764f = t0Var2;
        ty.t0[] t0VarArr = {t0Var, t0Var2};
        f422765g = t0VarArr;
        rz5.b.a(t0VarArr);
    }

    public t0(java.lang.String str, int i17, long j17) {
        this.f422766d = j17;
    }

    public static ty.t0 valueOf(java.lang.String str) {
        return (ty.t0) java.lang.Enum.valueOf(ty.t0.class, str);
    }

    public static ty.t0[] values() {
        return (ty.t0[]) f422765g.clone();
    }
}
