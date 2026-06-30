package k91;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class y2 {

    /* renamed from: d, reason: collision with root package name */
    public static final k91.y2 f305827d;

    /* renamed from: e, reason: collision with root package name */
    public static final k91.y2 f305828e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k91.y2[] f305829f;

    static {
        k91.y2 y2Var = new k91.y2("NORMAL", 0);
        f305827d = y2Var;
        k91.y2 y2Var2 = new k91.y2("FAKE_NATIVE", 1);
        f305828e = y2Var2;
        k91.y2[] y2VarArr = {y2Var, y2Var2};
        f305829f = y2VarArr;
        rz5.b.a(y2VarArr);
    }

    public y2(java.lang.String str, int i17) {
    }

    public static k91.y2 valueOf(java.lang.String str) {
        return (k91.y2) java.lang.Enum.valueOf(k91.y2.class, str);
    }

    public static k91.y2[] values() {
        return (k91.y2[]) f305829f.clone();
    }
}
