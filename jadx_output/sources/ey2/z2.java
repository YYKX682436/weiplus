package ey2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z2 {

    /* renamed from: d, reason: collision with root package name */
    public static final ey2.z2 f257598d;

    /* renamed from: e, reason: collision with root package name */
    public static final ey2.z2 f257599e;

    /* renamed from: f, reason: collision with root package name */
    public static final ey2.z2 f257600f;

    /* renamed from: g, reason: collision with root package name */
    public static final ey2.z2 f257601g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ey2.z2[] f257602h;

    static {
        ey2.z2 z2Var = new ey2.z2("Default", 0);
        f257598d = z2Var;
        ey2.z2 z2Var2 = new ey2.z2("HardRefresh", 1);
        f257599e = z2Var2;
        ey2.z2 z2Var3 = new ey2.z2("Timeout", 2);
        f257600f = z2Var3;
        ey2.z2 z2Var4 = new ey2.z2("InCacheTime", 3);
        f257601g = z2Var4;
        ey2.z2[] z2VarArr = {z2Var, z2Var2, z2Var3, z2Var4};
        f257602h = z2VarArr;
        rz5.b.a(z2VarArr);
    }

    public z2(java.lang.String str, int i17) {
    }

    public static ey2.z2 valueOf(java.lang.String str) {
        return (ey2.z2) java.lang.Enum.valueOf(ey2.z2.class, str);
    }

    public static ey2.z2[] values() {
        return (ey2.z2[]) f257602h.clone();
    }
}
