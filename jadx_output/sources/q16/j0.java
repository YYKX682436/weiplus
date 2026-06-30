package q16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final q16.j0 f359761d;

    /* renamed from: e, reason: collision with root package name */
    public static final q16.j0 f359762e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ q16.j0[] f359763f;

    static {
        q16.j0 j0Var = new q16.j0("RENDER_OVERRIDE", 0);
        f359761d = j0Var;
        q16.j0 j0Var2 = new q16.j0("RENDER_OPEN", 1);
        f359762e = j0Var2;
        q16.j0[] j0VarArr = {j0Var, j0Var2, new q16.j0("RENDER_OPEN_OVERRIDE", 2)};
        f359763f = j0VarArr;
        rz5.b.a(j0VarArr);
    }

    public j0(java.lang.String str, int i17) {
    }

    public static q16.j0 valueOf(java.lang.String str) {
        return (q16.j0) java.lang.Enum.valueOf(q16.j0.class, str);
    }

    public static q16.j0[] values() {
        return (q16.j0[]) f359763f.clone();
    }
}
