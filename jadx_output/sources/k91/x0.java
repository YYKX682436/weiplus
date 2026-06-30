package k91;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k91.x0[] f305815d;

    static {
        k91.x0[] x0VarArr = {new k91.x0("NONE", 0, 0), new k91.x0("PRE_DOWNLOAD", 1, 1), new k91.x0("PARALLEL_DOWNLOAD", 2, 2)};
        f305815d = x0VarArr;
        rz5.b.a(x0VarArr);
    }

    public x0(java.lang.String str, int i17, int i18) {
    }

    public static k91.x0 valueOf(java.lang.String str) {
        return (k91.x0) java.lang.Enum.valueOf(k91.x0.class, str);
    }

    public static k91.x0[] values() {
        return (k91.x0[]) f305815d.clone();
    }
}
