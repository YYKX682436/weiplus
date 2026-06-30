package cw0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a1 {

    /* renamed from: e, reason: collision with root package name */
    public static final cw0.z0 f222606e;

    /* renamed from: f, reason: collision with root package name */
    public static final cw0.a1 f222607f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cw0.a1[] f222608g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f222609h;

    /* renamed from: d, reason: collision with root package name */
    public final int f222610d;

    static {
        cw0.a1 a1Var = new cw0.a1("TIMBRE", 0, 1);
        f222607f = a1Var;
        cw0.a1[] a1VarArr = {a1Var, new cw0.a1("DIVIDER", 1, 0)};
        f222608g = a1VarArr;
        f222609h = rz5.b.a(a1VarArr);
        f222606e = new cw0.z0(null);
    }

    public a1(java.lang.String str, int i17, int i18) {
        this.f222610d = i18;
    }

    public static cw0.a1 valueOf(java.lang.String str) {
        return (cw0.a1) java.lang.Enum.valueOf(cw0.a1.class, str);
    }

    public static cw0.a1[] values() {
        return (cw0.a1[]) f222608g.clone();
    }
}
