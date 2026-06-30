package xc2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s0 {

    /* renamed from: d, reason: collision with root package name */
    public static final xc2.s0 f453290d;

    /* renamed from: e, reason: collision with root package name */
    public static final xc2.s0 f453291e;

    /* renamed from: f, reason: collision with root package name */
    public static final xc2.s0 f453292f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ xc2.s0[] f453293g;

    static {
        xc2.s0 s0Var = new xc2.s0("Like", 0);
        f453290d = s0Var;
        xc2.s0 s0Var2 = new xc2.s0("Follow", 1);
        f453291e = s0Var2;
        xc2.s0 s0Var3 = new xc2.s0("UnFollow", 2);
        f453292f = s0Var3;
        xc2.s0[] s0VarArr = {s0Var, s0Var2, s0Var3};
        f453293g = s0VarArr;
        rz5.b.a(s0VarArr);
    }

    public s0(java.lang.String str, int i17) {
    }

    public static xc2.s0 valueOf(java.lang.String str) {
        return (xc2.s0) java.lang.Enum.valueOf(xc2.s0.class, str);
    }

    public static xc2.s0[] values() {
        return (xc2.s0[]) f453293g.clone();
    }
}
