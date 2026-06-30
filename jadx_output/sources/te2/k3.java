package te2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k3 {

    /* renamed from: e, reason: collision with root package name */
    public static final te2.k3 f418162e;

    /* renamed from: f, reason: collision with root package name */
    public static final te2.k3 f418163f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ te2.k3[] f418164g;

    /* renamed from: d, reason: collision with root package name */
    public final int f418165d;

    static {
        te2.k3 k3Var = new te2.k3("HD_BUBBLE_EXPOSE", 0, 1);
        f418162e = k3Var;
        te2.k3 k3Var2 = new te2.k3("CLICK", 1, 2);
        f418163f = k3Var2;
        te2.k3[] k3VarArr = {k3Var, k3Var2, new te2.k3("REMIND_BUBBLE_EXPOSE", 2, 3)};
        f418164g = k3VarArr;
        rz5.b.a(k3VarArr);
    }

    public k3(java.lang.String str, int i17, int i18) {
        this.f418165d = i18;
    }

    public static te2.k3 valueOf(java.lang.String str) {
        return (te2.k3) java.lang.Enum.valueOf(te2.k3.class, str);
    }

    public static te2.k3[] values() {
        return (te2.k3[]) f418164g.clone();
    }
}
