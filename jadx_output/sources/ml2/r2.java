package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r2 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.r2 f327896e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.r2 f327897f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml2.r2[] f327898g;

    /* renamed from: d, reason: collision with root package name */
    public final int f327899d;

    static {
        ml2.r2 r2Var = new ml2.r2("OPEN", 0, 1);
        f327896e = r2Var;
        ml2.r2 r2Var2 = new ml2.r2("CLOSE", 1, 2);
        f327897f = r2Var2;
        ml2.r2[] r2VarArr = {r2Var, r2Var2, new ml2.r2("MIC_SETTING_NO", 2, 3), new ml2.r2("MIC_SETTING_REWARD", 3, 4), new ml2.r2("MIC_SETTING_FOLLOW", 4, 5), new ml2.r2("MIC_SETTING_BUY_PRODUCT", 5, 7)};
        f327898g = r2VarArr;
        rz5.b.a(r2VarArr);
    }

    public r2(java.lang.String str, int i17, int i18) {
        this.f327899d = i18;
    }

    public static ml2.r2 valueOf(java.lang.String str) {
        return (ml2.r2) java.lang.Enum.valueOf(ml2.r2.class, str);
    }

    public static ml2.r2[] values() {
        return (ml2.r2[]) f327898g.clone();
    }
}
