package yf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ yf.e[] f461336d;

    static {
        yf.e[] eVarArr = {new yf.e("MATTE", 0, 0), new yf.e("FINE_FLASH", 1, 1)};
        f461336d = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
    }

    public static yf.e valueOf(java.lang.String str) {
        return (yf.e) java.lang.Enum.valueOf(yf.e.class, str);
    }

    public static yf.e[] values() {
        return (yf.e[]) f461336d.clone();
    }
}
