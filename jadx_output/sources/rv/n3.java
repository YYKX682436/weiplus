package rv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class n3 {

    /* renamed from: d, reason: collision with root package name */
    public static final rv.n3 f399884d;

    /* renamed from: e, reason: collision with root package name */
    public static final rv.n3 f399885e;

    /* renamed from: f, reason: collision with root package name */
    public static final rv.n3 f399886f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rv.n3[] f399887g;

    static {
        rv.n3 n3Var = new rv.n3("UNREAD_COUNT_TYPE_NO", 0, 0);
        f399884d = n3Var;
        rv.n3 n3Var2 = new rv.n3("UNREAD_COUNT_TYPE_MUTED", 1, 1);
        f399885e = n3Var2;
        rv.n3 n3Var3 = new rv.n3("UNREAD_COUNT_TYPE_SHOW", 2, 2);
        f399886f = n3Var3;
        rv.n3[] n3VarArr = {n3Var, n3Var2, n3Var3};
        f399887g = n3VarArr;
        rz5.b.a(n3VarArr);
    }

    public n3(java.lang.String str, int i17, int i18) {
    }

    public static rv.n3 valueOf(java.lang.String str) {
        return (rv.n3) java.lang.Enum.valueOf(rv.n3.class, str);
    }

    public static rv.n3[] values() {
        return (rv.n3[]) f399887g.clone();
    }
}
