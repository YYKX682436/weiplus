package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s1 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.s1 f327915e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.s1 f327916f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml2.s1[] f327917g;

    /* renamed from: d, reason: collision with root package name */
    public final int f327918d;

    static {
        ml2.s1 s1Var = new ml2.s1("BEFORE", 0, 1);
        f327915e = s1Var;
        ml2.s1 s1Var2 = new ml2.s1("LIVING", 1, 2);
        f327916f = s1Var2;
        ml2.s1[] s1VarArr = {s1Var, s1Var2};
        f327917g = s1VarArr;
        rz5.b.a(s1VarArr);
    }

    public s1(java.lang.String str, int i17, int i18) {
        this.f327918d = i18;
    }

    public static ml2.s1 valueOf(java.lang.String str) {
        return (ml2.s1) java.lang.Enum.valueOf(ml2.s1.class, str);
    }

    public static ml2.s1[] values() {
        return (ml2.s1[]) f327917g.clone();
    }
}
