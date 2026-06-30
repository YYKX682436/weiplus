package f26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class d3 {

    /* renamed from: f, reason: collision with root package name */
    public static final f26.d3 f259143f;

    /* renamed from: g, reason: collision with root package name */
    public static final f26.d3 f259144g;

    /* renamed from: h, reason: collision with root package name */
    public static final f26.d3 f259145h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ f26.d3[] f259146i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f259147d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f259148e;

    static {
        f26.d3 d3Var = new f26.d3("INVARIANT", 0, "", true, true, 0);
        f259143f = d3Var;
        f26.d3 d3Var2 = new f26.d3("IN_VARIANCE", 1, "in", true, false, -1);
        f259144g = d3Var2;
        f26.d3 d3Var3 = new f26.d3("OUT_VARIANCE", 2, "out", false, true, 1);
        f259145h = d3Var3;
        f26.d3[] d3VarArr = {d3Var, d3Var2, d3Var3};
        f259146i = d3VarArr;
        rz5.b.a(d3VarArr);
    }

    public d3(java.lang.String str, int i17, java.lang.String str2, boolean z17, boolean z18, int i18) {
        this.f259147d = str2;
        this.f259148e = z18;
    }

    public static f26.d3 valueOf(java.lang.String str) {
        return (f26.d3) java.lang.Enum.valueOf(f26.d3.class, str);
    }

    public static f26.d3[] values() {
        return (f26.d3[]) f259146i.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f259147d;
    }
}
