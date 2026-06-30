package pv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final pv.a0 f358474e;

    /* renamed from: f, reason: collision with root package name */
    public static final pv.a0 f358475f;

    /* renamed from: g, reason: collision with root package name */
    public static final pv.a0 f358476g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pv.a0[] f358477h;

    /* renamed from: d, reason: collision with root package name */
    public final int f358478d;

    static {
        pv.a0 a0Var = new pv.a0("WEBVIEW_MP", 0, 1);
        f358474e = a0Var;
        pv.a0 a0Var2 = new pv.a0("WEBVIEW_OTHER", 1, 2);
        f358475f = a0Var2;
        pv.a0 a0Var3 = new pv.a0("APPBRAND", 2, 3);
        f358476g = a0Var3;
        pv.a0[] a0VarArr = {a0Var, a0Var2, a0Var3};
        f358477h = a0VarArr;
        rz5.b.a(a0VarArr);
    }

    public a0(java.lang.String str, int i17, int i18) {
        this.f358478d = i18;
    }

    public static pv.a0 valueOf(java.lang.String str) {
        return (pv.a0) java.lang.Enum.valueOf(pv.a0.class, str);
    }

    public static pv.a0[] values() {
        return (pv.a0[]) f358477h.clone();
    }
}
