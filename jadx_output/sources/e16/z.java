package e16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e16.z[] f246452d;

    static {
        e16.z[] zVarArr = {new e16.z("SOURCE", 0), new e16.z("BINARY", 1)};
        f246452d = zVarArr;
        rz5.b.a(zVarArr);
    }

    public z(java.lang.String str, int i17) {
    }

    public static e16.z valueOf(java.lang.String str) {
        return (e16.z) java.lang.Enum.valueOf(e16.z.class, str);
    }

    public static e16.z[] values() {
        return (e16.z[]) f246452d.clone();
    }
}
