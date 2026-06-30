package ky;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ky.m0 f313392d;

    /* renamed from: e, reason: collision with root package name */
    public static final ky.m0 f313393e;

    /* renamed from: f, reason: collision with root package name */
    public static final ky.m0 f313394f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ky.m0[] f313395g;

    static {
        ky.m0 m0Var = new ky.m0("Normal", 0);
        f313392d = m0Var;
        ky.m0 m0Var2 = new ky.m0("VoiceInput", 1);
        f313393e = m0Var2;
        ky.m0 m0Var3 = new ky.m0("VoiceInputContinuous", 2);
        f313394f = m0Var3;
        ky.m0[] m0VarArr = {m0Var, m0Var2, m0Var3};
        f313395g = m0VarArr;
        rz5.b.a(m0VarArr);
    }

    public m0(java.lang.String str, int i17) {
    }

    public static ky.m0 valueOf(java.lang.String str) {
        return (ky.m0) java.lang.Enum.valueOf(ky.m0.class, str);
    }

    public static ky.m0[] values() {
        return (ky.m0[]) f313395g.clone();
    }
}
