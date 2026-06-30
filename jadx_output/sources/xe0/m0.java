package xe0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final xe0.m0 f453754d;

    /* renamed from: e, reason: collision with root package name */
    public static final xe0.m0 f453755e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ xe0.m0[] f453756f;

    static {
        xe0.m0 m0Var = new xe0.m0("LEFT", 0);
        f453755e = m0Var;
        xe0.m0 m0Var2 = new xe0.m0("RIGHT", 1);
        xe0.m0[] m0VarArr = {m0Var, m0Var2};
        f453756f = m0VarArr;
        rz5.b.a(m0VarArr);
        f453754d = m0Var2;
    }

    public m0(java.lang.String str, int i17) {
    }

    public static xe0.m0 valueOf(java.lang.String str) {
        return (xe0.m0) java.lang.Enum.valueOf(xe0.m0.class, str);
    }

    public static xe0.m0[] values() {
        return (xe0.m0[]) f453756f.clone();
    }
}
