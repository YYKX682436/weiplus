package k91;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v2 {

    /* renamed from: d, reason: collision with root package name */
    public static final k91.v2 f305790d;

    /* renamed from: e, reason: collision with root package name */
    public static final k91.v2 f305791e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ k91.v2[] f305792f;

    static {
        k91.v2 v2Var = new k91.v2("NORMAL", 0);
        f305790d = v2Var;
        k91.v2 v2Var2 = new k91.v2("APP_BRAND", 1);
        f305791e = v2Var2;
        k91.v2[] v2VarArr = {v2Var, v2Var2};
        f305792f = v2VarArr;
        rz5.b.a(v2VarArr);
    }

    public v2(java.lang.String str, int i17) {
    }

    public static k91.v2 valueOf(java.lang.String str) {
        return (k91.v2) java.lang.Enum.valueOf(k91.v2.class, str);
    }

    public static k91.v2[] values() {
        return (k91.v2[]) f305792f.clone();
    }
}
