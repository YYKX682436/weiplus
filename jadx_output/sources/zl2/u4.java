package zl2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u4 {

    /* renamed from: d, reason: collision with root package name */
    public static final zl2.u4 f473988d;

    /* renamed from: e, reason: collision with root package name */
    public static final zl2.u4 f473989e;

    /* renamed from: f, reason: collision with root package name */
    public static final zl2.u4 f473990f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ zl2.u4[] f473991g;

    static {
        zl2.u4 u4Var = new zl2.u4("AUTO", 0);
        f473988d = u4Var;
        zl2.u4 u4Var2 = new zl2.u4(org.chromium.support_lib_boundary.util.Features.FORCE_DARK, 1);
        f473989e = u4Var2;
        zl2.u4 u4Var3 = new zl2.u4("FORCE_LIGHT", 2);
        f473990f = u4Var3;
        zl2.u4[] u4VarArr = {u4Var, u4Var2, u4Var3};
        f473991g = u4VarArr;
        rz5.b.a(u4VarArr);
    }

    public u4(java.lang.String str, int i17) {
    }

    public static zl2.u4 valueOf(java.lang.String str) {
        return (zl2.u4) java.lang.Enum.valueOf(zl2.u4.class, str);
    }

    public static zl2.u4[] values() {
        return (zl2.u4[]) f473991g.clone();
    }
}
