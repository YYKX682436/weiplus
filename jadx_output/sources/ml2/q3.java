package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q3 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.q3 f327846e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.q3 f327847f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.q3 f327848g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.q3 f327849h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ml2.q3[] f327850i;

    /* renamed from: d, reason: collision with root package name */
    public final int f327851d;

    static {
        ml2.q3 q3Var = new ml2.q3("HORIZONTAL_BY_CLICK_BTN", 0, 1);
        f327846e = q3Var;
        ml2.q3 q3Var2 = new ml2.q3("HORIZONTAL_BY_ROTATE_PHONE", 1, 2);
        f327847f = q3Var2;
        ml2.q3 q3Var3 = new ml2.q3("PORTRAIT_BY_CLICK_BTN", 2, 3);
        f327848g = q3Var3;
        ml2.q3 q3Var4 = new ml2.q3("PORTRAIT_BY_ROTATE_PHONE", 3, 4);
        f327849h = q3Var4;
        ml2.q3[] q3VarArr = {q3Var, q3Var2, q3Var3, q3Var4};
        f327850i = q3VarArr;
        rz5.b.a(q3VarArr);
    }

    public q3(java.lang.String str, int i17, int i18) {
        this.f327851d = i18;
    }

    public static ml2.q3 valueOf(java.lang.String str) {
        return (ml2.q3) java.lang.Enum.valueOf(ml2.q3.class, str);
    }

    public static ml2.q3[] values() {
        return (ml2.q3[]) f327850i.clone();
    }
}
