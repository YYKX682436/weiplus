package ym5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: d, reason: collision with root package name */
    public static final ym5.q2 f463478d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ym5.q2[] f463479e;

    static {
        ym5.q2 q2Var = new ym5.q2("BOTTOM", 0);
        f463478d = q2Var;
        ym5.q2[] q2VarArr = {q2Var, new ym5.q2("INSIDE", 1), new ym5.q2("NONE", 2)};
        f463479e = q2VarArr;
        rz5.b.a(q2VarArr);
    }

    public q2(java.lang.String str, int i17) {
    }

    public static ym5.q2 valueOf(java.lang.String str) {
        return (ym5.q2) java.lang.Enum.valueOf(ym5.q2.class, str);
    }

    public static ym5.q2[] values() {
        return (ym5.q2[]) f463479e.clone();
    }
}
