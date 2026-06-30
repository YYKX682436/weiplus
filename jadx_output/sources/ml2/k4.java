package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class k4 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.k4 f327649e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.k4 f327650f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.k4 f327651g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.k4[] f327652h;

    /* renamed from: d, reason: collision with root package name */
    public final int f327653d;

    static {
        ml2.k4 k4Var = new ml2.k4("REPLAY_PANEL", 0, 1);
        f327649e = k4Var;
        ml2.k4 k4Var2 = new ml2.k4("MY_HEAT_INFO", 1, 2);
        f327650f = k4Var2;
        ml2.k4 k4Var3 = new ml2.k4("REPLAY_DETAIL_PANEL", 2, 3);
        f327651g = k4Var3;
        ml2.k4[] k4VarArr = {k4Var, k4Var2, k4Var3};
        f327652h = k4VarArr;
        rz5.b.a(k4VarArr);
    }

    public k4(java.lang.String str, int i17, int i18) {
        this.f327653d = i18;
    }

    public static ml2.k4 valueOf(java.lang.String str) {
        return (ml2.k4) java.lang.Enum.valueOf(ml2.k4.class, str);
    }

    public static ml2.k4[] values() {
        return (ml2.k4[]) f327652h.clone();
    }
}
