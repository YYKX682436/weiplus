package qk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class x9 {

    /* renamed from: d, reason: collision with root package name */
    public static final qk.x9 f364368d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ qk.x9[] f364369e;

    static {
        qk.x9 x9Var = new qk.x9("Music", 0);
        f364368d = x9Var;
        qk.x9[] x9VarArr = {x9Var, new qk.x9("Audio", 1)};
        f364369e = x9VarArr;
        rz5.b.a(x9VarArr);
    }

    public x9(java.lang.String str, int i17) {
    }

    public static qk.x9 valueOf(java.lang.String str) {
        return (qk.x9) java.lang.Enum.valueOf(qk.x9.class, str);
    }

    public static qk.x9[] values() {
        return (qk.x9[]) f364369e.clone();
    }
}
