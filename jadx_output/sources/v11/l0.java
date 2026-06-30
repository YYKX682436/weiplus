package v11;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final v11.l0 f432437d;

    /* renamed from: e, reason: collision with root package name */
    public static final v11.l0 f432438e;

    /* renamed from: f, reason: collision with root package name */
    public static final v11.l0 f432439f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v11.l0[] f432440g;

    static {
        v11.l0 l0Var = new v11.l0("Left", 0);
        f432437d = l0Var;
        v11.l0 l0Var2 = new v11.l0("Center", 1);
        f432438e = l0Var2;
        v11.l0 l0Var3 = new v11.l0("Right", 2);
        f432439f = l0Var3;
        v11.l0[] l0VarArr = {l0Var, l0Var2, l0Var3};
        f432440g = l0VarArr;
        rz5.b.a(l0VarArr);
    }

    public l0(java.lang.String str, int i17) {
    }

    public static v11.l0 valueOf(java.lang.String str) {
        return (v11.l0) java.lang.Enum.valueOf(v11.l0.class, str);
    }

    public static v11.l0[] values() {
        return (v11.l0[]) f432440g.clone();
    }
}
