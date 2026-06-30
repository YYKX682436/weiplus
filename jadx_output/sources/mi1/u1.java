package mi1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class u1 {

    /* renamed from: d, reason: collision with root package name */
    public static final mi1.u1 f326698d;

    /* renamed from: e, reason: collision with root package name */
    public static final mi1.u1 f326699e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ mi1.u1[] f326700f;

    static {
        mi1.u1 u1Var = new mi1.u1("NORMAL", 0);
        f326698d = u1Var;
        mi1.u1 u1Var2 = new mi1.u1("WITH_ROUND_CIRCLE", 1);
        f326699e = u1Var2;
        mi1.u1[] u1VarArr = {u1Var, u1Var2};
        f326700f = u1VarArr;
        rz5.b.a(u1VarArr);
    }

    public u1(java.lang.String str, int i17) {
    }

    public static mi1.u1 valueOf(java.lang.String str) {
        return (mi1.u1) java.lang.Enum.valueOf(mi1.u1.class, str);
    }

    public static mi1.u1[] values() {
        return (mi1.u1[]) f326700f.clone();
    }
}
