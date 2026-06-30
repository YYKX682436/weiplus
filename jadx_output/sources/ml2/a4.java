package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a4 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.a4 f327204e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.a4 f327205f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml2.a4[] f327206g;

    /* renamed from: d, reason: collision with root package name */
    public final int f327207d;

    static {
        ml2.a4 a4Var = new ml2.a4("PUBLIC", 0, 0);
        f327204e = a4Var;
        ml2.a4 a4Var2 = new ml2.a4("NUMBER_TO_SEE", 1, 1);
        f327205f = a4Var2;
        ml2.a4[] a4VarArr = {a4Var, a4Var2, new ml2.a4("ONLY_ANCHOR_SHARE", 2, 2)};
        f327206g = a4VarArr;
        rz5.b.a(a4VarArr);
    }

    public a4(java.lang.String str, int i17, int i18) {
        this.f327207d = i18;
    }

    public static ml2.a4 valueOf(java.lang.String str) {
        return (ml2.a4) java.lang.Enum.valueOf(ml2.a4.class, str);
    }

    public static ml2.a4[] values() {
        return (ml2.a4[]) f327206g.clone();
    }
}
