package m31;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final m31.p0 f323175d;

    /* renamed from: e, reason: collision with root package name */
    public static final m31.p0 f323176e;

    /* renamed from: f, reason: collision with root package name */
    public static final m31.p0 f323177f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ m31.p0[] f323178g;

    static {
        m31.p0 p0Var = new m31.p0("Normal", 0);
        f323175d = p0Var;
        m31.p0 p0Var2 = new m31.p0("SingleMode", 1);
        f323176e = p0Var2;
        m31.p0 p0Var3 = new m31.p0("SingleVoiceMode", 2);
        f323177f = p0Var3;
        m31.p0[] p0VarArr = {p0Var, p0Var2, p0Var3};
        f323178g = p0VarArr;
        rz5.b.a(p0VarArr);
    }

    public p0(java.lang.String str, int i17) {
    }

    public static m31.p0 valueOf(java.lang.String str) {
        return (m31.p0) java.lang.Enum.valueOf(m31.p0.class, str);
    }

    public static m31.p0[] values() {
        return (m31.p0[]) f323178g.clone();
    }
}
