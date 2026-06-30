package db5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u9 {

    /* renamed from: d, reason: collision with root package name */
    public static final db5.u9 f228545d;

    /* renamed from: e, reason: collision with root package name */
    public static final db5.u9 f228546e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ db5.u9[] f228547f;

    static {
        db5.u9 u9Var = new db5.u9("SMALLBox", 0);
        f228545d = u9Var;
        db5.u9 u9Var2 = new db5.u9("MEDIUMBox", 1);
        f228546e = u9Var2;
        db5.u9[] u9VarArr = {u9Var, u9Var2};
        f228547f = u9VarArr;
        rz5.b.a(u9VarArr);
    }

    public u9(java.lang.String str, int i17) {
    }

    public static db5.u9 valueOf(java.lang.String str) {
        return (db5.u9) java.lang.Enum.valueOf(db5.u9.class, str);
    }

    public static db5.u9[] values() {
        return (db5.u9[]) f228547f.clone();
    }
}
