package re2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final re2.a0 f394355d;

    /* renamed from: e, reason: collision with root package name */
    public static final re2.a0 f394356e;

    /* renamed from: f, reason: collision with root package name */
    public static final re2.a0 f394357f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ re2.a0[] f394358g;

    static {
        re2.a0 a0Var = new re2.a0("IDLE", 0);
        f394355d = a0Var;
        re2.a0 a0Var2 = new re2.a0("POLLING", 1);
        f394356e = a0Var2;
        re2.a0 a0Var3 = new re2.a0("DEAD", 2);
        f394357f = a0Var3;
        re2.a0[] a0VarArr = {a0Var, a0Var2, a0Var3};
        f394358g = a0VarArr;
        rz5.b.a(a0VarArr);
    }

    public a0(java.lang.String str, int i17) {
    }

    public static re2.a0 valueOf(java.lang.String str) {
        return (re2.a0) java.lang.Enum.valueOf(re2.a0.class, str);
    }

    public static re2.a0[] values() {
        return (re2.a0[]) f394358g.clone();
    }
}
