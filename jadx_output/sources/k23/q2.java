package k23;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class q2 {

    /* renamed from: e, reason: collision with root package name */
    public static final k23.q2 f303670e;

    /* renamed from: f, reason: collision with root package name */
    public static final k23.q2 f303671f;

    /* renamed from: g, reason: collision with root package name */
    public static final k23.q2 f303672g;

    /* renamed from: h, reason: collision with root package name */
    public static final k23.q2 f303673h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k23.q2[] f303674i;

    /* renamed from: d, reason: collision with root package name */
    public final int f303675d;

    static {
        k23.q2 q2Var = new k23.q2("Ok", 0, 0);
        f303670e = q2Var;
        k23.q2 q2Var2 = new k23.q2("OccupiedError", 1, -1);
        f303671f = q2Var2;
        k23.q2 q2Var3 = new k23.q2("NetworkError", 2, -2);
        f303672g = q2Var3;
        k23.q2 q2Var4 = new k23.q2("PermissionError", 3, -3);
        f303673h = q2Var4;
        k23.q2[] q2VarArr = {q2Var, q2Var2, q2Var3, q2Var4};
        f303674i = q2VarArr;
        rz5.b.a(q2VarArr);
    }

    public q2(java.lang.String str, int i17, int i18) {
        this.f303675d = i18;
    }

    public static k23.q2 valueOf(java.lang.String str) {
        return (k23.q2) java.lang.Enum.valueOf(k23.q2.class, str);
    }

    public static k23.q2[] values() {
        return (k23.q2[]) f303674i.clone();
    }
}
