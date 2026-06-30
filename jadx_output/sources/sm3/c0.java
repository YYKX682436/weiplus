package sm3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final sm3.c0 f409838d;

    /* renamed from: e, reason: collision with root package name */
    public static final sm3.c0 f409839e;

    /* renamed from: f, reason: collision with root package name */
    public static final sm3.c0 f409840f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ sm3.c0[] f409841g;

    static {
        sm3.c0 c0Var = new sm3.c0("None", 0);
        f409838d = c0Var;
        sm3.c0 c0Var2 = new sm3.c0("Left", 1);
        f409839e = c0Var2;
        sm3.c0 c0Var3 = new sm3.c0("Right", 2);
        f409840f = c0Var3;
        sm3.c0[] c0VarArr = {c0Var, c0Var2, c0Var3};
        f409841g = c0VarArr;
        rz5.b.a(c0VarArr);
    }

    public c0(java.lang.String str, int i17) {
    }

    public static sm3.c0 valueOf(java.lang.String str) {
        return (sm3.c0) java.lang.Enum.valueOf(sm3.c0.class, str);
    }

    public static sm3.c0[] values() {
        return (sm3.c0[]) f409841g.clone();
    }
}
