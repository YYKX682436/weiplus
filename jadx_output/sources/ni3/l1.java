package ni3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class l1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ni3.l1 f337627d;

    /* renamed from: e, reason: collision with root package name */
    public static final ni3.l1 f337628e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ni3.l1[] f337629f;

    static {
        ni3.l1 l1Var = new ni3.l1("IDLE", 0);
        ni3.l1 l1Var2 = new ni3.l1("ONE", 1);
        f337627d = l1Var2;
        ni3.l1 l1Var3 = new ni3.l1("TWO", 2);
        f337628e = l1Var3;
        ni3.l1[] l1VarArr = {l1Var, l1Var2, l1Var3, new ni3.l1("PRERENDER", 3)};
        f337629f = l1VarArr;
        rz5.b.a(l1VarArr);
    }

    public l1(java.lang.String str, int i17) {
    }

    public static ni3.l1 valueOf(java.lang.String str) {
        return (ni3.l1) java.lang.Enum.valueOf(ni3.l1.class, str);
    }

    public static ni3.l1[] values() {
        return (ni3.l1[]) f337629f.clone();
    }
}
