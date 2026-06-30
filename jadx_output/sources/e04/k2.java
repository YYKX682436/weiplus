package e04;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class k2 {

    /* renamed from: e, reason: collision with root package name */
    public static final e04.k2 f246000e;

    /* renamed from: f, reason: collision with root package name */
    public static final e04.k2 f246001f;

    /* renamed from: g, reason: collision with root package name */
    public static final e04.k2 f246002g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ e04.k2[] f246003h;

    /* renamed from: d, reason: collision with root package name */
    public final int f246004d;

    static {
        e04.k2 k2Var = new e04.k2("NOT_RETRY", 0, 1);
        f246000e = k2Var;
        e04.k2 k2Var2 = new e04.k2("RETRY_BY_PREVIEW_TIMEOUT", 1, 2);
        f246001f = k2Var2;
        e04.k2 k2Var3 = new e04.k2("RETRY_BY_STAY_TIMEOUT", 2, 3);
        f246002g = k2Var3;
        e04.k2[] k2VarArr = {k2Var, k2Var2, k2Var3};
        f246003h = k2VarArr;
        rz5.b.a(k2VarArr);
    }

    public k2(java.lang.String str, int i17, int i18) {
        this.f246004d = i18;
    }

    public static e04.k2 valueOf(java.lang.String str) {
        return (e04.k2) java.lang.Enum.valueOf(e04.k2.class, str);
    }

    public static e04.k2[] values() {
        return (e04.k2[]) f246003h.clone();
    }
}
