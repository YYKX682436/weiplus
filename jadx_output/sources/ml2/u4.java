package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u4 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.u4 f328111e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.u4 f328112f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml2.u4[] f328113g;

    /* renamed from: d, reason: collision with root package name */
    public final int f328114d;

    static {
        ml2.u4 u4Var = new ml2.u4("EXPOSURE", 0, 1);
        f328111e = u4Var;
        ml2.u4 u4Var2 = new ml2.u4("CLICK", 1, 2);
        f328112f = u4Var2;
        ml2.u4[] u4VarArr = {u4Var, u4Var2};
        f328113g = u4VarArr;
        rz5.b.a(u4VarArr);
    }

    public u4(java.lang.String str, int i17, int i18) {
        this.f328114d = i18;
    }

    public static ml2.u4 valueOf(java.lang.String str) {
        return (ml2.u4) java.lang.Enum.valueOf(ml2.u4.class, str);
    }

    public static ml2.u4[] values() {
        return (ml2.u4[]) f328113g.clone();
    }
}
