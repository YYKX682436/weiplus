package q16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public abstract class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final q16.o0 f359776d;

    /* renamed from: e, reason: collision with root package name */
    public static final q16.o0 f359777e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q16.o0[] f359778f;

    static {
        final java.lang.String str = "PLAIN";
        final int i17 = 0;
        q16.o0 o0Var = new q16.o0(str, i17) { // from class: q16.n0
            @Override // q16.o0
            public java.lang.String a(java.lang.String string) {
                kotlin.jvm.internal.o.g(string, "string");
                return string;
            }
        };
        f359776d = o0Var;
        final java.lang.String str2 = "HTML";
        final int i18 = 1;
        q16.o0 o0Var2 = new q16.o0(str2, i18) { // from class: q16.m0
            @Override // q16.o0
            public java.lang.String a(java.lang.String string) {
                kotlin.jvm.internal.o.g(string, "string");
                return r26.i0.t(r26.i0.t(string, "<", "&lt;", false), ">", "&gt;", false);
            }
        };
        f359777e = o0Var2;
        q16.o0[] o0VarArr = {o0Var, o0Var2};
        f359778f = o0VarArr;
        rz5.b.a(o0VarArr);
    }

    public o0(java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
    }

    public static q16.o0 valueOf(java.lang.String str) {
        return (q16.o0) java.lang.Enum.valueOf(q16.o0.class, str);
    }

    public static q16.o0[] values() {
        return (q16.o0[]) f359778f.clone();
    }

    public abstract java.lang.String a(java.lang.String str);
}
