package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m3 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.m3 f327713e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.m3 f327714f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml2.m3[] f327715g;

    /* renamed from: d, reason: collision with root package name */
    public final int f327716d;

    static {
        ml2.m3 m3Var = new ml2.m3("START_LIVE_BY_FINDER_IDENTITY", 0, 1);
        f327713e = m3Var;
        ml2.m3 m3Var2 = new ml2.m3("CREATE_FINDER", 1, 2);
        f327714f = m3Var2;
        ml2.m3[] m3VarArr = {m3Var, m3Var2, new ml2.m3("WECHAT_REALNAME_AUTH", 2, 3)};
        f327715g = m3VarArr;
        rz5.b.a(m3VarArr);
    }

    public m3(java.lang.String str, int i17, int i18) {
        this.f327716d = i18;
    }

    public static ml2.m3 valueOf(java.lang.String str) {
        return (ml2.m3) java.lang.Enum.valueOf(ml2.m3.class, str);
    }

    public static ml2.m3[] values() {
        return (ml2.m3[]) f327715g.clone();
    }
}
