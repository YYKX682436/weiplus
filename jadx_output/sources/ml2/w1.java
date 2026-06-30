package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class w1 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.w1 f328175e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.w1 f328176f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.w1 f328177g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.w1 f328178h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ml2.w1[] f328179i;

    /* renamed from: d, reason: collision with root package name */
    public final long f328180d;

    static {
        ml2.w1 w1Var = new ml2.w1("LIVE_EXIT_OK", 0, 1L);
        f328175e = w1Var;
        ml2.w1 w1Var2 = new ml2.w1("LIVE_EXIT_ERROR", 1, 2L);
        f328176f = w1Var2;
        ml2.w1 w1Var3 = new ml2.w1("LIVE_EXIT_CANCEL_TIMER", 2, 3L);
        f328177g = w1Var3;
        ml2.w1 w1Var4 = new ml2.w1("LIVE_EXIT_NOTHING", 3, 4L);
        f328178h = w1Var4;
        ml2.w1[] w1VarArr = {w1Var, w1Var2, w1Var3, w1Var4};
        f328179i = w1VarArr;
        rz5.b.a(w1VarArr);
    }

    public w1(java.lang.String str, int i17, long j17) {
        this.f328180d = j17;
    }

    public static ml2.w1 valueOf(java.lang.String str) {
        return (ml2.w1) java.lang.Enum.valueOf(ml2.w1.class, str);
    }

    public static ml2.w1[] values() {
        return (ml2.w1[]) f328179i.clone();
    }
}
