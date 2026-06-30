package db5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class l2 {

    /* renamed from: d, reason: collision with root package name */
    public static final db5.l2 f228428d;

    /* renamed from: e, reason: collision with root package name */
    public static final db5.l2 f228429e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ db5.l2[] f228430f;

    static {
        db5.l2 l2Var = new db5.l2("Left", 0);
        f228428d = l2Var;
        db5.l2 l2Var2 = new db5.l2("Right", 1);
        f228429e = l2Var2;
        db5.l2[] l2VarArr = {l2Var, l2Var2};
        f228430f = l2VarArr;
        rz5.b.a(l2VarArr);
    }

    public l2(java.lang.String str, int i17) {
    }

    public static db5.l2 valueOf(java.lang.String str) {
        return (db5.l2) java.lang.Enum.valueOf(db5.l2.class, str);
    }

    public static db5.l2[] values() {
        return (db5.l2[]) f228430f.clone();
    }
}
