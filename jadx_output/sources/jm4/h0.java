package jm4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final jm4.g0 f300387d;

    /* renamed from: e, reason: collision with root package name */
    public static final jm4.h0 f300388e;

    /* renamed from: f, reason: collision with root package name */
    public static final jm4.h0 f300389f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ jm4.h0[] f300390g;

    static {
        jm4.h0 h0Var = new jm4.h0("REQUEST", 0, 1);
        f300388e = h0Var;
        jm4.h0 h0Var2 = new jm4.h0("RELEASE", 1, 2);
        f300389f = h0Var2;
        jm4.h0[] h0VarArr = {h0Var, h0Var2, new jm4.h0("MAX", 2, 2), new jm4.h0("MIN", 3, 1), new jm4.h0("COUNT", 4, 2)};
        f300390g = h0VarArr;
        rz5.b.a(h0VarArr);
        f300387d = new jm4.g0(null);
    }

    public h0(java.lang.String str, int i17, int i18) {
    }

    public static jm4.h0 valueOf(java.lang.String str) {
        return (jm4.h0) java.lang.Enum.valueOf(jm4.h0.class, str);
    }

    public static jm4.h0[] values() {
        return (jm4.h0[]) f300390g.clone();
    }
}
