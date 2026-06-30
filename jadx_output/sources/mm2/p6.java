package mm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p6 {

    /* renamed from: f, reason: collision with root package name */
    public static final mm2.p6 f329353f;

    /* renamed from: g, reason: collision with root package name */
    public static final mm2.p6 f329354g;

    /* renamed from: h, reason: collision with root package name */
    public static final mm2.p6 f329355h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ mm2.p6[] f329356i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f329357d;

    /* renamed from: e, reason: collision with root package name */
    public final int f329358e;

    static {
        mm2.p6 p6Var = new mm2.p6("SPRING_SNG_TOAST", 0, "SPRING_SNG_TOAST", 1);
        f329353f = p6Var;
        mm2.p6 p6Var2 = new mm2.p6("LOTTERY_RESULT_TOAST", 1, "LOTTERY_RESULT_TOAST", 1);
        f329354g = p6Var2;
        mm2.p6 p6Var3 = new mm2.p6("LIVE_BOX_TOAST", 2, "LIVE_BOX_TOAST", 2);
        f329355h = p6Var3;
        mm2.p6[] p6VarArr = {p6Var, p6Var2, p6Var3};
        f329356i = p6VarArr;
        rz5.b.a(p6VarArr);
    }

    public p6(java.lang.String str, int i17, java.lang.String str2, int i18) {
        this.f329357d = str2;
        this.f329358e = i18;
    }

    public static mm2.p6 valueOf(java.lang.String str) {
        return (mm2.p6) java.lang.Enum.valueOf(mm2.p6.class, str);
    }

    public static mm2.p6[] values() {
        return (mm2.p6[]) f329356i.clone();
    }
}
