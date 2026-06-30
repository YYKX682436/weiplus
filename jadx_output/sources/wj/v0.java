package wj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class v0 {

    /* renamed from: e, reason: collision with root package name */
    public static final wj.v0 f446536e;

    /* renamed from: f, reason: collision with root package name */
    public static final wj.v0 f446537f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wj.v0[] f446538g;

    /* renamed from: d, reason: collision with root package name */
    public final int f446539d;

    static {
        wj.v0 v0Var = new wj.v0("Show", 0, 0);
        wj.v0 v0Var2 = new wj.v0("Installed", 1, 1);
        f446536e = v0Var2;
        wj.v0 v0Var3 = new wj.v0("NotInstalled", 2, 2);
        f446537f = v0Var3;
        wj.v0[] v0VarArr = {v0Var, v0Var2, v0Var3, new wj.v0("LowVersion", 3, 3), new wj.v0("Else", 4, 100)};
        f446538g = v0VarArr;
        rz5.b.a(v0VarArr);
    }

    public v0(java.lang.String str, int i17, int i18) {
        this.f446539d = i18;
    }

    public static wj.v0 valueOf(java.lang.String str) {
        return (wj.v0) java.lang.Enum.valueOf(wj.v0.class, str);
    }

    public static wj.v0[] values() {
        return (wj.v0[]) f446538g.clone();
    }
}
