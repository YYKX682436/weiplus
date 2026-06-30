package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d3 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.d3 f327355e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.d3 f327356f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.d3 f327357g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.d3 f327358h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ml2.d3[] f327359i;

    /* renamed from: d, reason: collision with root package name */
    public final long f327360d;

    static {
        ml2.d3 d3Var = new ml2.d3("LIVE_VERIFIED_PAGE_EXPOSURE", 0, 1L);
        f327355e = d3Var;
        ml2.d3 d3Var2 = new ml2.d3("LIVE_ENTER_VERIFIED_PAGE", 1, 2L);
        f327356f = d3Var2;
        ml2.d3 d3Var3 = new ml2.d3("LIVE_PASS_VERIFIED_SUCC", 2, 3L);
        f327357g = d3Var3;
        ml2.d3 d3Var4 = new ml2.d3("LIVE_PASS_VERIFIED_FAIL", 3, 4L);
        f327358h = d3Var4;
        ml2.d3[] d3VarArr = {d3Var, d3Var2, d3Var3, d3Var4};
        f327359i = d3VarArr;
        rz5.b.a(d3VarArr);
    }

    public d3(java.lang.String str, int i17, long j17) {
        this.f327360d = j17;
    }

    public static ml2.d3 valueOf(java.lang.String str) {
        return (ml2.d3) java.lang.Enum.valueOf(ml2.d3.class, str);
    }

    public static ml2.d3[] values() {
        return (ml2.d3[]) f327359i.clone();
    }
}
