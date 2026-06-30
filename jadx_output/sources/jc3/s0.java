package jc3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: d, reason: collision with root package name */
    public static final jc3.s0 f298984d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ jc3.s0[] f298985e;

    static {
        jc3.s0 s0Var = new jc3.s0("Runtime", 0);
        f298984d = s0Var;
        jc3.s0[] s0VarArr = {s0Var, new jc3.s0("PreLayout", 1), new jc3.s0("PreLayoutWithCacheHeight", 2), new jc3.s0("PreLayoutWithCover", 3)};
        f298985e = s0VarArr;
        rz5.b.a(s0VarArr);
    }

    public s0(java.lang.String str, int i17) {
    }

    public static jc3.s0 valueOf(java.lang.String str) {
        return (jc3.s0) java.lang.Enum.valueOf(jc3.s0.class, str);
    }

    public static jc3.s0[] values() {
        return (jc3.s0[]) f298985e.clone();
    }
}
