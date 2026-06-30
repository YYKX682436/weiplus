package mv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final mv.f0 f331501d;

    /* renamed from: e, reason: collision with root package name */
    public static final mv.f0 f331502e;

    /* renamed from: f, reason: collision with root package name */
    public static final mv.f0 f331503f;

    /* renamed from: g, reason: collision with root package name */
    public static final mv.f0 f331504g;

    /* renamed from: h, reason: collision with root package name */
    public static final mv.f0 f331505h;

    /* renamed from: i, reason: collision with root package name */
    public static final mv.f0 f331506i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ mv.f0[] f331507m;

    static {
        mv.f0 f0Var = new mv.f0("STATUS_NORMAL", 0, 0);
        f331501d = f0Var;
        mv.f0 f0Var2 = new mv.f0("STATUS_ERROR", 1, 1);
        f331502e = f0Var2;
        mv.f0 f0Var3 = new mv.f0("STATUS_PREPARING", 2, 2);
        f331503f = f0Var3;
        mv.f0 f0Var4 = new mv.f0("STATUS_RUNNING", 3, 3);
        f331504g = f0Var4;
        mv.f0 f0Var5 = new mv.f0("STATUS_IMPORTING", 4, 4);
        f331505h = f0Var5;
        mv.f0 f0Var6 = new mv.f0("STATUS_DELETING", 5, 5);
        f331506i = f0Var6;
        mv.f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6};
        f331507m = f0VarArr;
        rz5.b.a(f0VarArr);
    }

    public f0(java.lang.String str, int i17, int i18) {
    }

    public static mv.f0 valueOf(java.lang.String str) {
        return (mv.f0) java.lang.Enum.valueOf(mv.f0.class, str);
    }

    public static mv.f0[] values() {
        return (mv.f0[]) f331507m.clone();
    }
}
