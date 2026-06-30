package wj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final wj.y0 f446549d;

    /* renamed from: e, reason: collision with root package name */
    public static final wj.y0 f446550e;

    /* renamed from: f, reason: collision with root package name */
    public static final wj.y0 f446551f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wj.y0[] f446552g;

    static {
        wj.y0 y0Var = new wj.y0("Show", 0);
        f446549d = y0Var;
        wj.y0 y0Var2 = new wj.y0("NotInstalled", 1);
        f446550e = y0Var2;
        wj.y0 y0Var3 = new wj.y0("InstalledAndVersionMatch", 2);
        f446551f = y0Var3;
        wj.y0[] y0VarArr = {y0Var, y0Var2, y0Var3};
        f446552g = y0VarArr;
        rz5.b.a(y0VarArr);
    }

    public y0(java.lang.String str, int i17) {
    }

    public static wj.y0 valueOf(java.lang.String str) {
        return (wj.y0) java.lang.Enum.valueOf(wj.y0.class, str);
    }

    public static wj.y0[] values() {
        return (wj.y0[]) f446552g.clone();
    }
}
