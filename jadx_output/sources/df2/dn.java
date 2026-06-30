package df2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class dn {

    /* renamed from: d, reason: collision with root package name */
    public static final df2.dn f229990d;

    /* renamed from: e, reason: collision with root package name */
    public static final df2.dn f229991e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ df2.dn[] f229992f;

    static {
        df2.dn dnVar = new df2.dn("LOTTERY_DONE", 0);
        f229990d = dnVar;
        df2.dn dnVar2 = new df2.dn("CUSTOM_OPEN", 1);
        f229991e = dnVar2;
        df2.dn[] dnVarArr = {dnVar, dnVar2};
        f229992f = dnVarArr;
        rz5.b.a(dnVarArr);
    }

    public dn(java.lang.String str, int i17) {
    }

    public static df2.dn valueOf(java.lang.String str) {
        return (df2.dn) java.lang.Enum.valueOf(df2.dn.class, str);
    }

    public static df2.dn[] values() {
        return (df2.dn[]) f229992f.clone();
    }
}
