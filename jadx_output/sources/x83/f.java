package x83;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x83.f[] f452567d;

    static {
        x83.f[] fVarArr = {new x83.f("REG_RESULT_SUCCESS", 0, 1), new x83.f("REG_RESULT_FAIL", 1, 2), new x83.f("REG_RESULT_CANCEL", 2, 3)};
        f452567d = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
    }

    public static x83.f valueOf(java.lang.String str) {
        return (x83.f) java.lang.Enum.valueOf(x83.f.class, str);
    }

    public static x83.f[] values() {
        return (x83.f[]) f452567d.clone();
    }
}
