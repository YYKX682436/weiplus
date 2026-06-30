package qk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class m8 {

    /* renamed from: d, reason: collision with root package name */
    public static final qk.m8 f364250d;

    /* renamed from: e, reason: collision with root package name */
    public static final qk.m8 f364251e;

    /* renamed from: f, reason: collision with root package name */
    public static final qk.m8 f364252f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ qk.m8[] f364253g;

    static {
        qk.m8 m8Var = new qk.m8("NORMAL", 0);
        f364250d = m8Var;
        qk.m8 m8Var2 = new qk.m8("LOADING", 1);
        f364251e = m8Var2;
        qk.m8 m8Var3 = new qk.m8("PLAYING", 2);
        f364252f = m8Var3;
        qk.m8[] m8VarArr = {m8Var, m8Var2, m8Var3};
        f364253g = m8VarArr;
        rz5.b.a(m8VarArr);
    }

    public m8(java.lang.String str, int i17) {
    }

    public static qk.m8 valueOf(java.lang.String str) {
        return (qk.m8) java.lang.Enum.valueOf(qk.m8.class, str);
    }

    public static qk.m8[] values() {
        return (qk.m8[]) f364253g.clone();
    }
}
