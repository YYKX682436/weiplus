package t16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t16.p[] f414619d;

    static {
        t16.p[] pVarArr = {new t16.p("COMMON_SUPER_TYPE", 0), new t16.p("INTERSECTION_TYPE", 1)};
        f414619d = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17) {
    }

    public static t16.p valueOf(java.lang.String str) {
        return (t16.p) java.lang.Enum.valueOf(t16.p.class, str);
    }

    public static t16.p[] values() {
        return (t16.p[]) f414619d.clone();
    }
}
