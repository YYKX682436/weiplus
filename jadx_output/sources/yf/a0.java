package yf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final yf.z f461291e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ yf.a0[] f461292f;

    /* renamed from: d, reason: collision with root package name */
    public final int f461293d;

    static {
        yf.a0[] a0VarArr = {new yf.a0("MATTE", 0, 0), new yf.a0("SATIN", 1, 1), new yf.a0("MOIST", 2, 2), new yf.a0("HIGH_LIGHT", 3, 3), new yf.a0("PEARL", 4, 4), new yf.a0("METALLIC_LIGHT", 5, 5), new yf.a0("NEON_LIGHT", 6, 6)};
        f461292f = a0VarArr;
        rz5.b.a(a0VarArr);
        f461291e = new yf.z(null);
    }

    public a0(java.lang.String str, int i17, int i18) {
        this.f461293d = i18;
    }

    public static yf.a0 valueOf(java.lang.String str) {
        return (yf.a0) java.lang.Enum.valueOf(yf.a0.class, str);
    }

    public static yf.a0[] values() {
        return (yf.a0[]) f461292f.clone();
    }
}
