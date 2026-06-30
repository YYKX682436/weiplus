package te2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l3 {

    /* renamed from: d, reason: collision with root package name */
    public static final te2.l3 f418200d;

    /* renamed from: e, reason: collision with root package name */
    public static final te2.l3 f418201e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ te2.l3[] f418202f;

    static {
        te2.l3 l3Var = new te2.l3("BEFORE_LIVE", 0, 1);
        f418200d = l3Var;
        te2.l3 l3Var2 = new te2.l3("DURING_LIVE", 1, 2);
        f418201e = l3Var2;
        te2.l3[] l3VarArr = {l3Var, l3Var2};
        f418202f = l3VarArr;
        rz5.b.a(l3VarArr);
    }

    public l3(java.lang.String str, int i17, int i18) {
    }

    public static te2.l3 valueOf(java.lang.String str) {
        return (te2.l3) java.lang.Enum.valueOf(te2.l3.class, str);
    }

    public static te2.l3[] values() {
        return (te2.l3[]) f418202f.clone();
    }
}
