package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class y1 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.y1 f328248e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.y1 f328249f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml2.y1[] f328250g;

    /* renamed from: d, reason: collision with root package name */
    public final int f328251d;

    static {
        ml2.y1 y1Var = new ml2.y1("AppendToHistory", 0, 1);
        ml2.y1 y1Var2 = new ml2.y1("ExposureEmpty", 1, 2);
        f328248e = y1Var2;
        ml2.y1 y1Var3 = new ml2.y1("InHistory", 2, 3);
        f328249f = y1Var3;
        ml2.y1[] y1VarArr = {y1Var, y1Var2, y1Var3};
        f328250g = y1VarArr;
        rz5.b.a(y1VarArr);
    }

    public y1(java.lang.String str, int i17, int i18) {
        this.f328251d = i18;
    }

    public static ml2.y1 valueOf(java.lang.String str) {
        return (ml2.y1) java.lang.Enum.valueOf(ml2.y1.class, str);
    }

    public static ml2.y1[] values() {
        return (ml2.y1[]) f328250g.clone();
    }
}
