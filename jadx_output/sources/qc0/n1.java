package qc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class n1 {

    /* renamed from: d, reason: collision with root package name */
    public static final qc0.n1 f361417d;

    /* renamed from: e, reason: collision with root package name */
    public static final qc0.n1 f361418e;

    /* renamed from: f, reason: collision with root package name */
    public static final qc0.n1 f361419f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ qc0.n1[] f361420g;

    static {
        qc0.n1 n1Var = new qc0.n1("Video", 0);
        f361417d = n1Var;
        qc0.n1 n1Var2 = new qc0.n1("Photo", 1);
        f361418e = n1Var2;
        qc0.n1 n1Var3 = new qc0.n1("LivePhoto", 2);
        f361419f = n1Var3;
        qc0.n1[] n1VarArr = {n1Var, n1Var2, n1Var3};
        f361420g = n1VarArr;
        rz5.b.a(n1VarArr);
    }

    public n1(java.lang.String str, int i17) {
    }

    public static qc0.n1 valueOf(java.lang.String str) {
        return (qc0.n1) java.lang.Enum.valueOf(qc0.n1.class, str);
    }

    public static qc0.n1[] values() {
        return (qc0.n1[]) f361420g.clone();
    }
}
