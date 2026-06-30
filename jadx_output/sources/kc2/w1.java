package kc2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class w1 {

    /* renamed from: e, reason: collision with root package name */
    public static final kc2.w1 f306514e;

    /* renamed from: f, reason: collision with root package name */
    public static final kc2.w1 f306515f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kc2.w1[] f306516g;

    /* renamed from: d, reason: collision with root package name */
    public final int f306517d;

    static {
        kc2.w1 w1Var = new kc2.w1("CLICK", 0, 1);
        f306514e = w1Var;
        kc2.w1 w1Var2 = new kc2.w1("EXIST", 1, 2);
        f306515f = w1Var2;
        kc2.w1[] w1VarArr = {w1Var, w1Var2};
        f306516g = w1VarArr;
        rz5.b.a(w1VarArr);
    }

    public w1(java.lang.String str, int i17, int i18) {
        this.f306517d = i18;
    }

    public static kc2.w1 valueOf(java.lang.String str) {
        return (kc2.w1) java.lang.Enum.valueOf(kc2.w1.class, str);
    }

    public static kc2.w1[] values() {
        return (kc2.w1[]) f306516g.clone();
    }
}
