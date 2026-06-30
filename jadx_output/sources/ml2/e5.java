package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e5 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.e5 f327389e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.e5 f327390f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.e5 f327391g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.e5[] f327392h;

    /* renamed from: d, reason: collision with root package name */
    public final int f327393d;

    static {
        ml2.e5 e5Var = new ml2.e5("UNKNOWN", 0, -1);
        f327389e = e5Var;
        ml2.e5 e5Var2 = new ml2.e5("ANCHOR", 1, 1);
        f327390f = e5Var2;
        ml2.e5 e5Var3 = new ml2.e5("LINKMIC_VISITOR", 2, 2);
        f327391g = e5Var3;
        ml2.e5[] e5VarArr = {e5Var, e5Var2, e5Var3};
        f327392h = e5VarArr;
        rz5.b.a(e5VarArr);
    }

    public e5(java.lang.String str, int i17, int i18) {
        this.f327393d = i18;
    }

    public static ml2.e5 valueOf(java.lang.String str) {
        return (ml2.e5) java.lang.Enum.valueOf(ml2.e5.class, str);
    }

    public static ml2.e5[] values() {
        return (ml2.e5[]) f327392h.clone();
    }
}
