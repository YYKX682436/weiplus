package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.d2 f327351e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.d2 f327352f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml2.d2[] f327353g;

    /* renamed from: d, reason: collision with root package name */
    public final int f327354d;

    static {
        ml2.d2 d2Var = new ml2.d2("TASK_EXPOSURE", 0, 1);
        f327351e = d2Var;
        ml2.d2 d2Var2 = new ml2.d2("GET_EXPOSURE", 1, 2);
        ml2.d2 d2Var3 = new ml2.d2("TASK_CLICK", 2, 3);
        f327352f = d2Var3;
        ml2.d2[] d2VarArr = {d2Var, d2Var2, d2Var3, new ml2.d2("GET_CLICK", 3, 4)};
        f327353g = d2VarArr;
        rz5.b.a(d2VarArr);
    }

    public d2(java.lang.String str, int i17, int i18) {
        this.f327354d = i18;
    }

    public static ml2.d2 valueOf(java.lang.String str) {
        return (ml2.d2) java.lang.Enum.valueOf(ml2.d2.class, str);
    }

    public static ml2.d2[] values() {
        return (ml2.d2[]) f327353g.clone();
    }
}
