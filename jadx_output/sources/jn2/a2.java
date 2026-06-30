package jn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a2 {

    /* renamed from: d, reason: collision with root package name */
    public static final jn2.a2 f300550d;

    /* renamed from: e, reason: collision with root package name */
    public static final jn2.a2 f300551e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jn2.a2[] f300552f;

    static {
        jn2.a2 a2Var = new jn2.a2("BOARD", 0);
        f300550d = a2Var;
        jn2.a2 a2Var2 = new jn2.a2("SEARCH", 1);
        f300551e = a2Var2;
        jn2.a2[] a2VarArr = {a2Var, a2Var2};
        f300552f = a2VarArr;
        rz5.b.a(a2VarArr);
    }

    public a2(java.lang.String str, int i17) {
    }

    public static jn2.a2 valueOf(java.lang.String str) {
        return (jn2.a2) java.lang.Enum.valueOf(jn2.a2.class, str);
    }

    public static jn2.a2[] values() {
        return (jn2.a2[]) f300552f.clone();
    }
}
