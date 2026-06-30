package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r4 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.r4 f327910e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.r4 f327911f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml2.r4[] f327912g;

    /* renamed from: d, reason: collision with root package name */
    public final int f327913d;

    static {
        ml2.r4 r4Var = new ml2.r4("OPEN", 0, 1);
        f327910e = r4Var;
        ml2.r4 r4Var2 = new ml2.r4("CLOSE", 1, 2);
        f327911f = r4Var2;
        ml2.r4[] r4VarArr = {r4Var, r4Var2};
        f327912g = r4VarArr;
        rz5.b.a(r4VarArr);
    }

    public r4(java.lang.String str, int i17, int i18) {
        this.f327913d = i18;
    }

    public static ml2.r4 valueOf(java.lang.String str) {
        return (ml2.r4) java.lang.Enum.valueOf(ml2.r4.class, str);
    }

    public static ml2.r4[] values() {
        return (ml2.r4[]) f327912g.clone();
    }
}
