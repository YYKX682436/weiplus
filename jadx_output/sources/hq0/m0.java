package hq0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final hq0.m0 f283032d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ hq0.m0[] f283033e;

    static {
        hq0.m0 m0Var = new hq0.m0("PreloadStrategyDefault", 0);
        hq0.m0 m0Var2 = new hq0.m0("PreloadStrategyOnlyPrelayout", 1);
        hq0.m0 m0Var3 = new hq0.m0("PreloadStrategyPreLayoutWithCacheHeight", 2);
        hq0.m0 m0Var4 = new hq0.m0("PreloadStrategyPreLayoutWithCover", 3);
        f283032d = m0Var4;
        hq0.m0[] m0VarArr = {m0Var, m0Var2, m0Var3, m0Var4};
        f283033e = m0VarArr;
        rz5.b.a(m0VarArr);
    }

    public m0(java.lang.String str, int i17) {
    }

    public static hq0.m0 valueOf(java.lang.String str) {
        return (hq0.m0) java.lang.Enum.valueOf(hq0.m0.class, str);
    }

    public static hq0.m0[] values() {
        return (hq0.m0[]) f283033e.clone();
    }
}
