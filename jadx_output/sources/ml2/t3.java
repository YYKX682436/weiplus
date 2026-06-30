package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class t3 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.t3 f328015e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.t3 f328016f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml2.t3[] f328017g;

    /* renamed from: d, reason: collision with root package name */
    public final int f328018d;

    static {
        ml2.t3 t3Var = new ml2.t3("LIVE_SCREEN_PORTRAIT", 0, 1);
        f328015e = t3Var;
        ml2.t3 t3Var2 = new ml2.t3("LIVE_SCREEN_HORIZONTAL", 1, 2);
        f328016f = t3Var2;
        ml2.t3[] t3VarArr = {t3Var, t3Var2};
        f328017g = t3VarArr;
        rz5.b.a(t3VarArr);
    }

    public t3(java.lang.String str, int i17, int i18) {
        this.f328018d = i18;
    }

    public static ml2.t3 valueOf(java.lang.String str) {
        return (ml2.t3) java.lang.Enum.valueOf(ml2.t3.class, str);
    }

    public static ml2.t3[] values() {
        return (ml2.t3[]) f328017g.clone();
    }
}
