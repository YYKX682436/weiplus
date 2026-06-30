package zl2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: e, reason: collision with root package name */
    public static final zl2.r0 f473939e;

    /* renamed from: f, reason: collision with root package name */
    public static final zl2.r0 f473940f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ zl2.r0[] f473941g;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f473942d;

    static {
        zl2.r0 r0Var = new zl2.r0("AVC", 0, "avc");
        f473939e = r0Var;
        zl2.r0 r0Var2 = new zl2.r0("HEVC", 1, "hevc");
        f473940f = r0Var2;
        zl2.r0[] r0VarArr = {r0Var, r0Var2};
        f473941g = r0VarArr;
        rz5.b.a(r0VarArr);
    }

    public r0(java.lang.String str, int i17, java.lang.String str2) {
        this.f473942d = str2;
    }

    public static zl2.r0 valueOf(java.lang.String str) {
        return (zl2.r0) java.lang.Enum.valueOf(zl2.r0.class, str);
    }

    public static zl2.r0[] values() {
        return (zl2.r0[]) f473941g.clone();
    }
}
