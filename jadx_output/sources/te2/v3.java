package te2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v3 {

    /* renamed from: d, reason: collision with root package name */
    public static final te2.v3 f418491d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ te2.v3[] f418492e;

    static {
        te2.v3 v3Var = new te2.v3("NEW", 0);
        f418491d = v3Var;
        te2.v3[] v3VarArr = {v3Var, new te2.v3("OPENED", 1), new te2.v3("ALL_SNATCHED", 2)};
        f418492e = v3VarArr;
        rz5.b.a(v3VarArr);
    }

    public v3(java.lang.String str, int i17) {
    }

    public static te2.v3 valueOf(java.lang.String str) {
        return (te2.v3) java.lang.Enum.valueOf(te2.v3.class, str);
    }

    public static te2.v3[] values() {
        return (te2.v3[]) f418492e.clone();
    }
}
