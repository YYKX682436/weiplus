package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.f2 f327423e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.f2 f327424f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.f2 f327425g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.f2 f327426h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ml2.f2[] f327427i;

    /* renamed from: d, reason: collision with root package name */
    public final int f327428d;

    static {
        ml2.f2 f2Var = new ml2.f2("ICON_EXPOSE", 0, 1);
        f327423e = f2Var;
        ml2.f2 f2Var2 = new ml2.f2("ICON_CLICK", 1, 2);
        f327424f = f2Var2;
        ml2.f2 f2Var3 = new ml2.f2("GET_SUCCESS", 2, 3);
        f327425g = f2Var3;
        ml2.f2 f2Var4 = new ml2.f2("GET_FAIL", 3, 4);
        f327426h = f2Var4;
        ml2.f2[] f2VarArr = {f2Var, f2Var2, f2Var3, f2Var4};
        f327427i = f2VarArr;
        rz5.b.a(f2VarArr);
    }

    public f2(java.lang.String str, int i17, int i18) {
        this.f327428d = i18;
    }

    public static ml2.f2 valueOf(java.lang.String str) {
        return (ml2.f2) java.lang.Enum.valueOf(ml2.f2.class, str);
    }

    public static ml2.f2[] values() {
        return (ml2.f2[]) f327427i.clone();
    }
}
