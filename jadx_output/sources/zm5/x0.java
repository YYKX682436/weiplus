package zm5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class x0 {

    /* renamed from: d, reason: collision with root package name */
    public static final zm5.x0 f474286d;

    /* renamed from: e, reason: collision with root package name */
    public static final zm5.x0 f474287e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ zm5.x0[] f474288f;

    static {
        zm5.x0 x0Var = new zm5.x0("CUR_STATE_PREVIEW", 0);
        f474286d = x0Var;
        zm5.x0 x0Var2 = new zm5.x0("CUR_STATE_RUNNING", 1);
        f474287e = x0Var2;
        zm5.x0[] x0VarArr = {x0Var, x0Var2};
        f474288f = x0VarArr;
        rz5.b.a(x0VarArr);
    }

    public x0(java.lang.String str, int i17) {
    }

    public static zm5.x0 valueOf(java.lang.String str) {
        return (zm5.x0) java.lang.Enum.valueOf(zm5.x0.class, str);
    }

    public static zm5.x0[] values() {
        return (zm5.x0[]) f474288f.clone();
    }
}
