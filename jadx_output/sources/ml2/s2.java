package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.s2 f327919e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.s2 f327920f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.s2 f327921g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ml2.s2[] f327922h;

    /* renamed from: d, reason: collision with root package name */
    public final int f327923d;

    static {
        ml2.s2 s2Var = new ml2.s2("INVALIDATE", 0, 0);
        f327919e = s2Var;
        ml2.s2 s2Var2 = new ml2.s2("AUDIO", 1, 1);
        f327920f = s2Var2;
        ml2.s2 s2Var3 = new ml2.s2("VIDEO", 2, 2);
        f327921g = s2Var3;
        ml2.s2[] s2VarArr = {s2Var, s2Var2, s2Var3};
        f327922h = s2VarArr;
        rz5.b.a(s2VarArr);
    }

    public s2(java.lang.String str, int i17, int i18) {
        this.f327923d = i18;
    }

    public static ml2.s2 valueOf(java.lang.String str) {
        return (ml2.s2) java.lang.Enum.valueOf(ml2.s2.class, str);
    }

    public static ml2.s2[] values() {
        return (ml2.s2[]) f327922h.clone();
    }
}
