package k91;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class q3 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k91.q3[] f305733d;

    static {
        k91.q3[] q3VarArr = {new k91.q3("STATUS_CHANGED", 0), new k91.q3("HEIGHT_CHANGED", 1), new k91.q3("OPEN", 2), new k91.q3("CLOSE", 3), new k91.q3("RElEASE", 4), new k91.q3("RESUME", 5), new k91.q3("PAUSE", 6)};
        f305733d = q3VarArr;
        rz5.b.a(q3VarArr);
    }

    public q3(java.lang.String str, int i17) {
    }

    public static k91.q3 valueOf(java.lang.String str) {
        return (k91.q3) java.lang.Enum.valueOf(k91.q3.class, str);
    }

    public static k91.q3[] values() {
        return (k91.q3[]) f305733d.clone();
    }
}
