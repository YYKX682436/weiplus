package vp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final vp5.a f439087e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ vp5.b[] f439088f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f439089g;

    /* renamed from: d, reason: collision with root package name */
    public final int f439090d;

    static {
        vp5.b[] bVarArr = {new vp5.b("OK", 0, 0), new vp5.b("FAIL_ALLOC", 1, -3), new vp5.b("FAIL_DECOMPRESS", 2, -4), new vp5.b("FAIL_OVERFLOW", 3, -5), new vp5.b("FAIL_READ_OLD_FILE", 4, -6), new vp5.b("FAIL_READ_DIFF_FILE", 5, -7), new vp5.b("FAIL_WRITE_NEW_FILE", 6, -8)};
        f439088f = bVarArr;
        f439089g = rz5.b.a(bVarArr);
        f439087e = new vp5.a(null);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f439090d = i18;
    }

    public static vp5.b valueOf(java.lang.String str) {
        return (vp5.b) java.lang.Enum.valueOf(vp5.b.class, str);
    }

    public static vp5.b[] values() {
        return (vp5.b[]) f439088f.clone();
    }
}
