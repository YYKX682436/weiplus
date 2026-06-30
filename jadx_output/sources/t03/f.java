package t03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final t03.f f414445d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ t03.f[] f414446e;

    static {
        t03.f fVar = new t03.f("Unknown", 0);
        f414445d = fVar;
        t03.f[] fVarArr = {fVar, new t03.f("GradientBlur", 1), new t03.f("Blur", 2)};
        f414446e = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static t03.f valueOf(java.lang.String str) {
        return (t03.f) java.lang.Enum.valueOf(t03.f.class, str);
    }

    public static t03.f[] values() {
        return (t03.f[]) f414446e.clone();
    }
}
