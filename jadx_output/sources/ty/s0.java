package ty;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ty.s0 f422757e;

    /* renamed from: f, reason: collision with root package name */
    public static final ty.s0 f422758f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ty.s0[] f422759g;

    /* renamed from: d, reason: collision with root package name */
    public final long f422760d;

    static {
        ty.s0 s0Var = new ty.s0("FULL_QUOTE", 0, 1L);
        f422757e = s0Var;
        ty.s0 s0Var2 = new ty.s0("PARTIAL_QUOTE", 1, 2L);
        f422758f = s0Var2;
        ty.s0[] s0VarArr = {s0Var, s0Var2};
        f422759g = s0VarArr;
        rz5.b.a(s0VarArr);
    }

    public s0(java.lang.String str, int i17, long j17) {
        this.f422760d = j17;
    }

    public static ty.s0 valueOf(java.lang.String str) {
        return (ty.s0) java.lang.Enum.valueOf(ty.s0.class, str);
    }

    public static ty.s0[] values() {
        return (ty.s0[]) f422759g.clone();
    }
}
