package hk0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: d, reason: collision with root package name */
    public static final hk0.d1 f281720d;

    /* renamed from: e, reason: collision with root package name */
    public static final hk0.d1 f281721e;

    /* renamed from: f, reason: collision with root package name */
    public static final hk0.d1 f281722f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ hk0.d1[] f281723g;

    static {
        hk0.d1 d1Var = new hk0.d1("UNDO", 0);
        f281720d = d1Var;
        hk0.d1 d1Var2 = new hk0.d1("FORWARD", 1);
        f281721e = d1Var2;
        hk0.d1 d1Var3 = new hk0.d1("EDIT", 2);
        f281722f = d1Var3;
        hk0.d1[] d1VarArr = {d1Var, d1Var2, d1Var3};
        f281723g = d1VarArr;
        rz5.b.a(d1VarArr);
    }

    public d1(java.lang.String str, int i17) {
    }

    public static hk0.d1 valueOf(java.lang.String str) {
        return (hk0.d1) java.lang.Enum.valueOf(hk0.d1.class, str);
    }

    public static hk0.d1[] values() {
        return (hk0.d1[]) f281723g.clone();
    }
}
