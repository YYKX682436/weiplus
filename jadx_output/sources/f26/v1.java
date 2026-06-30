package f26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f26.v1[] f259230d;

    static {
        f26.v1[] v1VarArr = {new f26.v1("CHECK_ONLY_LOWER", 0), new f26.v1("CHECK_SUBTYPE_AND_LOWER", 1), new f26.v1("SKIP_LOWER", 2)};
        f259230d = v1VarArr;
        rz5.b.a(v1VarArr);
    }

    public v1(java.lang.String str, int i17) {
    }

    public static f26.v1 valueOf(java.lang.String str) {
        return (f26.v1) java.lang.Enum.valueOf(f26.v1.class, str);
    }

    public static f26.v1[] values() {
        return (f26.v1[]) f259230d.clone();
    }
}
