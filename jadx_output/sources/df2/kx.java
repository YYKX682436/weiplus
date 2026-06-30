package df2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kx {

    /* renamed from: d, reason: collision with root package name */
    public static final df2.kx f230607d;

    /* renamed from: e, reason: collision with root package name */
    public static final df2.kx f230608e;

    /* renamed from: f, reason: collision with root package name */
    public static final df2.kx f230609f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ df2.kx[] f230610g;

    static {
        df2.kx kxVar = new df2.kx("CAN_ENTER_FOCUS", 0);
        f230607d = kxVar;
        df2.kx kxVar2 = new df2.kx("CAN_EXIT_FOCUS", 1);
        f230608e = kxVar2;
        df2.kx kxVar3 = new df2.kx("NONE", 2);
        f230609f = kxVar3;
        df2.kx[] kxVarArr = {kxVar, kxVar2, kxVar3};
        f230610g = kxVarArr;
        rz5.b.a(kxVarArr);
    }

    public kx(java.lang.String str, int i17) {
    }

    public static df2.kx valueOf(java.lang.String str) {
        return (df2.kx) java.lang.Enum.valueOf(df2.kx.class, str);
    }

    public static df2.kx[] values() {
        return (df2.kx[]) f230610g.clone();
    }
}
