package mi1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class y0 {

    /* renamed from: e, reason: collision with root package name */
    public static final mi1.y0 f326730e;

    /* renamed from: f, reason: collision with root package name */
    public static final mi1.y0 f326731f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mi1.y0[] f326732g;

    /* renamed from: d, reason: collision with root package name */
    public final int f326733d;

    static {
        mi1.y0 y0Var = new mi1.y0("START", 0, 1);
        f326730e = y0Var;
        mi1.y0 y0Var2 = new mi1.y0("STOP", 1, 2);
        f326731f = y0Var2;
        mi1.y0[] y0VarArr = {y0Var, y0Var2, new mi1.y0("CLICK", 2, 3)};
        f326732g = y0VarArr;
        rz5.b.a(y0VarArr);
    }

    public y0(java.lang.String str, int i17, int i18) {
        this.f326733d = i18;
    }

    public static mi1.y0 valueOf(java.lang.String str) {
        return (mi1.y0) java.lang.Enum.valueOf(mi1.y0.class, str);
    }

    public static mi1.y0[] values() {
        return (mi1.y0[]) f326732g.clone();
    }
}
