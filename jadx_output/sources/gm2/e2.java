package gm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: e, reason: collision with root package name */
    public static final gm2.d2 f273359e;

    /* renamed from: f, reason: collision with root package name */
    public static final gm2.e2[] f273360f;

    /* renamed from: g, reason: collision with root package name */
    public static final gm2.e2 f273361g;

    /* renamed from: h, reason: collision with root package name */
    public static final gm2.e2 f273362h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ gm2.e2[] f273363i;

    /* renamed from: d, reason: collision with root package name */
    public final int f273364d;

    static {
        gm2.e2 e2Var = new gm2.e2("SIZE_NORMAL", 0, 0);
        f273361g = e2Var;
        gm2.e2 e2Var2 = new gm2.e2("SIZE_LARGE", 1, 1);
        f273362h = e2Var2;
        gm2.e2[] e2VarArr = {e2Var, e2Var2, new gm2.e2("SIZE_SMALL", 2, 2)};
        f273363i = e2VarArr;
        rz5.b.a(e2VarArr);
        f273359e = new gm2.d2(null);
        f273360f = values();
    }

    public e2(java.lang.String str, int i17, int i18) {
        this.f273364d = i18;
    }

    public static gm2.e2 valueOf(java.lang.String str) {
        return (gm2.e2) java.lang.Enum.valueOf(gm2.e2.class, str);
    }

    public static gm2.e2[] values() {
        return (gm2.e2[]) f273363i.clone();
    }
}
