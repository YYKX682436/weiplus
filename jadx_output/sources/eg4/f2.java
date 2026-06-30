package eg4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f2 {

    /* renamed from: e, reason: collision with root package name */
    public static final eg4.e2 f252703e;

    /* renamed from: f, reason: collision with root package name */
    public static final eg4.f2 f252704f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ eg4.f2[] f252705g;

    /* renamed from: d, reason: collision with root package name */
    public final int f252706d;

    static {
        eg4.f2 f2Var = new eg4.f2("HEADER", 0, 1);
        eg4.f2 f2Var2 = new eg4.f2("NEW_DATA_ITEM", 1, 2);
        f252704f = f2Var2;
        eg4.f2[] f2VarArr = {f2Var, f2Var2, new eg4.f2("OLD_DATA_ITEM", 2, 3), new eg4.f2("LOADING_ITEM", 3, 4)};
        f252705g = f2VarArr;
        rz5.b.a(f2VarArr);
        f252703e = new eg4.e2(null);
    }

    public f2(java.lang.String str, int i17, int i18) {
        this.f252706d = i18;
    }

    public static eg4.f2 valueOf(java.lang.String str) {
        return (eg4.f2) java.lang.Enum.valueOf(eg4.f2.class, str);
    }

    public static eg4.f2[] values() {
        return (eg4.f2[]) f252705g.clone();
    }
}
